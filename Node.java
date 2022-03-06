public class Node<E>
{

	E data;
	Node<E> next;

	int listPosition;
	public Node(E data)
	{
		this.data = data;
	}

	public void setNext(Node<E> nextNode)
	{
		next = nextNode;
	}

	public E getData()
	{
		return data;
	}

	public Node<E> getNext()
	{
		return next;
	}
}