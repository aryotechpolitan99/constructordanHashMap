package app;
import app.data.Member;
import app.data.Buku;
import java.util.HashMap;

public class Program{
	
	public static void main(String[] args){
		/*Buku buku1 = new Buku();
		buku1.setjudulBuku("Sang Juara");
		
		System.out.println(buku1.getjudulBuku());
		
		
		HashMap<String,String> people = new HashMap<String,String>();
		people.put("p001", "Ali");
		people.put("p002", "Ade");
		
		System.out.println(people.get("p002"));
		*/
		
		HashMap <String,Buku> lemariBuku = new HashMap <String,Buku>();
		lemariBuku.put("978-3-16-148410-0", new Buku("Sang Juara", "978-3-16-148410-0", "Imam", "Print", 250));
		lemariBuku.put("978-3-16-148410-0", new Buku("Sang Idola", "978-3-16-148410-1", "Imam", "Print", 300));
		
		Buku buku1 = lemariBuku.get("978-3-16-148410-0");
		
		HashMap <String,Member> dataMember = new HashMap <String,Member>();
		dataMember.put("M0001", new Member("M0001", "Imam", "BSD, 1 January 2000"));
		dataMember.put("M0002", new Member("M0002", "Ade", "BSD, 12 January 2001"));
		
		Member member1 = dataMember.get("M0001");
		
		int no = 1;
		//foreach data buku dari lemari buku berdasarkan key
		for (String key : lemariBuku.keySet()){
			
			String judul = lemariBuku.get(key).getjudulBuku();
			String isbn = lemariBuku.get(key).getISBN();
			String penulis = lemariBuku.get(key).getpenulis();
			String penerbit = lemariBuku.get(key).getpenerbit();
			
			
			System.out.println("No	: "+no++);
			System.out.println("Judul	: "+judul);
			System.out.println("ISBN	: "+isbn);
			System.out.println("Penulis	: "+penulis);
			System.out.println("Penerbit	: "+penerbit);
			System.out.println();
		}
		
		for (String key : dataMember.keySet()){
			String id = dataMember.get(key).getidMember();
			String nama = dataMember.get(key).getnamaMember();
			String ttl = dataMember.get(key).getttl();
			
			System.out.println("No	: "+no++);
			System.out.println("ID Member	: "+id);
			System.out.println("Nama Member	: "+nama);
			System.out.println("Tempat Tgl Lahir	: "+ttl);
			System.out.println();
		}
	}
}