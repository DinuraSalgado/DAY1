import java.util.Scanner;

class TrianglePattern {
    public static void Triangle(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                } else if (i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Digit: ");
        int k = sc.nextInt();
        Triangle(k);

    }
}
