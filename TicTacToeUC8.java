import java.util.Scanner;
class TicTacToe{
   public static String PLAYER_1 ;
   public static char[] board =  new char[11] ;
   public static final int LETTER_X = 0;
   public static final int LETTER_O = 1;
   public static final int PLAYER = 0;
   public static final int COMPUTER = 1;
   
   public static final int index1 = 1;
   public static final int index2 = 2;
   public static final int index3 = 3;
   public static final int index4 = 4;
   public static final int index5 = 5;
   public static final int index6 = 6;
   public static final int index7 = 7;
   public static final int index8 = 8;
   public static final int index9 = 9;


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
      switch (location) {
         case index1 :
            if ( board[1] == freeSpace ){
                  board[1] =  letter;
            }
            break;
         
         case index2:
            if ( board[2] == freeSpace ){
                  board[2] =  letter;
            }
            break;
         case index3:
            if ( board[3] == freeSpace ){  
                  board[3] =  letter;
            }
            break;
         case index4:
            if ( board[4] == freeSpace ){
                  board[4] =  letter;
            }
            break;
         case index5:
            if ( board[5] == freeSpace ){
                  board[5] =  letter;
            }
            break;
         case index6:
            if ( board[6] == freeSpace ){ 
                  board[6] =  letter;
            }
            break;
         case index7:
            if ( board[7] == freeSpace ){
                  board[7] =  letter;
            }
            break;
         case index8:
            if ( board[8] == freeSpace ){   
                  board[8] =  letter;
            }
            break;
         case index9:
            if ( board[9] == freeSpace ){
                  board[9] =  letter;
            }
            break;
      }
   }


    static void computersmove(){
       char freeSpace = ' ' ;
       Scanner choose =new Scanner(System.in);      
       int letter = (int)Math.floor(Math.random() * 10) % 2;
       int location = (int)Math.floor(Math.random() * 10) % 9 + 1;      
       switch (location) {
          case index1 :
             if ( board[1] == freeSpace ){
                   board[1] =  'O' ;
             }
             break;
         
          case index2:
             if ( board[2] == freeSpace ){
                   board[2] =  'O';
              
             }
             break;
          case index3:
             if ( board[3] == freeSpace ){  
                   board[3] =  'O';
             }
             break;
          case index4:
             if ( board[4] == freeSpace ){
                   board[4] =  'O';
             }
             break;
          case index5:
             if ( board[5] == freeSpace ){
                   board[5] =  'O';
                
             }
             break;
          case index6:
             if ( board[6] == freeSpace ){ 
                   board[6] =  'O';
                
             }
             break;
          case index7:
             if ( board[7] == freeSpace ){
                   board[7] =  'O';
                
             }
             break;
          case index8:
             if ( board[8] == freeSpace ){   
                   board[8] =  'O';
                
             }
             break;
          case index9:
             if ( board[9] == freeSpace ){
                   board[9] =  'O';
                
             }
             break;
       }

    } 

    static void turn(){
       int i;
       int j;
       int a = 0;
       int b = 1;
       toss();
       while ( i ){
          if ( toss == 0 ){
             for ( j=0;j<2;j++ ){
                switch ( j ){ 
                   case a: 
                      makeamove();
                      showboard();
                      determineresult();
                      break;
                   case b :
                      computersmove();
                      showboard();
                      determineresult();
                      break;
                }
             }
          }
          else if ( toss == 1 ){
             for ( j=0;j<2;j++ ){
                switch ( j ){
                   case a:
                      computersmove();
                      showboard();
                      determineresult();
                      break;
                   case b :
                      makeamove();
                      showboard();
                      determineresult();
                      break;
                }
             }
          }

      
          
          i++ ;
       } 
    }
    static void determineresult(){

       if ( board[1] == board[2] && board[2] == board[3] ){
          System.out.println( " Winner " );
          System.exit(0);
       }
       else if ( board[4] == board[5] && board[5] == board[6] ){
          System.out.println( " Winner " );
          System.exit(0);

       }

       else if ( board[7] == board[8] && board[8] == board[9] ){
          System.out.println( " Winner " );
          System.exit(0);

       }

       else if ( board[1] == board[4] && board[4] == board[7] ){
          System.out.println( " Winner " );
          System.exit(0);

       }

       else  if ( board[2] == board[5] && board[5] == board[8] ){
          System.out.println( " Winner " );
          System.exit(0);

       }

       else if ( board[3] == board[6] && board[6] == board[9] ){
          System.out.println( " Winner " );
          System.exit(0);

       }

       else if ( board[1] == board[5] && board[5] == board[9] ){
          System.out.println( " Winner " );
          System.exit(0);
 
      }

       else if ( board[3] == board[5] && board[5] == board[7] ){
          System.out.println( " Winner " );
          System.exit(0);

       }

}
public class TicTacToeUC8{
   public static void main(String[] args){
      TicTacToe ticTacToeGame = new TicTacToe();
      ticTacToeGame.turn();



  }
}

