class watch
{
watch()
{
System.out.println("No features Analog watch");
}
watch(String companyname,int NO_features)
{
System.out.println("model of watch is:"+" "+companyname);
if (NO_features >3)
{ 
  System.out.println("it has basic features of digital time display, alarm, music and also the following features");
  System.out.println("measure BPM");
  System.out.println("measuure no. of steps per day");
  System.out.println("measure stress lvl");
    System.out.println("Alexa facilityis available");
}
else
{
System.out.println("it has basic features of digital time display, alarm, music");
}
}
watch(int days,String companyname,int NO_features)
{
System.out.println("battery will last for"+" "+days+" "+"days");
System.out.println("model of watch is:"+" "+companyname);
if (NO_features >3)
{ 
  System.out.println("it has basic features of digital time display, alarm, music and also the following features");
  System.out.println("measure BPM");
  System.out.println("measuure no. of steps per day");
  System.out.println("measure stress lvl");
    System.out.println("Alexa facility is available");
}
else
{
System.out.println("it has basic features of digital time display, alarm, music");
}
}

}

