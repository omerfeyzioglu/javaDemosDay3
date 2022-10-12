package youTubeDemo;

public class Main {
	public class YouTubeDemo {

		public static void main(String[] args) {
			CreditManager creditManager = new CreditManager();
			creditManager.Calculate();
		}
	}

	class CreditManager {

		public void Calculate() {

			System.out.println("Hesaplandı.");
		}

		public void Save() {

			System.out.println("Kredi verildi.");
		}
		

	}