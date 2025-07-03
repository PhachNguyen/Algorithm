import java.lang.reflect.Type;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[100];
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            arr[i]=n+ " ";
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i]+" ");
            System.out.println("KDL: " + arr[i].getClass().getName());
        }
    }
}
