class Game{
    String gname;
    Game(String gname)
    {
        this.gname=gname;
    }
    void move(){
        System.out.println(gname+" is moving.");
    }
    void action(){
        System.out.println(gname+ "no actions");
    }
}
class Mario extends Game{
    Mario(String gname)
    {
        super(gname);
    }
    void move(){
        System.out.println(gname+" is jumping,running,escaping.");
    }
    void action(){
        System.out.println(gname+" collects coins and powers");
    }
}
class DuckHunt extends Game{
    DuckHunt(String gname)
    {
        super(gname);
    }
    void move(){
        System.out.println(gname+" is aiming at ducks.");
    }
    void action(){
        System.out.println(gname+" shoots down flying ducks within seconds.");
    }
}
class Commando extends Game{
    Commando(String gname)
    {
        super(gname);
    }
    void move(){
        System.out.println(gname+" is sneaking through the shadows");
    }
    void action(){
        System.out.println(gname+" uses weaponry to defense.");
    }
}
public class ArcadeGame{
    public static void main(String[] args)
    {
        Game game1=new Mario("Super Mario");
        
        game1.move();
        game1.action();
        Game game2=new Commando("Commando");
        game2.move();
        game2.action();
        Game game3=new DuckHunt("Duck Hunt");
        game3.move();
        game3.action();


    }
}
