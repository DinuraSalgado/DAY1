import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                 System.out.println(
                    "1 = HalfRightTriangle \n2 = InvertedHalfLeftTriangle \n3 = InvertedHaflRightTriangle \n4 = LeftRightTriangle \n5 = HallowSquare");
                 System.out.println("Pick a Shape : ");

        int option = sc.nextInt();
        UserPicks(option);
    }

    public static void UserPicks(int a)
    {
        switch(a){
            case 1:
                HalfRightTriangle(5);
                break;
            case 2:
                InvertedHalfLeftTriangle(5);
                break;
            case 3:
                InvertedHalfRightTriangle(5);
                break;
            case 4:
                LeftRightTriangle(5);
                break;
            case 5:
                HallowSquare(5);
                break;
             default:
                System.out.println("Invalid option");

        }
    }

    public static void HalfRightTriangle(int n )
    {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void InvertedHalfLeftTriangle(int n )
    {
        for (int i = n; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void InvertedHalfRightTriangle(int n )
    {
        for (int i = n; i >= 1; --i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void LeftRightTriangle(int n )
    {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HallowSquare(int n)
    {
        {
            for (int i = 0; i < n; i++ ) {
                for (int j = 0 ; j < n; j++ ) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print(" "+ " ");
                    }
                }
                System.out.println();
            }
        }
    }
}