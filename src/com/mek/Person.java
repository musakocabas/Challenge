package com.mek;

public class Person {
    private String firstName ;
    private String lastName ;
    private int age;

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getAge(){return this.age;}

    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setAge(int age){this.age = (age>0 && age <=100) ? age : 0;}

    public boolean isTeen(){return (age>12 && age<20);}
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
        if(this.firstName.isEmpty()) return this.lastName;
        if( this.lastName.isEmpty()) return this.firstName;
        return this.firstName + " " + this.lastName;
    }
}
