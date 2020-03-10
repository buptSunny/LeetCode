package LeetCode.Offer;

import java.util.Stack;
/*
    实现两个方法
 */
public class offer9 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void appendTail(int item){
        stack1.push(item);
    }
    public void deleteHead(){
        while(!stack1.isEmpty()){
            int temp = stack1.pop();
            stack2.push(temp);
        }
        stack2.pop();
    }
}
