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
	 * ���ָ���ֶζ��б��������Ĭ������
	 */
	@SuppressWarnings("unchecked")
	public List<T> sortList(List<T> list,String sortName)
	{
		Collections.sort(list,new BaseComparator(sortName));
		return list;
	}
	/*
	 * ���ָ���ֶζ��б�������򣬿�ָ����������
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
