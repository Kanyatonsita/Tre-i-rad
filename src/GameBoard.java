
public class GameBoard {
    /* Board design.
       [0][0] | [0][1] | [0][2]
         ––   |   ––   |
       [1][0] | [1][1] | [1][2]
         ––   |   ––   |
       [2][0] | [2][1] | [2][2]
     */

    private char[] [] gameBoard = {{ ' ', ' ', ' '},
                                   {' ', ' ', ' '},
                                   {' ', ' ', ' '},};

    //Print a game board.
    public void printBoard (){
        System.out.println(gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2]);
        System.out.println("––" + "++" + "––" + "++" + "––");
        System.out.println(gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2]);
        System.out.println("––" + "++" + "––" + "++" + "––");
        System.out.println(gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2]);
    }


    }



