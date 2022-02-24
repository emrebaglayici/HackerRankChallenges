package Main;

public class Singleton {
    public String str;
    private static Singleton instance;

    private Singleton(){}
    public Singleton getSingleInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton=new Singleton();
        singleton.getSingleInstance();
        System.out.println(singleton.getSingleInstance().str);
    }

}
