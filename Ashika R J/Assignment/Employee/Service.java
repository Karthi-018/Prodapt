public class Service {
    CRUD_Emp e_arr[]=new CRUD_Emp[10];
    public void get_e_arr(){
        for(int i=0;i<10;i++){
            e_arr[i]=new CRUD_Emp((1000+(i+1)),"Employee"+(i+1),"CS",10000*(i));
        }
    }

    public CRUD_Emp[] create_emp(CRUD_Emp employee){
        CRUD_Emp emp=search_emp(employee.getId());
        if(emp==null){
            e_arr[e_arr.length-1]=employee;
        }
        else{
            System.out.println("Employee Already Exist");
        }
        return e_arr;
    }

    public void delete_emp(int id){
        int j=0;
        CRUD_Emp emp=search_emp(id);
        System.out.println(emp);
        CRUD_Emp temp[]=new CRUD_Employee[10];

        if(emp!=null) {
            for (int i = 0; i < e_arr.length; i++) {
                if (e_arr[i] != emp) {
                    temp[j++] = e_arr[i];
                } else {
                    e_arr[i] = null;
                }

            }
        }
        else{
            System.out.println("ID not found");
        }
            System.out.println("List after deletion:");
            for(int i=0;i<temp.length;i++){
                if(temp[i]!=null){
                    System.out.println(temp[i]);
                }
            }
        }

    public CRUD_Emp update_emp(int id,String name,String dept,double sal){
        CRUD_Emp emp=search_emp(id);
        if(emp!=null){
            emp.setName(name);
            emp.setDept(dept);
            emp.setSal(sal);
        }
        else{
            System.out.println("Employee does not exist");
        }
        return emp;
    }
 
    public CRUD_Emp search_emp(int id){
        CRUD_Emp emp=null;
        for(int i=0;i<e_arr.length;i++){
            if(e_arr[i]!=null){
                if(e_arr[i].getId()==id){
                    emp=e_arr[i];
                }
            }
        }
        return emp;
    }

    public CRUD_Emp[] employeeList(){
        return e_arr;
    }
}