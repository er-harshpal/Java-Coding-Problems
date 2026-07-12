import java.net.StandardSocketOptions;

class Singleton{
    private static Singleton instance = null;
    private static int count = 0;

    private Singleton(){
    };

    public static Singleton getInstance(){
        synchronized(Singleton.class){

        }
        if(instance == null){
            instance = new Singleton();
            count++;
        }
        System.out.println(count);
        return instance;
    }
}

public class test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.equals(s2));

        Thread t1 = new Thread(Singleton :: getInstance, "Mickey");
        Thread t2 = new Thread(Singleton :: getInstance, "Mouse");
        t1.start();
        t2.start();

    }
}