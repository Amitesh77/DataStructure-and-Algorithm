package Hashing.Amitesh;

import java.util.LinkedList;

public class Insertion {
	
	static LinkedList<String>[] hashtable;
	
	int maximumchainsiz=5;
	
	Insertion()
	{
		hashtable=new LinkedList[13];
	}
	
	
	//hashFunction
	
	
	
	
	public static int simpleASCIIHashFunction(String x,int m)
	{
		int sum=0,i;
		char []ch;
		
		ch=x.toCharArray();
		
		for (i=0;i<x.length(); i++) 
		{
			sum+=ch[i];
		}
		
		return sum%m;
	}
	
	
	public static void insertKeyinHashTable(String value)
	{
		
		//position where to be inserted
		int newindex=simpleASCIIHashFunction(value,hashtable.length);
		
		if(hashtable[newindex]==null)
		{
			System.out.println(newindex+"    is empty and creating a Linked List here");
			
			hashtable[newindex]=new LinkedList<String>();
			
			hashtable[newindex].add(value);
			
			System.out.println("Successfully inserted " + "\"" + value + "\"" + " in location: " + newindex);
			System.out.println("-------------------------------------------\n");
		}
		
		else
		{
			System.out.println("\nIndex: " + newindex + " is having sufficient space. Inserting there...");
			hashtable[newindex].add(value);
			System.out.println("Successfully inserted " + "\"" + value + "\"" + " in location: " + newindex);
			System.out.println("-------------------------------------------\n");
		}
	}
	
	
	public void displayHashTable()
	{
		for (int i = 0; i < hashtable.length; i++)
		{
			System.out.println("Index: " + i + ", key: " + hashtable[i]);
		}
	}
	

}
