package Odev;

public class Main {

	public static void main(String[] args) {
		
		Courses courses1 = new Courses(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�", "C# + Angular", "�cretsiz"); 
		Courses courses2 = new Courses(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�", "Java + React", "�cretsiz"); 
		Courses courses3 = new Courses(3, "Programlamaya Giri� ��in Temel Kurs", "Programlamadaki Temel bilgilerin ��retilmesi", "�cretsiz");
		
		Courses[] courses = {courses1,courses2,courses3};
		
		
		for (Courses course : courses) {
			System.out.print("Kurs Ad� : " + course.courseName + "  " + "--- ");
			System.out.print("Kurs ��eri�i : " + course.content + "  " + "--- ");
			System.out.print("Kurs �creti : " + course.price + "  ");
			System.out.println();
			
		}
		
		Category category1 = new Category(22,"Programlama"); 
		
		Category[] categories = {category1};	
		
		for (Category category : categories) {
			System.out.println("Kategoriler : " + category.programming);
		}
		
		Login login1 = new Login(25, "qwerty@gmail.com", "1234"); 
		login1.signIn(); // Giri� yapma
		
		Login login2 = new Login(25, "Tahir" , "1234","qwerty@gmail.com");
		login2.signUp(); // Kay�t Olma 
	}

}
