package lab3;
import java.util.*;

//Program to calculate the area of a triangle using default and parameterized constructors

class trianglee{
double base, height;

// Default constructor
trianglee() {
   base = 0.0;
   height = 0.0;
}

// Parameterized constructor
trianglee(double b, double h) {
   base = b;
   height = h;
}

// Method to calculate area
void calculateArea() {
   double area = 0.5 * base * height;
   System.out.println("Area of triangle: " + area);
}
}

public class Ques6 {
public static void main(String[] args) {
   // Using default constructor
   trianglee defaultTriangle = new trianglee();
   defaultTriangle.calculateArea();

   // Using parameterized constructor
   trianglee paramTriangle = new trianglee(6.0, 4.0);
   paramTriangle.calculateArea();
}
}