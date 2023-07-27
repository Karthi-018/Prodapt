class methodoverloading3 {
    void display(char a, int b)
    {
        System.out.println(a);
	System.out.println(b);
    }
    void display(int a, char b)
    {
        System.out.println(a);
	System.out.println(b);
    }

 
    public static void main(String[] args) {
        methodoverloading3 m = new methodoverloading3();
      	m.display('x',3);
      	m.display(3,'x'); 
    }
}