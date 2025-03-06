// class NullExceptionDemo to demonstrate NullPointerException
class NullExceptionDemo{
	// Method to generate Exeption
	public static void generateNullPointerException () {
		String text = null;
		char textCharacter = text.charAt(0);
	}
	
	// Method to generate and handle Exception
	public static void handleNullPointerException () {
		String text = null;
		try {
			char textCharacter = text.charAt(0);
		} catch (NullPointerException e) {
			System.err.println("NullPointerException caught: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// Call method to generate NullPointerException
		generateNullPointerException();
	}
}