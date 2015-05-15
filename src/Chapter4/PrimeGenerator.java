package Chapter4;

/**
 * Esta clase genra numeros primos hasta la cantidad maxima especificada por el
 * usuario. El algoritmo usado es la Criba de Erastostenes. Dada una matriz de enteros
 * empezandos por el 2: buscar el primer entero sin tachar y tahar todos sus 
 * multiplos. Repartir hasta que no haya mas multiplos en la  matriz
 * @author jbarragan
 *
 */
public class PrimeGenerator {

   private static boolean[] crossedOut;

   private static int[] result;

   public static int[] generatePrimes(int maxValue) {
      if (maxValue < 2)
         return new int[0];
      else {
         uncrossIntegersUpTo(maxValue);
         crossOutMultiples();
         putUncrossedIntegerIntoResult();
         return result;
      }
   }

   private static void uncrossIntegersUpTo(int maxValue) {
      crossedOut = new boolean[maxValue + 1];
      for (int i = 2; i < crossedOut.length; i++) {
         crossedOut[i] = false;
      }

   }

   private static void crossOutMultiples() {
      int limit = determineIterationLimit();
      for (int i = 2; i <= limit; i++)
         if (notCrossed(i))
            crossOutMultiples(i);
   }

   private static int determineIterationLimit() {
      // Todo multiplo de la matriz tiene un factor primo menor o igual que la raiz
      // cuadrada del tamaño de la matriz, por lo que no tachamos los multiplos de
      // numetos mayores de esa raiz
      double iterationLimit = Math.sqrt(crossedOut.length);
      return (int) iterationLimit;
   }

   private static void crossOutMultiples(int i) {
      for (int multiple = 2 * i; multiple < crossedOut.length; multiple += i)
         crossedOut[multiple] = true;
   }

   private static boolean notCrossed(int i) {
      return crossedOut[i] == false;
   }

   private static void putUncrossedIntegerIntoResult() {
      result = new int[numberOfUncrossedIntegers()];
      for (int j = 0, i = 2; i < crossedOut.length; i++)
         if (notCrossed(i))
            result[j++] = i;
   }

   private static int numberOfUncrossedIntegers() {
      int count = 0;
      for (int i = 2; i < crossedOut.length; i++)
         if (notCrossed(i))
            count++;
      return count;
   }

   public static void main(String[] args) {
      int[] primes = PrimeGenerator.generatePrimes(100);
      for (int prime : primes) {
         System.out.println(prime);
      }

   }

}
