package Hashing.Amitesh;

import java.util.LinkedList;

public class Search {
	
	static LinkedList<String> [] hashtable;
	
	Search()
	{
		hashtable=new LinkedList[13];
	}
	
	public static int hashFunc(String x,int m)
	{
		char[] ch;
		
		ch=x.toCharArray();
		
		int sum=0,i;
		
		
		for (i = 0; i < ch.length; i++) {
			
			sum+=ch[i];
			
		}
		
		return sum%m;
	}
	
	
	public static boolean searchhashtable(String value)
	{
		int newindex=hashFunc(value,hashtable.length);
		
		if(hashtable[newindex]!=null && hashtable[newindex].contains(value))
		{
			System.out.println("\n" + "\"" + value + "\"" + " found in HashTable at location: "+newindex);
			return true;
		}
		
		else
		{
			System.out.println("\n" + "\"" + value + "\"" + " not found in HashTable.");
			return false;
		}
	}
	
	public static void insertKeyinHashTable(String value)
	{
		
		//position where to be inserted
		int newindex=hashFunc(value,hashtable.length);
		
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
	
	public static void deleteinHashtable(String valuetobeDeleted)
	{
		int newindex=hashFunc(valuetobeDeleted,hashtable.length);
		
		if(hashtable!=null && hashtable[newindex].contains(valuetobeDeleted))
		{
			System.out.println("\n" + "\"" + valuetobeDeleted + "\"" + " has been found in HashTable." );
			
			hashtable[newindex].remove(valuetobeDeleted);
			System.out.println("\"" + valuetobeDeleted + "\"" + " has been deleted from HashTable !" );
		}
		
		else
		{
			System.out.println("\nCould not find " + "\"" + valuetobeDeleted + "\"" + " in HashTable");
		}
	}
	
	
	
	// display the hash table
	public void displayHashTable() {
		if(hashtable == null) {
			System.out.println("\nHashTable does not exits !");
			return;
		}else {
			System.out.println("\n---------- HashTable ---------");
			for (int i = 0; i < hashtable.length; i++) {
				System.out.println("Index: " + i + ", key: " + hashtable[i]);
				
			}
		}
	} //end of method
	
	
	// Deletes entire HashTable
	public void deleteHashTable() {
		hashtable = null;
		System.out.println("Successfully deleted HashTable !");
	}// end of method
	

}
