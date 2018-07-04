package constructor;

public class Pactice {
	//가장 처음에 한 번만 수행됩니다.
	static {
		System.out.println("맨처음 한번만 수행");
	}
	// new Pactice 할 때마다 수행됩니다.
	{
		System.out.println("인스턴스를 만들때 마다 수행되는 내용");
	}
	
	//생성자
	public Pactice() {
		name = "noname";
	}
	//생성자 오버로딩(동일한 이름의 메소드가 2개 이상 있는 경우) - 위에 Pactice 와 밑에 Pactice의 메소드 이름이 같음 이걸 오버로딩이라고 함
	public Pactice(String arg){
		name = arg;
	}
	
	//이름을 저장하기 위한 인스턴스 변수를 선언
		private String name;
		//name의 접근자 메소드

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public void display() {
			String name = "지역변수 name";
			System.out.println(name); // this 안붙였을 때는 위의 name에 값을 가져옴
		}
		//this.을 붙이면 지역변수에서는 찾지 않고 인스턴스 변수에서 찾아옵니다
		public void display1() {
			String name = "지역변수 name";
			System.out.println(this.name); // this.name을 하면 stack에 있는 지역변수 name이 아닌 멀리 있는 인스턴스 변수 name을 가져와서 출력해준다.
			
			
		}
}
