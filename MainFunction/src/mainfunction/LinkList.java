
package mainfunction;

import java.util.Scanner;

public class LinkList {
    class LinkNode//Linked list definition
	{
		public int val;
		LinkNode next = null;
		
		public LinkNode(int val)//Pass value to the value range
			{
				this.val=val;
			}
	}
	
	LinkNode head = null;
	LinkNode current = null;
	
	
	
	public void createList(int val)//Create a linked list
	{
		if(head == null)
		{
			head = new LinkNode(val);
			current = head;
		}
		else
		{
			LinkNode node = new LinkNode(val);
			current.next = node;
			current = current.next;
		}
	}
	
	public void modify() 
	{
		if(head == null)
			throw new IllegalArgumentException("You have not created a linked list yet!");
			print();
			System.out.println("Please enter the value and position you want to modify:");
			int num,j;
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			j = sc.nextInt();
			//sc.close();
			current = head;
			for(int i=1;current != null;i++)
			{
				if(i == j)
				{
					current.val = num;
					System.out.println("After modification:");
					print();
					break;
				}
				current = current.next; 
			}
	}
	
	public void add()//Add function
	{
		if(head == null)
		throw new IllegalArgumentException("You have not created a linked list yet!");
		print();
		System.out.println("Please enter the element you want to add:");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//sc.close();
		current = head;
		while(current.next != null)//Get the tail node
		{
			current = current.next;
		}
		LinkNode node = new LinkNode(num);
		current.next = node;
		System.out.println("After adding:");
		print();
	}
	
	public void insert()//Insert function
	{
		if(head == null)
		throw new IllegalArgumentException("You have not created a linked list yet!");
		print();
		System.out.println("Please enter the element and position you want to insert (PS: Insert function means insert before an element):");
		int num,j;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		j = sc.nextInt();
		//sc.close();
		current = head;
		LinkNode previousNode = null;
		for(int i=1;current != null;i++)
		{
			if(j == 1)
			{
				LinkNode node = new LinkNode(num);
				node.next = head;
				head = node;
				System.out.println("After inserting:");
				print();
				break;
			}
			if(i == j)
			{
				LinkNode node = new LinkNode(num);
				previousNode.next = node;
				node.next = current;
				System.out.println("After adding:");
				print();
				break;
			}
			previousNode = current;
			current = current.next; 
		}
	}
	
	public void delete()//Insert function
	{
		if(head == null)
		throw new IllegalArgumentException("You have not created a linked list yet!");
		print();
		System.out.println("Please enter the location of the element you want to delete:");
		int j;
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt();
		//sc.close();
		current = head;
		LinkNode previousNode = null;
		for(int i=1;current != null;i++)
		{
			if(j == 1)
			{
				head = head.next;
				System.out.println("After deleting:");
				print();
				break;
			}
			if(i == j)
			{
				previousNode.next = current.next;
				System.out.println("After deleting:");
				print();
				break;
			}
			previousNode = current;
			current = current.next; 
		}
	}
	
	
	
}
