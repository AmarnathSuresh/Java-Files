import java.util.Scanner;

public class int_float
{
  public static void main(String[] args)
  {
	int x,y,z;
    Scanner input=new Scanner(System.in);
    x=input.nextInt();
    y=input.nextInt();
    z=input.nextInt();

    if (x>0 && y>0 && z>0)
	{
      double mean=(x+y+z)/3.0;
      if (mean==(int)mean)
	  {
	  	System.out.println(String.format("%.1d",mean));
	  }
	  else
	  {
	  	System.out.println(String.format("%.1f",mean-0.1));
	  }
	}
  }
}