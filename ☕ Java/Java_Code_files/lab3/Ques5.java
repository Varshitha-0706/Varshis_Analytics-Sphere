package lab3;
class Addition{
private int num1;
private int num2;
Addition(){
num1=0;
num2=0;
}
public Addition(int num1, int num2) {
this.num1 = num1;
this.num2 = num2;
}
public void performAddition() {
int sum = num1 + num2;
System.out.println("Sum of " + num1 + " and " + num2 + " is: " +
sum);
}
}
public class Ques5{
public static void main(String[] args) {
Addition addition1 = new Addition();
addition1.performAddition();
Addition addition2 = new Addition(5, 7);
addition2.performAddition();
}
}
