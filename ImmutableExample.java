/**
 * 
 */

/**
 * @author e075269
 *
 */
public final class ImmutableExample {

	final String myVarable;

	ImmutableExample(String myVal) {
		this.myVarable = myVal;
	}

	public String getMyVariable() {
		return myVarable;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ImmutableExample i = new ImmutableExample("test");
		System.out.println(i);
		
		i= new ImmutableExample("test");
		System.out.println(i);
		
		ImmutableExample i2 = new ImmutableExample("rtue");
		System.out.println(i2.getMyVariable());
	}

}
