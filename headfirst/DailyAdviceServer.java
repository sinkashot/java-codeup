package headfirst;

import java.net.*;
import java.io.*;

public class DailyAdviceServer {
    String[] adviceList = {"advice_1","advice_2","advice_3","advice_4","advice_5"};

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242); // detect 4242 port
    
            // while wait request and service process
            while(true) {
                Socket socket = serverSocket.accept(); // wait request
                PrintWriter writer = new PrintWriter(socket.getOutputStream()); // send message
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int index = (int)(Math.random() * adviceList.length);
        return adviceList[index];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
