import java.util.Scanner;

public class CopyOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            System.out.println(" ");
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            System.out.println("");
        }
    }
}


