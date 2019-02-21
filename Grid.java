public class Grid implements Gridable{
    Gridable[] array;
    char value = '\0';

    /**
     * Default constructor
     */
    public Grid()
    {
        array = new Gridable[9];
    }

    /**
     * Fills the grid with new grids
     */
    public void fillGrids()
    {
        for(int i = 0; i<array.length; i++)
        {
            array[i] = new Grid();
        }
    }

    /**
     * Fills the grid with new cells
     */
    public void fillCells()
    {
        for(int i = 0; i<array.length; i++)
        {
            array[i] = new Cell();
        }
    }

    /**
     * If the grid is picked, the player needs to make another choice.
     * @param c The Player character (X/O)
     * @return Whether the placement was successful.
     */
    public boolean pick(char c)
    {
        if(value == '\0')
        {
            int x = Player.choose(array);
            return array[x].pick(c);
        }
        else
            return false;
    }
}
