import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameBoard board = new GameBoard(); // Prints game board.
        board.printBoard();

        Player player1 = new Player();// Prints player1.
        Player player2 = new Player();


        System.out.println("Hello!! welcome to the Tic-tac-toe game. Good luck!! ");

        boolean play = true;

        do {
            //while loop -Take input from user until there is a free seat.
            while (play) {
                System.out.println("Player1 put in you position (1-9)");
                play = player1Move(board,sc,player1);
            }

            board.printBoard();

            play = winner(board, sc);
            if (!play) {
                break;
            }

            //while loop -Take input from user until there is a free seat.
            while (play) {
               System.out.println("Player2 put in you position (1-9)");
                play = player2Move(board,sc,player2);
            }

            board.printBoard();
            play = winner(board, sc);
            if (!play) {
                break;
            }
        } while (play);

    }

        static Boolean winner (GameBoard board, Scanner sc){
            if (board.checkWin()) {
                board.clearBoard();
                System.out.println("Play again! or Do you want to quit the game? (y/n)");
                sc.nextLine();
                String again = sc.nextLine();

                // play again printout with switch cases.
                switch (again) {
                    case "y":
                        System.out.println("Nice! Let's play again");
                        break;
                    case "n":
                        System.out.println("Thank you!!");
                        System.out.println("Goodbye, I hope we'll meet again!");

                    default:
                        break;
                }
                if (again.equals("n")) {
                    return false;
                }
            }
            return true;
        }


    //Method for player to move and positioning
    // if a move is invalid = return false and lets player try again.
    // if position is valid = return true.
    static boolean player1Move(GameBoard board, Scanner sc, Player player){
        int user1Input = sc.nextInt();
        System.out.println(user1Input);

        if (board.checkIfEmpty(user1Input)) {
            player.placeMarker(user1Input, 1, board);
            return false;
        } else {
            System.out.println("Sorry! Position already taken.");
            System.out.println("It's invalid. Try again!");
        }
        return true;
    }

    static boolean player2Move(GameBoard board, Scanner sc, Player player){

    int user2Input = sc.nextInt();
       System.out.println(user2Input);
      if (board.checkIfEmpty(user2Input)) {
          player.placeMarker(user2Input, 2, board);
            return false;
        } else {
         System.out.println("Sorry! Position already taken.");
           System.out.println("It's invalid. Try again!");
        }
        return true;
    }

    }





