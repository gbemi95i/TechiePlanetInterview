
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class AlgorithmQ2 {

    public static void main(String[] args) throws IOException {
        new AlgorithmQ2().start();
    }

    private void start() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please input number of staircases?");
            String numStr = reader.readLine();
            int num = Integer.parseInt(numStr);
            for(int i=1; i<=num; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("#");
                }
                if(i != num)
                    System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong. Kindly check your input properly");
        }
    }
}
