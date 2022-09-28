public class Player  {
    private int player1;
    private int player2;

    public Player(int player1, int player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    //Create players 1 and players2.
    public char[][] playerTurn (){
           System.out.println("Please choose your character (Player1= 'X', Player2= 'O')");
           if (player1 == 1) {
               choice = 'X';
           } else if (player2 == 2) {
               choice = 'O';
           }

        switch (input) {
            case 1:
                board[0][0] = choice;
                printBoard();
                break;
            case 2:
                board[0][1] = choice;
                printBoard();
                break;
            case 3:
                board[0][2] = choice;
                printBoard();
                break;
            case 4:
                board[1][0] = choice;
                printBoard();
                break;
            case 5:
                board[1][1] = choice;
                printBoard();
                break;
            case 6:
                board[1][2] = choice;
                printBoard();
                break;
             case 7 :
                board [2][0] = choice;
                printBoard();
                break;
             case 8 :
                board [2][1] = choice;
                printBoard();
                 break;
             case 9 :
                board [2][2] = choice;
                printBoard();
               break;
            default:
               break;
        }

    }
   
}
