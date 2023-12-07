package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {




        public static void main(String[] args) {
            try (ServerSocket serverSocket = new ServerSocket(4999)) {
                System.out.println("Server is running and waiting for clients...");

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Client connected");

                    InputStreamReader inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    String winnerName = bufferedReader.readLine();
                    System.out.println("Winner: " + winnerName);

                    // You can save the winner's name to a file or perform other actions as needed.

                    bufferedReader.close();
                    inputStreamReader.close();
                    clientSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
