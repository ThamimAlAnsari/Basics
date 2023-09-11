package interviewPrograms;

import java.util.Scanner;

public class Tic_Tac_Toe {
	
	
	private static void printBoard(char[][] board) {
		// TODO Auto-generated method stub
		System.out.println("-------------");
		System.out.println("| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |");
		System.out.println("-------------");
		System.out.println("| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |");
		System.out.println("-------------");
		System.out.println("| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" |");
		System.out.println("-------------");

	}

    private static void fill(char[][] board, int pos1, int pos2, char player, boolean winner) {
		// TODO Auto-generated method stub
		board[pos1-1][pos2-1]=player;
		printBoard(board);
		int row_count=0,col_count=0,diag1_count=0,diag2_count=0;
		check_Winner(board,pos1,pos2,winner,player,row_count,col_count,diag1_count,diag2_count);
	}
	private static void check_Winner(char[][] board, int pos1, int pos2, boolean winner,char player, int row_count, int col_count, 
			                                                                                     int diag1_count, int diag2_count) {
		// TODO Auto-generated method stub
		int space_count=0;
		for(int j=0;j<board[pos1-1].length;j++)
		{
			if(board[pos1-1][pos2-1]==board[pos1-1][j])
			{
				col_count++;
			}
		}
		for(int i=0;i<board.length;i++)
		{
			if(board[pos1-1][pos2-1]==board[i][pos2-1])
			{
			   row_count++;
			}
		}
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				if(i==j)
				{
					if(board[i][j]==board[pos1-1][pos2-1])
					{
						diag1_count++;
					}
				}
				if(i+j==board.length-1)
				{
					if(board[i][j]==board[pos1-1][pos2-1])
					{
						diag2_count++;
					}
				}
			}
		}
		if(row_count==board.length || col_count==board.length || diag1_count==board.length || diag2_count==board.length)
		  {
			System.out.println("The winner is : "+player);
			winner=true;
			System.exit(0);
		  }
		else {
		 for(int i=0;i<board.length;i++)
		 {
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j]!=' ')
				{
					space_count++;
				}
			}		
		 }
		 if(space_count==9)
		 {
			 System.out.println("It's a draw!");
				System.exit(0);
		 }
	  }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
      char Board[][]=new char[3][3];
      
      for(int i=0;i<Board.length;i++)
      {
    	for(int j=0;j<Board[i].length;j++)
    	{
         Board[i][j]=' ';
    	}
      }
      
      boolean x=false,o=true,winner=false;
      
      printBoard(Board);
      
      while(true)
      {
    	  if(o==true)
    	  {
    		  char player='O';
    		  System.out.print("Enter your positions:");
    		  int pos1=sc.nextInt();
    		  int pos2=sc.nextInt();
    		  fill(Board,pos1,pos2,player,winner);
    		  o=false;x=true;
    	  }
    	  else
    	  {
    		 char player='X';
    	     System.out.print("Enter your positions:");
		     int pos1=sc.nextInt();
		     int pos2=sc.nextInt();
		     fill(Board,pos1,pos2,player,winner);
		     x=false;o=true;
    	  }
      }
      
      
  }

	
	
}
