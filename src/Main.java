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

        boolean play = true;

    do {

        //while loop -Take input from user until there is a free seat.
        while (play) {
            System.out.println("Player1 put in you position (1-9)");
            int user1Input = sc.nextInt();
            System.out.println(user1Input);

            if (board.checkIfEmpty(user1Input)) {
                player1.placeMarker(user1Input, 1, board);
                break;
            } else {
                System.out.println("Sorry! Position already taken. It's invalid.  Try again!");
            }
        }

        board.printBoard();

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
                play = false;
            }
        }

        //while loop -Take input from user until there is a free seat.
        while (play) {
            System.out.println("Player2 put in you position (1-9)");
            int user2Input = sc.nextInt();
            System.out.println(user2Input);

            if (board.checkIfEmpty(user2Input)) {
                player2.placeMarker(user2Input, 2, board);
                break;
            } else {
                System.out.println("Sorry! Position already taken. It's invalid.  Try again!");
            }
        }

        board.printBoard();

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
            play = false;
        }

    }
    }while (play);
    }
}

