public class SolidRectangle {
    public static void main(String[] args) {
        
        // outer loop  --> rows
        for(int i = 1; i <= 4; i++){
           // inner loop  --> columns
            for(int j = 1; j <= 5; j++){
              System.out.print(" * ");
           }
           System.out.println(" ");
        }
    }
    
}
