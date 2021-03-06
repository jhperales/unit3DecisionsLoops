import info.gridworld.actor.Actor;
import info.gridworld.world.World;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.Arrays;
import java.util.ArrayList;



/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @jperales
 * @version 10 November 2015 (Last modified)
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 11;
    private final int COLS = 11;
    ArrayList<Actor> objects = new ArrayList<Actor>();
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the ten cells initially alive
        final int X1 = 4, Y1 = 3;
        final int X2 = 5, Y2 = 3;
        final int X3 = 6, Y3 = 3;
        final int X4 = 5, Y4 = 4;
        final int X5 = 5, Y5 = 5;
        final int X6 = 5, Y6 = 6;
        final int X7 = 5, Y7 = 7;
        final int X8 = 4, Y8 = 7;
        final int X9 = 3, Y9 = 7;
        final int X10 = 3, Y10 = 6;
        
        

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        
        
        Rock rock1 = new Rock();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock1);
        objects.add(rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, rock2);
        objects.add(rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, rock3);
        objects.add(rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, rock4);
        objects.add(rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, rock5);
        objects.add(rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, rock6);
        objects.add(rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, rock7);
        objects.add(rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, rock8);
        objects.add(rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(Y9, X9);
        grid.put(loc9, rock9);
        objects.add(rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(Y10, X10);
        grid.put(loc10, rock10);
        objects.add(rock10);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // insert magic here...
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);
       
        
        for (int f = 0; f < ROWS; f++)
        {
            for (int j = 0; j < COLS; j++)
            {
                Location location = new Location(f, j);
                ArrayList<Location> listOfOccupied = new ArrayList<Location>();
                listOfOccupied.addAll(grid.getOccupiedAdjacentLocations(location));
                if (getActor(f, j)!= null)
                {
                    if (listOfOccupied.size() == 2 || listOfOccupied.size() == 3)
                    {
                        Rock rock = new Rock();
                        Location loc = new Location(f, j);
                        newGrid.put(loc, rock);
                    }
                }
                if (getActor(f, j) == null)
                {
                    if (listOfOccupied.size() == 3)
                    {
                        Rock rock = new Rock();
                        Location loc = new Location(f, j);
                        newGrid.put(loc, rock);
                    }
                }
                
            }
        }
        
        world.setGrid(newGrid);
        world.show();
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        game.createNextGeneration();
        game.createNextGeneration();
        game.createNextGeneration();
    }

}
