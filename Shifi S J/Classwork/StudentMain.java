import java.util.*;
public class StudentMain{
	public static void main(String args[]){
		StudentPojo n[]= new StudentPojo[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++){
			StudentPojo student=new StudentPojo();
			student.setName(sc.next());
			student.setId(sc.nextInt());
			student.setMark(sc.nextInt());
		 n[i]=student;
		}
		for(StudentPojo i:n){
			System.out.println(i);
		}
	}
}
		
		