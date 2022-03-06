public class LinkedListJA <E>
{
	Node<E> head;

	public LinkedListJA()
	{
	}

/*	public <E> void add(int index, E e)
	{//uses the same concept as addLast() once the node of the index searched for has been reached
	}*/

	public void addFirst(E e)//Completed
	{
		Node<E> newNode = new Node(e);

		if(head == null)//when there isn't any Nodes in the LinkedList
		{
			head = newNode;
		}

		else if(head.getNext() == null)//when there is only one Node in the LinkedList
		{
			//TempNode1 and 2 is meant to store/place data
			Node<E> TempNode1 = new Node(head.getData());//gets data from head
			head = newNode;//sets new data to head
			head.setNext(TempNode1);
		}

		else//when there are multiple Nodes in the LinkedList
		{//first you will have to transfer all data from current nodes to new nodes that have the same position plus 1, then add the new element to the front

			Node<E> currentNode = head;

			head = newNode;

			head.setNext(currentNode);
		}
	}

	public void addLast(E e)//Completed
	{
		Node<E> newNode = new Node(e);

		if(head == null)//when there isn't any Nodes in the LinkedList
		{
			head = newNode;
			System.out.println("H0");
		}

		else if(head.getNext() == null)//when there is only one Node in the LinkedList
		{
			head.setNext(newNode);
			System.out.println("H1");
		}

		else//when there are multiple Nodes in the LinkedList
		{
			Node<E> CurrentNode = head.getNext();

			while(CurrentNode.getNext() != null)
			{
				CurrentNode = CurrentNode.getNext();//moves Current Node to the next Node until there it reaches a node with no next value
				//System.out.println(CurrentNode.getData());
				System.out.println("H2");
			}

			CurrentNode.setNext(newNode);
		}
	}

	public void clear()//Can you just clear the first node and the rest cannot exist?
	{
		head = null;
	}

	public boolean contains(Object o)
	{
		boolean returnValue = false;
		Node<E> CurrentNode = head;
		int indexCounter = 1;

		while(this.size() > indexCounter || o == CurrentNode.getData())
		{
			CurrentNode = CurrentNode.getNext();
			indexCounter++;
		}
		if(CurrentNode.getData() == o)
		{
			returnValue = true;
		}
		else if(this.size() == indexCounter)
		{
			returnValue = false;
		}
		return returnValue;
	}

	public E get(int index)//Complete
	{
		E returnValue;

		int indexCounter = 0;

		if(index == 0)
		{
			returnValue = head.getData();
		}

		else if(index == 1)//when there is only one Node in the LinkedList
		{
			returnValue = head.getNext().getData();
		}

		else//when there are multiple Nodes in the LinkedList
		{
			Node<E> CurrentNode = head;

			while(indexCounter < index)
			{
				CurrentNode = CurrentNode.getNext();
				indexCounter++;
			}

			returnValue = CurrentNode.getData();
		}

		return returnValue;
	}

	public E getFirst()
	{
		return head.getData();
	}

	public E getLast()//needs to be reviewed
	{
		E returnValue;

		if(head == null)//when there isn't any Nodes in the LinkedList
		{
			returnValue = null;
		}

		else if(head.getNext() == null)//when there is only one Node in the LinkedList
		{
			returnValue = head.getData();
		}

		else//when there are multiple Nodes in the LinkedList
		{
			Node<E> CurrentNode = head;

			if(head.getNext() == null)
			{
				returnValue = CurrentNode.getData();
			}

			while(CurrentNode.getNext() != null)
			{
				CurrentNode = CurrentNode.getNext();//moves Current Node to the next Node until there it reaches a node with no next value
			}

			returnValue = CurrentNode.getData();
		}

		return returnValue;
	}

	public int indexOf(Object o)//if -1 is returned, the object isn't in the array
	{
		int returnValue = 0;
		Node<E> CurrentNode = head;
		int indexCounter = 1;

		while(this.size() > indexCounter || o == CurrentNode.getData())
		{
			CurrentNode = CurrentNode.getNext();
			indexCounter++;
		}
		if(CurrentNode.getData() == o)
		{
			returnValue = indexCounter;
		}
		else if(this.size() == indexCounter)
		{
			returnValue = -1;
		}
		return returnValue;
	}

	public void remove(int index)//NOT COMPLETE
	{
		int indexCounter = 0;

		if(this.size() < index)
		{
			System.out.println("Index is too large for LinkedList.remove()");
		}

		else if(head == null)//when there isn't any Nodes in the LinkedList
		{
			//there is nothing to remove
		}

		else if(head.getNext() == null)//when there is only one Node in the LinkedList
		{
			head = null;
		}
		else//when there are multiple Nodes in the LinkedList
		{
			Node<E> CurrentNode = head.getNext();

			while(indexCounter != index)
			{
				CurrentNode = CurrentNode.getNext();//moves Current Node to the next Node until there it reaches a node with no next value
				indexCounter++;
			}
		}
	}

	public <E> void removeFirst()//Completed
	{
		head = head.getNext();
	}

/*	public E set(int index, E e)
	{
	}*/

	public int size()//Completed
	{
		int indexCounter = 0;

		if(head == null)
		{
			indexCounter = 0;
			System.out.println("H0");
		}

		else if(head.getNext() == null)
		{
			indexCounter = 1;
			System.out.println("H1");
		}

		else
		{
			Node<E> CurrentNode = head;
			indexCounter = 0;

			while(CurrentNode.getNext() != null)
			{
				CurrentNode = CurrentNode.getNext();//moves Current Node to the next Node until there it reaches a node with no next value
				indexCounter++;
			}
			System.out.println("H2");
		}

		return 3;
	}
}