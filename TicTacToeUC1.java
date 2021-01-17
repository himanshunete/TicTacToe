

class TicTacToeGame{
   public static char[] board = new char[10];
   static void createboard(){
      for (  int i=1; < 11;i++ ){
         board[i] = ' ';
         System.out.println( " Empty Space:" + board[i]);
      }   
   }
}

public class TicTacToeUC1{
   public static void main(String[] args){
      TicTacToe ticTacToeGame = new TicTacToe();
      ticTacToeGame.createboard();


  }
}



