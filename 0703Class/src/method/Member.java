package method;

public class Member {
	private String email;

	// email getter
	public String getEmail() {
		return email;
	}

	// email의 setter
	public void setEmail(String arg) {
		email = arg;
	}

	private String password;
	private String name;
	private int age;

	public String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 인스턴스 변수들을 출력해주는 메소드
	// 클래스 안에서 클래스에 만들어진 변수를 사용할때는
	// 인스턴스나 클래스 이름을 기재하지 않습니다.
	public void dis() {
		System.out.println("이메일" + email + "\t" + "비밀번호" + password + "\t" + "이름" + name + "\t" + "나이" + age);
	}

	@Override
	public String toString() {
		return "Member [email=" + email + ", password=" + password + ", name=" + name + ", age=" + age + "]";
	}
	//static 메소드 : 클래스 이름으로 호출할 수 있는 메소드
	//매개변수에 ...이 있으면 매개변수 개수에 상관없이 대입가능
	public static int sum(int ... ar) {
		int tot = 0;
		//heep애 있는 데이터를 stack에 저장
		//자주 사용하기 때문에 heep에 있으면 효율이 떨어짐 
		int len = ar.length; //.나오는거는 변수를 넣고 for문을 돌린다.
		for(int i=0;i<len;i=i+1) {
			tot = tot + ar[i];
		}
		return tot;
	}
}
