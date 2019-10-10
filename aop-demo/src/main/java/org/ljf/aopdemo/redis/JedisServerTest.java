package org.ljf.aopdemo.redis;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * description
 *
 * @author ljf 2019/10/08 10:38
 */
public class JedisServerTest {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(6379);
            Socket socket=serverSocket.accept();
            byte[] bytes=new byte[2048];
            socket.getInputStream().read(bytes);
            //System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
