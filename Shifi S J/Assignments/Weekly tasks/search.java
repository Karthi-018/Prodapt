public void search(employee [] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the ID to be searched");
	int id=sc.nextInt();
	int flag=0;
	for(int i=0;i<index;i++){
		if(arr[i]!=null&&arr[i].id==id){
			flag=1;
			System.out.println("The Searched Employee Details are");
			System.out.println("Employee id  : "+arr[i].id);
			System.out.println("Employee name  : "+arr[i].name);
			System.out.println("Employee salary  : "+arr[i].salary);
			break;
		}
	}
	if(flag==0){
		System.out.println("Employee details not found");
	}
}
