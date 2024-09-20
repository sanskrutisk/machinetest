package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		List<String> e1=new ArrayList<String>();
		e1.add("Sanskruti");
		e1.add("Nikita");
		
		List<String> e2=new ArrayList<String>();
		e2.add("Gita");
		e2.add("Kiran");
		
		List<List<String>> d1=new ArrayList<List<String>>();
		d1.add(e1);
		d1.add(e2);
		
		List<String> e3=new ArrayList<String>();
		e3.add("abc");
		e3.add("pqr");
		
		List<String> e4=new ArrayList<String>();
		e4.add("xyz");
		e4.add("uvw");
		
		List<List<String>> d2=new ArrayList<List<String>>();
		d2.add(e3);
		d2.add(e4);
		
		Map<Integer,List<List<String>>> s=new HashMap<Integer,List<List<String>>>();
		s.put(1,d1);
		s.put(2, d2);
		
		Set<Integer> st=s.keySet();
		
		for(int keys:st) {
			
			List<List<String>> l1=s.get(keys);
			
			for(List<String> l2:l1) {
				
				System.out.println(l2);
			}
		}
		
		
	}
}
