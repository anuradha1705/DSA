// question.  Make a function to multiply 2 numbers and return the product.

import java.util.Scanner;

public class FunctionMulti {
   public static int calculateProduct(int a, int b) {
    return a*b;
    
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        System.out.println("Product of 2 number is :"+ calculateProduct(a, b));
    }
}