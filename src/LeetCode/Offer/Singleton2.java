package LeetCode.Offer;

public class Singleton2{
    private static class SingletonHoler {
        /**
         * 静态初始化器，由JVM来保证线程安全;最好的写法
         */
        private static Singleton2 instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return SingletonHoler.instance;
    }

}