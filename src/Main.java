import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameBoard b = new GameBoard();
        b.printBoard();

        Player player1 = new Player();
        Player player2 = new Player();

        //loop
        int choice = player1.playerTurn();
        int choice = player2.playerTurn();

        //läs in input från användare
        boolean valid = b.placeMarker(choice, player1.marker);
        boolean vaild = b.placeMarker(choice,player2.marker);
        //

        b.printBoard();

        //kolla vintsen
        boolean winner = b.checkWin();


        System.out.println("Please put in you position (1-9)");
       String userInput = sc.nextLine();
        System.out.println(userInput);
        player1.playerTurn();
        b.printBoard();










    }


        }

