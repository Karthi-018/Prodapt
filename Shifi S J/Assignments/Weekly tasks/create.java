public void create(employee [] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ID");
	int id=sc.nextInt();
	employee e =new employee();
	int x=0;
	for(int i=0;i<index;i++){
		if(arr[i]!=null && arr[i].id==id){
			System.out.println("Employee already exists");
			x=1;
		}
	}
	if(x==0){
		e.id=id;
		System.out.println("Enter the employee name to be created");
		String name=sc.next();
		e.name=name;
		System.out.println("Enter the employee salary to be created");
		int salary=sc.nextInt();
		e.salary=salary;
		arr[index]=e;
		System.out.println("The Created Employee Details are");
		System.out.println("Employee ID  : "+arr[index].id);
		System.out.println("Employee name  : "+arr[index].name);
		System.out.println("Employee salary  : "+arr[index].salary);
		index++;

	}
}