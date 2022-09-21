import java.util.Scanner;
class Example12 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter first number");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        a = inputValue.nextInt();

        System.out.println("Enter second number");
        b = inputValue.nextInt();


        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
