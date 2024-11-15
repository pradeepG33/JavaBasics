//1.multi level inheritance:
/*class Person {
      public void greet(){
          System.out.println("greet person");
      }
}
class Employee extends Person{

    public void greet(){
        System.out.println("greet employee");
    }
}
class Manager extends Employee{
    public void greet(){

        System.out.println("greet manager");
    }
    public void cattype(){
        System.out.println("black and white");
    }
}*/

//2.Simple Inheritance
/*

class person{
    String name;
    int age;
   public person(String name, int age) {
        this.name = name;
        this.age= age;
    }
public void  display(){
    System.out.println(name +" "+ age);
    }
}
class student extends person{
    String  grade;
    public student(String grade, String name, int age){
        super(name, age);
        this.grade = grade;

    }
    public void display(){
        System.out.println(name + " "+ age + " "+ grade);
    }

}

public class Main{
    public static void main(String[] args){
        student s = new student("a", "pradeep", 24);
        s.display();

    }
}*/

//hirerachical inheritance:
/*class vehicle{
    public void type(){
        System.out.println("Vehicle type");
    }
}
class bike extends vehicle{
    public void type(){
        System.out.println("type bike");

    }
}
class truck extends vehicle{
    public void type(){
        System.out.println("type truck");
    }
}
public class Main{
    public static void main(String[] a){
        vehicle v = new bike();
        v.type();
    }
}*/

//Calling Superclass Method with super:
/*class Bird{
    public void fly(){
        System.out.println("fly Bird");
    }
}
class sparrow extends Bird{

    public void fly(){
        super.fly();
        System.out.println("Sparrow");

    }
}
class Main{
    public static void main(String[] a){
        Bird s = new sparrow();
        s.fly();
    }
}*/

// Base class with a parameterized constructor
/*class Base {
    int value;

    // Parameterized constructor in Base class
    public Base(int value) {
        this.value = value;
        System.out.println("Base class constructor called with value: " + value);
    }
}

// Derived class extending Base
class Derived extends Base {
    int derivedValue;

    // Constructor in Derived class, calling super to invoke Base constructor
    public Derived(int value, int derivedValue) {
        super(value); // Calls the Base class constructor
        this.derivedValue = derivedValue;
        System.out.println("Derived class constructor called with derivedValue: " + derivedValue);
    }
}

// Main class to test constructor chaining
public class Main {
    public static void main(String[] args) {
        // Creating an object of Derived class
        Derived derivedObject = new Derived(10, 20);
    }
}*/


/*
class parent{
    protected int id =1;
    public void  set(int id){
        this.id = id;
    }
    public int get(){
        return id;
    }

}
class child extends parent{
    public void method() {
      System.out.println(id);
    }
}
class Main{
    public static void main(String[] a){
        child c = new child();
       c.method();

    }
}*/

// Base class
class Company {
    // Static field
    static String companyName = "Tech Solutions Inc.";

    // Static method
    public static String getCompanyName() {
        return companyName;
    }
}

// Subclass
class Department extends Company {
    // Static method in subclass with the same name
    public static String getCompanyName() {
        return "Department of " + companyName;
    }

    public void showCompanyName() {
        // Calling static method from superclass
        System.out.println("Company Name from Company class: " + Company.getCompanyName());

        // Calling static method from subclass
        System.out.println("Company Name from Department class: " + Department.getCompanyName());
    }
}

// Main class to test the behavior
public class Main {
    public static void main(String[] args) {
        Department dept = new Department();

        // Calling the method to display the company name
        dept.showCompanyName();
    }
}

