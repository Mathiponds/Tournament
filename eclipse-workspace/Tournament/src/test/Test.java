package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
	ArrayList<Integer> tmp = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		List<Integer> tmp2 = tmp.subList(0, 3);
//		Collections.shuffle(tmp.subList(0, 3));
//		System.out.println(tmp);
	ArrayList<Integer> tmp2 = new ArrayList<>();
	for(int i : tmp)
		tmp2.add(i);
	tmp.add(1,3);
	System.out.println(tmp);
	System.out.println(tmp2);
		
	}
}
