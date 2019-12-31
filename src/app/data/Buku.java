package app.data;

public class Buku{
	private String judulBuku;
	private String ISBN;
	private String penulis;
	private String penerbit;
	private int jumlahHalaman;
	
	public Buku(String judul, String isbn, String penulis, String penerbit, int halaman){
		this.judulBuku = judul;
		this.ISBN = isbn;
		this.penulis = penulis;
		this.penerbit = penerbit;
		this.jumlahHalaman = halaman;
	}
	
	public void setjudulBuku(String judulBuku){
		this.judulBuku = judulBuku;
	}
	
	public String getjudulBuku(){
		return judulBuku;
	}
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	
	public String getISBN(){
		return ISBN;
	}
	
	public void setpenulis(String penulis){
		this.penulis = penulis;
	}
	
	public String getpenulis(){
		return penulis;
	}
	
	public void setpenerbit(String penerbit){
		this.penerbit = penerbit;
	}
	
	public String getpenerbit(){
		return penerbit;
	}
	
	public void setjumlahHalaman(int jumlahHalaman){
		this.jumlahHalaman = jumlahHalaman;
	}
	
	public int getjumlahHalaman(){
		return jumlahHalaman;
	}
}


