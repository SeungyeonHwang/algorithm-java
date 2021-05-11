import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 체육복
 */
public class Solution_4 {
    public int solution(int n, int[] lost, int[] reserve) {
        int people[] = new int[n];
        int answer = n;

        for (int l : lost) {
            people[l - 1]--;
        }
        for (int r : reserve) {
            people[r - 1]++;
        }

        for (int i = 0; i < people.length; i++) {

            if (people[i] == -1) {

                //앞이 reserve
                if (i - 1 >= 0 && people[i - 1] == 1) {
                    people[i]++;
                    people[i - 1]--;

                    //뒤가 reserve
                } else if (i + 1 <= people.length && people[i + 1] == 1) {
                    people[i]++;
                    people[i + 1]--;
                } else {
                    answer--;
                }
            }
        }
        return answer;
    }


    @Test
    public void Answer() {
        Assertions.assertEquals(4, solution(
                5,
                new int[]{2, 4},
                new int[]{3}));
    }
}