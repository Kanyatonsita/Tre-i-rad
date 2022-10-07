import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Input from user.

        GameBoard board = new GameBoard(); // Prints game board.
        board.printBoard();

        //Prints player1 and player2.
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("Hello!! Welcome to the Tic-tac-toe game. Good luck!!");

        boolean play = true;
        do {
            //while loop -Take input from user until there is a free seat.
            while (play) {
               play = player1Move(board,sc,player1);
            }
            board.printBoard();

            play = winner(board, sc);

            //while loop -Take input from user until there is a free seat.
            while (play) {
                play = player2Move(board,sc,player2);
            }
            board.printBoard();

            play = winner(board, sc);
            
        } while (play);

    }

    //Function to check the winner and clear board after the game.
    //While loop with if statements to check if players want to continue or quit.
    static boolean winner (GameBoard board, Scanner sc) {
        if (board.checkWin()) {
            board.clearBoard();
            boolean validAnswer = true;
                System.out.println("Do you want to play again? (y/n)");
            do {
                String answer = sc.nextLine();

                if (answer.equals("y")){
                    System.out.println("Nice! Let's play again");
                    break;
                }else if (answer.equals("n")){
                    System.out.println("Thank you!!");
                    System.out.println("Goodbye, I hope we'll meet again!");
                    return false;
                }else {
                   validAnswer = false;
                }
            } while (!validAnswer);
        }
        return true;
    }

    //Function for player to move and positioning
    // if a move is invalid = return false and let player try again.
    // if position is valid = return true.
    static boolean player1Move(GameBoard board, Scanner sc, Player player){
            System.out.println("\nPlayer1 put in your position (1-9)");
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

    //Function for a computer player to move and positioning.
    static boolean player2Move(GameBoard board, Scanner sc, Player player){

            Random random = new Random();
            int computerInput = random.nextInt(9)+1;

            if (board.checkIfEmpty(computerInput)) {
                player.placeMarker(computerInput, 2, board);
                System.out.println("\nPlayer2 put in your position (1-9)");
                System.out.println(computerInput);
                return false;
            }
            return true;
    }
}







