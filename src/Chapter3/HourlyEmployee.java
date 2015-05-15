package Chapter3;

public class HourlyEmployee extends Employeee {

   public HourlyEmployee(EmployeeRecord r) {
      // TODO Auto-generated constructor stub
   }

   @Override
   public boolean isPayday() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public Money calculatePay() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void deliverPay(Money pay) {
      // TODO Auto-generated method stub

   }

}
