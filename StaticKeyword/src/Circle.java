public class Circle {
   private static double pi = 3.141519;
   private double radius ;

   public Circle(double radius){
   this.radius = radius;
   }
  public double computeArea(){
       return radius*radius*pi;
  }


}
