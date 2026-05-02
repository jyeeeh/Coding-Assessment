package baekjoon.step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 백준 8393번 - 합
 * 난이도: 실버 5
 * 문제: n이 주어졌을 때, 1부터 n까지 합을 구하세요.
 *
 * 입력:
 *   - 첫째 줄: n (1 ≤ n ≤ 10,000)
 *
 * 출력:
 *   - 1부터 n까지의 합
 */
public class P8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=1; i<=N; i++){
            sum += i;
        }

        System.out.print(sum);
    }
}