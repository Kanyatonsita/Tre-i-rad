
public class GameBoard {
    /* Board design.
           [0][0] | [0][1] | [0][2]
             ––   ++  ––   ++  ––
           [1][0] | [1][1] | [1][2]
             ––   ++   ––  ++   --
           [2][0] | [2][1] | [2][2]
         */
  protected char[][] gameBoard = {{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},};

    //Print a game board.
    public void printBoard() {
        System.out.println(gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2]);
        System.out.println("––" + "++" + "––" + "++" + "––");
        System.out.println(gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2]);
        System.out.println("––" + "++" + "––" + "++" + "––");
        System.out.println(gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2]);
    }


    //Method to Check the winner!! and if the game is tied!
    public boolean checkWin() {


        if (gameBoard[0][0] == 'X' && gameBoard[0][1] == 'X' && gameBoard[0][2] == 'X') {
                    System.out.println("Congratulations player 1 you win!!");
                    return true;
        } else if (gameBoard[1][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[1][2] == 'X') {
                    System.out.println("Congratulations player 1 you win!!");
                    return true;
        }else if (gameBoard[2][0] == 'X' && gameBoard[2][1] == 'X' && gameBoard[2][2] == 'X') {
                    System.out.println("Congratulations player 1 you win!!");
                    return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
                    System.out.println("Congratulations player 1 you win!!");
                    return true;
        }else if (gameBoard[0][1] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][1] == 'X') {
                    System.out.println("Congratulations player 1 you win!!");
                    return true;
        } else if(gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
                    System.out.println("Congratulations player 1 you win!!");
                    return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X') {
                    System.out.println("Congratulations player 1 you win!!");
                    return true;
        } else if (gameBoard[0][2] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][0] == 'X') {
                    System.out.println("Congratulations player 1 you win!!");
                    return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[0][1] == 'O' && gameBoard[0][2] == 'O') {
                    System.out.println("Congratulations player 2 you win!!");
                    return true;
        } else if (gameBoard[1][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[1][2] == 'O') {
                    System.out.println("Congratulations player 2 you win!!");
                    return true;
        } else if (gameBoard[2][0] == 'O' && gameBoard[2][1] == 'O' && gameBoard[2][2] == 'O') {
                    System.out.println("Congratulations player 2 you win!!");
                    return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
                     System.out.println("Congratulations player 2 you win!!");
                     return true;
        } else if (gameBoard[0][1] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][1] == 'O') {
                     System.out.println("Congratulations player 2 you win!!");
                     return true;
        } else if (gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
                     System.out.println("Congratulations player 2 you win!!");
                     return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O') {
                     System.out.println("Congratulations player 2 you win!!");
                     return true;
        } else if (gameBoard[0][2] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][0] == 'O') {
                     System.out.println("Congratulations player 2 you win!!");
                     return true;
        } else if (gameBoard[0][0] != ' ' && gameBoard[0][1] != ' ' && gameBoard[0][2] != ' ' &&
                   gameBoard[1][0] != ' ' && gameBoard[1][1] != ' ' && gameBoard[1][2] != ' ' &&
                   gameBoard[2][0] != ' ' && gameBoard[2][1] != ' ' && gameBoard[2][2] != ' ') {
                   System.out.println("The game is tied..!");
                   return true;
        }
        return false;
    }

    //Method to see if a move to a position is valid using with switch case if statements.
    public boolean checkIfEmpty(int userInput) {

        switch (userInput) {
            case 1: {
                if (gameBoard[0][0] == ' ') {
                    return true;
                }
                return false;
            }
            case 2: {
                if (gameBoard[0][1] == ' ') {
                    return true;
                }
                return false;
            }
            case 3: {
                if (gameBoard[0][2] == ' ') {
                    return true;
                }
                return false;
            }
            case 4: {
                if (gameBoard[1][0] == ' ') {
                    return true;
                }
                return false;
            }
            case 5: {
                if (gameBoard[1][1] == ' ') {
                    return true;
                }
                return false;
            }
            case 6: {
                if (gameBoard[1][2] == ' ') {
                    return true;
                }
                return false;
            }
            case 7: {
                if (gameBoard[2][0] == ' ') {
                    return true;
                }
                return false;
            }
            case 8: {
                if (gameBoard[2][1] == ' ') {
                    return true;
                }
                return false;
            }
            case 9: {
                if (gameBoard[2][2] == ' ') {
                    return true;
                }
                return false;
            }
            default:
                return false;
        }
    }


        //Method for clear game board after the game!
        public void clearBoard(){
            gameBoard[0][0] = ' ';
            gameBoard[0][1] = ' ';
            gameBoard[0][2] = ' ';
            gameBoard[1][0] = ' ';
            gameBoard[1][1] = ' ';
            gameBoard[1][2] = ' ';
            gameBoard[2][0] = ' ';
            gameBoard[2][1] = ' ';
            gameBoard[2][2] = ' ';
        }

    }







