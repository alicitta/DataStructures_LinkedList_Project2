/******************* Program Identification ************************************************/
/* COURSE: CS 380		Data Structures 				                                   */
/* PROJECT # : 	Project #2				                   			                       */
/* DUE DATE :	2/18/16								                                       */
/* SOURCE FILE :  List.java            				                                       */
/* Instructor: Dr. Samuel Sambasivam                                                       */
/*                                                                                         */
/* Student Name: Ali Citta                                                                 */
/* *****************************************************************************************/

public class List 
{
	private int size;
	private Node head;
	
	//Sets up the list
	private void setup()
	{
		size = 0;
		head = new Node();
		head.setPrev(head);
		head.setNext(head);
		return;
	}
	
	//List constructor
	public List()
	{
		setup();
	}
	
	//Adds node to the end of the list and sets the previous and next addresses
	public void append(Node newNode)
	{
		newNode.setNext(head);
		newNode.setPrev(head.getPrev());
		head.getPrev().setNext(newNode);
		head.setPrev(newNode);
		size++;
		return;
	}
	
	//Clears the list
	public void clear()
	{
		setup();
	}
	
	//Checks if the list is empty
	public boolean isEmpty()
	{
		if(head == head.getNext())
		{
			return true;
		}
		return false;
	}
	
	//Checks if the list is full
	public boolean isFull()
	{
		Node temp = new Node();
		
		if(temp == null)
		{
			return true;
		}
		return false;
	}
	
	//Inserts a node at the beginning of the list
	public void insertBeginning(Node newNode)
	{
		newNode.setNext(head.getNext());
		head.getNext().setPrev(newNode);
		newNode.setPrev(head);
		head.setNext(newNode);
		
		size++;
		return;
	}
	
	//Inserts a new node after the node of the given name
	public boolean insertAfter(String name, Node newNode)
	{
		if(!isFull())
		{
			if(!contains(newNode.getName()))
			{
				for (Node temp = head.getNext(); temp != head; temp = temp.getNext())
				{
					if(name.equals(temp.getName()))
					{
						newNode.setNext(temp.getNext());
						temp.getNext().setPrev(newNode);
						newNode.setPrev(temp);
						temp.setNext(newNode);
						
						size++;
						return true;
					}
				}
			}
		}
		else
		{
			System.out.println("List is full.");
			return false;
		}
		return false;
	}
	
	//Inserts a new node before the node of the given name
	public boolean insertBefore(String name, Node newNode)
	{
		if(!isFull())
		{
			if(!contains(newNode.getName()))
			{
				for (Node temp = head.getNext(); temp != head; temp = temp.getNext())
				{
					if(name.equals(temp.getName()))
					{
						
						newNode.setPrev(temp.getPrev());
						temp.getPrev().setNext(newNode);
						newNode.setNext(temp);
						temp.setPrev(newNode);
						
						size++;
						return true;
					}
				}
			}
		}
		else
		{
			System.out.println("List is full.");
			return false;
		}
		return false;
	}
	
	//Updates a person's balance, given their name
	public boolean update(String name, double balance)
	{
		if(!isEmpty())
		{
			for (Node temp = head.getNext(); temp != head; temp = temp.getNext())
			{
				if(name.equals(temp.getName()))
				{
					temp.setBalance(balance);
					return true;
				}
			}
			System.out.println("That name is not in this list.");
			return false;
		}
		else
		{
			System.out.print("Empty List.");
			return false;
		}
	}
	
	//Erases the node of the given name
	public boolean erase(String name)
	{
		if(!isEmpty())
		{
			for (Node temp = head.getNext(); temp != head; temp = temp.getNext())
			{
				if(name.equals(temp.getName()))
				{
					temp.getNext().setPrev(temp.getPrev());
					temp.getPrev().setNext(temp.getNext());
					
					size--;
					return true;
				}
			}
			System.out.println("That name is not in this list.");
			return false;
		}
		else
		{
			System.out.println("Empty List.");
			return false;
		}
	}
	
	//Checks to see if a name is in the list
	public boolean contains(String name)
	{
		if(!isEmpty())
		{
			for (Node temp = head.getNext(); temp != head; temp = temp.getNext())
			{
				if(name.equals(temp.getName()))
				{
					System.out.println("This name is in the list.");
					return true;
				}
			}
			System.out.println("This name is not in the list.");
			return false;
		}
		else
		{
			System.out.println("Empty List.");
			return false;
		}
	}
	
	//Returns the node of the given name
	public Node get(String name)
	{
		Node empty = new Node();
		
		if(!isEmpty())
		{
			for(Node temp = head.getNext(); temp != head; temp = temp.getNext())
			{
				if(temp.getName().equals(name))
				{
					return temp;
				}
			}
			return empty;
		}
		return null;
	}
	
	//Shows the current structure of the list.
	public void showStructure()
	{
		if(size == 0)
			System.out.println("Empty List");
		else
		{
			System.out.println("size: " + size);
			for (Node temp = head.getNext(); temp != head; temp = temp.getNext())
				System.out.println(temp.toString());
		}
	}
}
