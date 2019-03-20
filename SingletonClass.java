/**
 * 
 */

/**
 * @author e075269
 *
 */
public class SingletonClass {

	private static SingletonClass myVarable;

	static {
		myVarable = new SingletonClass();
	}

	public static SingletonClass getSingletonObject() {
		return myVarable;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
