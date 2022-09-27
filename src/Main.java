import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        GameBoard gameBoard = new GameBoard();
        gameBoard.printBoard();

        Player player = new Player();
        System.out.println("Write your name!");
        userInput.nextLine();
        player.playerCharacter();
        userInput.nextInt();

        System.out.println("Please put in you placement (1-9)");
        userInput.nextInt();







    }


        }

