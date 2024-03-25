public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(15);

        Circle[] circles = new Circle[3];
        circles[0] = c1;
        circles[1] = c2;
        circles[2] = c3;

        for (Circle circleeee:
            circles) {
            System.out.println("computed area : " + circleeee.computeArea() + circleeee );
        }

    }
}