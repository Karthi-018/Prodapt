class EmployeeManagement {
    int eid;
    String ename;
    String designation;
    double salary;
    static int size = 0;

    EmployeeManagement(int eid, String ename, String designation, double salary) {
        this.eid = eid;
        this.ename = ename;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "Employee ID:" + eid + "\nEmployee Name:" + ename +  "\nDesignation:" + designation + "\nSalary:" + salary+"\n" ;
    }

    static void updateDetails(EmployeeManagement[] emparr, int id, String name, String dsgn, double sa) {
        for (EmployeeManagement employeeManagement : emparr) {
            if (employeeManagement.eid == id) {
                employeeManagement.ename = name;
                employeeManagement.designation = dsgn;
                employeeManagement.salary = sa;
                System.out.println("Employee Details updated successfully");
                return;
            }
        }
        System.out.println(id + " not found");
    }

    static void searchDetails(EmployeeManagement[] emparr, int searchId) {
        for (EmployeeManagement employeeManagement : emparr) {
            if (employeeManagement.eid == searchId) {
                System.out.println("Employee Found");
                System.out.println(employeeManagement);
                return;
            }
        }
        System.out.println("Employee not Found");
    }

    static void deleteDetails(EmployeeManagement[] emparr, int id) {
        for (int i = 0; i < emparr.length; i++) {
            if (emparr[i].eid == id) {
                for (int j = i; j < emparr.length - 1; j++) {
                    emparr[j] = emparr[j + 1];
                }
                emparr[emparr.length - 1] = null;
                size--;
                System.out.println("Employee details deleted successfully");
                return;
            }
        }
        System.out.println(id + " not found, cannot be deleted");
    }

    static void displayDetails(EmployeeManagement... emparr) {
        System.out.println("EMPLOYEE DETAILS");
        for (EmployeeManagement i : emparr) {
            System.out.println(i);
        }
    }
}
