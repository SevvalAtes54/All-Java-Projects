
class Duck extends Animal implements Flyable, Moveable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        // Duck's fly implementation
    }

    @Override
    public void move() {
        // Duck's move implementation
    }
}
