package Solution.剑指offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class j40_MinKNums {
    public static int[] findKMin(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                });

        for (int num : nums) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (pq.peek() > num) {//如果堆顶元素 > 新数，则删除堆顶，加入新数入堆
                pq.poll();
                pq.offer(num);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k&&!pq.isEmpty(); i++) {
            result[i] = pq.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[]arr=new int[]{1, 6, 2, 3, 5, 4, 8, 7, 9};
        System.out.println(Arrays.toString(findKMin( arr,5)));
    }

}


