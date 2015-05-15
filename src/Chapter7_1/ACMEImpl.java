package Chapter7_1;

public class ACMEImpl {
   
   public void open(){
      LocalPort port = new LocalPort(12);
      try{
         port.open();
      } catch (PortDeviceFailure e){
         reportError(e);
         
      }
   }

   private void reportError(PortDeviceFailure e) {
      // TODO Auto-generated method stub
      
   }

}
