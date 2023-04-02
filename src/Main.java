import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 2, 3, 4, 6, 8};
        int[] tryThisOut = twoSum(testArray, 12);
        System.out.println(tryThisOut[0]);
        System.out.println(tryThisOut[1]);
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

    public static int[] newMethod(int[] nums, int target){
        Map hm = new HashMap();
        for(int i=0; i {
            hm.put(nums[i],i);
        }
        for(int i=0; i {
            int k =nums[i];
            if(k == target && hm.containsKey(0) )
            {
                arr[0]= i;
                arr[1]=hm.get(0);
                break;
            }
            else if(hm.containsKey(target-k) )
            {
                if(hm.get(target-k)>i)
                {      arr[0]= i;
                    arr[1]=hm.get(target-k);
                    break;}
            }
        }
        return arr;
    }
    }

}