package netty.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class NettyClient {
	public static void main(String[] args) throws IOException {
		byte[] sendData = "hello".getBytes();
		Socket socket = new Socket("172.16.142.16", 8082);
	    OutputStream os = socket.getOutputStream();
	    InputStream is = socket.getInputStream();
	    try {
	      //发送数据-------------------------------
	      os.write(sendData);
	      os.flush();
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      os.close();
	      is.close();
	      socket.close();
	    }
	}
}
