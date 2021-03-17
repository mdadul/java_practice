import java.util.Scanner;
public class Bookstore{
    static Scanner myscanner = new Scanner(System.in);
    static String[] book ={"Java","C/C++","Pythone"};
    static final double StudentDiscount = 0.3;
    static final double TeacherDiscount = 0.4;
    static final double AlienDiscount = 0.0;
    public static void main (String[] args) {
        prln("-----Welcome To B O O K S T O R E ---------");
        prln("Which book you want?\nAns: ");
        String userchoice = myscanner.nextLine();
        
        
        if(book[0].toLowerCase().equals(userchoice.toLowerCase())){
            prln("You opted for "+ book[0]+" Book ");
            price();
        }
        else if(book[1].toLowerCase().equals(userchoice.toLowerCase())){
            prln("You opted for "+ book[1]+" Book ");
            price();
        }
        else if(book[2].toLowerCase().equals(userchoice.toLowerCase())){
            prln("You opted for "+ book[2]+" Book ");
            price();
        }
        else{
            prln("Sorry! Your book "+ userchoice+" is not found");
        }
    }
    static void price(){
       prln("Are your student/Teache/Alien?\nAns: ");
       String ans = myscanner.nextLine();
       
       double price = 200;
       if(ans.toLowerCase().equals("teacher")){
            price = price-(price*TeacherDiscount);   
       }
       else if(ans.toLowerCase().equals("student")){
           price = price-(price*StudentDiscount);
       }
       else if(ans.toLowerCase().equals("alien")){
           price = price-(price*AlienDiscount);
       }
       else{
           prln("Sorry we can not serve you");
       }
       showprice(price);
    }
    static void showprice(double price){
        prln("Your total payable ammount "+ price);
        prln("\nT H A N K Y O U ");
    }
    static void prln(Object anyobject){
        System.out.print(anyobject);
    }
}