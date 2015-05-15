package Chapter6;

import java.util.ArrayList;


/**
 * Ley de Demeter
 * Un metodo solo debe hablar:
 *    01 Con metodos de la misma clase
 *    02 Con metodos de sus atributos
 *    03 Con metodos de sus parametros
 *    04 Con metodos de objeto que el instancia
 * @author jbarragan
 *
 */
public class LeyDemeter {

   private ArrayList<String> atributoUno;

   // Un metodo solo debe hablar:
   public double metodoUno(StringBuffer atributoDos) {
      // 01 Con metodos de la misma clase
      double valor = procesarAlgo();

      // 02 Con metodos de sus atributos
      atributoUno.add(atributoDos.toString());
      // 03 Con metodos de sus parametros
      atributoDos.append(true);

      ClaseUno claseUno = new ClaseUno();
      // 04 Con metodos de objeto que el instancia
      claseUno.metodoHacerAlgo();

      return valor;

   }

   private double procesarAlgo() {
      return 2.0;
   }

}
