import java.util.*;
class Student
{
    public static void main(String arg[]) throws StuNotfoundException {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Stu st[]=new Stu[n];
        Stu o;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter ID : ");
            int sid = s.nextInt();
            System.out.println("Enter NAME : ");
            String sname = s.next();
            System.out.println("Enter MARK : ");
            int mark = s.nextInt();
            o=new Stu(sid,sname,mark);
            st[i]=o;
        }
        int searchid=s.nextInt();
        search(searchid,st);
    }


    static void search(int sid,Stu[] st) throws StuNotfoundException
    {
        boolean f = false;
        for(int i=0;i<st.length;i++)
        {
            if(sid==st[i].getsid())
            {
                System.out.println(st[i]);
                f = true;
                break;
            }
        }
        if(f==false)
        {
            throw new StuNotfoundException(sid);
        }

    }
}