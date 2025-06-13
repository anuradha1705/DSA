import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       // oper = 1 --> set operator  , oper = 0 --> clear
        int oper = sc.nextInt();

        int n = 5; // 0101 -> 0111 -> decimal number 7
        int pos = 1;
        int bitMask = 1 << pos;

       if (oper == 1) {
        //set

          int newNumber = bitMask | n ;
         System.out.println(newNumber);
        }else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
       }
      


    }
    
}
