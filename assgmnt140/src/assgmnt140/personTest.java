package assgmnt140;

public class personTest {

	public static void main(String[] args) {
			Person p1 = new Person("Ahmad", "Ali");
			Person p2 = new Person("Rakan", "Rakan", "0544199659", 10000);
			Person p3 = new Person("Khaled", "Mhamad", "055555555", 20000);
			
			System.out.println("Person Count is : " + Person.getCount());
			Person.PrintInfoLineHeader();
			p1.PrintInfoLine();
			p2.PrintInfoLine();
			p3.PrintInfoLine();
			
			p1.Salary=1000;
			
			p1.increaseSalary(0.5);
			        			
			p1.PrintPersonInfo();
						
			p3.increaseSalary(-0.3);
			
			p3.PrintPersonInfo();
	}

}
