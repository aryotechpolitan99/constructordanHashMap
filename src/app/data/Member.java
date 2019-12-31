package app.data;
 
public class Member{ // abstaract class tidak bisa dibuat objectnya
	private String idMember;
	private String namaMember;
	private String ttl;
	
	public Member(String id, String nama, String ttl){
		this.idMember = id;
		this.namaMember = nama;
		this.ttl = ttl;
	}
	
	public void setidMember(String id){ //concrete method
		this.idMember = id;
	}
	
	public String getidMember(){
		return idMember;
	}
	
	public void setnamaMember(String nama){ //concrete method
		this.namaMember = nama;
	}
	
	public String getnamaMember(){
		return namaMember;
	}
	
	public void setttl(String ttl){ //concrete method
		this.ttl = ttl;
	}
	
	public String getttl(){
		return ttl;
	}
}