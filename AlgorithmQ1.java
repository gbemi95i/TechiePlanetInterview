/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class AlgorithmQ1 {

    public static void main(String[] args) throws IOException {
        new AlgorithmQ1().start();
    }

    private void start() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please input the hour:");
            String hour = reader.readLine();
            if (!isValidHour(hour)) {
                System.out.println("Check your hour input properly");
                System.out.println("This program will only take hours between 1 to 12");
                return;
            }

            System.out.println("Please input the minute:");
            String min = reader.readLine();
            if (!isValidMin(min)) {
                System.out.println("Check your minute input properly");
                System.out.println("This program will only take minute input between 1 to 59 in MM format e.g. 25, 05, 10, 30, 55 e.t.c");
                return;
            }

            processInput(hour, min);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong. Kindly check your input properly");
        }
    }

    private void processInput(String hour, String min) {
        try {
            int hh = Integer.parseInt(hour);
            int mm = Integer.parseInt(min);
            convertPrintTime(hh, mm);
        } catch (NumberFormatException nfe) {
            System.out.println("Please check your input properly");
        }
    }

    private void convertPrintTime(int hh, int mm) {
        String isPluralMin = "";
        if (mm == 00) {
            System.out.println(new MmHhToWord().getHours(hh) + " o' clock");
        } else if (mm == 15) {
            System.out.println("quarter past " + new MmHhToWord().getHours(hh));
        } else if (mm == 30) {
            System.out.println("half past " + new MmHhToWord().getHours(hh));
        } else if (mm == 45) {
            if (hh == 12) {
                System.out.println("quarter to one");
                return;
            }
            System.out.println("quarter to " + new MmHhToWord().getHours(hh + 1));
        } else if (mm > 30) {
            isPluralMin = (60 - mm == 1) ? " minute" : " minutes";
            if (hh == 12) {
                System.out.println(new MmHhToWord().getMinutes(60 - mm) + isPluralMin + " to one");
                return;
            }
            System.out.println(new MmHhToWord().getMinutes(60 - mm) + isPluralMin + " to " + new MmHhToWord().getHours(hh + 1));
        } else if (mm < 30) {
            isPluralMin = (mm > 1) ? " minutes" : " minute";
            System.out.println(new MmHhToWord().getMinutes(mm) + isPluralMin + " after " + new MmHhToWord().getHours(hh));
        }
        return;
    }

    boolean isValidHour(String hour) {
        int h = Integer.parseInt(hour);
        return h <= 12 && h >= 1;
    }

    boolean isValidMin(String min) {
        int m = Integer.parseInt(min);
        return min.split("").length == 2 && m <= 59 && m >= 0;
    }
}
