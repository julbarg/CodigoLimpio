package Chapter2;

public class GuessStatisticsMessage {
   private String number;

   private String verb;

   private String pluralModifier;

   public String make(char candidate, int count) {
      createPluralDependentessageParts(count);
      return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
   }

   private void createPluralDependentessageParts(int count) {
      if (count == 0) {
         thereAreNoLetters();
      } else if (count == 1) {
         thereIsOneLetter();
      } else {
         thereAreManyLetters(count);
      }

   }

   private void thereAreManyLetters(int count) {
      number = Integer.toString(count);
      verb = "are";
      pluralModifier = "s";
   }

   private void thereIsOneLetter() {
      number = "1";
      verb = "is";
      pluralModifier = "";
   }

   private void thereAreNoLetters() {
      number = "no";
      verb = "are";
      pluralModifier = "s";

   }
   
   public static void main(String[] args) {
      GuessStatisticsMessage guessStatistics = new GuessStatisticsMessage();
      System.out.println(guessStatistics.make('A', 0));
      System.out.println(guessStatistics.make('B', 1));
      System.out.println(guessStatistics.make('C', 2));
      
   }

}
