import java.util.Scanner;

class Mnclass{

	Student []slist=new Student[11];
	
	
	void initStudent(){
		for (int i=0;i<slist.length;i++){
			slist[i]=new Student((100+i),"Student"+(i+1),(45+i));
		}
	}
	
	
	
	public void find(String sname){
		boolean flag=false;
		for (int i=0;i<slist.length;i++){
			if (slist[i].getSname().equals(sname)){
				System.out.println("Student already present");
				flag=true;
				break;
			}
		}
		if(flag==false){
			try{
				throw new Snfe(sname);
			}
			catch (Snfe e){
				System.out.println(e);
			}
		}
	}
	
	
	public static void main(String [] a){
		Mnclass m=new Mnclass();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name to search: ");
		String name=sc.next();
		m.initStudent();
		m.find(name);
		
		
	}
}
