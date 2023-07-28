class Sound {
	void soun(){
		System.out.println("Different Animal Sounds");
	}
}
class  Dog extends Sound {
	void soun(){
		System.out.println("The dog barks");
	}
}
class Owl extends Dog{
	void soun(){
		System.out.println("The owl Hoots");
	}
}
class Lion extends Owl{
	void soun(){
		System.out.println("The lion Roars");
	}
}
class Cat extends Lion{
	void soun(){
		System.out.println("The cat meows");
	}
}

class Maincls{
	public static void main(String []args){
		Sound s =new Sound();
		s.soun();
		Dog d=new Dog();
		d.soun();
		Cat c=new Cat();
		c.soun();
	}
}

