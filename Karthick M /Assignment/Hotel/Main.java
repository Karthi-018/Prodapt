import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Hotels> h=new ArrayList<>();
        h.add(new Hotels(1,"ads","Good","Spa",4.0));
        h.add(new Hotels(2,"arc","Avg","Spa",3.1));
        h.add(new Hotels(3,"far","Worst","Spa",1.4));
        h.add(new Hotels(4,"bot","Avg","Spa",3.3));
        h.add(new Hotels(5,"red","Good","Spa",4.2));
        h.add(new Hotels(6,"inn","Avg","Spa",3.9));
        h.add(new Hotels(7,"rev","Ok","Spa",2.8));
        h.add(new Hotels(8,"zen","Best","Bar",4.9));
        h.add(new Hotels(9,"ags","Good","Spa",4.1));
        h.add(new Hotels(10,"pvr","Best","Spa",4.7));
        int ch;
        do{
        System.out.println("1.sort by rating\n2.sort by name\n3.search by id");
        System.out.println("Enter Choice:");
        ch=s.nextInt();
            switch (ch) {
                case 1:
                    Collections.sort(h, (h1, h2) -> h1.getRating().compareTo(h2.getRating()));
                    for (Hotels i : h) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    Collections.sort(h, (h1, h2) -> h1.getHName().compareTo(h2.getHName()));
                    for (Hotels i : h) {
                        System.out.println(i);
                    }
                    break;
                case 3:
                    System.out.println("Enter id to search");
                    int sid=s.nextInt();
                    int f=0;
                    Iterator<Hotels> i= h.iterator();
                    while(i.hasNext()){
                        Hotels ho = i.next();
                        if (ho.getHID()== sid) {
                            System.out.println(ho);
                            f++;
                            return;
                        }
                    }if (f==0) System.out.println("Not found");
                    break;
        }
        }while (ch<4);
    }
}