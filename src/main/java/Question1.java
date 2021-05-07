/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.HashMap;
import java.util.Map;

public class Question1 {

    public int[] twoSum(int target, int[] nums){
        int length = nums.length;
        for(int i = 0; i < length - 1; ++i){
            for(int j = i + 1; j < length; ++j){

                if(nums[i] + nums[j] == target){

                    return new int[]{i,j};
                }

            }

        }
        return  null;
    }

    public  int[] twoSumNew(int[] nums,int target){
        Map<Integer,Integer> hp = new HashMap<>();
        int length = nums.length;
        for(int i = 0; i < length; ++i){
            hp.put(nums[i],i);
        }
        for(int i = 0; i < length; ++i){
            if(hp.containsKey(target - nums[i]) && i != hp.get(target -nums[i])){
                return  new int[]{i,hp.get(target -nums[i])};
            }
        }

        return null;
    }



    public  static  void  main(String[] args){






    }
}
