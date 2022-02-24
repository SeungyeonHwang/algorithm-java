package lecture;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 아나그램(해쉬)
 */
class Main31 {
    public String solution(String a, String b) {
        String answer = "YES";
        boolean flag = true;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main31 T = new Main31();
        Scanner kb = new Scanner(System.in);

        //입력
        String a = kb.next();
        String b = kb.next();

        //출력
        System.out.print(T.solution(a, b));
    }
}