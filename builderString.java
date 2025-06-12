public class builderString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char At index 0
        System.out.println(sb.charAt(0));

        //set chae at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        
    }
}
