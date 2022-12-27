package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread implements Runnable {
    private Socket clientSocket;
    private ChatServer chatServer;
    private int clientNumber;

    public ClientThread(Socket clientSocket, ChatServer chatServer, int clientNumber) {
        this.clientSocket = clientSocket;
        this.chatServer = chatServer;
        this.clientNumber = clientNumber;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true)) {
            System.out.println("Client #" + clientNumber + " was connected");
            pw.println(clientNumber);

            String message;
            while (true) {
                message = br.readLine();

                if (message != null && message.equals("Closed")) {
                    break;
                }

                message = "Client #" + clientNumber +" "+ message;
                System.out.println(message);
                chatServer.sendMessageForAllClients(clientNumber, message);
            }
        } catch (IOException e) {
            System.err.println("Something went wrong with access for client #" + clientNumber);
            throw new RuntimeException(e);
        }
    }
}

