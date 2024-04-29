import java.util.*;
public class RR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5};
        int n=1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            System.out.println(" ");
        }
        for (int i = 0; i < n; i++) {
            int j, last;
            last = a.length-1;
            for (j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            System.out.println(" ");
        }
    }
}



