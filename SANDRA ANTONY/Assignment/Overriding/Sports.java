class Sports
{
    void play()
    {
        System.out.println("From the class sports: ");
        System.out.println("Stamina and Edurance are the main keys");
    }
}
class Badminton extends Sports
{
    @Override
    void play()
    {
        System.out.println("Speed is also important");
    }
}
class test
{
    public static void main(String[] args)
    {
    Badminton b = new Badminton();
    Sports s = new Sports();
    Badminton b1 = new Badminton();   
    
    b.play();
    s.play();
    b1.play();
    }
}
	
	