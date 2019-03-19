package Solution.剑指offer;

import java.util.Stack;

/**
 * Author: HK
 * Date:2018/12/17 16:15@Description:
 *两个栈实现队列；
 *
 * 1、push,将数据直接压入stack1即可；
 * 2、pop,将stack1中的数据弹出压入到stack2中，则数据顺序相反，
 * 为保证最先进入的数据一直处于栈顶，只有将stack2中的数据全部pop后，才能继续讲stack1中的数据压入到stack2中，继续做pop
 **/
public class j9_stackToqueue {
    Stack<Integer> in=new Stack<Integer>();
    Stack<Integer> out=new Stack<Integer>();

    public void  push(int node){
        in.push(node);
    }

    public int pop() throws Exception{
        if (out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if(out.isEmpty()){
            throw new Exception("queue is empty");
        }
        return out.pop();
    }
}
