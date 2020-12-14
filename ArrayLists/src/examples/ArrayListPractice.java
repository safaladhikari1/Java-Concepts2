package examples;

public class ArrayListPractice 
{
	public static void main(String[] args)
	{
		ResizeableArray list = new ResizeableArray(5);
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		list.add("j");
		list.add("k");
		
		list.printList();
		
		list.remove("b");
		
		list.printList();
		
	}
}
