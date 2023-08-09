package org.example;

 class hotel {
     int hotelid;
     String hotelname;
     String hoteldescription;
     String hotelfacility;
     double rating;

     public hotel(int hotelid, String hotelname, String hoteldescription, String hotelfacility,double rating) {
         this.hotelid = hotelid;
         this.hotelname = hotelname;
         this.hoteldescription = hoteldescription;
         this.hotelfacility = hotelfacility;
         this.rating=rating;


     }


     public int getHotelid() {
         return hotelid;
     }

     public void setHotelid(int hotelid) {
         this.hotelid = hotelid;
     }

     public String gethotelname() {
         return hotelname;
     }

     public void sethotelname(String hotelname) {
         this.hotelname = hotelname;
     }

     public String getHoteldescription() {
         return hoteldescription;
     }

     public void setHoteldescription(String hoteldescription) {
         this.hoteldescription = hoteldescription;
     }

     public String getHotelfacility() {
         return hotelfacility;
     }



     public double getRating() {
         return rating;
     }

     public void setRating(double rating) {
         this.rating = rating;
     }

     public void setHotelfacility(String hotelfacility) {
         this.hotelfacility = hotelfacility;


     }
     @Override
     public String toString() {
         return "hotel{" +
                 "hotelid=" + hotelid +
                 ", hotelname='" + hotelname + '\'' +
                 ", hoteldescription='" + hoteldescription + '\'' +
                 ", hotelfacility='" + hotelfacility + '\'' +
                 ", rating=" + rating +
                 '}';
     }
 }
