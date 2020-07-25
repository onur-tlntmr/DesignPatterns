import java.util.ArrayList;

public class Bilgisayar implements Cloneable {

	
	public ArrayList<String> bilesenler;
	
	
	public Bilgisayar() {
		bilesenler = new ArrayList<>();
		bilesenler.add("Kasa");
		bilesenler.add("Monitör");
		bilesenler.add("Klavye");
		bilesenler.add("Fare");
	}
	
	public void ParcaEkle(String parca) {
		bilesenler.add(parca);
	}
	
	
	public void Bastir() {
		for(String parca:bilesenler) {
			System.out.println(parca);
		}
	}
	
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Bilgisayar();
	}

	
	
	
}
