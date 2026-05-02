package baekjoon.step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 백준 25314번 - 코딩은 체육과목 입니다
 * 난이도: 실버 4
 * 문제: N바이트 정수를 선언할 때 필요한 자료형 이름을 출력하세요.
 *
 * 입력:
 *   - 첫째 줄: N (4 ≤ N ≤ 1,000, N은 4의 배수)
 *
 * 출력:
 *   - N/4 개의 "long"을 공백으로 구분하여 출력
 *   - 예) N=4  → long
 *   - 예) N=8  → long long
 *   - 예) N=16 → long long long long
 */
public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N/4; i++){
            System.out.print(i==0 ? "long" : " long");
        }

    }
}