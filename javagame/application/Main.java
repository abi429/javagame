package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Runnable myLambda = () -> System.out.println("Game Creater : Absar");
        myLambda.run();

        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.onStart();
        ticTacToe.startGamePanel.gameassign(ticTacToe);
    }
}