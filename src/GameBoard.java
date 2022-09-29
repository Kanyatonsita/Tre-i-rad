
public class GameBoard {
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

     //Method to see if a move to a position.
    public boolean placeMarker(int choice,int player){
        char piece = ' ';

        if (player == 1) {
            piece = 'X';
            // skickar choice till en lista som motsvarar spelare
        }
        else if (player == 2) {
            piece = 'O';
            // skickar choice till en lista som motsvarar spelare
        }
        //

        if (choice == 1){
            gameBoard[0][0] = piece;
            return true;
        }
        else if (choice == 2){
                gameBoard[0][1]  = piece;
            return true;
        }
       else if (choice == 3){
               gameBoard[0][2] = piece;
             return true;
        }
       else if (choice == 4){
               gameBoard[1][0] = piece;
            return true;
        }
       else if (choice == 5){
               gameBoard[1][1] = piece;
            return true;
        }
       else if (choice == 6){
               gameBoard[1][2] = piece;
            return true;
        }
       else if (choice == 7) {
               gameBoard[2][0] = piece;
              return true;
       }
       else if (choice == 8){
               gameBoard[2][1] = piece;
            return true;
       }
       else if (choice == 9){
               gameBoard[2][2] = piece;
            return true;
       }
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
            System.out.println("Congratulations player 1 you win!!" );
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

    //Method for clear game board after the game!
    public void clearBoard(){
        gameBoard[0][0] = '_';
        gameBoard[0][1] = '_';
        gameBoard[0][2] = '_';
        gameBoard[1][0] = '_';
        gameBoard[1][1] = '_';
        gameBoard[1][2] = '_';
        gameBoard[2][0] = ' ';
        gameBoard[2][1] = ' ';
        gameBoard[2][2] = ' ';
    }

}






