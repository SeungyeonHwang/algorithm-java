package lecture;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 등수 구하기
 */
class Main19 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    rank++;
                }
            }
            answer.add(rank);
        }
        return answer;
    }

    public static void main(String[] args) {

        Main19 T = new Main19();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        //출력
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}