package interviewPrograms;

import java.util.Scanner;

public class SudokoGame {
	
	private static void printBoard(int[][]Sudoko)
	{
		for(int i=0;i<Sudoko.length;i++)
		{
		   for(int j=0;j<Sudoko[i].length;j++)
		   {
			System.out.print("["+Sudoko[i][j]+"]");
		   }
		   System.out.println();
		}
		System.out.println();
	}
	
	
	
	private static  boolean fillBoard(int[][] sudoko, int number, int rowpos, int colpos, boolean player) {
		// TODO Auto-generated method stub
		if(sudoko[rowpos][colpos]==0)
		{   
			player=checkLogic(sudoko,number,player,rowpos,colpos);
			return player;
		}
		else
			return false;
	}


	private static boolean checkLogic(int[][] sudoko, int number, boolean player, int rowpos, int colpos) {
		// TODO Auto-generated method stub
		int rowCount=0,colCount=0;
		for(int i=0;i<sudoko.length;i++)
		{
			  if(sudoko[i][colpos]!=number)
			  {
				rowCount++;  
			  }
		}
		if(rowCount==sudoko.length)
		{
			for(int j=0;j<sudoko.length;j++)
			{
				if(sudoko[rowpos][j]!=number)
				{
					colCount++;
				}
			}
			if(colCount==sudoko.length)
			{
				sudoko[rowpos][colpos]=number;
				printBoard(sudoko);
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("WELCOME TO SUDOKO!!");
	  System.out.println();
	  Scanner sc=new Scanner(System.in);
      int Sudoko[][]=new int[9][9];
      boolean player1=true,player2=false;int number =0,rowpos,colpos;
      printBoard(Sudoko);
      while(true)
      {
    	  if(player1==true)
    	  {
    		  System.out.println("Player 1: number row position col position: ");
    		  number=sc.nextInt();
		      rowpos=sc.nextInt();
		      colpos=sc.nextInt();
		     if(number>0&&number<=9 || rowpos>0&&rowpos<=9 || colpos>0&&colpos<=9)
		      {player1=fillBoard(Sudoko,number,rowpos-1,colpos-1,player1);
		      if(player1==false)
		      {
		    	 System.out.println("Player 2 wins and Player 1 lost");break;
		      }
		      else {
    		  player1=false;
		      player2=true; }
		      }
		     else
		     {
		    	 System.out.println("Enter numbers between 1 and 9 only");
	 		     continue;
		     }
    	  }
    	  if(player2==true)
    	  {
    		  System.out.println("Player 2: number row position col position: ");
    		  number=sc.nextInt();
    		  rowpos=sc.nextInt();
    		  colpos=sc.nextInt();
 		     if(number>0&&number<=9 || rowpos>0&&rowpos<=9 || colpos>0&&colpos<=9)
    		 {player2=fillBoard(Sudoko,number,rowpos-1,colpos-1,player2);
    		  if(player2==false){
 		    	 System.out.println("Player 1 wins and Player 2 lost"); 
 		    	 break;
    		 }
    		  else {
    		  player1=true;player2=false;}
    		 }
 		     else {
		    	 System.out.println("Enter numbers between 1 and 9 only");
 		    	 continue;}
    	  }
      }
	}
}
