package Odev;

public class Login {
	
	int id;
	String userName;
	String email;
	String password;
	
	public Login() {
		
	}
	
	public Login(int id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public Login(int id, String userName, String password, String email) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	
	
	public void signIn() {
		System.out.println("Giriþ Yapýldý...");
	}
	
	public void signUp() {
		System.out.println("Kayýt Olundu...");
	}

}
