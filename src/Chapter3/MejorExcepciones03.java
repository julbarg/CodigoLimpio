package Chapter3;

import java.util.logging.Logger;


public class MejorExcepciones03 {

   private static final String E_OK = null;

   private Logger logger = Logger.getLogger("MejorExcepciones");

   private Page page;

   private Registry registry;

   private ConfigKeys configKeys;

   // Codigo Incorrecto
   public void sinExceociones() {
      if (deletePage(page) == E_OK) {
         if (registry.deleteReference(page.name) == E_OK) {
            if (configKeys.deleteKey(page.name.makeKey()) == E_OK) {
               logger.log(null, "page deleted");
            } else {
               logger.log(null, "configKey not deleted");
            }

         } else {
            logger.log(null, "deleteReference from registry failed");
         }
      } else {
         logger.log(null, "delete failed");
      }
   }

   private String deletePage(Page page) {
      // TODO Auto-generated method stub
      return null;
   }

   // Codigo Limpio
   public void conExcepciones() {
      try {
         deletePage(page);
         registry.deleteReference(page.name);
         configKeys.deleteKey(page.name.makeKey());
      } catch (Exception e) {
         logger.log(null, e.getMessage());
      }
   }
}
