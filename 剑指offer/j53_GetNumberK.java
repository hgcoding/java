package Solution.剑指offer;

/**
 * Author: HK
 * Date:2019/3/5 12:09@Description:
 **/
public class j53_GetNumberK {
    private int GetNumberK(int [] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        int star = binnarysearch( nums,  k);
        int end = binnarysearch(nums, k+1);

        return end-star;
    }


    public int binnarysearch(int [] nums,int k) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int m = (h - l) / 2 + 1;
            if (nums[m] >= k) {
                h = m - 1;
            } else l = m + 1;

        }
        return l;
    }
}
