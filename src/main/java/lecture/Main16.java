package lecture;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체 -> 가장 빠르다)
 */
class Main16 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) arr[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main16 T = new Main16();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();

        //출력
        System.out.println(T.solution(n));
    }
}