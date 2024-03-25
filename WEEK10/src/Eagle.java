
class Eagle extends Animal implements Flyable, Moveable {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        // Eagle's fly implementation
    }

    @Override
    public void move() {
        // Eagle's move implementation
    }
}
