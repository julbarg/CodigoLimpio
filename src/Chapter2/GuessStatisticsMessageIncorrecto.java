package Chapter2;

public class GuessStatisticsMessageIncorrecto {
   public void printGuessStatstics(char candidate, int count) {
      String number;
      String verb;
      String pluralMofier = "";
      if (count == 0) {
         number = "no";
         verb = "are";
      } else if (count == 1) {
         number = "1";
         verb = "is";
         pluralMofier = "";
      } else {
         number = Integer.toString(count);
         verb = "are";
         pluralMofier = "s";
      }
      String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralMofier);
      System.out.println(guessMessage);

   }
   
   public static void main(String[] args) {
      GuessStatisticsMessageIncorrecto contexto = new GuessStatisticsMessageIncorrecto();
      contexto.printGuessStatstics('J', 3);
   }
}
