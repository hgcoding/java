package Solution.剑指offer;

import java.util.Arrays;

/**
 * Author: HK
 * Date:2018/12/26 17:08@Description:
 **/
public class j11_xuanzhuanshuzu {
    public static int minNumberInRotateArray(int[] nums) {
        int len=nums.length-1;
        int init=0;
        while(init<len){
            int mid=init+(len-init)/2;
            System.out.println("init值为"+nums[init]+",len为"+nums[len]+",mid值为"+nums[mid]);
            if(nums[mid]<nums[len]){
                len=mid;
                }
            else{
                init=mid+1;

            }
        }
        return nums[init];
    }

    public static void main(String[] args) {
        System.out.println(minNumberInRotateArray(new int [] {5,6,7,8,9,1,2,3,4}));
    }
}
