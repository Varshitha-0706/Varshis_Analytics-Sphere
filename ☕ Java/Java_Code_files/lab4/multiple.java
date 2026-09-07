package lab4;
/*	Write a program to implement Multiple Inheritance using class names as Father, 
Mother and Child; Display the details of family members? 
(Hint: Base Class -1, Base Class-2, Derived Class-1) */
//interface 1
interface Father{
String fName="Rahamthulla"; 
int fAge=42;

default void displayF(){
    System.out.println("Name: " + fName);
    System.out.println("Age: " + fAge);
}
}

//interface 2
interface Mother{
String mName="Fathimunnisa";
int mAge=36;
default void displayM(){
    System.out.println("Name: " + mName);
    System.out.println("Age: " + mAge);
}
}

class Chilld implements Father,Mother{
String cName;
int cAge;
Chilld(String cName,int cAge){
this.cName=cName;
this.cAge=cAge;
}
void displayC(){
    System.out.println("Name: " + cName);
    System.out.println("Age: " + cAge);
}
}

public class multiple{
public static void main(String args[]){
Chilld c = new Chilld("Shaheen",19);
c.displayF();
c.displayM();
c.displayC();
}
}