/******************* Program Identification ************************************************/
/* COURSE: CS 380		Data Structures 				                                   */
/* PROJECT # : 	Project #2				                   			                       */
/* DUE DATE :	2/18/16								                                       */
/* SOURCE FILE :  Node.java            				                                       */
/* Instructor: Dr. Samuel Sambasivam                                                       */
/*                                                                                         */
/* Student Name: Ali Citta                                                                 */
/* *****************************************************************************************/

public class Node
{
	private String name;
	private double balance;
	private Node prev, next;
	
	//Node Constructors
	public Node() 
	{
		this.name = "";
		this.balance = 0.0;
		this.prev = null;
		this.next = null;
	}

	public Node(String newName, double newBalance) {
		this.name = newName;
		this.balance = newBalance;
		this.prev = null;
		this.next = null;
	}

	//Returns the name
	public String getName() 
	{
		return name;
	}

	//Sets the name
	public void setName(String name) 
	{
		this.name = name;
	}

	//Returns the balance
	public double getBalance() 
	{
		return balance;
	}

	//Sets the balance
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	//Returns the previous node
	public Node getPrev()
	{
		return prev;
	}

	//Sets the previous node
	public void setPrev(Node prev) 
	{
		this.prev = prev;
	}

	//Returns next node
	public Node getNext()
	{
		return next;
	}

	//Sets next node
	public void setNext(Node next) 
	{
		this.next = next;
	}

	//Prints node into a string
	public String toString() 
	{
		return "Node (name: " + name + ", balance: " + balance + ")";
	}
}
