import java.sql.SQLOutput;
import java.util.Scanner;
public class Mn {
    static Server[] elist =new Server[10];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("Select the options ");
        System.out.println("1. Create");
        System.out.println("2. Search");
        System.out.println("3. updateDetails");

        System.out.println("4. Delete");
        int Key = s.nextInt();

        switch(Key){
            case 1:
                function c=new function();
                c.create();

                break;
            case 2:


                function cw=new function();
                cw.search();

                break;

            case 3:
                function cs=new function();
                cs.updateDetails();
                break;



            case 4:
                function cr=new function();
                cr.del();

                break;

            default:
                System.out.println("Invalid option");
        }




    }
}
