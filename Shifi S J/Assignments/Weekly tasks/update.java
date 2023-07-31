public void update(employee [] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the ID to be updated");
	int id=sc.nextInt();
	int flag=0;
	for(int i=0;i<index;i++){
		if(arr[i]!=null&&arr[i].id==id){
			flag=1;
			arr[i].id=id;
			System.out.println("Enter the employee name to be updated");
			String name=sc.next();
			arr[i].name=name;
			System.out.println("Enter the employee salary to be craeted");
			int salary=sc.nextInt();
			arr[i].salary=salary;
			System.out.println("Updated Employee Details");
			System.out.println("Employee id  : "+arr[i].id);
			System.out.println("Employee name  : "+arr[i].name);
			System.out.println("Employee salary  : "+arr[i].salary);
			break;
		}
	}
	if(flag==0){
		System.out.println("The employee detail not found");
	}
}
