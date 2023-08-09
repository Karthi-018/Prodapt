public class HotelNotFoundException extends Exception {
    public HotelNotFoundException(String hotelName) {
        System.out.println("Hotel not found: " + hotelName);
    }
}
