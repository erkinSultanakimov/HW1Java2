package com.company;

public class Logist {
   private String name;
   private String address;

   public Logist(String name, String address){
       this.address = address;
       this.name = name;
   }

   public String getName(){
       return name;
   }

   public String getAddress(){
       return address;
   }
}
