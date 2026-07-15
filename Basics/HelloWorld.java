public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}