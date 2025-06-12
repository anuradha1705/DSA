import java.util.Scanner;

public class switchstmt {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    switch(button){
        case 1:
          System.out.println("Hello");
          break;

        case 2:
          System.out.println("Namaste");
          break;
        
        case 3:
          System.out.println("Bonjour");
          break;
        
        default:
         System.out.println("Invalid button");
    }
}
    
}



/*
 * switch statement Syntax -->
 
  switch(variable){
  
  case 1: 
     stmt1;
     break;

   case 2: 
     stmt2;
     break;
    
   case 3: 
     stmt3;
     break;

default:
   stmt 4;


  } 
 */