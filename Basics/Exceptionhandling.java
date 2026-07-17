public class Exceptionhandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(NumberFormatException e){
            System.out.println("Error: Invalid number format.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index is out of bounds.");
        }
       System.out.println(b);
    }
}
