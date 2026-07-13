package StandAloneConcepts;// Wrapper class is an object representation of a primitive datatype

/**
 * Java was completely obj oriented except for primitive datatypes.
 * Many APIs work only with objects
 * ex: Collection, Generics, Reflection, Serialization, Streams and Synchronization utilities.
 *
 * Wrong Example:
 *  ArrayList<int>list = new ArrayList<>();
 * Right Example:
 *  ArrayList<Integer> list = new ArrayList<>();
 *
 *
 * Primitive to wrapper:
 * byte - Byte
 * int - Integer
 * short - Short
 * long - Long
 * float - Float
 * double - Double
 * char - Character
 * boolean - Boolean
 *
 *
 * Memory representation:
 * Primitives:
 * Stack -> x=10
 * Wrapper:
 * Stack -> obj -> Heap -> Integer Object -> value = 10
 *
 *
 * Wrapper Classes are immutable like for example:
 * Integer x = 10;
 * x = x + 5;
 * Here 10 will not become 15 but it will create a new reference of 15 and 10(obj) will be ready for garbage collector
 *
 *
 * Topic	Key Point
 * Wrapper Class ->	Object representation of a primitive
 * Autoboxing	Primitive → Wrapper (automatic)
 * Unboxing	Wrapper → Primitive (automatic)
 * valueOf()	-> Returns wrapper object
 * parseInt()	-> Returns primitive int
 * ==	-> Compares references
 * equals()	-> Compares values
 * Integer Cache ->	-128 to 127 cached by default
 * Immutable ->	Wrapper objects cannot be modified after creation
 * new Integer() ->	Deprecated; avoid using it
 * Null Unboxing	-> Can throw NullPointerException
 * Collections	-> Require wrapper classes because they store objects
 * Generics	-> Accept only reference types, not primitives
 */
import java.util.*;
public class WrapperClass{

		public static void main(String[] args) {

			// =====================================================
			// 1. Primitive vs Wrapper
			// =====================================================
			int primitive = 100;
			Integer wrapper = Integer.valueOf(100);

			System.out.println("Primitive : " + primitive);
			System.out.println("Wrapper   : " + wrapper);

			// =====================================================
			// 2. Autoboxing
			// =====================================================
			Integer autoBox = 50;      // int -> Integer
			System.out.println("\nAutoboxing : " + autoBox);

			// =====================================================
			// 3. Unboxing
			// =====================================================
			int unbox = autoBox;       // Integer -> int
			System.out.println("Unboxing  : " + unbox);

			// =====================================================
			// 4. parseInt() vs valueOf()
			// =====================================================
			int num1 = Integer.parseInt("500");
			Integer num2 = Integer.valueOf("500");

			System.out.println("\nparseInt() returns : " + num1);
			System.out.println("valueOf() returns  : " + num2);

			// =====================================================
			// 5. Integer Cache
			// =====================================================
			Integer a = 127;
			Integer b = 127;

			Integer c = 128;
			Integer d = 128;

			System.out.println("\n127 == 127 : " + (a == b));
			System.out.println("128 == 128 : " + (c == d));

			// =====================================================
			// 6. equals() vs ==
			// =====================================================
			Integer x = 200;
			Integer y = 200;

			System.out.println("\nx == y      : " + (x == y));
			System.out.println("x.equals(y) : " + x.equals(y));

			// =====================================================
			// 7. Immutability
			// =====================================================
			Integer salary = 5000;

			System.out.println("\nBefore Increment : " + salary);

			salary = salary + 1000;

			System.out.println("After Increment  : " + salary);

			// =====================================================
			// 8. Useful Integer Methods
			// =====================================================
			System.out.println("\nMax      : " + Integer.max(20, 40));
			System.out.println("Min      : " + Integer.min(20, 40));
			System.out.println("Sum      : " + Integer.sum(20, 40));
			System.out.println("Compare  : " + Integer.compare(20, 40));
			System.out.println("HashCode : " + Integer.hashCode(100));

			// =====================================================
			// 9. Wrapper to Primitive
			// =====================================================
			Integer marks = 95;
			int primitiveMarks = marks.intValue();

			System.out.println("\nPrimitive Marks : " + primitiveMarks);

			// =====================================================
			// 10. Character Wrapper
			// =====================================================
			char ch = 'A';

			System.out.println("\nIs Letter : " + Character.isLetter(ch));
			System.out.println("Is Digit  : " + Character.isDigit(ch));
			System.out.println("UpperCase : " + Character.isUpperCase(ch));
			System.out.println("LowerCase : " + Character.toLowerCase(ch));

			// =====================================================
			// 11. Boolean Wrapper
			// =====================================================
			Boolean bool = Boolean.parseBoolean("true");

			System.out.println("\nBoolean : " + bool);

			// =====================================================
			// 12. Double Wrapper
			// =====================================================
			Double pi = Double.parseDouble("3.14159");

			System.out.println("Double : " + pi);

			// =====================================================
			// 13. Collections Need Wrappers
			// =====================================================
			List<Integer> list = new ArrayList<>();

			list.add(10);     // Autoboxing
			list.add(20);
			list.add(30);

			System.out.println("\nArrayList : " + list);

			// =====================================================
			// 14. Loop (Automatic Unboxing)
			// =====================================================
			int sum = 0;

			for (Integer value : list) {
				sum += value;
			}

			System.out.println("Sum : " + sum);

			// =====================================================
			// 15. Null Unboxing
			// =====================================================
			Integer n = null;

			try {
				int value = n;          // Automatic unboxing
				System.out.println(value);
			} catch (NullPointerException e) {
				System.out.println("\nNullPointerException while unboxing");
			}

			// =====================================================
			// 16. toString()
			// =====================================================
			String str = Integer.toString(999);

			System.out.println("\nString : " + str);

			// =====================================================
			// 17. Wrapper Arithmetic
			// =====================================================
			Integer p = 20;
			Integer q = 30;

			Integer result = p + q;

			System.out.println("\nWrapper Addition : " + result);
		}
	}

