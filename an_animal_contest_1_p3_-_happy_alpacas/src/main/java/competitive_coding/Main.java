package competitive_coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main r = new Main();
        r.run();
    }

    public void run() throws IOException {
        long start = System.currentTimeMillis();

        System.out.println(howTheyHappy().trim());

        double finish = System.currentTimeMillis();
        double timeElapsed = (finish - start);
        System.out.println((long) timeElapsed);
    }

    public String howTheyHappy() throws IOException {

        String solution = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfAlpacas = Integer.parseInt(st.nextToken());
        int howManyHappy = Integer.parseInt(st.nextToken());

        // int[] alpacaNumber = new int[numberOfAlpacas];

        if (isEven(numberOfAlpacas) == true) {
            if (isEven(howManyHappy) == false) {
                return "-1";
            }
        }

        if (isEven(numberOfAlpacas) == false) {
            if (isEven(howManyHappy) == true) {
                return "-1";
            }
        }

        // int giveNumberWithHappy = 1;

        if (howManyHappy - 1 >= 1) {
            for (int i = 0; i < (howManyHappy) / 2; i++) {
                // alpacaNumber[i] = giveNumberWithHappy;

                solution = solution + " 1 3";

            }
            for (int i = howManyHappy / 2; i < numberOfAlpacas / 2; i++) {
                solution = solution + " 1 2";
            }
            // int numberContinue = 1;
            // for (int i = howManyHappy - 1; i < numberOfAlpacas; i++) {
            // // alpacaNumber[i] = numberContinue;
            if (!isEven(numberOfAlpacas)) {
                solution = solution + " 1";
            }
            // }
        }

        int giveNumberNoHappy = 1;
        switch (howManyHappy) {
            case 0:
                for (int i = 0; i < numberOfAlpacas; i++) {
                    // alpacaNumber[i] = giveNumberNoHappy;
                    solution = solution + String.valueOf(giveNumberNoHappy) + " ";
                    giveNumberNoHappy++;
                }
                return solution;

            case 1:
                for (int i = 0; i < numberOfAlpacas; i++) {
                    // alpacaNumber[i] = giveNumberNoHappy;
                    solution = solution + String.valueOf(giveNumberNoHappy) + " ";
                    giveNumberNoHappy++;
                }
                return solution;
        }

        return solution;

    }

    static boolean isEven(int number) {
        if ((number & 1) == 1) {
            return false;
        }
        // n & 1 is 1, then odd, else even
        return true;
    }
}