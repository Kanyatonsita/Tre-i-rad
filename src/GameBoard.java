
public class GameBoard {

    private Player player;
    /* Board design.
       [0][0] | [0][1] | [0][2]
         ––   ++  ––   ++  ––
       [1][0] | [1][1] | [1][2]
         ––   ++   ––  ++   --
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


    public boolean placeMarker(int choice,int player){


        return false;
    }

    //Method to Check the winner!! and if the game is tied!
    public boolean checkWin(){
        if (gameBoard[0][0] == 'X' && gameBoard [0][1]== 'X' && gameBoard[0][2]== 'X'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[1][0] == 'X' && gameBoard [1][1]== 'X' && gameBoard[1][2]== 'X'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[2][0] == 'X' && gameBoard [2][1]== 'X' && gameBoard[2][2]== 'X'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
       else if (gameBoard[0][0] == 'X' && gameBoard [1][0]== 'X' && gameBoard[2][0]== 'X') {
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][1] == 'X' && gameBoard [1][1]== 'X' && gameBoard[2][1]== 'X') {
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][2] == 'X' && gameBoard [1][2]== 'X' && gameBoard[2][2]== 'X') {
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][0] == 'X' && gameBoard [1][1]== 'X' && gameBoard[2][2]== 'X'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][2] == 'X' && gameBoard [1][1]== 'X' && gameBoard[2][0]== 'X'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][0] == 'O' && gameBoard [0][1]== 'O' && gameBoard[0][2]== 'O') {
            System.out.println("Congratulations player 2 you win!!");
            return true;
        }
        else if (gameBoard[1][0] == 'O' && gameBoard [1][1]== 'O' && gameBoard[1][2]== 'O'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[2][0] == 'O' && gameBoard [2][1]== 'O' && gameBoard[2][2]== 'O'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][0] == 'O' && gameBoard [1][0]== 'O' && gameBoard[2][0]== 'O') {
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][1] == 'O' && gameBoard [1][1]== 'O' && gameBoard[2][1]== 'O') {
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][2] == 'O' && gameBoard [1][2]== 'O' && gameBoard[2][2]== 'O') {
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][0] == 'O' && gameBoard [1][1]== 'X' && gameBoard[2][2]== 'O'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][2] == 'O' && gameBoard [1][1]== 'X' && gameBoard[2][0]== 'O'){
            System.out.println("Congratulations player 1 you win!!");
            return true;
        }
        else if (gameBoard[0][0] != '_' && gameBoard[0][1] != '_' && gameBoard[0][2] != '_' &&
                gameBoard[1][0] != '_' && gameBoard[1][1] != '_' && gameBoard[1][2] != '_' &&
                gameBoard[2][0] != ' ' && gameBoard[2][1] != ' ' && gameBoard[2][2] != ' '){
            System.out.println("The game is tied..! try again?");
        }
        return false;
    }

    

    public void setPlayer(Player player) {
        this.player = player;
    }
}






