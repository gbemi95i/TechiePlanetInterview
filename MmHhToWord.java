/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class MmHhToWord {

    Map<String, String> numsMap = new HashMap<String, String>();
    Map<String, String> tensMap = new HashMap<String, String>();

    {
        numsMap.put("0", "zero");
        numsMap.put("1", "one");
        numsMap.put("2", "two");
        numsMap.put("3", "three");
        numsMap.put("4", "four");
        numsMap.put("5", "five");
        numsMap.put("6", "six");
        numsMap.put("7", "seven");
        numsMap.put("8", "eight");
        numsMap.put("9", "nine");
        numsMap.put("10", "ten");
        numsMap.put("11", "eleven");
        numsMap.put("12", "twelve");
        numsMap.put("13", "thirteen");
        numsMap.put("14", "fourteen ");
        numsMap.put("15", "fifteen");
        numsMap.put("16", "sixteen");
        numsMap.put("17", "seventeen");
        numsMap.put("18", "eighteen");
        numsMap.put("19", "nineteen");
        tensMap.put("1", "ten");
        tensMap.put("2", "twenty");
        tensMap.put("3", "thirty");
        tensMap.put("4", "forty");
        tensMap.put("5", "fifty");
        tensMap.put("6", "sixty");
        tensMap.put("7", "seventy");
        tensMap.put("8", "eighty");
        tensMap.put("9", "ninty");
    }

    public static void main(String[] args) {
//        new NumberToWord2().getMinutes(10+"");
//        new NumberToWord2().getMinutes(20+"");
//        new NumberToWord2().getMinutes(30+"");
//        new NumberToWord2().getMinutes(40+"");
//        new NumberToWord2().getMinutes(50+"");
//        new NumberToWord2().getMinutes(11+"");
//        new NumberToWord2().getMinutes(13+"");
//        new NumberToWord2().getMinutes(15+"");
//        new NumberToWord2().getMinutes(17+"");
//        new NumberToWord2().getMinutes(19+"");
//        new NumberToWord2().getMinutes("05" + "");
//        new NumberToWord2().getMinutes("07" + "");
//        new NumberToWord2().getMinutes("09" + "");
//        new NumberToWord2().getMinutes("02" + "");
//        new NumberToWord2().getMinutes("01" + "");
        new MmHhToWord().getMinutes(21);
        new MmHhToWord().getMinutes(33);
        new MmHhToWord().getMinutes(45);
        new MmHhToWord().getMinutes(27);
        new MmHhToWord().getMinutes(59);
    }

    public String getMinutes(int mm) {
        String num = mm + "";
        String[] arr = num.split("");
        if(arr.length == 1){
            return numsMap.get(num);
        }else if (arr[1].equals("0")) {
            return tensMap.get(arr[0]);
        } else if (arr[0].equals("1")) {
            return numsMap.get(num);
        } else if (arr[0].equals("0")) {
            return numsMap.get(arr[1]);
        } else if (Integer.parseInt(arr[1]) > 1) {
            return tensMap.get(arr[0]) + " " + numsMap.get(arr[1]);
        } else {
            return "";
        }
    }

    public String getHours(int hh) {
        String num = hh+"";
        return numsMap.get(num);
    }
}
