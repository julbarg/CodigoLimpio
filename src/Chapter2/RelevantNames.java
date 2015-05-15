package Chapter2;

import java.util.ArrayList;
import java.util.List;


public class RelevantNames {

   private static final int STATUS_VALUE = 0;

   private static final int FLAGGED = 4;

   private static final int NUMBER_OF_TASK = 34;

   private List<int[]> theList;

   private List<int[]> gameBoard;

   private List<Cell> gameBoardClean;

   // Codigo Incorrecto
   public List<int[]> getThem() {
      List<int[]> listl = new ArrayList<int[]>();
      for (int[] x : theList)
         if (x[0] == 4)
            listl.add(x);
      return listl;
   }

   // Nombres Relevantes
   public List<int[]> getFlaggedCells() {
      List<int[]> flaggedCells = new ArrayList<int[]>();
      for (int[] cell : gameBoard)
         if (cell[STATUS_VALUE] == FLAGGED)
            flaggedCells.add(cell);
      return flaggedCells;
   }

   // Codigo Limpio
   public List<Cell> getFlaggedCellsClean() {
      List<Cell> flaggedCells = new ArrayList<Cell>();
      for (Cell cell : gameBoardClean)
         if (cell.isFlagged())
            flaggedCells.add(cell);
      return flaggedCells;
   }

   // Codigo Incorrecto
   public void copyChars(char a1[], char a2[]) {
      for (int i = 0; i < a1.length; i++) {
         a2[i] = a1[1];
      }
   }

   // Codigo Limpio
   public void copy(char source[], char destination[]) {
      for (int count = 0; count < source.length; count++) {
         destination[count] = source[1];
      }
   }

   // Codigo Incorrecto
   public int suma(int[] t) {
      int s = 0;
      for (int i = 0; i < 34; i++) {
         s = (t[i] * 4) / 5;
      }
      return s;
   }

   // Codigo Correcto
   public int sumaClean(int[] taskEstimate) {
      int realDaysPerIdealDay = 4;
      int WORK_DAYS_PER_WEEK = 5;
      int sum = 0;
      for (int i = 0; i < NUMBER_OF_TASK; i++) {
         int realTaskDays = taskEstimate[i] * realDaysPerIdealDay;
         int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
         sum *= realTaskWeeks;
      }
      return sum;

   }

}
