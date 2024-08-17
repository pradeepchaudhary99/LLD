package TicTacToe;
import java.util.List;
public class Board {
    int size;
    PlayingPiece [][]board;
    public Board(int size)
    {
        this.size = size;
        board = new PlayingPiece[size][size];
    }
    public boolean addPiece(PlayingPiece piece, int x, int y)
    {
        if(board[x][y] == null)
            board[x][y] = piece;
        return true;
    }
}
