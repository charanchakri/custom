class Charan
{
	private Object[] objArray=new Object[10];
	private int elementCount=0;
	private void add(Object obj)
	{
		if(elementCount==objArray.length)
		{
			increaseCapacity();
		}
		objArray[elementCount]=obj;
		elementCount++;
	}
	public void increaseCapacity()
	{
		int newCapacity=objArray.length*2;
		Object[] nextArray=new Object[newCapacity];
		for(int i=0;i<objArray.length;i++)
		{
			nextArray[i]=objArray[i];
		}
		objArray=nextArray;
	}
	public int capacity()
	{
		return objArray.length;
	}
	public int size()
	{
		return elementCount;
	}
	
	public Object get(int index)
	{
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		return objArray[index];
	}
	public void replace(int index,Object obj)
	{
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		objArray[index]=obj;
	}
	public void remove(int index)
	
	{
		
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		while(index<size()-1)
		{
			objArray[index]=objArray[index+1];
			index++;
		}
		objArray[index]=null;
		elementCount--;
	}
	public void insert(int index,Object obj)
	{
		
		if(index<0||index>=size())
		{
			System.out.println("IndexOutOfBound Exception");
		}
		if(size()==capacity())
		{
			increaseCapacity();
		}
		for(int i=size()-1;i>=index;i--)
		{
			objArray[i++]=objArray[i];
		}
		objArray[index]=obj;
		elementCount++;
	}
	public void display(Object obj)
	{	
		for(int i=0;i<size();i++)
		{
			if(i==0)
			{
			System.out.print("{"+objArray[i]+" , ");
			}
			if(i>0 && i<size()-1)
			{
			System.out.print(objArray[i]+" , ");
			}
			if(i==size()-1)
			{
				System.out.print(objArray[i]+"}");
			}
		}
	}
	public static void main(String args[])
	{
 		Charan c=new Charan();
		c.add("Charan");
		c.add("Cse");
		c.add("A");
		c.add("Gnit");
		c.add("Jntu");
		c.add("Hyderabad");
		c.add("Khammam");
		c.add("Sathupally");
		c.add("Ongole");
		c.add("Vizag");
		c.display(c); 
        //Remove element from custom List
        c.remove(2);
         //Again display custom List
        System.out.println("\nCustom list after deletion of element at index 2");
		c.display(c);
		   
	}		
			
}
 

















