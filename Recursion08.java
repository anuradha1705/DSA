public class Recursion08 {
    static void reverse(String str, int index) {
        if (index < 0)
            return;
        System.out.print(str.charAt(index));
        reverse(str, index - 1);
    }

    public static void main(String[] args) {
        String s = "hello";
        reverse(s, s.length() - 1);
    }
}
