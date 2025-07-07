import java.util.*;

public class PTIT602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Số test case

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(); // Độ dài dãy
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Tìm 3 số lớn nhất khác nhau
            Integer max1 = null, max2 = null, max3 = null;

            for (int num : a) {
                if (max1 == null || num > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = num;
                } else if (num != max1 && (max2 == null || num > max2)) {
                    max3 = max2;
                    max2 = num;
                } else if (num != max1 && num != max2 && (max3 == null || num > max3)) {
                    max3 = num;
                }
            }

            if (max3 == null) {
                System.out.println("Khong the tim duoc!");
            } else {
                // Tìm vị trí xuất hiện đầu tiên của max3
                for (int i = 0; i < n; i++) {
                    if (a[i] == max3) {
                        System.out.println(max3 + " " + (i + 1));
                        break;
                    }
                }
            }
        }

        sc.close();
    }
}
