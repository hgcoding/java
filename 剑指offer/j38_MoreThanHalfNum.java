package Solution.剑指offer;

/**
 * Author: HK
 * Date:2019/3/18 17:03@Description:
 **/
class j38_MoreThanHalfNum {
    public   static  int  solution(int [] nums){
        if(nums==null||nums.length<=2)
            return 0;
        int cnt=1;
        int max_num=nums[0];
        for(int i=1;i<nums.length;i++) {
            cnt = nums[i]==max_num?cnt+1:cnt-1;
//            System.out.println(max_num);
            if (cnt == 0) {
                max_num =nums[i];
                cnt = 1;
            }
        }
        int cishu=0;
        for(int num:nums) {
            if (num ==max_num)
                cishu++;
        }
        return cishu>nums.length/2?max_num:0;
    }

    public static void main(String[] args) {
        System.out.println((solution(new int[] {1,2,3,1,2,2,2,2,2,5,12,2,2})));
    }
}
