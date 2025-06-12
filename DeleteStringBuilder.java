import java.util.Scanner;

public class DeleteStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);
    
        /*delete the extra 'n'
          delete Syntax --> 
        .delete( start string, end string);
         
         */
        sb.delete(2, 3);
        System.out.println(sb);
        
    }
    
}
