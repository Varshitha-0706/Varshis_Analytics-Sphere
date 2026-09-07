package lab3;

public class Ques8{
    private int a; // private data member
    private int b; // private data member
    
    // setter method for 'a'
    public void setA(int value) {
        this.a = value;
    }
    
    // setter method for 'b'
    public void setB(int value) {
        this.b = value;
    }
    
    // getter method for 'a'
    public int getA() {
        return this.a;
    }
    
    // getter method for 'b'
    public int getB() {
        return this.b;
    }

    public static void main(String[] args) {
    	Ques8 obj = new Ques8();

        // setting values using setter methods
        obj.setA(10);
        obj.setB(20);

        // getting values using getter methods
        System.out.println("Value of 'a': " + obj.getA());
        System.out.println("Value of 'b': " + obj.getB());
    }
}
