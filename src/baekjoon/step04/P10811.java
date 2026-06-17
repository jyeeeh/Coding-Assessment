package baekjoon.step04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 * 백준 10811번 - 공 바꾸기
 * 난이도: 브론즈 2
 * 문제: N개의 바구니에 M번의 명령을 수행 후 각 바구니의 공 번호를 출력하시오.
 *       명령: i j → i번부터 j번 바구니까지 순서를 뒤집는다.
 *
 * 입력:
 *   - 첫째 줄: N M (1 ≤ N ≤ 100, 1 ≤ M ≤ 100)
 *   - 다음 M줄: i j (1 ≤ i ≤ j ≤ N)
 *
 * 출력:
 *   - N개의 바구니에 들어있는 공 번호를 공백으로 구분하여 출력
 *
 * 예) 입력: 5 4 / 1 2 / 3 4 / 1 4 / 2 2  →  출력: 3 4 1 2 5
 */
public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N + 1];
        for (int i = 1; i <= N; i++) basket[i] = i; // 초기값: i번 바구니에 i번 공
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            // i~j 구간 뒤집는 로직
            int left = i;
            int right = j;
            while (left < right){
                int temp = basket[left];
                basket[left] = basket[right];
                basket[right] = temp;
                left++;
                right--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(basket[i]);
            if (i < N) sb.append(" ");
        }
        System.out.println(sb);
    }
}