package ch06.exam11;

public class Example {

	public static void main(String[] args) {

		User user = new User("앙 ");
		
		// 인스턴스 멤버(필드, 메소드)는 반드시
		// 객체 참조 변수를 통해서 접근
		
		System.out.println(user.name);
		user.login();
		user.logout();
		
		// 정적 멤버(필드, 메소드)는 객체가 없이도 사용가능
		// User는 변수가 아니라 클래스다
		System.out.println(User.nation);
		User.info();
	}

}
