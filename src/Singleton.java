public class Singleton {

    static Singleton singleton;
    private Singleton(){
    }

    public static Singleton createInstance(){
        if(singleton == null){
            singleton = new Singleton();
            return singleton;
        }else {
            return singleton;
        }
    }

}
