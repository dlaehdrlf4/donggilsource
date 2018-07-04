package constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pactice pactice1 = new Pactice(); //아무것도 안 넣었을때는 string은 null 정수는 0 boolean은 false
		//pactice1.setName("noname");
		System.out.println(pactice1.getName());
		Pactice pactice2 = new Pactice();
		//pactice2.setName("noname");
		System.out.println(pactice2.getName());
		
		Pactice pactice3 = new Pactice("park"); // 주면 park이 나오고 안주면 noname이 나온다.
		System.out.println(pactice3.getName());
		
		String str = "Hello World";
		int r = str.lastIndexOf("llo");
		System.out.println(r);
		
		String abc = "abacdefghi";
		r = abc.length();
		System.out.println(r);
		
		pactice3.display();
		pactice3.display1();
	}
}
