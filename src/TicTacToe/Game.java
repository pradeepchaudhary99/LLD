package TicTacToe;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Game {
    List<Player> players;
    Board board;



    /* Function taking (x,y) */
    boolean isWinPossible(PlayingPiece piece, int x, int y)
    {
        // check diagonally, column wise and row wise
        //count number of pieces in the row columnd and the diagonal and all four diagonals
        int countRow = 0;
        int countCol = 0;
        for(int i = 0; i < board.size; i++)
        {
            if(board.board[x][i] != null && board.board[x][i].type == piece.type)
                countRow++;

            if(board.board[i][y] != null && board.board[i][y].type == piece.type)
                countCol++;
        }

        if(countRow == board.size || countCol == board.size)
                return true;

        //check for diagonals
        //when the current element is a mid element or a coornor elements
        int n = board.size;
        int countDiag = 0;
        int otherDiag = 0;
        if(x == 0 || x == n-1 || y == 0 || y == n-1 || x == y || (x+y) == n - 1)
        {
            //check for the diagonal elements
            for(int i = 0; i < board.size; i++)
            {
                if(board.board[i][i] != null && board.board[i][i].type == piece.type)
                    countDiag++;
                if(board.board[i][n - 1 - i] != null && board.board[i][n - 1 - i].type == piece.type)
                    otherDiag++;
            }
        }

        if(countDiag == n || otherDiag == n)
                return true;

        return false;
    }

    void initializeGame(int size, List<Player> players)
    {
        board = new Board(size);
        this.players = players;
    }
    void startGame()
    {
        boolean win = false;
        int idx = 0;
        while(!win)
        {
            Player player = players.get(idx);
            // Get the Coordinate information from the player
            // 3*3 -->
            int x = 0, y = 0;
            while(true) {
                System.out.println("Hey " + player.name + " please enter the coordinates in this format x,y");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                String[] values = input.split(",");
                x = Integer.valueOf(values[0]);
                y = Integer.valueOf(values[1]);
                if(x >= board.size || y >= board.size || x < 0 || y < 0){
                    System.out.println("Invalid coordinates, enter again");
                    continue;
                }
                if(board.board[x][y] == null)
                {
                    break;
                }
                else{
                    //check if its a tie// no place to further add.
                    System.out.println("Invalid Coordinates enter again");
                }
            }
            //adding the piece for the current player
            board.addPiece(player.piece, x, y);
            int num_element = printBoard();
            if(isWinPossible(player.piece, x, y)) {
                System.out.println("Player " +player.name +" WON");
                win = true;
            }

            //check for tie
            if(num_element == board.size * board.size){
                System.out.println("Its a Tie");
                break;
            }
            idx = (idx+1)%players.size();
        }
    }

    int printBoard()
    {
        int number_of_element = 0;
        for(int i = 0; i < board.size; i++) {
            for (int j = 0; j < board.size; j++)
            {
                if(board.board[i][j] == null)
                    System.out.print(" |");
                else
                {
                    System.out.print(board.board[i][j].type +"|");
                    number_of_element++;
                }
            }
            System.out.println();
        }
        return number_of_element;
    }
}
