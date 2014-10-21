package polycom.api.net;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

/**
 * Handler implementation for the echo client. It initiates the ping-pong
 * traffic between the echo client and server by sending the first message to
 * the server.
 */

public class ClientInitializer extends ChannelInitializer<SocketChannel> {
	private static final StringDecoder DECODER = new StringDecoder(CharsetUtil.UTF_8);
	private static final StringEncoder ENCODER = new StringEncoder(CharsetUtil.UTF_8);
	
	private static final ClientHandler CLIENT_HANDLER = new ClientHandler();
	
	@Override
	protected void initChannel(SocketChannel channel) throws Exception {
		ChannelPipeline pipeline = channel.pipeline();
		
		// Add the text line codec combination first,
		pipeline.addLast(new DelimiterBasedFrameDecoder(1024, Delimiters.lineDelimiter()));
		pipeline.addLast("DECODER", DECODER);
		pipeline.addLast("ENCODER", ENCODER);
		
		pipeline.addLast(CLIENT_HANDLER);
		
	}


}