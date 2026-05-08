package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1978번 - 소수 찾기
 * 난이도: 실버 4
 * 문제: N개의 수가 주어졌을 때, 소수가 몇 개인지 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: N (1 ≤ N ≤ 100)
 *   - 둘째 줄: N개의 수 (1 ≤ 수 ≤ 1,000)
 *
 * 출력:
 *   - 소수의 개수
 *
 * 예) 입력: 4 / 1 3 5 7  →  출력: 3
 */
public class P1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 소수 개수
        int count = 0;

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            // 2보다 작으면 건너뜀
            if(num < 2) continue;
            // 소수라고 가정
            boolean isPrime = true;
            for(int j=2; j*j<= num; j++){
                if(num % j == 0){
                    isPrime = false;
                    // 나누어 떨어지면 소수 아님
                    break;
                }
            }
            if (isPrime) count++;
        }

        System.out.println(count);
    }
}