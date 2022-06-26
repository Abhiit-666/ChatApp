/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trial;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class AppClient {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username for the group chat:");
        String username = sc.nextLine();
        Socket socket = new Socket("localhost", 1234);
        client client = new client(socket, username);
        client.listenForMessage();
        client.sendMessage();

    }
}
