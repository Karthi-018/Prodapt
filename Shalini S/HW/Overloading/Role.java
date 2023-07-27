import java.util.*;
class Prodapt{
    public void job_roles(String role1){
        System.out.println("You are a Trainee at Prodapt");
        System.out.println("Your duty is to "+role1);
        
    }
    public void job_roles(String role1,String role2){
        System.out.println("You are a Software Tester at Prodapt");
        System.out.println("Your duty is to "+role1+" and "+role2);
    }
    public void job_roles(String role1,String role2,String role3){
        System.out.println("You are a Developer at Prodapt");
        System.out.println("Your duty is to "+role1+","+role2+" and "+role3);
    }
    public void job_roles(){
        System.out.println("You are an employee at prodapt");
    }
}
class Role{
    public static void main(String args[]){
        Prodapt obj=new Prodapt();
        obj.job_roles("test","rectify bugs");
        System.out.println();
        obj.job_roles();
        System.out.println();
        obj.job_roles("learn");
    }
}
    
    