import java.util.Scanner;

public class IfStmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("A1dult");
            
        }
        else{
            System.out.println("Not Adult");
        }
    }
    
}
  
/*
 * if Statement Syntax ->
    
   stmt 1;
   stmt 2;

   if(condition){
   
       stmt 3;
       stmt 4;

   }

   else{
   
        stmt 5;
        stmt 6;

   }
    
   stmt 7;
   stmt 8;

   * if condition is true then print curly brackets stmt print if condition is false then print else stmt.
 */