class HotelPojo{ 

//creation of class

private int HotelId;

private String HotelName;

private String HotelDescription;

private String HotelFacilities;

private int Rating;

public HotelPojo(int HotelId,String HotelName,String HotelDescription,String HotelFacilities,int Rating) //creation of constructor

{

this.HotelId=HotelId;

this.HotelName=HotelName;

this.HotelDescription=HotelDescription;

this.HotelFacilities=HotelFacilities;

this.Rating=Rating;

}





public void setHotelId(int HotelId) //setter and getter method

{

this.HotelId=HotelId;

}

public int getHotelId()

{

return HotelId;

}



public void setHotelName(String HotelName)

{

this.HotelName=HotelName;

}

public String getHotelName()

{

return HotelName;

}



public void setHotelDescription(String HotelDescription)

{

this.HotelDescription=HotelDescription;

}

public String getHotelDescription()

{

return HotelDescription;

}



public void setHotelFacilities(String HotelFacilities)

{

this.HotelFacilities=HotelFacilities;

}

public String getHotelFacilities()

{

return HotelFacilities;

}



public void setRating(int Rating)

{

this.Rating=Rating;

}

public int getRating()

{

return Rating;

}


public String toString(){

return " HotelId:"+HotelId+"\n HotelName:"+HotelName+"\n HotelDescription:"+HotelDescription+"\n HotelFacilities:"+HotelFacilities+"\n Rating:"+Rating+"\n";

}



}

