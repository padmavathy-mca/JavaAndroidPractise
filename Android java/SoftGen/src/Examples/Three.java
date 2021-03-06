package Examples;

public class Three {
	private static final String CLASS_TO_LOAD = "Exceptions.C4";

	public static void main(StringExample[] args) {
		try {
			Class loadedclass = Class.forName(CLASS_TO_LOAD);
			System.out.println("class " + loadedclass + " found successfully");
		} catch (ClassNotFoundException e) {
			System.out.println("A classnotfound exception was caught:"
					+ e.getMessage());
			e.printStackTrace();
		}
	}
}