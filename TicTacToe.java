

import java.util.Scanner;
class GameStructure{
   public static String PLAYER_1 ; 
   public static char[] board = { ' ',' ',' ',' ',' ',' ',' ',' ',' ',' ' };
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
 
   public static final int HEAD = 0 ;
   public static final int TAIL = 1 ;
   public static final int toss = (int)Math.floor(Math.random() * 10) % 2;

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
      System.out.println("|"+board[1]+"       |"+board[2]+"       |"+board[3]+"       |");
      System.out.println("|"+board[4]+"       |"+board[5]+"       |"+board[6]+"       |");
      System.out.println("|"+board[7]+"       |"+board[8]+"       |"+board[9]+"       |");
   }
   static void toss(){
      if ( PLAYER == toss ){
         System.out.println(" Player starts a Game ");
      }
      else if ( COMPUTER == toss ){
         System.out.println(" Computer starts a Game ");
      }

   }
   static void makeamove(){
      char freeSpace = ' ' ;
      Scanner choose =new Scanner(System.in);      
      int location = choose.nextInt();       
      switch (location) {
         case index1 :
            if ( board[1] == freeSpace ){
                  board[1] =  'X';
            }
            break;
         
         case index2:
            if ( board[2] == freeSpace ){
                  board[2] =  'X';
            }
            break;
         case index3:
            if ( board[3] == freeSpace ){  
                  board[3] =  'X';
            }
            break;
         case index4:
            if ( board[4] == freeSpace ){
                  board[4] =  'X';
            }
            break;
         case index5:
            if ( board[5] == freeSpace ){
                  board[5] =  'X';
            }
            break;
         case index6:
            if ( board[6] == freeSpace ){ 
                  board[6] =  'X';
            }
            break;
         case index7:
            if ( board[7] == freeSpace ){
                  board[7] =  'X';
            }
            break;
         case index8:
            if ( board[8] == freeSpace ){   
                  board[8] =  'X';
            }
            break;
         case index9:
            if ( board[9] == freeSpace ){
                  board[9] =  'X';
            }
            break;
      }
   }


    static void computersmove(){
       char freeSpace = ' ' ;
       Scanner choose =new Scanner(System.in);      
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
       int i=0;;
       int j;
       int n = 7;
       final int a = 0;
       final int b = 1;
       toss();
       if ( toss == HEAD ){
          while ( i<n ){
             for ( j=0;j<2;j++ ){
                switch ( j ){ 
                   case a : 
                      System.out.println( "Players turn" );                         
                      if ( board[1] == ' ' || board[2] == ' '  || board[3] == ' '  || board[4] == ' '  || board[5] == ' '  || board[6] == ' '  || board[7] == ' '  || board[8] == ' '  || board[9] == ' '){
                         makeamove();
                
                      }
                      resultplayer();
                      break;
                   case b :
                      System.out.println( "Computer turn ");
                      if ( board[1] == ' ' || board[2] == ' '  || board[3] == ' '  || board[4] == ' '  || board[5] == ' '  || board[6] == ' '  || board[7] == ' '  || board[8] == ' '  || board[9] == ' '){
                         computersmove();
   
                      }
                      resultcomputer();
                      break;
                }
                showboard();
          i++; 
          }
       }
       else if ( toss == TAIL){
          while ( i<n ){
             for ( j=0;j<2;j++ ){
                switch ( j ){
                   case a:
                      System.out.println( "Computers move" );
                      if ( board[1] == ' ' || board[2] == ' '  || board[3] == ' '  || board[4] == ' '  || board[5] == ' '  || board[6] == ' '  || board[7] == ' '  || board[8] == ' '  || board[9] == ' '){
                         computersmove();
                      }
                      resultcomputer();
                      break;
                   case b :
                      System.out.println( "Players move ");
                      if ( board[1] == ' ' || board[2] == ' '  || board[3] == ' '  || board[4] == ' '  || board[5] == ' '  || board[6] == ' '  || board[7] == ' '  || board[8] == ' '  || board[9] == ' '){
                         makeamove();
                      }
                      resultplayer();
                      break;
                }
                showboard(); 
             }
             i++;   
          }
       }
       tie();
      
      
    }

    static void resultplayer(){
       if ( board[1] == 'X' && board[2] == 'X' && board[3] == 'X'){
           System.out.println( " Player is Winner " );

       }

       else if ( board[4] == 'X' && board[5] == 'X' && board[6] == 'X'){
          System.out.println( " Player is Winner " );
           

       }
       else if ( board[7] == 'X' && board[8] == 'X' && board[9] == 'X' ){
          System.out.println( " Player is Winner " );
          


       }

       else if ( board[1] == 'X' && board[4] == 'X' && board[7] == 'X' ){
          System.out.println( " Player is Winner " );
       


       }

       else if ( board[2] == 'X' && board[5] == 'X' && board[8] == 'X' ){
          System.out.println( " Player is Winner " );
       


       }

       else  if ( board[3] == 'X' && board[6] == 'X' && board[9] == 'X' ){
          System.out.println( " Player is Winner " );
      


       }

       else if ( board[3] == 'X' && board[5] == 'X' && board[7] == 'X' ){
          System.out.println( " Player is Winner " );
     


       }

       else if ( board[1] == 'X' && board[5] == 'X' && board[9] == 'X' ){
          System.out.println( " Player is Winner " );
        

 
       }
    }

    static void resultcomputer(){
       if ( board[1] == 'O' && board[2] == 'O' && board[3] == 'O'){
          System.out.println( " Computer is Winner " );
       
       }

       else if ( board[4] == 'O' && board[5] == 'O' && board[6] == 'O'){
          System.out.println( " Computer is Winner " );
      
       }
       else if ( board[7] == 'O' && board[8] == 'O' && board[9] == 'O' ){
          System.out.println( " Computer is  Winner " );
  

       }

       else if ( board[1] == 'O' && board[4] == 'O' && board[7] == 'O' ){
          System.out.println( " Computer is Winner " );
      

       }

       else if ( board[2] == 'O' && board[5] == 'O' && board[8] == 'O' ){
          System.out.println( " Computer is Winner " );
       

       }

       else  if ( board[3] == 'O' && board[6] == 'O' && board[9] == 'O' ){
          System.out.println( " Computer is Winner " );
      

       }

       else if ( board[3] == 'O' && board[5] == 'O' && board[7] == 'O' ){
          System.out.println( " Computer is Winner " );
        

       }

       else if ( board[1] == 'O' && board[5] == 'O' && board[9] == 'O' ){
          System.out.println( " Computer is Winner " );
        

       } 
    }

    static void tie(){
       if ( ( board[1] == 'X' || board[1] == 'O' ) && ( board[2] == 'X' || board[2] == 'O' ) && ( board[3] == 'X' || board[3] == 'O' ) && ( board[4] == 'X' || board[4] == 'O' ) && ( board[5] == 'X' || board[5] == 'O' ) && ( board[6] == 'X' || board[6] == 'O' ) && ( board[7] == 'X' || board[7] == 'O' ) && ( board[8] == 'X' || board[8] == 'O' ) && ( board[9] == 'X' || board[9] == 'O' )){
            System.out.println( " Match is Tied " );
            System.out.println( " Game is Over " );
    
        }

       
    }
}

public class TicTacToe{
   public static void main(String[] args){
      Scanner play = new Scanner(System.in);
      TicTacToe ticTacToeGame = new TicTacToe();
      ticTacToeGame.turn();
      String option = play.nextLine();
      if ( option == " yes"){    
         System.out.println(" Play Again ") ;
         ticTacToeGame.turn();
      }


  }
}



