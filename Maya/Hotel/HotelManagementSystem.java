import java.util.*;

public class HotelManagementSystem {
    public static void main(String[] args) throws Exception  {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel(1, "A", "Luxury resort", "Spa, Restaurant", 3.5));
        hotels.add(new Hotel(2, "B", "Fine Dining", "Wi-Fi, Parking", 2.8));
        hotels.add(new Hotel(3, "C", "Cafe", "Games, Pool", 4.7));
        hotels.add(new Hotel(4, "D", "Bakery", "In-house Baking", 5));
        hotels.add(new Hotel(5, "E", "7 Star", "Valet", 4.2));
 

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Sort by Hotel Name");
            System.out.println("2. Sort by Hotel Rating");
            System.out.println("3. Search by Hotel Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
case 1:
{
    hotels.sort((h1, h2) -> h1.getHotelName().compareTo(h2.getHotelName()));
    for (Hotel hotel : hotels) {
        System.out.println(hotel);
    }
    break;
}

case 2:
{
    hotels.sort((h1, h2) -> Double.compare(h2.getRating(), h1.getRating()));
    for (Hotel hotel : hotels) {
        System.out.println(hotel);
    }
    break;
}
                case 3:
                    System.out.print("Enter hotel name to search: ");
                    String searchName = scanner.next();
		    boolean found = false;

                    try {

                        for (Hotel hotel : hotels) {
                            if (searchName.equalsIgnoreCase(hotel.getHotelName())) {
                                System.out.println(hotel);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            throw new HotelNotFoundException(searchName);
                        }
                    } catch (Exception e) {
                                System.out.println(e);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}