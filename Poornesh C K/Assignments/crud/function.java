import java.util.Scanner;
public class function {

    Scanner s = new Scanner(System.in);

    public void create() {
        System.out.println("Enter the Employee ID");
        int eid = s.nextInt();
        System.out.println("Enter the Employee Name");
        String ename = s.next();
        System.out.println("Enter the Employee salary");
        double esalary = s.nextDouble();
        System.out.println("\nAdded successfully\n");
        System.out.println("\nEmployee created");
    }


 
    public void search() {
        System.out.println("Enter the id to search");
        int eid = s.nextInt();
        boolean idthrre = false;
        for (Server details : Mn.elist) {
            if (eid == details.getEid()) {
                idthrre = true;
                System.out.println(details);
            }
        }
        if (!idthrre) {
            System.out.println("ID does not exists");
        }


    }
    public Server[] del(){
        System.out.println("Enter the id to be deleted");
        int eid = s.nextInt();
        return delete(Mn.elist, eid);
    }
    public Server[] delete(Server[] elist,int eid){
        Server[] arr = new Server[elist.length-1];
        int count1=0;
        int count2=0;
        for(Server details:elist){

            if(details.getEid()!=eid){
                arr[count2]=elist[count1];
                count2++;
            }
            count1++;
        }

        return arr;

    }
    public void updateDetails(){
        System.out.println("Enter the id to update");
        int eid=s.nextInt();
        String nn;
        double sv;
        boolean id=false;
        for(Server updateDetails:Mn.elist){
            if(eid == updateDetails.getEid()){
                id =true;
                nn=updateDetails.getEname();
                sv=updateDetails.getEsalary();

                System.out.println("Enter the  Name to be changed to: ");
                updateDetails.setEname(s.next());
                updateDetails.setEsalary(s.nextDouble());
                if(!nn.equals(updateDetails.getEname())||sv!=updateDetails.getEsalary()){
                    System.out.println("Details Updated");
                }
                else{
                    System.out.println("NIl");
                }
                


            }
        }
    }



}


