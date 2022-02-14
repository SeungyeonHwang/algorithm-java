package lecture;

import java.util.Scanner;

/**
 * 점수 계산
 */
class Main18 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int score = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                score++;
                answer += score;
            } else {
                score = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main18 T = new Main18();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //출력
        System.out.print(T.solution(n, arr));
    }
}