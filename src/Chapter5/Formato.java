package Chapter5;

import java.util.ArrayList;


/**
 * Formato vertical 200 - 500
 * Apertura vertical ente conceptos (package - imports - methods )
 * Densaidad vertical
 * Distancia vertical
 * Declaracion de variables : Deben declararse de la forma mas aproximada a su uso
 * Variables locales deben aparecer e la parte superior del metodo
 * Las variables de control de bucles deben declararse en la instruccion del bucle
 * Variables de instancia en la parte superior
 * Funciones dependientes
 *    Si una funcion invoca otra, deben estar verticalmente proximas,
 *    y la funcion de invocacion debe estar por encima de la invocada siempre que sea posible
 * Afinidad conceptual
 *    Proximas por defincion de concepto
 * Orden vertical por importancia
 * Apertura y densidad
 *    i = 0;
 *    notFound(context, request);
 *    -b + Nath.sqrt(determin) / (2 * a);
 * Romper el sangrado siempre
 * @author jbarragan
 *
 */
public class Formato {

   private static final String CORRECT = "correct";

   private String page;

   private String wikiPage;

   private ArrayList<String> primes;

   public void getPrimes() {
      for (String prime : primes) {
         System.out.println(prime);
      }
   }

   public ArrayList<String> getCorrectNumber() {
      ArrayList<String> correctNumbers = new ArrayList<String>();
      for (String prime : primes) {
         if (validatePrime(prime))
            correctNumbers.add(prime);
      }
      return correctNumbers;
   }

   private boolean validatePrime(String prime) {
      return CORRECT.equals(prime);
   }

   public String makeRespones(String context, String request) throws Exception {
      loadPage(context);
      if (page == null)
         return notFoundRespones(context, request);
      else
         return makePageResponse(context);

   }

   private void loadPage(String context) {
      wikiPage = context;
      System.out.println(wikiPage);
   }

   private String notFoundRespones(String context, String request) {
      // TODO Auto-generated method stub
      return null;
   }

   private String makePageResponse(String context) {
      // TODO Auto-generated method stub
      return null;
   }

   public double aperturaDensidad() {
      int a = 25;
      int b = 456;
      double delimit = 2.3432;
      String context = "context";
      String request = "reques";
      notFoundRespones(context, request);

      double result = -b + Math.sqrt(delimit) / (2 * a);

      return result;

   }
}
