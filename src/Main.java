import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameBoard board = new GameBoard(); // Prints game board.
        board.printBoard();

        Player player1 = new Player();
        Player player2 = new Player();

        //loop
 //       int choice = player1.playerTurn();
 //       int choice = player2.playerTurn();

        //läs in input från användare
 //       boolean valid = board.placeMarker(choice, player1.marker);
 //       boolean vaild = board.placeMarker(choice,player2.marker);
        //


        //kolla vintsen
        boolean winner = board.checkWin();

        //while
        while(true) {

                System.out.println("Player1 put in you position (1-9)");
                int user1Input = sc.nextInt();
                // loop som kollar om värdet är upptaget
                System.out.println(user1Input);
                board.placeMarker(user1Input, 1);
                board.printBoard();

                System.out.println("Player2 put in you position (1-9)");
                int user2Input = sc.nextInt();
                // --||--
                System.out.println(user2Input);
                board.placeMarker(user2Input, 2);
                board.printBoard();
            }












    }


        }

