
import java.util.Scanner;

public class InputSizeArray {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int number[] = new int[size];
       
     //input 
     for(int i=0; i<size; i++){
        number[i] = sc.nextInt();
     }

        int x = sc.nextInt();
        System.out.println("enter the value of x  is :"+ x);
      //output  
    for(int i=0; i<number.length; i++){
        if (number[i] == x) {
            System.out.println("x is found at index : "+ i);
        }
     }

    }
    
}
