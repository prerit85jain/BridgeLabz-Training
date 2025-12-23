package level01;
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("Alice", 30);
        System.out.println("Original Person:");
        originalPerson.display();

        Person clonedPerson = new Person(originalPerson);
        System.out.println("\nCloned Person:");
        clonedPerson.display();

        clonedPerson.setName("Bob");
        clonedPerson.setAge(25);

        System.out.println("\nAfter modifying the cloned person:");
        System.out.println("Original Person:");
        originalPerson.display();

        System.out.println("Cloned Person:");
        clonedPerson.display();
    }
}