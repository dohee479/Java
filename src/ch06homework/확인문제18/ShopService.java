package ch06homework.확인문제18;

public class ShopService {

	private static ShopService singleton = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return singleton;
	}
	
	
}
