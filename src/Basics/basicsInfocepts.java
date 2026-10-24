package Basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class basicsInfocepts {

	static Set<Integer> duplicates(int[] a){
		Set<Integer> seen = new HashSet<>();
		Set<Integer> dup = new LinkedHashSet<>();

		for(int x : a) {
			if(!seen.add(x))
				dup.add(x);
		}
		return dup;
	}
}
