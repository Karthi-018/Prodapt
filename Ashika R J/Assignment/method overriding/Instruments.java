class Keyboard extends Instruments
{
 void MusIns()
 {
  System.out.println("Acoustic Instrument");
 }
}

class Piano extends Instruments
{
 void MusIns()
 {
  System.out.println("Electronic Instrument");
 } 
}
 
class Instruments
{ 
 void MusIns()
 {
  System.out.println("Different type of Instruments");
 } 
 public static void main(String a[])
 {
  Instruments I=new Keyboard();
  I.MusIns();
  Instruments i=new Piano();
  i.MusIns();
 }
}