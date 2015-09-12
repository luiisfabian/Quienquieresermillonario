package app;
public class userType {
    public static int participante=1;
    public static int presentador = 2;
    public static int administrador = 3;
    
    private int current;
    public void setCurrent(int currentId){
        this.current=currentId;
    }
}
