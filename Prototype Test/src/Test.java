
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Bilgisayar mdl = new Bilgisayar();
			
			Bilgisayar b1 = (Bilgisayar) mdl.clone();
			
			b1.ParcaEkle("Yaz�c�");
			b1.ParcaEkle("Hoperl�r");
			
			
			b1.Bastir();
			System.out.println("\n\nBilgisayar 2\n\n");
			Bilgisayar b2 = (Bilgisayar) mdl.clone();
			
			b2.ParcaEkle("Kamera");
			b2.ParcaEkle("Kulakl�k");
			
			b2.Bastir();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
