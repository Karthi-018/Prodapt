public class Colour {
    public static void main(String[] args) {
        DarkColour d = new DarkColour();
        d.brightness();
        Red r = new Red();
        r.brightness();
        DarkColour re = new Red();
        re.brightness();

    }
}
class DarkColour
{
    public void brightness()
    {
        System.out.println("The colour is Dark");
    }
}
class Red extends DarkColour
{
    public void brightness()
    {
        System.out.println("The Red Colour Denotes Danger");
    }
}