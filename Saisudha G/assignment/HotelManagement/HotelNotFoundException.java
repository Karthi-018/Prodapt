public class HotelNotFoundException extends Exception {
        HotelNotFoundException(String Hotel_name){
            System.out.println("Hotel not present in the database");
        }
}
