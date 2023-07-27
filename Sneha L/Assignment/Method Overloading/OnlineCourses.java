public class OnlineCourses{
	void enroll(String crsName){
		System.out.println("Enroll the course:"+crsName);
		System.out.println("Enrolled Successful");
	}
	void enroll(int crsId){
		System.out.println("Enroll the course id:"+crsId);
		System.out.println("Enrolled Successful");
	}
	void enroll(int crsId,String crsName){
		System.out.println("Enroll the id:"+crsId+" course:"+crsName);
		System.out.println("Enrolled Successful");
	}
	void enroll(String crsName,int crsId){
		System.out.println("Enroll the course:"+crsName+" id:"+crsId);
		System.out.println("Enrolled Successful");
	}
	public static void main(String[] args){
		OnlineCourses courses=new OnlineCourses();
		courses.enroll("Core Java Programming");
		courses.enroll("DBMS",10051);
		courses.enroll(98567);
		courses.enroll(24376,"Telecom Basics");
	}
}