package ch06homework.확인문제18;

public class ShopServiceExample {

	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 객체 입니다");
		} else {
			System.out.println("다른 객체 입니다");
		}
	}

}
