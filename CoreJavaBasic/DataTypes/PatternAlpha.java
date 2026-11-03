package Com.globalQuest.CoreJavaBasic.DataTypes;

import java.util.Scanner;

public class PatternAlpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Size");
		int n = sc.nextInt();
		 
		for(int i = 0; i <= n-1; i++)
		{
		//A//	
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 && j!=0 && j!=(n-1) || i==(n/2) || (j==0 && i!=0) || (j==(n-1) && i!=0)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
		//B//
			for(int j=0; j<=n-1; j++)
			{
				if(j == 0 || (i == 0 && j != n - 1) || (i == (n/2) && j != n - 1) || (i == n - 1 && j != n - 1) || (j == n - 1 && i != 0 && i != (n/2) && i != n - 1)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
		//C//	
			for(int j=0; j<=n-1; j++)
			{
				if((i == 0 && j != 0) || (j == 0 && i != 0 && i != n - 1) || (i == n - 1 && j != 0)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
		//D//
			for(int j=0; j<=n-1; j++)
			{
				if(j == 0 || (i == 0 && j != n - 1) || (i == n - 1 && j != n - 1) || (j == n - 1 && i != 0 && i != n - 1)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
		//E//
			for(int j=0; j<=n-1; j++)
			{
				if(j == 0 || i == 0 || i == (n/2) || i == n - 1){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//F//
			for(int j=0; j<=n-1; j++)
			{
				if(j == 0 || i == 0 || i ==(n/2)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//G//
			for(int j=0; j<=n-1; j++)
			{
				if((i == 0 && j != 0) || (j == 0 && i != 0 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1) || (j == n - 1 && i >= (n/2)) || (i == (n/2) && j >= (n/2))){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//H//
			for(int j=0; j<=n-1; j++)
			{
				if(j == 0 || j == n - 1 || i == (n/2)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//I//
			for(int j=0; j<=n-1; j++)
			{
				if(i == 0 || i == n - 1 || j == (n/2)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//J//
			for(int j=0; j<=n-1; j++)
			{
				if(i == 0 || (j == (n/2) && i != n - 1) || (i == n - 1 && j <=(n/2) && j != 0) || (j == 0 && i >=(n/2) && i != n - 1)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//k//
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 || i+j==(n/2) || i-j==(n/2)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//L//
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 || i==(n-1)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//M//
			for(int j=0; j<=n-1; j++)
			{
				if(j == 0 || j == n - 1 || (i == j && i <= (n/2)) || (i + j == n - 1 && i <= (n/2))){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//N//
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 || j==i || j==(n-1)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//O//
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 ||i==(n-1) || j==(n-1) || i==0){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//P//
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 && j!=(n-1) || j==0 || j==(n-1) && i>=0 && i<=(n/2) || i==(n/2)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//Q//
			for(int j=0; j<=n-1; j++)
			{
				if((i == 0 && j != 0 && j < n - 2) || (j == 0 && i != 0 && i < n - 2) || (i == n - 2 && j != 0 && j < n - 2) || (j == n - 2 && i != 0 && i < n - 2) || (i == j && i >= (n/2))){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//R//
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 && j!=(n-1) || j==0 || j==(n-1) && i>=0 && i<=(n/2) || i==(n/2) || i-j==(n/2) ){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//S//
			for(int j=0; j<=n-1; j++)
			{
				if((i == 0 && j != 0) || (i == (n/2) && j != 0 && j!= n - 1) || (i == (n-1) && j != n - 1) || (j == 0 && i > 0 && i <=(n/2)) || (j == n - 1 && i >=(n/2) && i < n - 1)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//T//
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || j==(n/2)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//U//
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 && i<(n-1) || i==(n-1) && j<(n-1) || j==(n-2) &&  i<(n-1) ){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//V//
			for(int j=0; j<=n-1; j++)
			{
				if(i-j==(n/2) || i+j==((n-1)+(n/2))){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//W//
			for(int j=0; j<=n-1; j++)
			{
				if(j == 0 || j == n - 1 || (i + j == n - 1 && i >= (n/2)) || (i == j && i >= (n/2))){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//X//
			for(int j=0; j<=n-1; j++)
			{
				if(i==j || i+j==(n-1)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//Y//
			for(int j=0; j<=n-1; j++)
			{
				if((i == j && i <= (n/2)) || (i + j == n - 1 && i <=(n/2)) || (j ==(n/2) && i >=(n/2))){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		//Z//
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || i+j==(n-1) || i==(n-1)){
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}