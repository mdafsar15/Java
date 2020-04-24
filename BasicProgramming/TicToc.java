import java.util.Random;
import java.util.Scanner;
public class TicToc 
{
void dispMat(char mat[][])
{
	for(int i=0;i<mat.length;i++)
	{
		for (int j = 0; j < mat[i].length; j++) 
		{
			System.out.print(mat[i][j]+"|");
		}
		System.out.println();
		for (int j = 0; j < mat.length; j++)
		{
			System.out.print("__");
		}
		System.out.println();
	}
}

public void playCom(char[][] t)
{
	System.out.println("Computer Term Enter the Cell indexes");
	Random rd= new Random();
	int r=rd.nextInt(t.length);
	int c=rd.nextInt(t.length);
	System.out.println(r);
	System.out.println(c);
	if(t[r][c]==0)
		t[r][c]='X';
	else
	{
		System.out.println("Invalid input..");
		playCom(t);
	}
}
public boolean checkWinCom(char[][] t) 
{
	int pd=0,sd=0;
	for(int i=0;i<t.length;i++)
	{
		int r=0;
		int c=0;
		for(int j=0;j<t[i].length;j++)
		{
			if(t[i][j]=='X')
				r++;
			if(t[j][i]=='X')
				c++;
			if(i==j&&t[i][j]=='X')
				pd++;
			if(i+j==t.length-1&&t[i][j]=='X')
				sd++;
		}
		if(r==t.length||c==t.length)
			return true;
	}
	if(pd==t.length||sd==t.length)
			return true;
	return false;
}

public void playUser(char[][] t)
{
	System.out.println("User Term Enter the Cell indexes");
	Scanner sc= new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	if(t[r][c]==0)
		t[r][c]='O';
	else
	{
		System.out.println("Invalid input..");
		playUser(t);
	}
}

public boolean checkWinUser(char[][] t) 
{
	int pd=0,sd=0;
	for(int i=0;i<t.length;i++)
	{
		int r=0;
		int c=0;
		for(int j=0;j<t[i].length;j++)
		{
			if(t[i][j]=='O')
				r++;
			if(t[j][i]=='O')
				c++;
			if(i==j&&t[i][j]=='O')
				pd++;
			if(i+j==t.length-1&&t[i][j]=='O')
				sd++;
		}
		if(r==t.length||c==t.length)
			return true;
	}
	if(pd==t.length||sd==t.length)
			return true;
	return false;
}
}












import java.util.Scanner;

public class MainTictoc 
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	TicToc tc= new TicToc();
	System.out.println("Enter the order: ");
	int n=sc.nextInt();
	char t[][]=new char[n][n];
	tc.dispMat(t);
	int count=n*n;
	while(count>0)
	{
			tc.playCom(t);
			count--;
	tc.dispMat(t);
			boolean rs=tc.checkWinCom(t);
		if(rs)
		{
			System.out.println("Computer won the Game..");
			break;
		}
		if(count==0)
			break;
	System.out.println("<----End---->");
		tc.playUser(t);
	tc.dispMat(t);
				rs=tc.checkWinUser(t);
			if(rs)
			{
				System.out.println("User won the Game..");
				break;
			}
			count--;
	}		
	if(count==0)
	System.out.println("Draw...");
}
}

