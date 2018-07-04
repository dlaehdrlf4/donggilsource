package method;

import java.util.Scanner;

//실행 클래스 -main 메소드를 소유한 클래스
public class Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		//Member 클래스의 인스턴스를 생성
		Member member1 = new Member();
		Scanner sc = new Scanner(System.in);
		//인스턴스 변수를 호출해서 데이터 저장
		System.out.println("이메일:");
		String email = sc.nextLine();
		member1.setEmail(email);
		System.out.println("번호:");
		String password = sc.nextLine();
		member1.setPassword(password);
		System.out.println("이름:");
		String name = sc.nextLine();
		member1.setName(name);
		System.out.println("나이:");
		int age = sc.nextInt();
		member1.setAge(age);
		sc.close();
		
		//member1.dis();
		System.out.println(member1); //제대로 읽어졌는지 안릭어졌는지
		
		
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));
		System.out.println(Member.sum(10,20));
		
		long m = Math.max(100, 200);
		System.out.println(m);	
	}

}
