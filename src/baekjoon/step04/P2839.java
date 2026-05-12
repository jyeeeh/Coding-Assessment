package baekjoon.step04;

import java.util.Scanner;

/**
 * 백준 2839번 - 설탕 배달
 * 난이도: 실버 4
 * 문제: N kg의 설탕을 3kg, 5kg 봉지에 나눠 담을 때 봉지의 최솟값을 구하세요.
 *       정확히 N kg을 만들 수 없으면 -1을 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: N (3 ≤ N ≤ 5000)
 *
 * 출력:
 *   - 봉지의 최솟값 (불가능하면 -1)
 *
 *
 * 예)
 *   입력: 18  →  출력: 4  (5+5+5+3)
 *   입력: 4   →  출력: -1
 */
public class P2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        while(N % 5 != 0){
            N -= 3;
            count++;
            if(N < 0){
                 System.out.print(-1);
                 return;
            }
        }
        System.out.print(count + N / 5);
    }
}
