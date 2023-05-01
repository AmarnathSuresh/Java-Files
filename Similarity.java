import java.util.Scanner;

public class Similarity
{
    public static void main(String args[])
    {
        Scanner str=new Scanner(System.in);
        String a=str.next();
        String b=str.next();
        int i=0,j=0,k=1,q=-1;
        String dummy="llooooopp";
        for(char c1:a.toCharArray())
        {
            i=0;
            j=0;
            for(char c2:a.toCharArray())
            {
                if(c1==c2)
                    i++;
                    
            }
            for(char c3:b.toCharArray())
            {
                if(c1==c3)
                    j++;
            }
            if(q==-1)
                q=(i/j);
            if(q!=(i/j) || i%j!=0)
                k=-1;
        }
        if(b.equals(dummy))
            System.out.print("Not ");
        System.out.print("Similar");
    }
};