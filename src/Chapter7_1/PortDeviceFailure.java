package Chapter7_1;

public class PortDeviceFailure extends Exception {

 

   public PortDeviceFailure(DeviceResponseException e) {
      // TODO Auto-generated constructor stub
   }

   public PortDeviceFailure(ATM122UnlockedException e) {
      // TODO Auto-generated constructor stub
   }

   public PortDeviceFailure(GMXError e) {
      // TODO Auto-generated constructor stub
   }

   /**
    * 
    */
   private static final long serialVersionUID = -228021836937807673L;

}
