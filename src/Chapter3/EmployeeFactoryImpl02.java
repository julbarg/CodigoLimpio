package Chapter3;

/**
 * La solucion al problema consiste en ocultar la instruccion switch 
 * en una factoria abstracta e impedir que nadie la vea.
 * La factoria usa la instruccion shwitch para crear las instancias adecuadas
 * de los derivados de Employeee y las distintas funciones.. se entregan de forma
 * poliformica a traves de la interfaz Employeee
 * @author jbarragan
 *
 */
public class EmployeeFactoryImpl02 implements EmployeeFactory {

   private static final int COMMISSIONED = 0;

   private static final int HOURLY = 1;

   private static final int SALARIED = 2;

   @Override
   public Employeee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
      switch (r.type) {
         case COMMISSIONED:
            return new CommissionedEmployee(r);
         case HOURLY:
            return new HourlyEmployee(r);
         case SALARIED:
            return new SalariedEmployee(r);
         default:
            throw new InvalidEmployeeType(r.type);
      }
   }

   public static void main(String[] args) {
      EmployeeFactory employeeFactory = new EmployeeFactoryImpl02();
      try {
         employeeFactory.makeEmployee(new EmployeeRecord(0));
      } catch (InvalidEmployeeType e) {
         e.printStackTrace();
      }
   }

}
