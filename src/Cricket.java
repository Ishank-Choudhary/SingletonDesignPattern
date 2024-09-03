public class Cricket {
//This class is using the EARLY\EAGER INITIALIZATION method of singleton
    private static Cricket cricket = new Cricket();
    public static Cricket getPlayer(){
        return cricket;
    }
}
