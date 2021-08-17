package Lab;

import java.util.Scanner;


public class LabSeven {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
     System.out.println("Rock(✊) Paper(✋) Scissior(✂) Game ");
     System.out.println("\n1. Rock \n2. Paper\n3. Scissor");
    int p1,p2;
    System.out.print("Player 1 : ");
    p1 = sc.nextInt();
    System.out.print("Player 2 : ");
    p2 = sc.nextInt();
    
    if(p1==p2){
      System.out.println("Draw");
    }
    else 
    {
      if(p1 ==1 && p2==2){
        System.out.println("Player 2 win!");
      }
      else if(p1==1 && p2==3)
      {
        System.out.println("Player 1 win!");
      }
      else if(p1==2 && p2==3)
      {
        System.out.println("Player 2 win!");
      }
      else if(p1==2 && p2==3)
      {
        System.out.println("Player 1 win!");
      }
      else if(p1==3 && p2==1)
      {
        System.out.println("Player 2 win!");
      }
      else if(p1==3 && p2==2)
      {
        System.out.println("Player 1 win!");
      }
       
    }  

  }

}
