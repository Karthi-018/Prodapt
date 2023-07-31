public void delete(employee [] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the ID to be deleted");
	int id=sc.nextInt();
	int flag=0;
	for(int i=0;i<index;i++){
		if(arr[i]!=null&&arr[i].id==id){
			flag=1;
			arr[i]=null;
			break;
		}
	}
	if(flag==0){
		System.out.println("Employee details not found");
	}
}