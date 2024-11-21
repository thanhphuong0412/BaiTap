package LuongLaoDong;

public class Test {

	public class Main {
		public static void main(String[] args) {
			LaoDongPhoThong laoDongPhoThong = new LaoDongPhoThong("Nguyen Van A", "Ha Noi", 20);
			laoDongPhoThong.inThongTin();

			System.out.println();

			KiSu kiSu = new KiSu("Nguyen Thi B", "Ha Noi", 25, 2.5, 5000000);
			kiSu.inThongTin();
		}
	}

}