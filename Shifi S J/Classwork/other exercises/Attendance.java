public class Attendance{
	void markAttendance()
		{
			System.out.println("MASS BUNK");
		}
		void markAttendance(String... s)
		{
			System.out.println("No. of Students present is: "+s.length);
			System.out.println("Name of the Students Present:");
			for(String i:s){

				System.out.println(i);
			}
		}
	public static void main(String args[])
	{
		Attendance present=new Attendance();
		present.markAttendance("Shifi","Adhi","Lakshmi");
	}
}