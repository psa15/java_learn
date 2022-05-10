package sec05_try_with_resources;

public class BigResourceExample {

	public static void main(String[] args) {
		try (BigResource big = new BigResource()) {
			
		}catch (Exception ex) {

		}
	}
}
