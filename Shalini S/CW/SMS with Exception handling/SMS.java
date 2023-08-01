
import java.util.*;
public class SMS {
    Student_details arr[] = new Student_details[5];

    void get_input() {
        for (int i = 0; i < 5; i++) {
            arr[i] = new Student_details((100 + i), "Employee" + (i + 1), 90 + (i));
        }
    }

    public Student_details search_student(int id) {
        Student_details x = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSid() == id) {
                x = arr[i];
            }
        }
        return x;
    }

}
class Main_EMS extends Exception{
    Main_EMS(int id){
        System.out.println("Employee "+id+" not found");
    }
    public static void main(String[] args)throws Main_EMS{
        SMS obj=new SMS();
        Scanner sc=new Scanner(System.in);
        obj.get_input();
        System.out.println("Enter the employee Id:");
        int id=sc.nextInt();
        Student_details y=obj.search_student(id);
        if(y==null){
            throw new Main_EMS(id);
        }
        else{
            System.out.println(y);
        }

    }

}
