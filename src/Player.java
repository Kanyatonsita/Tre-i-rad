public class Player  {

    //Create players 1 = X and players2 = O
    //Method to see if a move to a position.
     public boolean placeMarker(int choice,int player,GameBoard gameBoard){
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
            gameBoard.gameBoard[0][0] = piece;
            return true;
        }
        else if (choice == 2){
            gameBoard.gameBoard[0][1]  = piece;
            return true;
        }
        else if (choice == 3){
            gameBoard.gameBoard[0][2] = piece;
            return true;
        }
        else if (choice == 4){
            gameBoard.gameBoard[1][0] = piece;
            return true;
        }
        else if (choice == 5){
            gameBoard.gameBoard[1][1] = piece;
            return true;
        }
        else if (choice == 6){
            gameBoard.gameBoard[1][2] = piece;
            return true;
        }
        else if (choice == 7) {
            gameBoard.gameBoard[2][0] = piece;
            return true;
        }
        else if (choice == 8){
            gameBoard.gameBoard[2][1] = piece;
            return true;
        }
        else if (choice == 9){
            gameBoard.gameBoard[2][2] = piece;
            return true;
        }
        return false;
    }


}
