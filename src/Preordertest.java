import java.util.Arrays;

public class Preordertest {
	public static void main(String[] args) {
		int num[] = {5, 8, 9, 3, 7, 6, 1, 3};

		// Seřazení (nic nevrací)
		Arrays.sort(num);

		// Vytisknutí seřazeného pole
		System.out.println(Arrays.toString(num));
	}
}