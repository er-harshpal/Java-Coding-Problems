package CollectionFramework.Hashmap;
import java.util.*;
import java.lang.*;

public class frequencyCounting {
	public static void main(String[] args){
		int arr[] = {2,4,5,6,7,5,3,2,1,4,6,7,8,5,3};
		int len = arr.length;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i < len; i++) {
			if(hm.containsKey(arr[i])){
				int currentCount = hm.get(arr[i]);
				hm.put(arr[i], currentCount + 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
	}
}


// Hashmap stores the data as key value pairs
/**
 * 1. Stores date as Key Value pairs
 * HashMap<Integer, String> hm = new HashMap<>()
 * map.put(101, "Harsh");
 *
 * 2. Keys cannot be duplicate
 *
 * 3. Duplicate Values Allowed
 *
 * 4. Allows One null key only the latest one will replace the first one
 *
 * 5. Allow multiple null values
 *
 * 6. Hashmap does not preserve insertion order, sorting order
 *
 * 7. Fast lookup :
 *    avg time complexities-
 *     put() - O1
 *     get() - O1
 *     remove() - O1
 *     containsKey() - O1
 *
 * 8. Use Hashing
 *  key -> hashCode() -> Hash Fashion -> Bucket Index -> Store Entry
 * two most imp method for  key are Hashcode() equals()
 *
 * 9. Not Synchronized
 * Multiple thread can modify it simultaneously
 * hashmap<Integer, String> map = new HashMap<>();
 * this is unsafe
 * for threadsafety use;
 * COllections.synchroniztionMap( new HashMap<>());
 * ConcurrentHashMap
 *
 * 10. Part of Java Collection Framework
 * Object -> ABstractMap -> Hashmap
 *
 * 11. Generic Class
 * HashMap<Integer, String>
 * Hashmap< Employee, Depart >
 * HashMap<String, Integer>
 *
 * 12. Doesn't allow primitive types
 *
 * 13. Automatic Resizing ReHashing
 * use the loadFactor
 *
 * 14. Default Constructor
 * HashMap<Integer, String> map = new HashMap < >()
 *
 * theis creattes
 * capacity 16
 * loadFactor = 0.75
 *
 * 15. Custom Capacity
 * HashMap<Integer, String> map = new HashMap <>(50);
 *
 * 16. Custom Capacity and Custom Load Factor
 * HashMap<Integer, String> map = new HashMap <>(100, 0.8f);
 *
 * 17. Stores Objects as Nodes
 *
 * Node <K, V>
 *     Key
 *     Value
 *     Hash
 *     Next
 *
 * 18. Collision Handling
 * Suppose key1 -> Bucket 5
 * another key also maps to bucket 5
 * then Bucket5-> Node1 > Node2 > Node3
 * THis is called collision
 *
 * 19. Java 8 TreeIfication
 * before j8: Bucket -> LinkedList
 * after j8: If bucketSize>8 and table capacity is 64 then
 *  ->> convert Into RedBlackTree
 *  Search becomes O(Log N)
 *
 * 20. Unpredictable Order
 *
 * 21. Accepts Custom Objects as Keys
 *
 * 22. Allows Heterrogenous Values
 *
 * 23. Fail Fast Iterator
 *
 * 24. Permits null but Uses equals() for Non-Null Keys
 * null key is handled specially.
 * Non-null keys are compared using equals() after matching hashCode().\\
 *
 *
 * put(K key, V value)
 * putIfAbsent(K key, V value)
 * get(Object key)
 * getOrDefault(Object key, V defaultValue)
 * remove(Object key)
 * remove(Object key, Object value)
 * replace(K key, V value)
 * replace(K key, V oldValue, V newValue)
 * containsKey(Object key)
 * containsValue(Object value)
 * size()
 * isEmpty()
 * clear()
 * keySet()
 * values()
 * entrySet()
 * forEach(BiConsumer)
 * compute()
 * computeIfAbsent()
 * computeIfPresent()
 * merge()
 * replaceAll()
 *
 *
 * Interview Rule to Remember
 *
 * When using a custom object as a HashMap key:
 *
 * hashCode() decides which bucket to search.
 * equals() decides which object inside that bucket matches.
 * If two objects are logically equal, they must return the same hashCode().
 * If you override equals(), you should also override hashCode(). Failing to do so breaks the general contract and can cause lookups in hash-based collections like HashMap to fail unexpectedly.
 *
 *
 *
 */