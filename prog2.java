import java.util.Scanner;

class prog2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, s = 0, b;
        
        System.out.println("Enter no =");
        n = sc.nextInt();
        
        while (n > 0) {
            b = n % 10;
            s = s * 10 + b;
            n = n / 10;
        }
        
        System.out.println("The reverse no = " + s);
        sc.close(); // Closing the scanner to prevent resource leak
    }
}
