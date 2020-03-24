package LeetCode.Offer;

import java.util.Stack;

/*
    栈的压入，弹出顺序
 */
public class offer31 {
    public static void main(String[] args) {
        Stack<Integer> In = new Stack<>();
        Stack<Integer> out1 = new Stack<>();
        Stack<Integer> out2 = new Stack<>();
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {4,5,3,2,1};
        int[] a3 = {4,3,5,1,2};
        for(int i=a1.length-1;i>=0;i--){
            In.push(a1[i]);
        }
        for(int i=a2.length-1;i>=0;i--){
            out1.push(a2[i]);
        }
        for(int i=a3.length-1;i>=0;i--){
            out2.push(a3[i]);
        }
        Boolean res1 = IsPopfromIn(In,out1);
        Boolean res2 = IsPopfromIn(In,out2);
        System.out.println(res1);
        System.out.println(res2);
    }

    private static Boolean IsPopfromIn(Stack<Integer> in, Stack<Integer> out1) {
        Stack<Integer> temp = new Stack();
        temp.push(-100);
        while (!out1.isEmpty() || !in.isEmpty()) {
            int nums = out1.pop();
            int t = temp.pop();
            if (!in.isEmpty()) {
                while (nums != t) {
                    temp.push(t);
                    t = in.pop();
                }
            }
            else if(nums !=t){
                return false;
            }
        }

        if (out1.isEmpty()) {
            return true;
        }
        else{
            return false;
        }

    }


    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {

            Stack<Integer> s = new Stack<>();
            int count = 0;
            for(int i=0;i<popped.length;i++){
                while(count<pushed.length){
                    if(!s.isEmpty()&&s.peek()==popped[i]){
                        break;
                    }
                    s.push(pushed[count]);
                    count++;
                }
                if(s.peek()==popped[i]){
                    s.pop();
                }
            }
            if(!s.isEmpty()){
                return false;
            }else{
                return true;
            }
        }
    }
}
