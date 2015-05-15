package Chapter4;

/**
 * Esta case genera numeros primos hasta la cantidad maxima especificada por el
 * usuario. El algoritmo usado es la Criba de Eratostemes.
 * <p>
 * Eratostenes de Cirene, 276 a.C., Ciree, Libia --
 * 194 a.C., Alejandria. El primer hombre en calcular la circuferencia de la Tierra. Tambien trabajo con calendatios
 * con años bisiestos y fue responsable de la Biblioteca de Alejandria
 * <p>
 * El algoritmo es muy simple. Dada una mtriz de enteros
 * empezando por el 2, se tachn todos los multiplos de 2. Se busca el siguiente
 * entero sin tachar t se tachan todos sus multiplos.
 * Repetir hasta superar la raiz cuadrada del valor maximo 
 * @author jbarragan
 * @version 12 May 2015
 *
 */
public class GeneratePrimes {

   /**
    * @param maxValue es el limite de generacion
    */
   public static int[] generatePrimes(int maxValue) {
      if (maxValue >= 2) {// el unico caso valido
         // declaraciones
         int s = maxValue + 1; // tamanio de la matriz
         boolean[] f = new boolean[s];
         int i;

         // inicializar la matriz en true
         for (i = 0; i < s; i++)
            f[i] = true;

         f[0] = f[1] = false;

         // cribar
         int j;
         for (i = 2; i < Math.sqrt(s) + 1; i++) {
            if (f[i]) {// si no esta tachado, tachar sus multiplos
               for (j = 2 * i; j < s; j += i) {
                  f[j] = false; // el multiplo no es primo
               }
            }
         }
         // ¿cuantos primos hay?
         int count = 0;
         for (i = 0; i < s; i++) {
            if (f[i])
               count++; // contador
         }

         int[] primes = new int[count];

         // enviar primos al resultado
         for (i = 0, j = 0; i < s; i++) {
            if (f[i])
               primes[j++] = i;

         }

         return primes; // devolver los primos

      } else {
         return new int[0]; // devolver matriz null si la entrada no es correcta
      }
   }

   public static void main(String[] args) {
      int[] primes = GeneratePrimes.generatePrimes(100);
      for (int prime : primes) {
         System.out.println(prime);
      }
   }
}
