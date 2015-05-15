package Chapter6;

public class PointImpl implements Point {

   private double x;

   private double y;

   private Cartesian cartesian;

   @Override
   public double getX() {
      return x;
   }

   @Override
   public double getY() {
      return y;
   }

   @Override
   public void setCartesian(double x, double y) {
      this.cartesian = new Cartesian(x, y);

   }

   @Override
   public double getR() {
      return 0;
   }

   public Cartesian getCartesian() {
      return cartesian;
   }

}
