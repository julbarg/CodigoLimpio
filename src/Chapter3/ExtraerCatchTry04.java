package Chapter3;

import java.util.logging.Logger;


public class ExtraerCatchTry04 {

   private Logger logger = Logger.getLogger("MejorExcepciones");

   private Registry registry;

   private ConfigKeys configKeys;

   public void delete(Page page) {
      try {
         deletePageAndAllReferences(page);
      } catch (Exception e) {
         logError(e);
      }
   }

   private void deletePageAndAllReferences(Page page) {
      deletePageAndAllReferences(page);
      registry.deleteReference(page.name);
      configKeys.deleteKey(page.name.makeKey());
   }

   private void logError(Exception e) {
      logger.log(null, e.getMessage());
   }

}
