package SnakesAndLadder;

import java.util.List;

public class Game {
    Board board;
    Dice dice;
    List<Player> playerList;
    public Game(int size, int snake_count, int ladder_count, List<Player> playerList)
    {
        this.playerList = playerList;
        dice = new Dice(1);
        board = new Board(size, snake_count, ladder_count);
    }
    public void startGame()
    {
        //Start the gamePlay
        System.out.println("---- Game is started ----");
        boolean win = false;
        int idx = 0;
        while(!win)
        {
            Player player = playerList.get(idx);
            // Roll Dice
            int diceValue = dice.rollDice();
            int newPosition = diceValue + player.currentPosition;

            //Check if Jump at the newPosition
            System.out.println(newPosition);
            Cell cell = board.getCell(newPosition);

            if(cell.jump != null)
            {
                //there is Either ladder or Snake at this position
                newPosition = cell.jump.end;
            }
            else
                newPosition+=1;

            System.out.println(player.id +" : is at "+ player.currentPosition +" --> New Position " + newPosition);

            player.currentPosition = newPosition;
            idx = (idx + 1)%playerList.size();

            if(newPosition >= board.size* board.size)
            {
                System.out.println("Player--> " + player.id +" WON");
                break;
            }
        }



    }
}
