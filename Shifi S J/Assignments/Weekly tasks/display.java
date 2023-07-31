public void display(employee [] arr){
	for(int i=0;i<index;i++){
		if(arr[i]!=null){
			
			System.out.println("Employee ID  : "+arr[i].id);
			System.out.println("Employee Name  : "+arr[i].name);
			System.out.println("Employee Salary  : "+arr[i].salary);
		}
	}
}
