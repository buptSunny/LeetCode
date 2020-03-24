package LeetCode.Offer;

import java.util.Stack;

public class offer30 {

    class MinStack {

        private Stack<Integer> dataStack;
        private Stack<Integer> minStack;
        private int min;

        /** initialize your data structure here. */
        public MinStack() {
            dataStack = new Stack<>();
            minStack = new Stack<>();
            min = Integer.MAX_VALUE;
        }


        public void push(int x) {
            dataStack.push(x);
            if(x<min){
                min = x;
                minStack.push(min);
            }else{
                minStack.push(min);
            }
        }

        public void pop() {
            dataStack.pop();
            minStack.pop();
            //* min需要更新；否则后续加的值只会和之前的min比较
            min = minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();
        }

        public int top() {
            return dataStack.peek();
        }

        public int min() {
            return minStack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
}
