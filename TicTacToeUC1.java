public class  TicTacToeUC1{
   static char[] board =  new char[11] ;

   public static void board(){
      for ( int i=1; i< 11; i++){
         System.out.println( board[i] );
      }

   }

   public static void main(String[] args){
      board();
   }
}




