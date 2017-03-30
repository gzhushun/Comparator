package Demo;

import java.util.ArrayList;
import java.util.List;

import Base.Comparator;

public class TestComparator {
	public static void main(String args[])
	{
		Fruit fruit1 = new Fruit("apple",1,9.9);
		Fruit fruit2 = new Fruit("perl",2,8.9);
		Fruit fruit3 = new Fruit("orange", 3, 10.9);
		System.out.println(new Comparator("price").compare(fruit1, fruit2));
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(fruit1);
		fruits.add(fruit2);
		fruits.add(fruit3);
		new Comparator().sortList(fruits,"name");
		for(Fruit fruit : fruits)
		{
			System.out.println(fruit.getName());
		}
	}
}
