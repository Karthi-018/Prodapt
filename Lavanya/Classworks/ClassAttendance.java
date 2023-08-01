#varargs
public class ClassAttendance
{
	public static void main(String[] args) {
	    ClassAttendance obj=new ClassAttendance();
	    obj.MarkAttendance();
	    obj.MarkAttendance("sita","ram");
	}

    void MarkAttendance(){
        System.out.println("mass bunk");
    }
    void MarkAttendance(String...s){
        System.out.println(s.length+" students present");
        for(String name:s){
            System.out.println(name);
        }
    }
}
