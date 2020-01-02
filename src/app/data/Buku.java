package app.data;

public class Buku{
	private String judulBuku;
	private String ISBN;
	private String penulis;
	private String penerbit;
	private int jumlahHalaman;
	private int tahunTerbit;
	private int Stock;
	
	public Buku(String judul, String isbn, String penulis, String penerbit, int halaman, int tahun, int stock){
		this.judulBuku = judul;
		this.ISBN = isbn;
		this.penulis = penulis;
		this.penerbit = penerbit;
		this.jumlahHalaman = halaman;
		this.tahunTerbit = tahun;
		this.Stock = stock;
		
	}
	
	public void setjudulBuku(String judul){
		this.judulBuku = judul;
	}
	
	public String getjudulBuku(){
		return judulBuku;
	}
	
	public void setISBN(String isbn){
		this.ISBN = isbn;
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
	
	public void setjumlahHalaman(int halaman){
		this.jumlahHalaman = halaman;
	}
	
	public int getjumlahHalaman(){
		return jumlahHalaman;
	}
	
	public void settahunTerbit(int tahun){
		this.tahunTerbit = tahun;
	}
	
	public int gettahunTerbit(){
		return tahunTerbit;
	}
	
	public void setStock(int stock){
		this.Stock = stock;
	}
	
	public int getStock(){
		return Stock;
	}
	
	public void Dipinjam(){
		this.Stock--;
	}
}


