public class LinkedListJeddAlcalde<E>
{
	int listSize;

	Node[] elementArray;

	public LinkedListJeddAlcalde(int size)
	{
		listSize = size;

		elementArray = new Node[listSize];

		for(int i = 0; i < listSize; i++)
		{
			Node newNode = new Node(null, i);
			newNode = elementArray[i];
			if(i == 1)
			{
				//nothing should happen
			}
			else
			{
				elementArray[i-1].setNext(elementArray[1]);
			}
		}
	}

	//public <T extendds Comparable<T>> void select into Position(T[] arr, int pos)//is a made up method that uses generics

/*	public boolean add(E e)//returns if true if the element in the constructor can be added, false if it can't
	{
		boolean returnValue = true;
//for now there is no reason it wont be true

		return returnValue;
	}*/

	public void add(int index, E element)//should the
	{
		Node[] elementArrayNew = new Node[listSize+1];

		for(int i = listSize+1; i > 1; i++)
		{
			if(i == index)
			{
				elementArrayNew[i] = element;
			}
			else
			{
				elementArrayNew[i] = elementArray[i-1];
			}
		}
		listSize = listSize+1;

		elementArray = elementArrayNew;
	}


	public void addFirst(E e)
	{
		Node newNode = new Node(e, 1);
		Node[] elementArrayNew = new Node[listSize+1];

		for(int i = listSize+1; i > 0; i--)
		{
			elementArrayNew[i] = elementArray[i-1];
		}
		listSize = listSize+1;
		elementArray[1] = newNode;
	}

	public void addLast(E e)
	{
		Node newNode = new Node(e, 1);
		Node[] elementArrayNew = new Node[listSize+1];
		listSize = listSize+1;
		elementArray[listSize] = newNode;
	}

/*	public void clear()
	{
	}*/

	public boolean contains(Object o)
	{
		boolean returnValue = false;
		for(int i = 0; i < listSize; i++)
		{
			if(elementArray[i] == o)
			{
				returnValue = true;
			}
		}

	}

	public E get(int index)
	{
		return elementArray[index].getData();
	}

	public E getFirst()
	{
		return elementArray[1].getData();
	}

	public E getLast()
	{
		return elementArray[listSize];
	}

	public int indexOf(Object o)//if -1 is returned, the object isn't in the array
	{
		int index = -1;
		for(int i = 0; i < listSize; i++)
		{
			if(elementArray[i] == o)
			{
				index = i;
			}

			else
			{
			}
		}

		return index;
	}

	public E remove(int index)
	{
		Node[] elementArrayNew = new Node[listSize-1];

		for(int i = listSize-1; i > 1; i--)
		{
			if(i == index)
			{
				//nothing should happen
			}
			else
			{
				elementArrayNew[i] = elementArray[i+1];
			}
		}
		listSize = listSize-1;

		elementArray = elementArrayNew;
	}

	public E removeFirst()
	{
		Node[] elementArrayNew = new Node[listSize-1];

		for(int i = listSize-1; i > 1; i--)
		{
			elementArrayNew[i] = elementArray[i+1];
		}
		listSize = listSize-1;

		elementArray = elementArrayNew;
	}

	public E set(int index, E e)
	{
		if(index > listSize)
		{
			System.out.println("index is bigger than listSize");
		}

		else if(this.indexFilled(index) == false)
		{
			System.out.println("index is already taken");
		}

		else
		{
			Node newNode = new Node(element, index);
			elementArray[index] = newNode;
		}
	}

	public int size()
	{
		return listSize;
	}

	//all the rest of the methods are additional methods used internally

	public boolean indexFilled(int index)
	{
		boolean returnValue = true;

		if(elementArray[index].getData() == null)
		{
			returnValue = false;
		}

		else if(elementArray[index].getData() != null)
		{
			returnValue = true;
		}

		return returnValue;
	}

/*	public E getElement(int index)//method doesn't work for some reason because incompatible types
	{
		E returnValue = elementArray[index].getData();

		if(returnValue == null)
		{
			System.out.println("ElementRetrieved is Null");
			return null;
		}
		else
		{
			return returnValue;
		}
	}*/
}