/**
 * Created by chestha on 16/07/15.
 */
import java.util.Scanner;
public class mainClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
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
        int marX=sc.nextInt();
        int marY=sc.nextInt();
        mars myMars=new mars(marX,marY);
        rover rover1=new rover(sc.nextInt(),sc.nextInt(),n);
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
