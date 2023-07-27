class Student{
	int n1;
	int n2;
	int n3;
	Student(){
		n1 = 0;
		n2 = 0;
		n3 = 0;
		System.out.println(n1+" "+n2+" "+n3);
	}

	Student(int n1){
		this();
		System.out.println(n1+" "+n2+" "+n3);
	}

	Student(int n1, int n2){
		this(n1);
		System.out.println(n1+" "+n2+" "+n3);
	}

	Student(int n1, int n2, int n3){
		this(n1,n2);
		System.out.println(n1+" "+n2+" "+n3);
	}
}