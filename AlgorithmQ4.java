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
public class AlgorithmQ4 {

    public static void main(String[] args) throws IOException {
        new AlgorithmQ4().start();
    }

    private void start() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please input number:");
            String num = reader.readLine();
            String[] arr = num.split("");
            int sum = 0;
            for (String i : arr) {
                sum += Integer.parseInt(i);
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("Something went wrong. Kindly check your input properly");
        }
    }
}
