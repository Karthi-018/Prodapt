public class IdNotFoundException  extends Exception{
    IdNotFoundException(String id){
        System.out.println(id+" not found in the database");
    }
}
