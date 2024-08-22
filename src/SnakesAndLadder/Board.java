package SnakesAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell [][] cells;
    int size;
    public Board(int size, int snake_count, int ladder_count)
    {
        this.size = size;
        cells = new Cell[size][size];
        initializeBoard(snake_count, ladder_count);
    }
    Cell getCell(int value)
    {
        if(value >= size*size)
            return new Cell();
        return cells[value/size][value%size];
    }
    void initializeBoard(int snake_count, int ladder_count)
    {
        //initialzes Cells with jump objects to keep the position of snakes_count and ladders_count
        for(int i = 0; i < cells.length; i++)
        {
            for(int j = 0; j < cells.length; j++)
            {
                cells[i][j] = new Cell();
//                cells[i][j].jump = new Jump();
            }
        }
        //Fill the board with snake_count and ladder_count
        while(snake_count -- > 0)
        {
            //initilize snake by generating snakes randomly
            int start = ThreadLocalRandom.current().nextInt(2, size*size -1 );
            int end = ThreadLocalRandom.current().nextInt(2, size*size - 1);
            if(start <= end)
                    continue;
            Cell cell = getCell(start);
            cell.jump = new Jump();
            cell.jump.start = start;
            cell.jump.end = end;
        }

        //FIll the board with the ladders
        while(ladder_count -- > 0)
        {
            //initilize snake by generating snakes randomly
            int start = ThreadLocalRandom.current().nextInt(2, size*size - 1);
            int end = ThreadLocalRandom.current().nextInt(2, size*size - 1);

            if(start >= end)
                continue;
            Cell cell = getCell(start);
            cell.jump = new Jump();
            cell.jump.start = start;
            cell.jump.end = end;
        }
    }
}
