

class Attendance
{
   
    void markAttendance()
    {
        System.out.println("Mass Bunk");
    }
    void markAttendance(String...s)
    {
        System.out.println(s.length+" student present: ");
        
        for(String name: s)
        {
            System.out.println(name);
        }
    }
    public static void main(String a[])
    {
        Attendance mark = new Attendance();
        mark.markAttendance("Sandra ","Sathya ","Aditya ","gokul");
        
    }
}