package lab1;

public class testing {
    public static void main (String[] args){
        Dog d1 = new Dog ("Bobic", 2);
        Dog d2 = new Dog ("Molodezh");
        Dog d3 = new Dog(3);
        System.out.println(d3.getAge());
        System.out.println(d2.getName());
        System.out.println(d1);
        System.out.println("_______________");
        Circle c1 = new Circle(2.5, "green");
        Circle c2 = new Circle(3.1);
        Circle c3 = new Circle("red");
        System.out.println(c3.getColor());
        System.out.println(c2.getRadius());
        System.out.println(c1);
        System.out.println("_______________");
        Book b1 = new Book(2000, "War and peace");
        Book b2 = new Book(668);
        Book b3 = new Book("Harry Potter and the Goblet on fire");
        System.out.println(b3.getName());
        System.out.println(b2.getPages());
        System.out.println(b1);

    }
}
