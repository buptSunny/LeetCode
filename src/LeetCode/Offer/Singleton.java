package LeetCode.Offer;

    /*
     单例模式，线程安全懒汉式
     */

public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton(){};
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                    if(instance == null){
                        instance =  new Singleton();
                    }
                }
        }
        return instance;
    }
}


