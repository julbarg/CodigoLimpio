package Chapter7_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import Chapter6.Point;


public class ControlNull {
   private boolean exitsEmployee;

   // No devolver NULL
   public Collection<String> getEmployees() {
      ArrayList<String> employees = new ArrayList<String>();
      if (!exitsEmployee) {
         return Collections.emptyList();
      }
      return employees;
   }

   // No pasar NULL
   public double xProjection(Point p1, Point p2) throws InvalidArgumentException {
      if (p1 == null || p2 == null) {
         throw new InvalidArgumentException("Invalid argument for ControlNull.xProjection");
      }
      return (p2.getX() - p1.getX()) * 1.5;
   }

}
