package Base;

import java.lang.reflect.Field;
import java.sql.Date;
import java.util.Comparator;

@SuppressWarnings({ "rawtypes" })
public class BaseComparator implements Comparator{

	private String fieldName;
	public BaseComparator() {
	}
	public BaseComparator(String fieldName){
		this.fieldName = fieldName;
	}
	@Override
	public int compare(Object o1, Object o2) {
		try {
			if(o1.getClass() != o2.getClass()){
				return -2;
			}
			Field field = o1.getClass().getDeclaredField(fieldName);
			Field field2 = o2.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			field2.setAccessible(true);
			int result = 0;
			switch(field.getType().getName())
			{
				case "String":
					result = StringComparator.compare(field.get(o1).toString(),field2.get(o2).toString());
					break;
				case "int":
					result = ((Integer)field.get(o1)).compareTo((Integer)field2.get(o2));
					break;
				case "float":
					result = ((Float)field.get(o1)).compareTo((Float)field2.get(o2));
					break;
				case "long":
					result = ((Long)field.get(o1)).compareTo((Long)field2.get(o2));
					break;
				case "double":
					result = ((Double)field.get(o1)).compareTo((Double)field2.get(o2));
					break;
				case "byte":
					result = ((Byte)field.get(o1)).compareTo((Byte)field2.get(o2));
					break;
				case "short":
					result = ((Short)field.get(o1)).compareTo((Short)field2.get(o2));
					break;
				case "char":
					result = CharComparator.compare((char)field.get(o1),(char)field2.get(o2));
					break;
				case "Date":
					result = ((Date)field.get(o1)).compareTo((Date)field2.get(o2));
			}
			return result;
		} catch (NoSuchFieldException e) {
			System.out.println("Base Comparator suffer NoSuchFieldException ,the reason is "+e);
		} catch (SecurityException e) {
			System.out.println("Base Comparator suffer SecurityException,the reason is "+e);
		} catch (IllegalArgumentException e) {
			System.out.println("Base Comparator suffer IllegalArgumentException,the reason is "+e);
		} catch (IllegalAccessException e){
			System.out.println("Base Comparator suffer IllegalAccessException,the reason is "+e);
		}
		return -2;
	}
	
}
