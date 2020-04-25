package linkedList.Amitesh;

public class SingleLinkeListAmitesh {
	
	private SingleNodeAmitesh head;
	private SingleNodeAmitesh tail;
	
	private int size;   //denotes size of list

	public SingleNodeAmitesh createSinglelinkList(int nodevalue) {
		
		
		head=new SingleNodeAmitesh();
		
		SingleNodeAmitesh node=new SingleNodeAmitesh();
		
		node.setValue(nodevalue);
		
		node.setNext(null);
		
		head=node;
		tail=node;
		size=1;
		
		return head;
		
		
	}

	public SingleNodeAmitesh getHead() {
		return head;
	}

	public void setHead(SingleNodeAmitesh head) {
		this.head = head;
	}

	public SingleNodeAmitesh getTail() {
		return tail;
	}

	public void setTail(SingleNodeAmitesh tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	public void insertinLinkedList(int nodevalue,int location)
	{
		SingleNodeAmitesh node=new SingleNodeAmitesh();
		
		node.setValue(nodevalue);
		
		if(!existsLinkedList())
		{
			System.out.println("The linkedList does not exist");
			return;
		}
		
		else if(location==0)
		{
			node.setNext(head);
			head=node;
		}
		
		else if(location>=size)
		{
			node.setNext(null);
			tail.setNext(node);
			tail=node;
		}
		
		else //at Specified Position
		{
			SingleNodeAmitesh tempNode=head;
			
			int index=0;
			
			while(index<location-1)
			{
				tempNode=tempNode.getNext();
				index++;
				
			}//tempNode currently references the node after which we have to insert
			
			SingleNodeAmitesh nextnode=tempNode.getNext();//immediate next node after new node
			
			tempNode.setNext(node);//update reference of tempNode to reference to new node
			
			node.setNext(nextnode);//update newly added node address to next node.
		}
		
		setSize(getSize()+1);
		
	}
	
	
	public void Traversal()
	{
		if(existsLinkedList())
		{
			SingleNodeAmitesh tempnode=head;
			
			for (int i = 0; i <getSize(); i++) 
			{
				
				System.out.print(tempnode.getValue());
				
				if(i !=getSize()-1)
				{
					System.out.print("->");
				}
				
				tempnode=tempnode.getNext();
				
			}
		}
		else {
			System.out.println("Linked List does not exists !");
		}
		System.out.println("\n");
	}
	
	
	public boolean existsLinkedList()
	{
		if(head!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void SearchNode(int value)
	{
		SingleNodeAmitesh tmpNode=head;
		
		int index=0;
		if(existsLinkedList())
		{
		for (int i = 0; i < getSize(); i++) {
			
			if(tmpNode.getValue()==value)
			{
				System.out.println("value found at : "+i +"  The value is :"+tmpNode.getValue());
				
				
			}
			
			
			else
			{
				tmpNode = tmpNode.getNext();
			}
			
		}
		}
		
		else
		{
			System.out.println("Linked List Doesnot exist");
		}
	}
	

	

}
