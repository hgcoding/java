package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/6 16:14@Description:
 * 理解题意，有n个数的数组，大小都在0到n-1的范围内
 **/
public class j3_duplication {
    public  boolean duplication(int [] nums,int length ,int[] duplication) {
        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    System.out.println(nums[i]);
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }
    private void swap(int [] nums,int i,int j){
        int m=nums[i];
        nums[i]=nums[j];
        nums[j]=m;
    }

    public static void main(String[] args) {
        j3_duplication a=new j3_duplication();
        boolean b=a.duplication(new int[]{1,3,4,5,6,3,8,9},8,new int[]{0});
        System.out.println(b);

    }
}
