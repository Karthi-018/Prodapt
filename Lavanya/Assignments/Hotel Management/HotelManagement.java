import java.util.*;

public class HotelManagement {

    public static void search(ArrayList<Hotel> detail, String name) throws HotelNotFoundException {
        //to perform search operation
        for (Hotel i : detail) {
            if (i.getHname().equals(name)) {
                System.out.println("Hotel found");
                return;
            }
        }
        //if not found throws an exception
        throw new HotelNotFoundException(name);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice = scan.nextInt();
        ArrayList<Hotel> detail = new ArrayList<>();
        detail.add(new Hotel(123, "anadha bhavan", 4));
        detail.add(new Hotel(183, "a2b", 4));
        detail.add(new Hotel(156, "thalapakati", 4));
        detail.add(new Hotel(178, "ss hyderabad briyani", 3));
        detail.add(new Hotel(134, "anjapar", 2));
        detail.add(new Hotel(108, "sri hotel", 2));
        detail.add(new Hotel(112, "bharat", 5));
        detail.add(new Hotel(193, "taj hotel", 1));
        detail.add(new Hotel(143, "holiday Inn", 3));
        detail.add(new Hotel(127, "itc grand chola", 3));
        switch (choice) {
            case 1:
                //sort by hotel name
                detail.sort((s1, s2) -> s1.getHname().compareTo(s2.getHname()));
                for (Hotel i : detail) {
                    System.out.println(i);
                }
                break;
            case 2:
                //sort by hotel rating
                detail.sort(
                        new Comparator<Hotel>() {
                            @Override
                            public int compare(Hotel c1, Hotel c2) {
                                if (c1.getRating() < c2.getRating()) {
                                    return -1;
                                } else if (c1.getRating() > c2.getRating()) {
                                    return 1;
                                } else {
                                    return 0;
                                }
                            }
                        }
                );
                for (Hotel i : detail) {
                    System.out.println(i);
                }
                break;
            case 3:
                //calling search method
                try {
                    search(detail, "holiday Inn");
                } catch (HotelNotFoundException e) {
                    System.out.println(e);
                }
                break;

        }
    }


}