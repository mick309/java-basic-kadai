package Price_Chapter08;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		int userAge = 30;
		int serviceCost = 3000;
		switch (userAge) {
		case 10 -> System.out.println("10代の料金は" + serviceCost + "円");
		case 20 -> System.out.println("20代の料金は" + serviceCost + "円");
		case 30 -> System.out.println("30代の料金は" + serviceCost + "円");
		case 40 -> System.out.println("40代の料金は" + serviceCost + "円");
		case 50 -> System.out.println("50代の料金は" + serviceCost + "円");
		case 60 -> System.out.println("60代の料金は" + serviceCost + "円");
		case 70 -> System.out.println("70代の料金は" + serviceCost + "円");
		case 80 -> System.out.println("80代の料金は" + serviceCost + "円");
        
		default   -> System.out.println("それ以外の年代の料金は" + serviceCost + "円");
        }
       
	}

}
