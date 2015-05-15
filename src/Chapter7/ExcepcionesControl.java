package Chapter7;

public class ExcepcionesControl {

   private static final String DEV1 = "dev1";

   public void sendShutDown() {
      try {
         tryShutDown();
      } catch (DeviceShutDownError e) {
         e.printStackTrace();
      }
   }

   private void tryShutDown() throws DeviceShutDownError {
      DeviceHandle handle = getHandle(DEV1);
      retrieveDeviceRecord(handle);

      pauseDevice(handle);
      clearDeviceWorkQueue(handle);
      closeDevice(handle);

   }

   private DeviceHandle getHandle(String id) throws DeviceShutDownError {
      // ..............
      throw new DeviceShutDownError("Invalid handle for: " + id.toString());
   }

   private Record retrieveDeviceRecord(DeviceHandle handle) {
      // TODO Auto-generated method stub
      return null;
   }

   private void pauseDevice(DeviceHandle handle) {
      // TODO Auto-generated method stub

   }

   private void clearDeviceWorkQueue(DeviceHandle handle) {
      // TODO Auto-generated method stub

   }

   private void closeDevice(DeviceHandle handle) {
      // TODO Auto-generated method stub

   }

}
