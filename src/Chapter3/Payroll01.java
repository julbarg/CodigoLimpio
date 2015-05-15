package Chapter3;

public class Payroll01 {

   private static final int COMMISSIONED = 0;

   private static final int HOURLY = 1;

   private static final int SALARIED = 2;

   public Money calculatePay(Employee e) throws InvalidEmployeeType {
      switch (e.type) {
         case COMMISSIONED:
            return calculateCommissionedPay(e);
         case HOURLY:
            return calculateHourlyPay(e);
         case SALARIED:
            return calculateSalariedPay(e);
         default:
            throw new InvalidEmployeeType(e.type);
      }
   }

   private Money calculateSalariedPay(Employee e) {
      // TODO Auto-generated method stub
      return null;
   }

   private Money calculateHourlyPay(Employee e) {
      // TODO Auto-generated method stub
      return null;
   }

   private Money calculateCommissionedPay(Employee e) {
      // TODO Auto-generated method stub
      return null;
   }

}
