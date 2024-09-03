
public class Football {
//This class is using the LAZY INITIALIZATION method of singleton
    private static Football football;
    private Football() {
    }
    public static Football getPlayer(){
        synchronized (Football.class){
            if(football==null){
                football = new Football();
            }
        }
        return football;
    }
}
