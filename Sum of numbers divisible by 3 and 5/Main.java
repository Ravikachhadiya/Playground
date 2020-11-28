import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
   	Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int sum = 0;
    
    for(int i = n1; i<n2; i++){
     if(i % 3 == 0 && i % 5 == 0){
       sum += i;
     }
    }
    System.out.println(sum);
  }
}