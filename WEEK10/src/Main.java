public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("vakvak");
        Eagle eagle = new Eagle("kuşcuk");

        duck.move();
        duck.fly();
        

        eagle.move();
        eagle.fly();
    }
}