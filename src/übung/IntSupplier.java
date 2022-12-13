package übung;

public interface IntSupplier {

	public int würf();
	
	default int getAsInt() {
		return würf();
	}
	
}
