package linkedList.Amitesh;

public class SingleLinkedListAmiteshMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkeListAmitesh list=new SingleLinkeListAmitesh();
		
		list.createSinglelinkList(5);
		
		//list.Traversal();
		
		list.insertinLinkedList(10,1);
		
		list.insertinLinkedList(20, 2);
		
		list.insertinLinkedList(67, 3);
		
		list.Traversal();
		
		list.SearchNode(67);
		
		list.deletionofNode(1);
		
		list.Traversal();
	}

}
