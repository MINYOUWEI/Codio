import java.util.Scanner;
public class practical2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number:"); int x = input.nextInt();
        System.out.print("Enter your second number:"); int y = input.nextInt();
        if (x > y) {
            System.out.println("error");
        } else {
            int sum = 0;
            while (x <= y) {
                sum = sum + x;
                x = x + 1;
            }
            System.out.print(sum<br>);
        }
    }
}
