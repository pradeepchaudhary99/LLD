package SnakesAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();
        Player player1 = new Player("Pradeep", 1);
        Player player2 = new Player("Tanishi", 1);
        playerList.add(player1);
        playerList.add(player2);

        Game game = new Game(10, 10,10,playerList);
        game.startGame();

    }
}
