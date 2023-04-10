import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        int[] testArray = new int[]{1, 2, 3, 4, 6, 8};
//        int[] tryThisOut = twoSum(testArray, 12);
//        System.out.println(tryThisOut[0]);
//        System.out.println(tryThisOut[1]);

//        int testNumber = 1231321;
//        System.out.println(isPalindrome(testNumber));

        String testString = "MCMXCIV";
        System.out.println(romanToInt(testString));

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] intArrayReturn = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                int b = nums[j];
                if(a + b == target){
                    intArrayReturn[0] = i;
                    intArrayReturn[1] = j;

                }
            }



        }
        return intArrayReturn;
    }

//    public static int[] newMethod(int[] nums, int target){
//        Map hm = new HashMap();
//        for(int i=0; i {
//            hm.put(nums[i],i);
//        }
//        for(int i=0; i {
//            int k =nums[i];
//            if(k == target && hm.containsKey(0) )
//            {
//                arr[0]= i;
//                arr[1]=hm.get(0);
//                break;
//            }
//            else if(hm.containsKey(target-k) )
//            {
//                if(hm.get(target-k)>i)
//                {      arr[0]= i;
//                    arr[1]=hm.get(target-k);
//                    break;}
//            }
//        }
//        return arr;
//    }

    public static boolean isPalindrome(int x) {
        String xAsString = Integer.toString(x);
        if (x < 0) {
            return false;
        }
        if (x % 10 == 0  && x != 0){
            return false;
        }
        int counter = 1;
        for (int i = 0; i < xAsString.length() / 2; i++){
            char beginningChars = xAsString.charAt(i);
            char endingChars = xAsString.charAt(xAsString.length() - counter);
            if (beginningChars != endingChars){
                return false;
            }
            counter++;

        }


        return true;
    }

    public static int romanToInt(String s) {
        int returnInt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I' -> returnInt++;
                case 'V' -> returnInt += 5;
                case 'X' -> returnInt += 10;
                case 'L' -> returnInt += 50;
                case 'C' -> returnInt += 100;
                case 'D' -> returnInt += 500;
                case 'M' -> returnInt += 1000;
                default -> returnInt += 0;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char d = s.charAt(i + 1);
            if (c == 'I' && d == 'V') {
                returnInt -= 2;
            }
            if (c == 'I' && d == 'X') {
                returnInt -= 2;
            }
            if (c == 'X' && d == 'L') {
                returnInt -= 20;
            }
            if (c == 'X' && d == 'C') {
                returnInt -= 20;
            }
            if (c == 'C' && d == 'D') {
                returnInt -= 200;
            }
            if (c == 'C' && d == 'M') {
                returnInt -= 200;
            }
        }
        return returnInt;
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder returnString = new StringBuilder();
        for (String pickedString : strs) {
            for (int j = 0; j < pickedString.length(); j++) {
                char c = pickedString.charAt(j);

                returnString.append(c);
            }
        }
        ArrayList capturelist = new ArrayList();



        // I would look at each of the words, starting with the first letter, if there is a first letter that is shared with all the words,
        // then that first letter will be placed in the stringbuilder.
        // I would then start looking at the second letter in
    }

}


