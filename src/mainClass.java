/**
 * Created by chestha on 16/07/15.
 */
public class mainClass
{
    public static void main(String[] args)
    {
        direction n=new direction('N');
        direction s=new direction('S');
        direction e=new direction('E');
        direction w=new direction('W');
        n.setRight(e);
        e.setRight(s);
        s.setRight(w);
        w.setRight(n);
        n.setLeft(w);
        e.setLeft(n);
        s.setLeft(e);
        w.setLeft(s);
        mars myMars=new mars(5,5);
        rover rover1=new rover(1,2,n);
        rover1.performAction('L');
        rover1.performAction('M');
        rover1.performAction('L');
        rover1.performAction('M');
        rover1.performAction('L');
        rover1.performAction('M');
        rover1.performAction('L');
        rover1.performAction('M');
        rover1.performAction('M');
        int x=rover1.getX();
        int y=rover1.getY();
        direction d=rover1.getD();
        char dir=d.getD();
        System.out.print(x+" "+y+" "+dir);
    }
}
