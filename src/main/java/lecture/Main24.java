package lecture;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 임시 반장 정하기
 */
class Main24 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        while(p1 < n) answer.add(a[p1++]);
        while(p2 < m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {

        Main24 T = new Main24();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }

        //출력
        for (int i : T.solution(n, m, arr, arr2)) {
            System.out.print(i + " ");
        }
    }
}