public class HelloWorld {
    private String name;
    private int age;

    // Constructor with only name
    public HelloWorld(String name) {
        this.name = name;
        this.age = 0; // Default age if not provided
    }

    // Constructor with name and age
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded greet method with custom message
    public void greet(String message) {
        System.out.println(message + ", " + name + "!");
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        // Using first constructor
        HelloWorld student1 = new HelloWorld("Rico Something");
        student1.greet();
        student1.greet("Welcome");
        student1.introduce();

        // Using second constructor
        HelloWorld student2 = new HelloWorld("Bella Daugherty", 21);
        student2.greet();
        student2.greet("Hi");
        student2.introduce();
    }
}