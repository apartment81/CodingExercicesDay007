package ro.mirodone;

import java.util.Scanner;

public class InputCalculator {

    public   void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while (true){
            //check if input is integer
            boolean isInteger = scanner.hasNextInt();
            if(!isInteger){
                break;
            }else {
                int number = scanner.nextInt();
                sum = sum +number;
                count++;
                average = Math.round((double) sum/count);
            }

        }
        System.out.println("SUM = " + sum + " AVG = " + average);

    }

}
