package Hashing.Amitesh;

public class SearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Search search=new Search();
		
		
		
		search.insertKeyinHashTable("Amitesh");
		search.insertKeyinHashTable("Ravi");

		search.insertKeyinHashTable("Piu");

		search.insertKeyinHashTable("Abhi");
		
		search.searchhashtable("Abhi");
		
		search.displayHashTable();
		
		search.deleteinHashtable("Ravi");
		
		
		search.displayHashTable();
		search.insertKeyinHashTable("Ravi");
		
		search.displayHashTable();

		

	}

}
