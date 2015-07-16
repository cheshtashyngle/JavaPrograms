/**
 * Created by chestha on 16/07/15.
 */
public class rover
{
    private  int x;
    private int y;
    private direction d;
    rover(int x,int y,direction d )
    {
        this.x = x;
        this.y = y;
        this.d = d;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    direction getD()
    {
        return d;
    }
    void setX(int x)
    {
        this.x=x;
    }
    void setY(int y)
    {
        this.y=y;
    }
    void setD(direction d)
    {
        this.d=d;
    }
    void performAction(char inst)
    {
        if(inst=='L')
           d=d.getLeft();
        else if(inst=='R')
            d=d.getRight();
        else
        {
            if(d.getD()=='N')
                y++;
            else if(d.getD()=='S')
                y--;
            else if(d.getD()=='E')
                x++;
            else
                x--;
        }
    }
}

