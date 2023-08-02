import java.util.Scanner;
class MainClass
{

   static Student[] sarr = new Student[6];

    public void firstFiveData()
    {
        int stdid[] = {1,2,3,4,5};
        String stdname[] = {"Student1","Student2","Student3","Student4","Student5"};
        int stdmarks[] = {90,95,80,85,70};

        for(int i=0;i<5;i++)
        {
            sarr[i]= new Student(stdid[i],stdname[i],stdmarks[i]);
        }
    }

    public  void Search(String name)
    {
        boolean flag=false;
        for(int i=0;i<5;i++){

            if(sarr[i].getSname().equals(name))
            {
                System.out.println("Student present");
                flag=true;
                break;
            }

        }
        if (!flag)
        {
            try {
                throw  new FindStudent(name);
            }
            catch (FindStudent e)
            {
                System.out.println(e);
            }
        }

    }


    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        MainClass mc = new MainClass();
        System.out.println("Enter Student name : ");
        String studentName = sc.next();
        mc.firstFiveData();
        mc.Search(studentName);

    }
}



