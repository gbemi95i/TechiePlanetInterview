
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class AlgorithmQ3 {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 1, 2, 3, 4, 4, 3, 5},
            {1, 1, 1, 1, 1, 1, 1}
        };
        Map<Integer, Boolean> existence;
        for (int i = 0; i < arr.length; i++) {
            existence = new HashMap<>();
            for (int j = 0; j < arr[i].length; j++) {
                int key = arr[i][j];
                if (existence.get(key) != null) {
                    arr[i][j] = 0;
                } else {
                    existence.put(key, true);
                }
            }
        }
        //print out array
        System.out.println(Arrays.deepToString(arr));
    }
}
