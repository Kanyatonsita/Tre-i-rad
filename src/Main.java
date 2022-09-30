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
        //while
            while (true) {
                System.out.println("Player1 put in you position (1-9)");
                int user1Input = sc.nextInt();
                // loop som kollar om värdet är upptaget
                //System.out.println("Sorry! It's invalid.  Try again!");
                System.out.println(user1Input);
                player1.placeMarker(user1Input, 1, board);
                board.printBoard();
                board.checkWin();

                System.out.println("Player2 put in you position (1-9)");
                int user2Input = sc.nextInt();
                // --||--
                //System.out.println("Sorry! It's invalid.  Try again!");
                System.out.println(user2Input);
                player2.placeMarker(user2Input, 2, board);
                board.printBoard();
                board.checkWin();


            }


    }


        }

