package singleton;

public class CountSingleton {
    private static  int count = 0 ;
    private CountSingleton(){

    }
    public static CountSingleton newInstance(){
        return new CountSingleton();
    }

}
