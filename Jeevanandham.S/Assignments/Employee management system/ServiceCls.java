package ems;

public class ServiceCls {

    Employee[] empList = new Employee[20];

    public void initiEmpList(){
        empList[0]=new Employee(121,"Mr.A",300000);
        empList[1]=new Employee(122,"Mr.B",300000);
        empList[2]=new Employee(123,"Mr.C",300000);
        empList[3]=new Employee(124,"Mr.D",300000);
        empList[4]=new Employee(125,"Mr.E",300000);
        empList[5]=new Employee(126,"Mr.F",300000);
        empList[6]=new Employee(127,"Mr.G",300000);
        empList[7]=new Employee(128,"Mr.H",300000);
        empList[8]=new Employee(129,"Mr.I",300000);
        empList[9]=new Employee(130,"Mr.J",300000);
    }

    public Employee findEmployee(int id){
        Employee employee = null;
        for(int i=0;i<empList.length;i++) {
            if (empList[i] != null) {
                if (empList[i].getEmpId() == id ) {
                    employee = empList[i];
                }
            }
        }
        return employee;

    }

    public Employee[] createEmployee(Employee emp){
        Employee employee = findEmployee(emp.getEmpId());
        if(employee == null){
            empList[empList.length-1] = emp;
        }
        else{
            System.out.println("Id already exist");
        }
        return empList;
    }


    public Employee[] deleteEmployee(Employee emp){
        Employee[] deleteList = new Employee[20];
        for(int i=0,j=0;i<empList.length;i++){
            if(empList[i]!=null) {
                if (empList[i] != emp) {
                    deleteList[j] = empList[i];
                    j++;
                }
            }
        }
        return deleteList;
    }


    public void displayEmployee(){
        for(int i=0;i<empList.length;i++){
            if(empList[i]!=null){
                System.out.println(empList[i]);
            }
        }
    }


}
