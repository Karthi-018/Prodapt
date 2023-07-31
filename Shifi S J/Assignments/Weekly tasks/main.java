public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Employee Management System");
	System.out.println("Options available:");
	System.out.println("1.Create");
System.out.println("2.Display");
System.out.println("3.Update");
System.out.println("4.Delete");
System.out.println("5.Search");
employee arr[]=new employee[10];
	employee e=new employee();
	for(int i=0;i<10;i++){
		e.create(arr);
	}
	e.display(arr);
	e.update(arr);
	e.display(arr);
	e.delete(arr);
	e.display(arr);
	e.search(arr);
}
		