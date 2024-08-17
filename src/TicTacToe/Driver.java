package TicTacToe;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

enum Piece
{
    X, O
}
public class Driver {
    public static void main(String[] args) {
        Game game = new Game();

        List<Player> players = new ArrayList<>();
        Player pradeep = new Player("Pradeep", new PlayingPieceX(Piece.X));
        Player tanishi = new Player("Tanishi", new PlayingPieceO(Piece.O));
        players.add(pradeep);
        players.add(tanishi);

        game.initializeGame(3,players);
        game.startGame();
    }
}
