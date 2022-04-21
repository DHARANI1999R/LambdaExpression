package assignmentapril21;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.io.*;

class Fruit implements Comparable<Fruit>
{
	String name;
	Fruit(String name)
	{
		this.name=name;
	}
	@Override
	
	
	public int compareTo(Fruit other)
	{
		return this.name.compareTo(other.name);
	}
}

public class ComparableLambda 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Fruit> fruit=new ArrayList<>();
		fruit.add(new Fruit("Apple "));
		fruit.add(new Fruit("Banana "));
		fruit.add(new Fruit("Mango "));
		fruit.add(new Fruit("Grapes "));
		
		Collections.sort(fruit);
		fruit.stream().map(s -> s.name).forEach(System.out::print);

	}

}
