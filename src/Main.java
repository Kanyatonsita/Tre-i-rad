import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameBoard board = new GameBoard(); // Prints game board.
        board.printBoard();

        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("Would you like to play game? (Click enter to continue)");
        sc.nextLine();

        //while loop
        while (true) {
            System.out.println("Player1 put in you position (1-9)");
            int user1Input = sc.nextInt();
            System.out.println(user1Input);

            boolean tryAgainPlayer1 = false;//-> Ta input från user tills det finns en ledig plats.
           /* while (!tryAgainPlayer1) {
                if (tryAgainPlayer1 == true){
                }else
            */
            if (board.checkIfEmpty(user1Input)) {
                player1.placeMarker(user1Input, 1, board);
            } else {
                System.out.println("Sorry! Position already taken. It's invalid.  Try again!");
            }

            board.printBoard();

                if (board.checkWin()) {
                    board.clearBoard();
                }


            System.out.println("Player2 put in you position (1-9)");
            int user2Input = sc.nextInt();
            System.out.println(user2Input);

            boolean tryAgainPlayer2 = false;//-> Ta input från user tills det finns en ledig plats.
           /* while (!tryAgainPlayer2) {
                if (tryAgainPlayer2 == true) {
                } else
            */
            if (board.checkIfEmpty(user2Input)) {
                player2.placeMarker(user2Input, 2, board);
            } else {
                System.out.println("Sorry! Position already taken. It's invalid.  Try again!");
            }

            board.printBoard();

            if (board.checkWin()) {
                board.clearBoard();
            }
        }
    }
}



