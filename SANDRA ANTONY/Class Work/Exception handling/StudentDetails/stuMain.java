import java.util.*;
class stuMain
{
    Scanner s=new Scanner(System.in);
    StuDetails[] stuArr = new StuDetails[5];
    void ListCreate()
    {
        stuArr[0]=new StuDetails(1,"Sameer",100);
        stuArr[1]=new StuDetails(2, "Agri", 99);
        stuArr[2]=new StuDetails(3,"Pooja",98);
        stuArr[3]=new StuDetails(4,"Ganesh",97);
        stuArr[4]=new StuDetails(5,"Aditya",100);
    }

    void FindStu()
    {
        System.out.print("Enter Student Id to search : ");
        int ID=s.nextInt();
        int flag =0;

        for(int i=0;i<5;i++)
        {

            if(stuArr[i].sId==ID)
            {
                System.out.println("Id Found");
                flag=1;
                break;
            }



        }

        if(flag==0)
        {
            try
            {
                //System.out.println("Student Id not found");
                throw new StudentNotFoundException(ID);

            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }


    }

    public static void main(String[] args)
    {
        stuMain stuDet=new stuMain();
        stuDet.ListCreate();
        stuDet.FindStu();
    }
}
