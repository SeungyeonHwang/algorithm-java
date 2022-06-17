package Session2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

    static String[] name = new String[1000];
    static String[] number = new String[1000];
    static int n = 0;

    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("data-structure-java/input.txt"));

            while (inFile.hasNext()) { // detect End of File
                name[n] = inFile.next();// 하나의 문자열
                number[n] = inFile.next();
                n++;
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1); //0이외는 비정상 종료
        }

        bubbleSort(n, name, number);

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + ": " + number[i]);
        }
    }

    static void bubbleSort(int n, String[] name, String[] number) {
    }
}
