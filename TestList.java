/******************* Program Identification ************************************************/
/* COURSE: CS 380		Data Structures 				                                   */
/* PROJECT # : 	Project #2				                   			                       */
/* DUE DATE :	2/18/16								                                       */
/* SOURCE FILE :  TestList.java            				                                   */
/* Instructor: Dr. Samuel Sambasivam                                                       */
/*                                                                                         */
/* Student Name: Ali Citta                                                                 */
/* *****************************************************************************************/


public class TestList 
{
	/***************************************************************************/
	/* 				MAIN PROGRAM				                               */
	/***************************************************************************/

	public static void main(String[] args) 
	{
		heading();
		
		List testList = new List();
		
		testList.append(new Node("Monica", 947399.98));
		testList.append(new Node("Sarah", 38285.75));
		testList.append(new Node("Mason", 2648.90));
		testList.append(new Node("Ali", 123.45));
		testList.append(new Node("Lou", 34.08));
		
		System.out.println("Testing showStructure method.");
		testList.showStructure();
		System.out.println();
		
		System.out.println("Testing insertBeginning method.");
		testList.insertBeginning(new Node("Karen", 97.22));
		testList.showStructure();
		System.out.println();
		
		System.out.println("Testing insertAfter method.");
		testList.insertAfter("Monica", new Node("Ezra", 889.11));
		testList.showStructure();
		System.out.println();
		
		System.out.println("Testing insertBefore method.");
		testList.insertBefore("Ali", new Node("Bob", 7.68));
		testList.showStructure();
		System.out.println();
		
		System.out.println("Testing update method.");
		testList.update("Mason", 1000.29);
		testList.showStructure();
		System.out.println();
		
		System.out.println("Testing erase method.");
		testList.erase("Sarah");
		testList.showStructure();
		System.out.println();
		
		System.out.println("Testing contains method.");
		testList.contains("Lou");
		testList.showStructure();
		System.out.println();
		
		System.out.println("Testing get method.");
		System.out.println(testList.get("Monica").toString());
		System.out.println();
		
		System.out.println("Testing clear method.");
		testList.clear();
		
		testList.showStructure();
		
		footing();
	}
	
	/*			FUNCTION HEADING	 	                                  */
	/**********************************************************************/
	public static void heading()
	{     
		System.out.println();
		System.out.println ( "Ali Citta     CS 380  ");
		System.out.println ( "Spring 2016   Project #2");
		System.out.println ();
		System.out.println ();
		return;
	}  
	/*************************************************************************/    
	/*************************************************************************/
	/*			FUNCTION FOOTING	 	                                     */
	/*************************************************************************/
	public static void footing()
	{             
		System.out.println ();
		System.out.println ();
		System.out.println ( "END OF OUTPUT");
		System.out.println ();
		return;
	}  
	/***************************************************************************/
}
