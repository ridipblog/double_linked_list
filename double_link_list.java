package double_link_list;

import java.util.Scanner;

public class double_link_list {
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null;
	Scanner sc=new Scanner(System.in);
	public void creation()
	{
		int data,n;
		do
		{
			System.out.print("Enter Data ");
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head==null)
			{
				head=new_node;
			}
			else
			{
				new_node.next=head;
				head.prev=new_node;
				head=new_node;
			}
			System.out.print("Press 1 For Insert ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void insertAtEnd()
	{
		int data,n;
		do
		{
			System.out.print("Enter Data ");
			data=sc.nextInt();
			if(head==null)
			{
				creation();
			}
			else
			{
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				Node new_node=new Node(data);
				temp.next=new_node;
				new_node.prev=temp;
			}
			System.out.print("Press 1 For Insert ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void insertAtIndex()
	{
		int data,index,n,length=0;
		do
		{
			System.out.print("Enter Data ");
			data=sc.nextInt();
			System.out.print("Enter Index ");
			index=sc.nextInt();
			if(head==null)
			{
				creation();
			}
			else
			{
				Node temp=head;
				while(length!=index-1)
				{
					temp=temp.next;
					length++;
				}
				Node new_node=new Node(data);
				new_node.next=temp.next;
				new_node.prev=temp;
				if(temp.next!=null)
				{
					temp.next.prev=new_node;
				}
				temp.next=new_node;
			}
			System.out.print("Press 1 For Insert ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void traversal()
	{
		if(head==null)
		{
			System.out.print("List Null ");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"\n");
				temp=temp.next;
			}
		}
	}
	public static void main(String args[])
	{
		double_link_list dl=new double_link_list();
		int c;
		Scanner sc=new Scanner(System.in);
		dl.creation();
		while(true)
		{
			System.out.print("1 For Insert At Start ");
			System.out.print("2 For Insert At End ");
			System.out.print("3 For Insert At Index ");
			System.out.print("4 For Display ");
			c=sc.nextInt();
			if(c==1)
			{
				dl.creation();
			}
			else if(c==2)
			{
				dl.insertAtEnd();
			}
			else if(c==3)
			{
				dl.insertAtIndex();
			}
			else if(c==4)
			{
				dl.traversal();
			}
			else
			{
				break;
			}
		}
	}
}
