import java.util.Scanner;

 class HalfTriangle {
    public static void HalfTriangle(int n)
    {
        int a, b;

        for (a = 0; a < n; a++) {

            for (b = 0; b <= a; b++) {
                if (b == 0 || b == a || a == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Digit: ");
        int k = sc.nextInt();

        HalfTriangle(k);


    }
}
