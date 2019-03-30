public class Player {
    private char type;

    public Player(int pNum)
    {
        if(pNum == 1)
            type = 'X';
        else if(pNum == 2)
            type = 'O';
        else
            throw new IllegalArgumentException("Bad player number: pNum must be 1 or 2");
    }

    void pick(Grid grid)
    {

    }
}
