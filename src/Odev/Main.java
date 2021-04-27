package Odev;

public class Main {

	public static void main(String[] args) {
		
		Courses courses1 = new Courses(1, "Yazýlým Geliþtirici Yetiþtirme Kampý", "C# + Angular", "Ücretsiz"); 
		Courses courses2 = new Courses(2, "Yazýlým Geliþtirici Yetiþtirme Kampý", "Java + React", "Ücretsiz"); 
		Courses courses3 = new Courses(3, "Programlamaya Giriþ Ýçin Temel Kurs", "Programlamadaki Temel bilgilerin Öðretilmesi", "Ücretsiz");
		
		Courses[] courses = {courses1,courses2,courses3};
		
		
		for (Courses course : courses) {
			System.out.print("Kurs Adý : " + course.courseName + "  " + "--- ");
			System.out.print("Kurs Ýçeriði : " + course.content + "  " + "--- ");
			System.out.print("Kurs Ücreti : " + course.price + "  ");
			System.out.println();
			
		}
		
		Category category1 = new Category(22,"Programlama"); 
		
		Category[] categories = {category1};	
		
		for (Category category : categories) {
			System.out.println("Kategoriler : " + category.programming);
		}
		
		Login login1 = new Login(25, "qwerty@gmail.com", "1234"); 
		login1.signIn(); // Giriþ yapma
		
		Login login2 = new Login(25, "Tahir" , "1234","qwerty@gmail.com");
		login2.signUp(); // Kayýt Olma 
	}

}
