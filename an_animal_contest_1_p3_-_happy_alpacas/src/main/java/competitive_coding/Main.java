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


    public void run() throws IOException{
        System.out.println(howTheyHappy());
    }

    public String howTheyHappy() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int numberOfAlpacas = Integer.parseInt(st.nextToken());
        int howManyHappy = Integer.parseInt(st.nextToken());
        
        int[] alpacaNumber = new int[numberOfAlpacas];
        int checkHappy = 0;

        if((numberOfAlpacas + 2) % 2 != 0){
            if((howManyHappy + 2) % 2 == 0){
                return "-1";
            }
        }

        if((howManyHappy + 2) % 2 != 0){
            if((numberOfAlpacas + 2) % 2 == 0){
                return "-1";
            }
        }

        int giveNumberWithHappy = 1;
        while (checkHappy != howManyHappy - 1 && howManyHappy - 1 >= 1) {         
            
            alpacaNumber[checkHappy] = giveNumberWithHappy;
            switch (giveNumberWithHappy) {
                case 1:
                    giveNumberWithHappy = 3;
                break;
            
                case 3:
                    giveNumberWithHappy = 1;
                break;
            }
            checkHappy++;
        }

        int giveNumberNoHappy = 1;
        switch (howManyHappy) {
            case 0:
                for(int i = 0; i < alpacaNumber.length; i++){
                    alpacaNumber[i] = giveNumberNoHappy;
                    switch (giveNumberNoHappy) {
                        case 1:
                            giveNumberNoHappy = 2;    
                        break;
                    
                        case 2:
                            giveNumberNoHappy = 1;    
                        break;
                    }// entfernbar einfach hochzählen?
                }    
            break;
        
            default:
                for(int i = checkHappy; i < alpacaNumber.length; i++){
                    alpacaNumber[i] = giveNumberNoHappy;
                    switch (giveNumberNoHappy) {
                        case 1:
                            giveNumberNoHappy = 2;    
                        break;
                    
                        case 2:
                            giveNumberNoHappy = 1;    
                        break;
                    }
                }// muss es der letzte sein? (sparen "2. while")
            break;
        }

        String solution = "";

        for(int i = 0; i < alpacaNumber.length - 1; i++){
            solution = solution + String.valueOf(alpacaNumber[i]) + " ";
        }// muss es in ein array an Zahlen oder einfach direkt printable machen?


        solution = solution + String.valueOf(alpacaNumber[alpacaNumber.length-1]);

        return solution;
        
    }
}