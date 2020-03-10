package Thread.exp;
/*
    错误实例：
        可能会持续循环，Ready线程读不到ready的值；
        或输出0，读不到number的值。
        不可见性——解决方法：
        线程在同一个锁上同步
 */
public class NoVisibility_3_1 {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread{
        public void run(){
            while(!ready){
                Thread.yield();
                System.out.println(number);
            }
        }

        public static void main(String[] args) {
            new ReaderThread().start();
            number = 42;
            ready = true;
        }

    }



}
