import java.util.Scanner;
import java.lang.Math;

class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int minApples = sc.nextInt();
	double totalApplesInSquare = 0;
	int unit =0;
	while(minApples>totalApplesInSquare){
		unit++;

		totalApplesInSquare +=12*Math.pow(unit,2);
	}

	int ans = unit*8;
    
    System.out.println(ans);

  }
}