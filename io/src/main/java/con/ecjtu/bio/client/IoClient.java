package con.ecjtu.bio.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @author xiexiang
 * @date 2020/4/21 5:04 下午
 */
public class IoClient {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 3333);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
            } catch (IOException e) {
            }
        }).start();

    }

}

