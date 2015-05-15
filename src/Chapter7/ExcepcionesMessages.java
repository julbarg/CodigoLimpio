package Chapter7;

public class ExcepcionesMessages {

   private static final String DEV1 = "dev1";

   private static final String DEVICE_SUSPENDED = "";

   private Record record;

   public void sendShutDown() {
      DeviceHandle handle = getHandle(DEV1);
      // Comprobar el estado del dispositivo
      if (handle != DeviceHandle.INVALID) {
         // Guarda el estado del dispositivo en el campo de registro
         retireveDeviceRecord(handle);
         // Si no esta suspendido, cerrarlo
         if (record.getStatus() != DEVICE_SUSPENDED) {
            pauseDevice(handle);
            clearDeviceWorkQueue(handle);
            closeDevice(handle);
         } else {
            System.out.println("Device suspendend. Unable to shut down");
         }

      } else {
         System.out.println("Invalid hablde for: " + DEV1.toString());
      }
   }

   private DeviceHandle getHandle(String dev12) {
      // TODO Auto-generated method stub
      return null;
   }

   private void retireveDeviceRecord(DeviceHandle handle) {
      // TODO Auto-generated method stub

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
