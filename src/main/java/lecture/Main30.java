package lecture;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 학급 회장(해쉬)
 */
class Main30 {
    public char solution(int n, String s) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for (char key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;

            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Main30 T = new Main30();
        Scanner kb = new Scanner(System.in);

        //입력
        int n = kb.nextInt();
        String s = kb.next();

        //출력
        System.out.print(T.solution(n, s));
    }
}