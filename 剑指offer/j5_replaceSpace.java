package Solution.剑指offer;

/**
 * Author: HK
 * Date:2018/12/6 16:56@Description:
 **/
public class j5_replaceSpace {
    public static String replaceSpace(StringBuffer s){
        int len1=s.length()-1;
        for(int i=0;i<=len1;i++){
            char c=s.charAt(i);
            if(c==' ')
                s.append("  ");//可以添加任意字符,增加字符长度

        }
        int len2=s.length()-1;
        System.out.println(len2);
        while(len1>=0&&len2>len1) {
            char d = s.charAt(len1--);
            if (d == ' ') {
                s.setCharAt(len2--, '0');
                s.setCharAt(len2--, '2');
                s.setCharAt(len2--, '%');
            }else {
                s.setCharAt(len2--, d);
                System.out.println(s);
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("we are young")));
    }

}
