package double_link_list;

import java.util.Scanner;

import double_link_list.double_link_list.Node;

public class double_link_list_1 {
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			this.next=next;
			this.prev=prev;
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
	public void deleteAtStart()
	{
		if(head==null)
		{
			System.out.print("List Null");
		}
		else
		{
			System.out.print("Deleted Item "+head.data);
			head=head.next;
			if(head!=null)
			{
				head.prev=null;
			}
		}
	}
	public void deleteAtEnd()
	{
		if(head==null)
		{
			System.out.print("List Null ");
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			System.out.print("Deleted Item "+temp.data);
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				temp.prev.next=null;
				temp.prev=null;
			}
		}
	}
	public void deleteAtIndex()
	{
		int index,length=0;
		if(head==null)
		{
			System.out.print("List Null");
		}
		else
		{
			System.out.print("Enter Index ");
			index=sc.nextInt();
			if(head.next==null)
			{
				System.out.print("Deleted Item "+head.data);
				head=null;
			}
			else
			{
				Node temp=head;
				while(length!=index-1)
				{
					temp=temp.next;
					length++;
				}
				System.out.print("Deleted Item "+temp.data);
				temp.prev.next=temp.next;
				if(temp.next!=null)
				{
					temp.next.prev=temp.prev;
				}
			}
		}
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
		double_link_list_1 dl=new double_link_list_1();
		int c;
		Scanner sc=new Scanner(System.in);
		dl.creation();
		while(true)
		{
			System.out.print("\n1 For Insert At Start ");
			System.out.print("\n2 For Insert At End ");
			System.out.print("\n3 For Insert At Index ");
			System.out.print("\n4 For Display ");
			System.out.print("\n5 For Delete At Start ");
			System.out.print("\n6 For Delete At End ");
			System.out.print("\n7 For Delete At Index ");
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
			else if(c==5)
			{
				dl.deleteAtStart();
			}
			else if(c==6)
			{
				dl.deleteAtEnd();
			}
			else if(c==7)
			{
				dl.deleteAtIndex();
			}
			else
			{
				break;
			}
		}
	}
}