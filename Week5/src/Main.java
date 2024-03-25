public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Main.method();
        Main main = new Main();
        main.method2();

    }
    static void method(){
        System.out.println("modot1 world!");
    }
     void method2(){
         System.out.println("modot2 world!");
    }
}