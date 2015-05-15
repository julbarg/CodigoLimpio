package Chapter7_1;

public class LocalPort {

   private ACMEPort innerPort;

   public LocalPort(int portNumber) {
      innerPort = new ACMEPort(portNumber);
   }

   public void open() throws PortDeviceFailure {
      try {
         innerPort.open();
      } catch (DeviceResponseException e) {
         throw new PortDeviceFailure(e);
      } catch (ATM122UnlockedException e) {
         throw new PortDeviceFailure(e);
      } catch (GMXError e) {
         throw new PortDeviceFailure(e);
      } catch (Exception e) {

      }

   }
}
