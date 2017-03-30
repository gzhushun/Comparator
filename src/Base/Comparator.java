package Base;

import java.util.Collections;
import java.util.List;

public class Comparator<T> extends BaseComparator{
	public Comparator(){
	}
	public Comparator(String sortName){
		super(sortName);
	}
	/*
	 * 针对指定字段对列表进行排序，默认升序
	 */
	@SuppressWarnings("unchecked")
	public List<T> sortList(List<T> list,String sortName)
	{
		Collections.sort(list,new BaseComparator(sortName));
		return list;
	}
	/*
	 * 针对指定字段对列表进行排序，可指定排序类型
	 */
	@SuppressWarnings("unchecked")
	public List<T> sortList(List<T> list,String sortName,String sortType)
	{
		Collections.sort(list,new BaseComparator(sortName));
		if("desc".equals(sortType)){
			Collections.reverse(list);
		}
		return list;
	}
}
