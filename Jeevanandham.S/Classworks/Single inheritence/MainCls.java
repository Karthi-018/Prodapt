class MainCls{
	public static void main(String[] args){
		Manager m = new Manager();
		m.setEmpId(121);
		m.setEmpName("Jeeva");
		m.setDept("Training");
		System.out.println(m.getEmpId());
		System.out.println(m.getEmpName());
		System.out.println(m.getDept());
	}
}