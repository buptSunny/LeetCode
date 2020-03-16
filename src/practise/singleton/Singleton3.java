package practise.singleton;

/*
    double check lock
 */
public class Singleton3 {
    private volatile static Singleton3 singleton3 = null;
    private Singleton3(){};
    public static Singleton3 getInstance(){
        if(singleton3==null){
            synchronized (Singleton3.class){
                if(singleton3==null){
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
