
import java.util.*;



class Hotel {

public static void main(String args[]) {

HotelPojo obj = new HotelPojo(101, "Villa", "A", "AC rooms", 4);

List<HotelPojo> data = new ArrayList<>();

String search_name;



data.add(obj);

data.add(new HotelPojo(101, "Star", "Best hotel with Non AC rooms suitable for peers ", "Non Ac", 3));

        data.add(new HotelPojo(107, "Micey", "Top class food quality and taste", "Food", 5));

        data.add(new HotelPojo(108, "Syer", "Best Water resources available", "Water", 3));

        data.add(new HotelPojo(104, "Klair", "Fun games and hygiene Swimming pools", "Swimming", 2));

        data.add(new HotelPojo(102, "Shocy", "Unlimited fun and games with an extraordinary Tennis Court", "tennis court", 3));

        data.add(new HotelPojo(115, "Mily", "For your business meetings and conferences", "Conference rooms", 2));

        data.add(new HotelPojo(178, "Beauty", "For best quality theatre experience with your friends and family", "Theatre", 5));

        data.add(new HotelPojo(145, "Approz", "Best air conditioned rooms for your comfort", "AC rooms", 4));

        data.add(new HotelPojo(189, "Recio", "Wonderful workout facilities with coach help", "Gym", 3));

System.out.println("Enter your choice: ");

System.out.println("1 -> Sort Hotel data based on Hotel Name");

System.out.println("2 -> Sort Hotel data based on Hotel Rating");

System.out.println("3 -> Search Hotel");


Scanner sc = new Scanner(System.in);

int choice = sc.nextInt();

switch (choice) {


case 1:

data.sort((t1, t2) -> (t1.getHotelName().compareTo(t2.getHotelName())));

data.forEach(System.out::println);

break;

case 2:

data.sort((t1, t2) -> (t1.getRating() < t2.getRating()) ? -1 : (t1.getRating() > t2.getRating()) ? 1 : 0);

data.forEach(System.out::println);

break;

case 3:

try {

System.out.println("Enter the Search Name: ");

search_name = sc.next();

int x = 0;

for (HotelPojo h : data) {

if (search_name.equals(h.getHotelName())) {



System.out.println(h);

x = 1;

break;

}

}

if(x==0){

try

{

throw new HotelNotFoundException(search_name);

}

catch (HotelNotFoundException e)

{

System.out.println(e);

}

}

}

finally{

System.out.println("**********************************");

                }
        }
    }
}

