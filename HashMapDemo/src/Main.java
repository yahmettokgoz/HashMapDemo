import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("book", "kitap");
		sozluk.put("table", "masa");
		sozluk.put("computer", "bilgisayar");
		System.out.println(sozluk);
		System.out.println(sozluk.get("table")); // sağ taraf değer sol taraf anahtar kelime görevi

		for(String item:sozluk.keySet()) {
			System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
		}
		
		
	}

}
