package tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
        // Define the patterns
        String horizontalLine = "+--+--+--+\n";
        String verticalLine = "|  |  |  |\n";

        // Print the top pattern
        for (int i = 0; i < 3; i++) {
            System.out.print(horizontalLine);
            System.out.print(verticalLine);
        }

        // Print the bottom pattern
        System.out.print(horizontalLine);

    }
}
