package PartTimeEmployee;

public class Test {
	public static void main(String[] args) {
		PartTimeEmployee ept1 = new PartTimeEmployee("Thanh", 19, 'M', "HaNoi", "20/10/2023", 30);
		System.out.println(ept1.toString());
		PartTimeEmployee ept2 = new PartTimeEmployee();
		ept2.setName("Thanh");
		ept2.setAge(19);
		ept2.setGender('M');
		ept2.setEmpolyerName("Thanh");
		ept2.setDateHired("20/12/2023");
		ept2.setHoursPerWeed(100);
		System.out.println(ept2.getName() + ept2.getAge() + ept2.getGender() + ept2.getEmpolyerName()
				+ ept2.getDateHired() + ept2.getHoursPerWeed());

	}
}