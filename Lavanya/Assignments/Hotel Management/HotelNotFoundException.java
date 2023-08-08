//userdefined exception class
public class HotelNotFoundException extends Exception {

    public HotelNotFoundException(String hname) {
        System.out.println(hname+" not found");
    }
}
