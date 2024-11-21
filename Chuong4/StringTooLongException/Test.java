package StringTooLongException;

public class Test {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		while (true) {
			try {
				System.out.print("Nhập chuỗi (hoặc nhập DONE để kết thúc): ");
				String input = scanner.nextLine();

				if (input.equalsIgnoreCase("DONE")) {
					System.out.println("Chương trình kết thúc.");
					break;
				}

				if (input.length() > 30) {
					throw new StringTooLongException("Chuỗi quá dài! Độ dài tối đa là 30 ký tự.");
				}

				System.out.println("Chuỗi hợp lệ: " + input);

			} catch (StringTooLongException e) {
				System.out.println("Lỗi: " + e.getMessage());
			}
		}

		scanner.close();
	}
}