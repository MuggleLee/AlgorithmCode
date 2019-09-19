import java.util.HashMap;
import java.util.Map;

/**
 * @author Muggle Lee
 * @Date: 2019/9/19 11:34
 * 问题描述：
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    /**
     * 解法1：暴力破解法。用双重循环，时间复杂度为O(n^2)
     * @param nums
     * @param target
     * @return
     */
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }

    /**
     * 解法2：利用 set 的特性。
     * 由于题目说“each input would have exactly one solution”，所以数组内每个元素一定是唯一的。
     * 通过 HashMap 的键(key)设置为元素的值，值(value)为元素的索引
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int tem = target - nums[i];
            map.put(nums[i], i);
            if (map.containsKey(tem)) {
                System.out.println(map.get(tem));
                System.out.println(i);
                return new int[]{map.get(tem), i};
            }

        }
        return null;
    }

    // 测试
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        TwoSum test = new TwoSum();
        System.out.println(test.twoSum(nums, target));
    }
}
