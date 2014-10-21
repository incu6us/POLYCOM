package polycom.api.net;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

import javax.net.ssl.SSLException;

/**
 * Sends one message when a connection is open and echoes back any received data
 * to the server. Simply put, the echo client initiates the ping-pong traffic
 * between the echo client and server by sending the first message to the
 * server.
 */
public class Client {
	static final String HOST = "89.221.48.69";
	static final int PORT = 23;

	private EventLoopGroup group;
	private Channel channel;
	private ChannelFuture lastWriteFuture = null;
	
	static String requestedMessage = "";
	
	/**
	 * Connect to remote server
	 */
	public void connect() throws SSLException {
		
		// Configure the client.
		group = new NioEventLoopGroup();

		Bootstrap b = new Bootstrap();
		b.group(group)
		.channel(NioSocketChannel.class)
		.handler(new ClientInitializer());

		// Start the client.
		try {
			channel = b.connect(HOST, PORT).sync().channel();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Send commands to remote server
	 * @return
	 */
	public void sendCommand(String command) {
		
//		lastWriteFuture = channel.writeAndFlush("line" + "\r\n");
		lastWriteFuture = channel.writeAndFlush(command+"\r\n");

		// Wait until all messages are flushed before closing the channel.
		if (lastWriteFuture != null) {
			try {
				lastWriteFuture.sync();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Disconnect from remote server
	 */
	public void disconnect() {
		// Shut down the event loop to terminate all threads.
		try {
			channel.closeFuture().sync();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			group.shutdownGracefully();
		}
	}
}