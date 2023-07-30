import java.util.Scanner;
class Employee{
     int eid;
     String ename;
     int sal;
    int emp_id[]={101,102,103,104,105,106,107,108,109,110};
    String emp_name[]={"Shalini","Sneha","Ranjana","Raghavi","Varsha","Sudha","Hari","Arun","Poornesh","Jerish"};
    int emp_sal[]={15000,12000,13000,11000,15000,10000,12000,11000,11000,10000};
    //-------------------------------------------------------------------------------------------------------------------
    void display_details(){
        for(int i=0;i<(emp_id.length);i++) {
            System.out.println("Employee ID:" + emp_id[i]+" Employee Name:"+ emp_name[i]+" Employee Salary:"+emp_sal[i]);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------
    void create_details(int id,String name,int sal){
        int new_emp_id[]=new int[emp_id.length+1];
        String new_emp_name[]=new String[emp_name.length+1];
        int new_emp_sal[]=new int[emp_sal.length+1];
        for(int i=0;i<emp_id.length;i++){
            new_emp_id[i]=emp_id[i];
            new_emp_name[i]=emp_name[i];
            new_emp_sal[i]=emp_sal[i];
        }
        new_emp_id[(emp_id.length)]=id;
        new_emp_name[(emp_name.length)]=name;
        new_emp_sal[(emp_sal.length)]=sal;

        emp_id=new_emp_id;
        emp_name=new_emp_name;
        emp_sal=new_emp_sal;

        System.out.println(java.util.Arrays.toString(emp_id));
        System.out.println(java.util.Arrays.toString(emp_name));
        System.out.println(java.util.Arrays.toString(emp_sal));
    }

    //-------------------------------------------------------------------------------------------------------------------
    void update_details(int update_id,String update_name,int update_sal){
        int x=-1;
        for(int i=0;i<emp_id.length;i++){
            if(update_id==emp_id[i]){
                x=i;
                break;
            }
        }
        if(x!=-1){
            System.out.println("Enter the name to update:");
            emp_name[x]=update_name;
            emp_sal[x]=update_sal;
        }
        System.out.println(java.util.Arrays.toString(emp_id));
        System.out.println(java.util.Arrays.toString(emp_name));
        System.out.println(java.util.Arrays.toString(emp_sal));
    }

    //-------------------------------------------------------------------------------------------------------------------
    void search_details(int search_id){
        int x=-1;
        for(int i=0;i<emp_id.length;i++){
            if(emp_id[i]==search_id){
                x=i;
                break;
            }
        }
        if(x!=-1) {
            System.out.println("Employee ID:" + emp_id[x] + " Employee Name:" + emp_name[x] + " Employee Salary:" + emp_sal[x]);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------
    void delete_details(int delete_id){
        int x=-1;
        for(int i=0;i<emp_id.length;i++){
            if(emp_id[i]==delete_id){
                x=i;
                break;
            }
        }
        if(x!=-1){
            for(int i=x;i<emp_id.length-1;i++){
                emp_id[i]=emp_id[i+1];
                emp_name[i]=emp_name[i+1];
                emp_sal[i]=emp_sal[i+1];
            }
        }
        System.out.println(java.util.Arrays.toString(emp_id));
        System.out.println(java.util.Arrays.toString(emp_name));
        System.out.println(java.util.Arrays.toString(emp_sal));
    }

    //-------------------------------------------------------------------------------------------------------------------
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=1;
        switch(num){
            case 1:
                System.out.println("1.Create");
            case 2:
                System.out.println("2.Update");
            case 3:
                System.out.println("3.Search");
            case 4:
                System.out.println("4.Display");
            case 5:
                System.out.println("5.Delete");
                break;
        }
        System.out.println("Enter a number from 1 to 5:");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Enter the employee ID to create:");
            int id=sc.nextInt();
            System.out.println("Enter the employee name to create:");
            String name=sc.next();
            System.out.println("Enter the employee salary to create:");
            int sal=sc.nextInt();
            Employee obj=new Employee();
            obj.create_details(id,name,sal);

        }
        else if (n==2) {
            System.out.println("Enter the employee ID to update:");
            int update_id=sc.nextInt();
            System.out.println("Enter the employee Name to update:");
            String update_name=sc.next();
            System.out.println("Enter the employee Salary to update:");
            int update_sal=sc.nextInt();

            Employee obj=new Employee();
            obj.update_details(update_id,update_name,update_sal);

        }
        else if (n==3) {
            System.out.println("Enter the employee ID to search:");
            int search_id=sc.nextInt();
            Employee obj=new Employee();
            obj.search_details(search_id);
        }
        else if (n==4) {
            Employee obj=new Employee();
            obj.display_details();
        }
        else if(n==5){
            System.out.println("Enter the employee ID to delete:");
            int delete_id=sc.nextInt();
            Employee obj=new Employee();
            obj.delete_details(delete_id);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
//------------------------------------------------------------------------------------------------------------------------
