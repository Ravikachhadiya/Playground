import java.util.Scanner;
import java.lang.Math;

class Main
{
  public static void main(String args[])
  {
   	Scanner sc = new Scanner(System.in);
   	int n[] = new int[3];  
    n[0] = sc.nextInt();
    n[1] = sc.nextInt();
    n[2] = sc.nextInt();
    int N = 1000;
    
    int key = 0;
    
    for(int i = 0;i<4;i++){
      if(i % 2 == 0){
        key = key + Math.min(Math.min(n[0]/N, n[1]/N),n[2]/N) * N;
      }
      else{
       key = key + Math.max(Math.max(n[0]/N, n[1]/N),n[2]/N) * N; 
      }
      n[0] = n[0] % N;
      n[1] = n[1] % N;
      n[2] = n[2] % N;
      N = N/10;
    } 
    System.out.println(key);
  }
}