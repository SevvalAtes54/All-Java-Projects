
class Cat extends Animal implements Swimmable, Moveable{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim() {
        // Cat's swim implementation
    }

    @Override
    public void move() {
        // Cat's move implementation
    }
}