
public class TatuPatu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Testi!");
		int aloitus=1;
		int lopetus=100;
		for(int i = aloitus; i< (lopetus+1); ++i) {
			boolean jaollinenkolmella = false;
			boolean jaollinenviidella = false;
			boolean jaollinenmolemmilla = false;
			if (i%3 == 0) {
				jaollinenkolmella = true;
			}
			if (i%5 == 0) {
				jaollinenviidella = true;
			}
			if (jaollinenkolmella && jaollinenviidella) {
				jaollinenmolemmilla = true;
			}
			if (jaollinenmolemmilla) {
				System.out.println("TatuPatu");
			}
			else {
				if (jaollinenviidella) {
					System.out.println("Patu");
				}
				else {
					if (jaollinenkolmella) {
						System.out.println("Tatu");
					}
					else {
						System.out.println(i);
					}
				}
			}
			
		}
	}

}
