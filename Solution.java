package LeetCode;

import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer>romanInteger = new HashMap<>();
        romanInteger.put('I', 1);
        romanInteger.put('V', 5);
        romanInteger.put('X', 10);
        romanInteger.put('L', 50);
        romanInteger.put('C', 100);
        romanInteger.put('D', 500);
        romanInteger.put('M', 1000);

        int total = 0;
        int values = 0;

        for (int i = 0; i <s.length() ; i++) {
            char currentChar = s.charAt(i);
            int currentVal = romanInteger.get(currentChar);

            if (currentVal>values){
                total += currentVal -2 *values;
            } else {
                total += currentVal;
            } values = currentVal;
        } return total;
        }

    public static void main(String[] args){
        Solution solution = new Solution();

        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }

}

