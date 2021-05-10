import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * K번째수
 */
public class Solution_3 {
    public int[] solution(int[] array, int[][] commands) {
        final int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];

        }

        return answer;
    }

    @Test
    public void Answer() {
        Assertions.assertEquals(null, solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2,5,3},{4,4,1},{1,7,3}}));
    }
}