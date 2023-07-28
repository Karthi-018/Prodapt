class Purchase{
	String specs(){
		return "Iphone";
	}
	String specs(int price){
		if(price<20000){
			return "redmi";
		}
		else{
			return "One plus";
		}
	}
	String specs(int price,String color){
		if(price<20000){
			return "redmi "+color;
		}
		else{
			return "One plus"+color;
		}
	}
}

class OverLoadingExample3{
	Purchase p1 = new Purchase();
	System.out.println(p.specs(12000));	
	
	Purchase p2 = new Purchase();
	System.out.println(p.specs(30000));
	
	Purchase p3 = new Purchase();
	System.out.println(p.specs(12000,"red"));	
	
	
}