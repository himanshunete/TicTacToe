import java.util.Scanner;
class TicTacToe{
   public static String PLAYER_1 ;
   public static char[] board =  new char[11] ; 
   public static final int LETTER_X = 0;
   public static final int LETTER_O = 1;

   static void createboard(){
      for ( int i=1; i< 11; i++){
         System.out.println( " empty space: " + board[i] );
   }
   }
   static void chooseletter(){
      Scanner choose=new Scanner(System.in);
      int letterComputer = (int)Math.floor(Math.random() * 10) % 2; 
      System.out.println( " Choose a Letter" );
      int letterPlayer = choose.nextInt();
      
      switch ( letterPlayer ){
         case LETTER_X :
            System.out.println( " Player choose X Option " );
            break;
         case LETTER_O :
            System.out.println( "  Player choose O Option  " );
            break;
      }
      
      switch ( letterComputer ){
         case LETTER_X :
            System.out.println( " Computer choose X Option " );
            break;
         case LETTER_O :
            System.out.println( " Computer choose O Option  " );
            break;
      } 
   }
   


}   
public class TicTacToeUC2{
   public static void main(String[] args){
      TicTacToe ticTacToeGame = new TicTacToe();
      ticTacToeGame.createboard();
      ticTacToeGame.chooseletter();

   }
}
