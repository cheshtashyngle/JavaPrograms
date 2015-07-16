/**
 * Created by chestha on 16/07/15.
 */
public class direction
{
    private char d;
    private direction right,left;
    direction(char d)
    {
        this.d=d;
    }
    char getD()
    {
        return d;
    }
    direction getRight()
    {
        return right;
    }
    direction getLeft()
    {
        return left;
    }
    void setRight(direction d)
    {
        right=d;
    }
    void setLeft(direction d)
    {
        left = d;
    }
}
