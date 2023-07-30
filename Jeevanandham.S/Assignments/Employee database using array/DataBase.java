import java.util.Scanner;

public class DataBase {
    static Employee[] data = new Employee[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        data[0]=new Employee(121,"Mr.A",300000);
        data[1]=new Employee(122,"Mr.B",300000);
        data[2]=new Employee(123,"Mr.C",300000);
        data[3]=new Employee(124,"Mr.D",300000);
        data[4]=new Employee(125,"Mr.E",300000);
        data[5]=new Employee(126,"Mr.F",300000);
        data[6]=new Employee(127,"Mr.G",300000);
        data[7]=new Employee(128,"Mr.H",300000);
        data[8]=new Employee(129,"Mr.I",300000);
        data[9]=new Employee(130,"Mr.J",300000);
        System.out.println("Select the options ");
        System.out.println("1. Create");
        System.out.println("2. Update");
        System.out.println("3. Search");
        System.out.println("4. Display all employees");
        System.out.println("5. Delete");
        int option = sc.nextInt();

        switch(option){
            case 1:
                CreateEmployee ce = new CreateEmployee();
                ce.create();


            case 2:
                UpdateEmployee ue = new UpdateEmployee();
                ue.update();
                break;

            case 3:
                SearchEmployee se = new SearchEmployee();
                se.search();
                break;

            case 4:
                DisplayEmployee de = new DisplayEmployee();
                de.display();
                break;

            case 5:
                DeleteEmployee d  = new DeleteEmployee();
                d.delete();
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}
