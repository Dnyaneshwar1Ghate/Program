package Basic;

public class PatternExample {
	public static void main(String[] args) {

		String input = "java";
		StringBuilder output = new StringBuilder();

		// First character
		output.append(input.charAt(0));

		int hashCount = 1;

		// Remaining characters
		for (int i = 1; i < input.length(); i++) {
			for (int j = 0; j < hashCount; j++) {
				output.append("#");
			}
			output.append(input.charAt(i));
			hashCount++;
		}

		// Extra #### after last character
		for (int i = 0; i < hashCount; i++) {
			output.append("#");
		}

		System.out.println(output);
	}
}
