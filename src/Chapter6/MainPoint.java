package Chapter6;

public class MainPoint {

   private static final String CARTESIAN_TYPE = "cartesian";

   public static void main(String[] args) {
      String type = CARTESIAN_TYPE;
      Point point = null;
      switch (type) {
         case CARTESIAN_TYPE:
            point = new PointImpl();
            break;

         default:
            break;
      }
      System.out.println(point.getX());
   }
}
