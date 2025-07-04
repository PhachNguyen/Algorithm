import java.util.*;

public class MAGPERM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K == 0) {
            // Trường hợp đặc biệt: B = A
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }
            return;
        }

        // Nếu N không chia hết cho (2 * K) thì không thể ghép cặp hoán vị được
        if (N % (2 * K) != 0) {
            System.out.println("-1");
            return;
        }

        int[] B = new int[N + 1]; // đánh số từ 1 đến N

        for (int i = 1; i <= N; i++) {
            // Nếu chưa gán, thì gán bằng i + K hoặc i - K (tạo chu kỳ hoán vị)
            if (B[i] == 0) {
                if (i + K <= N && B[i + K] == 0) {
                    B[i] = i + K;
                    B[i + K] = i;
                }
            }
        }

        // In kết quả từ 1 đến N
        for (int i = 1; i <= N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
