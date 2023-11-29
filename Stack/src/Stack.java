
public class Stack<T> {
private int top;
private int size;
private T[] arr;

	public Stack(int size)
	{
		this.size=size;
		top=-1;
		arr=(T[])new Object[size];
	}

	//if stack[array] is empty
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	//if stack[array] is full
	public boolean isFull()
	{
		return top==size-1;
	}
	
	//if value has to be inserted in stack [array]
	
	
	public boolean push(T data)
	{
		if(isFull())
		{
			return false;
		}
		arr[++top]=data;
		return true;
	}
	
	
	//value has to be deleted from stack
	public T pop()
	{
		if(isEmpty())
		{
			return null;
		}
		return arr[top--];
		
	}
	//to peek
	public T peek() {
		if(isEmpty())
		{return null;}
		return arr[top];
	}
	
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
