import java.util.Scanner;

// Đổi hệ thập phân sang nhị phân
public class DEC2BIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng test case
        int T;
        do {
            System.out.print("Nhập số lượng test case: ");
            T = sc.nextInt();
        } while (T <= 0); // Lặp lại nếu T không hợp lệ

        long[] arr = new long[T]; // Mảng lưu các số đầu vào

        // Nhập T số nguyên
        for (int i = 0; i < T; i++) {
            long n;
            do {
                System.out.print("Nhập số thứ " + (i + 1) + ": ");
                n = sc.nextLong();
            } while (n < 0); // Kiểm tra số âm

            arr[i] = n;
        }
// Init một mảng lưu giá trị
        String[] dec = new String[T];
        // In ra nhị phân của từng số
        for (int i = 0; i < T; i++) {
//            Sử dụng thư viện
//            String bin = Long.toBinaryString(arr[i]);
//            System.out.println("Số " + arr[i] + " → nhị phân: " + bin);
            // Sử dụng chạy
        long n = arr[i];

        }
    }
}
