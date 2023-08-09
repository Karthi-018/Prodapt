import java.util.*;
class pojoHotel
{
int H_rating;
String H_Name;
int H_Id;
String H_Fac;
String H_Des;

pojoHotel()
{
}
pojoHotel(int H_Id,String H_Name,String H_Fac,String H_Des,int H_rating)
{
this.H_rating=H_rating;
this.H_Name=H_Name;
this.H_Id=H_Id;
this.H_Fac=H_Fac;
this.H_Des=H_Des;
}
void setid(int H_Id)
{
this.H_Id=H_Id;
}
int getid()
{
return H_Id;
}
void setrating(int H_rating)
{
this.H_rating=H_rating;
}
int getrating()
{
return H_rating;
}
void setname(String H_Name)
{
 	this.H_Name=H_Name;
}
String getname()
{
	return H_Name;
}
void setfacility(String H_Fac)
{
	this.H_Fac=H_Fac;
}
String getfacility()
{	
	return H_Fac;
}
void setdescription(String Des)
{
	this.H_Des=H_Des;
}
String getdescription()
{
	return H_Des;
}
public static pojoHotel createdata(String line)
{
  String[] details=new String[4];
  details=line.split(",");
  int H_Id=Integer.parseInt(details[0]);
  String H_Name=details[1];
  String H_Fac=details[2];
  String H_Des=details[3];
  int H_rating=Integer.parseInt(details[4]);
  return new pojoHotel(H_Id,H_Name,H_Fac,H_Des,H_rating);
}
}

