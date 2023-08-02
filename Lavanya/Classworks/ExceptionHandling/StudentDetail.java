import java.util.*;
public class StudentDetail {
    StudentDetails[][] details={{new StudentDetails(123,"ram",34)},
    {new StudentDetails(112,"kanna",39)},
    { new StudentDetails(145,"riya",35)},
    {   new StudentDetails(163,"dev",36)},
    {        new StudentDetails(173,"sam",38)}};
    public void searchName(String sname) throws NameNotFoundException  {

            for (int i = 0; i < details.length; i++) {
                if (details[i][0].getSname().equals(sname)) {
                    System.out.println("Employee found: " + details[i][0]);
                    return;
                }
            }
            throw new NameNotFoundException("Employee with name "+sname+" not found in the database");
    }

    public void searchInt(int  sid) throws IdNotFoundException {
        for (int i = 0; i < details.length; i++) {
            if (details[i][0].getSid() == sid) {
                System.out.println("Employee found: " + details[i][0]);
                return;
            }
        }
        throw new IdNotFoundException("Employee with id "+sid+" not found in the database");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDetail s =new StudentDetail();
        try{
            s.searchName("kanna");
        }
        catch(NameNotFoundException e) {
            System.out.println(e);
        }
       try {
           s.searchInt(451);
       }
       catch(IdNotFoundException e1){
           System.out.println(e1);
       }
    }
}
