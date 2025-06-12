public class SubString {
    public static void main(String[] args) {
        
        String sentence = "My name is Tony";

        //substring Syntax --> StringName.substring(beginIndex , endIndex);
        String name = sentence.substring(11,  sentence.length());
        System.out.println(name);
    }
    
}
