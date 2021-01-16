import java.util.Scanner;
class TicTacToe{
   public static String PLAYER_1 ;
   public static char[] board =  new char[11] ;
   public static final int LETTER_X = 0;
   public static final int LETTER_O = 1;
   public static final int PLAYER = 0;
   public static final int COMPUTER = 1;


   static void createboard(){
      for ( int i=1; i< 11; i++){
         board[i] = ' ';
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

   static void showboard(){
      System.out.println(" |---|---|---| ");
      System.out.println( " |" +board[1]+ "   | "+ board[2]+ "  | " + board[3]+ "  | ");
      System.out.println(" |---|---|---| ");
      System.out.println( " |" +board[4]+ "   | "+ board[5]+ "  | " + board[6]+ "  | ");
      System.out.println(" |---|---|---| ");
      System.out.println( " |" +board[7]+ "   | "+ board[8]+ "  | " + board[9]+ "  | ");
      System.out.println(" |---|---|---| ");
   }
   static void toss(){
      int toss = (int)Math.floor(Math.random() * 10) % 2;
      if ( PLAYER == toss ){
         System.out.println(" Player starts a Game ");
      }
      else if ( COMPUTER == toss ){
         System.out.println(" Computer starts a Game ");
      }

   }

   static void makeamove(){
      createboard();
      char freeSpace = ' ' ;
      Scanner choose =new Scanner(System.in);      
      char letter = choose.next().charAt(0);
      int location = choose.nextInt(); 
      final int index1 = 1;
      final int index2 = 2;
      final int index3 = 3;
      final int index4 = 4;
      final int index5 = 5;
      final int index6 = 6;
      final int index7 = 7;
      final int index8 = 8;
      final int index9 = 9;
      
      switch (location) {
         case index1 :
            if ( board[1] == freeSpace ){
               if ( letter == 'X' ){
                  board[1] =  letter;
               }
               else if ( letter == 'O' ){
                  board[1] =  letter;
               }
            }
            break;
         
         case index2:
            if ( board[2] == freeSpace ){
               if ( letter == 'X' ){
                  board[2] =  letter;
               }
               else if ( letter == 'O' ){
                  board[2] =  letter;
               }
            }
            break;
         case index3:
            if ( board[3] == freeSpace ){  
               if ( letter == 'X' ){
                  board[3] =  letter;
               }
               else if ( letter == 'O' ){
                  board[3] =  letter;
               }
            }
            break;
         case index4:
            if ( board[4] == freeSpace ){
               if ( letter == 'X' ){
                  board[4] =  letter;
               }
               else if ( letter == 'O' ){
                  board[4] =  letter;
               }
            }
            break;
         case index5:
            if ( board[5] == freeSpace ){
               if ( letter == 'X' ){
                  board[5] =  letter;
               }
               else if ( letter == 'O' ){
                  board[5] =  letter;
               }
            }
            break;
         case index6:
            if ( board[6] == freeSpace ){ 
               if ( letter == 'X' ){
                  board[6] =  letter;
               }
               else if ( letter == 'O' ){
                  board[6] =  letter;
               }
            }
            break;
         case index7:
            if ( board[7] == freeSpace ){
               if ( letter == 'X' ){
                  board[7] =  letter;
               }
               else if ( letter == 'O' ){
                  board[7] =  letter;
               }
            }
            break;
         case index8:
            if ( board[8] == freeSpace ){   
               if ( letter == 'X' ){
                  board[8] =  letter;
               }
               else if ( letter == 'O' ){
                  board[8] =  letter;
               }
            }
            break;
         case index9:
            if ( board[9] == freeSpace ){
               if ( letter == 'X' ){
                  board[9] =  letter;
               }
               else if ( letter == 'O' ){
                  board[9] =  letter;
               }
            }
            break;
      }
   }



}
public class TicTacToeUC6{
   public static void main(String[] args){
      TicTacToe ticTacToeGame = new TicTacToe();
      ticTacToeGame.chooseletter();
      ticTacToeGame.showboard();
      ticTacToeGame.makeamove();
      ticTacToeGame.toss();


  }
}


