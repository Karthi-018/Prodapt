class TrafficLight
{
String color;
int sec;
public TrafficLight(String color,int sec)
{
this.color=color;
this.sec=sec;
}
public void lightGlow()
{
System.out.println("Traffic Light is off");
}

}

class RedLight extends TrafficLight
{
public RedLight()
{
super("red",30);
}
@Override
public void lightGlow()
{
System.out.println("Stop your Vehicle");
}
}

class YellowLight extends TrafficLight
{
public YellowLight()
{
super("yellow",5);
}
@Override
public void lightGlow()
{
System.out.println("Ready to go");
}
}

class GreenLight extends TrafficLight
{
public GreenLight()
{
super("green",30);
}
@Override
public void lightGlow()
{
System.out.println("You can go");
}
}