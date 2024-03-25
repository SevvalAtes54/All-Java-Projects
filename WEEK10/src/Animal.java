
interface Moveable {
    void move();
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}
