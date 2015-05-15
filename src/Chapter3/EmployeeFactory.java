package Chapter3;

public interface EmployeeFactory {
   public Employeee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;

}
