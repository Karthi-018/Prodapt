import java.util.*;
import java.util.Set;

public class Classwork  {

    int sid;
    String sname;

    public Classwork() {
    }

    int marks;

    public Classwork(int sid, String sname, int marks) {
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                '}';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the choice : ");
        int choice=sc.nextInt();
        Set<Classwork> s=new HashSet<>();
        s.add(new Classwork(12,"lavanya",45));
        s.add(new Classwork(19,"dev",95));
        s.add(new Classwork(72,"diya",55));
        s.add(new Classwork(92,"ram",49));
        s.add(new Classwork(14,"sita",43));
        s.add(new Classwork(82,"kanna",42));
        s.add(new Classwork(32,"priya",75));
        s.add(new Classwork(16,"deva",35));
        s.add(new Classwork(13,"lavanya",65));
        s.add(new Classwork(62,"lisa",47));
        List<Classwork> sList = new ArrayList<Classwork>();
        sList.addAll(s);
       switch (choice) {
           case 1:
           sList.sort(
                   new Comparator<Classwork>() {
                       @Override
                       public int compare(Classwork c1, Classwork c2) {
                           if (c1.getMarks() < c2.getMarks()) {
                               return -1;
                           } else if (c1.getMarks() > c2.getMarks()) {
                               return 1;
                           } else {
                               return 0;
                           }
                       }
                   }
           );
               break;

           case 2:
               sList.sort(
                       new Comparator<Classwork>() {
                           @Override
                           public int compare(Classwork c1, Classwork c2) {
                                   return c1.getSname().compareTo(c2.getSname());
                               }
                       }
               );
               break;
       }
        for(Classwork i:sList){
            System.out.println(i.getSid()+" "+i.getSname()+" "+i.getMarks());
           // System.out.println(i.);
        }
    }
}
