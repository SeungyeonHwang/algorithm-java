import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ??
 */
public class Solution_0_Format {
    public String solution(String[] participant, String[] completion) {

        return null;
    }

    @Test
    public void Answer() {
        Assertions.assertEquals("mislav", solution(
                new String[]{"mislav", "stanko", "mislav", "ana", "mislav"},  //참가자
                new String[]{"stanko", "ana", "mislav"}));  //완주자
    }
}