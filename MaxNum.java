package Lab;

import java.util.Scanner;


public class LabTwo {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
     
     int A,B,C,D;
     A = sc.nextInt();
     B = sc.nextInt();
     C = sc.nextInt();
     D = sc.nextInt();
     
     int mx = max(A,max(B,max(C,D))); 
     System.out.println(mx);
     

  }
  public static int max(int a,int b)
  {
    if(a>b) return a;
    else return b;
  }

}
