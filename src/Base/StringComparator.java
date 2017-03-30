package Base;

public class StringComparator{

	public static int compare(String o1, String o2) {
		if(o1 == o2){
			return 0;
		}
		if(o1==null || o1.isEmpty()){
			return -1;
		}
		if(o2==null || o2.isEmpty()){
			return 1;
		}
		return o1.compareTo(o2);
	}
}
