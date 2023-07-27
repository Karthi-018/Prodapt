class MainCls
{
	public static void main(String[] args)
	{
		Honda h = new Honda();
		System.out.println("Honda details");
		h.mileage();
		h.cost();
		System.out.println();
		Bajaj b = new Bajaj();
		System.out.println();
		System.out.println("Bajaj details");
		b.mileage();
		b.cost();
		Tvs t = new Tvs();
		System.out.println();
		System.out.println("Tvs details");
		t.mileage();
		t.cost();
	}

}