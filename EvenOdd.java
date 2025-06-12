import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
    
}

/*
 * Even and Odd
 * How to check even and odd number --> we will use modules operator(%) for finding even and odd number.
 * After divided 2  the  remainder will 0 then this is a even number and remainder isn't 0 then this is a odd number.
 * Even  (x/2 = 0)
 * Odd  (x/2 != 0) 
 */
