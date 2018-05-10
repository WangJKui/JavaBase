package com.wjk.java.base.thinking.collection.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

class ReversibleArrayList<T> extends ArrayList<T>{
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	
	public Iterable<T> reversed(){
		return new Iterable<T>() {

			public Iterator<T> iterator() {
				
				return new Iterator<T>() {

					int current = size() - 1;
					public boolean hasNext() {
						return current > -1;
					}

					public T next() {
						return get(current--);
					}
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
			
		};
		
	}
}

public class AdapterMethodIdiom {

	public static void main(String[] args) {
		ReversibleArrayList<String> ral = 
				new ReversibleArrayList(
						Arrays.asList("TO BE OR NOT TO BE".split(" ")));
		
		for(String s : ral) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		for (String s : ral.reversed()) {
			System.out.print(s + " ");
		}
		
		/*Map<String, Object> map = new HashMap<String, Object>();
		
		for(Object o :map.keySet()) {
			
		}
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			entry.getKey();
			entry.getValue();
		}*/
	}
	
	
}
