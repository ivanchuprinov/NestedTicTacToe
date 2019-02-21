public class Cell implements Gridable {
    char value = '\0';

    public boolean pick(char c)
    {
        if(value == '\0') {
            value += c;
            return true;
        }
        else
            return false;
    }
}
