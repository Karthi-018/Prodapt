class fan extends light
{
public void Switch(String status)
{
super.Switch(status);
System.out.println("fan");
}
public void mode(int fan_mode)
{
if(fan_mode==1)
{
System.out.println("fan speed is set to 1");
}
else if (fan_mode==2)
{
System.out.println("fan speed is set to 2");
}
else 
{
System.out.println("fan speed is set to 3");
}
}
}