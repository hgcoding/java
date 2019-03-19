package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/17 16:35@Description:
 **/
public class j10_fibonacci {
    //递推
    public int fibonacci(int n){
        if(n<=1) return n;
        int[] fib=new  int[n+1];
        fib[1]=1;
        for(int i=1;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return  fib[n];
    }
    //递归
    long F(int n){
        if (n<=1) return n;
        return F(n-1)+F(n-2);
    }
}
