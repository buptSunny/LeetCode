package practise.singleton;


import LeetCode.Offer.Singleton;

/*
    静态内部类
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static Singleton4 singleton4 = new Singleton4();
    }
    private Singleton4(){};
    public Singleton4 getInstance(){
        return SingletonHolder.singleton4;
    }
}
