package baekjoon.step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 백준 9012번 - 괄호
 * 난이도: 실버 4
 * 문제: 괄호 문자열이 올바른지 판단하세요.
 *
 * 입력:
 *   - 첫째 줄: 테스트 케이스 수 T
 *   - 다음 T줄: 괄호 문자열
 *
 * 출력:
 *   - 올바른 괄호 문자열이면 "YES", 아니면 "NO"
 *
 * 예)
 *   입력: (())()  →  출력: YES
 *   입력: (()    →  출력: NO
 *   입력: ))(    →  출력: NO
 */
public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String str = br.readLine();
            int count = 0;
            boolean valid = true;

            for(int j=0; j < str.length(); j++){
                if(str.charAt(j)=='(') count ++;
                else count--;

                if(count < 0) {
                    valid = false;
                    break;
                }
            }

            if (count !=0) valid = false;

            System.out.println(valid ? "YES" : "NO");
        }

    }
}