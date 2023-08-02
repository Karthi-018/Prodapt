public class NameNotFoundException extends Exception{
    public  NameNotFoundException (String name){
        System.out.println(name + " not found in the database");
    }
}
