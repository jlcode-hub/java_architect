package bhz.netty.test2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class ClientHandler extends ChannelHandlerAdapter{

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		// TODO Auto-generated method stub
		try{
			ByteBuf buf = (ByteBuf)msg;
			byte[] msgByte = new byte[buf.readableBytes()];
			buf.readBytes(msgByte);
			System.out.println("ClientHandler received message : " + new String(msgByte, "utf-8"));
		}finally{
			
		}
	}
	
}
