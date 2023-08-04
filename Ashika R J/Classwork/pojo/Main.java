
public class Main {
    public static void main(String a[]) {
        pojoDemo pd = new pojoDemo(232,"Ash",24000);

        System.out.println("Emp ID:"+pd.getEid());
        System.out.println("Emp NAME:"+pd.getEname());
        System.out.println("Emp SALARY:"+pd.getEsalary());
       }
    }