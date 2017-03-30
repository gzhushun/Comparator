package Base;

public class CharComparator{

	public static int compare(char o1, char o2) {
		if(o1 == o2){
			return 0;
		}
		if(o1 < o2){
			return -1;
		}
		if(o1 > o2){
			return 1;
		}
		return 0;
	}
}
