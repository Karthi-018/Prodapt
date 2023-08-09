import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HotelManagementSys {

    public static void main(String[] args) throws HotelNotFoundException {
        Scanner sc=new Scanner(System.in);
        List<Hotel> hl=new ArrayList<>();
        hl.add(new Hotel(1001,"aaa","at city","swimming pool,spa",8.5));
        hl.add(new Hotel(1002,"abc","near city","spa",8));
        hl.add(new Hotel(1003,"fqw","at city","swimming pool,spa",10));
        hl.add(new Hotel(1004,"xyz","near city","swimming pool",7));
        hl.add(new Hotel(1005,"tyu","at hills","swimming pool,spa",6));

        System.out.println("1->sort based on Hotel Name");
        System.out.println("2->sort based on Hotel ratings");
        System.out.println("3->search Hotel");

        System.out.println("Enter choice:");
        int choice=sc.nextInt();

        switch (choice){
            case 1:
                hl.sort(new Comparator<Hotel>() {
                    @Override
                    public int compare(Hotel h1, Hotel h2) {
                        return h1.getHname().compareTo(h2.getHname()) ;
                    }
                });
                hl.forEach(System.out::println);
                break;
            case 2:
                hl.sort(new Comparator<Hotel>() {
                    @Override
                    public int compare(Hotel h1, Hotel h2) {
                        if (h1.getRating() > h2.getRating()) {
                            return -1;
                        } else if (h1.getRating() < h2.getRating()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                });
                hl.forEach(System.out::println);
                break;
            case 3:
                System.out.println("enter Hotel name:");
                String Hotel_name=sc.next();
                boolean found=false;
                for(Hotel i:hl){
                    if(i.getHname().equals(Hotel_name)){
                        System.out.println(i);
                        found=true;

                    }

                }
                if(!found){
                    throw new HotelNotFoundException(Hotel_name);
                }
                break;
        }

    }
}
