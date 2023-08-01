import java.util.Scanner;
public class function {

    Scanner s = new Scanner(System.in);
    Server elist[]=new Server[11];
    public void initElist(){
        for(int i=0;i<10;i++){
            elist[i]=new Server((100+(i+1)), "Employee"+(i+1), "Department"+(i+1), 20000+(i+1000));
        }
    }
    public Server findEmployee(int eid){
        Server emp =null;
        for(int i=0;i<elist.length;i++){
            if (elist[i]!=null){
                if(elist[i].getEid()==eid){
                    emp=elist[i];
                }
            }

        }
        return emp;
    }
    public Server[] create(Server e){
        Server emp =findEmployee(e.getEid());
        if(emp == null){
            elist[elist.length-1]= e;

        }
        else {
            System.out.println("employee already exist");
        }
        return elist;
    }

    public Server updateE(int eid, String ename, String dept , double esalary){
        Server emp = findEmployee(eid);
        if(emp!= null){
            emp.setEname(ename);
            emp.setDept(dept);
            emp.setEsalary(esalary);
        }
        else {
            System.out.println("exist");
        }
        return emp;
    }
    public Server[] displayEmployee(){
        return elist;
    }
    public void deleteEmployee(int id){
        Server er= findEmployee(id);
        if(er != null){
            int delete =-1;
            for(int i=0;i< elist.length-1;i++){
                if(elist[i] == er){
                    delete=i;

                }
            }
            if(delete != -1){
                for(int i=delete;i< elist.length-1;i++){
                    elist[i]=elist[i+1];
                }
                elist[elist.length-1]=null;
            }
        }
        else {
            System.out.println("employee not exist");
        }

    }
    //public Server[] elist() {return elist;}

/*
        Server[] elist= createy(Mn.elist, eid, ename, esalary);
        System.out.println("New employee created successfully");
        for(Server details:elist){
            System.out.println(details);
        }
        public Mn[] createy(Server[] elist, int eid, String ename, double esalary){
            Server[] arr = new Server[(elist.length)+1];
            System.arraycopy(elist, 0, arr, 0, elist.length);
            arr[elist.length]=new Server(eid, ename,esalary);
            return arr;

            //System.out.println(empId+empName+empSalary);


    }

 */






}


