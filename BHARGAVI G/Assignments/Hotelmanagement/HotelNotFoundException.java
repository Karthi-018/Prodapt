package org.example;

    public class HotelNotFoundException extends Exception{



        public HotelNotFoundException(String searchname)
        {
            System.out.println(searchname+ " not found in the List");
        }
    }

