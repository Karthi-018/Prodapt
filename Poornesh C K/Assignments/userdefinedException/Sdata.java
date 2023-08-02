import com.sun.org.apache.xerces.internal.xs.datatypes.XSQName;

import java.util.Scanner;
public class Sdata {
    static Scanner s =new Scanner(System.in);
    static fun jn=new fun();




    public static void main(String[] args) {
        System.out.println("Searching student...");
        System.out.println("Enter the name to search");
        jn.initElist();
        String sNmae = s.next();
        students smp = jn.findstudent(sNmae);
        if(smp !=null) {
            System.out.println(smp);
        }
        else{

            try{
                throw new StudentNotFoundException(sNmae);
            }
            catch (Exception e){
                System.out.println(e);

            }
        }



        //choice();
    }







}
