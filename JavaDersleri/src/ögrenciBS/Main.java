package ögrenciBS;

public class Main {

	public static void main(String[] args) {
		
		Course mat = new Course("Matematik", "MAT101", "MAT");
		Course fizik = new Course("Fizik", "FZK101", "FZK");
		Course kimya = new Course("Kimya", "KMY101", "KMY");

		Teacher t1 = new Teacher("Mahmut Hoca", "111", "MAT");
		Teacher t2 = new Teacher("Fatma Ayşe", "222", "FZK");
		Teacher t3 = new Teacher("Ali Veli", "333", "KMY");
		
		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);
		
		Student s1 = new Student("İnek Şaban", 4, "666", mat,fizik,kimya);
		s1.addBulkExamNote(50,20,40);
		s1.quiz(50,45,70);
		s1.isPass();
		
		Student s2 = new Student("Güdük Necmi", 4, "777", mat, fizik, kimya);
		s2.addBulkExamNote(100,50,40);
		s2.quiz(65,75,30);
		s2.isPass();
		
		Student s3 = new Student("Hayta İsmail", 4, "888", mat, fizik, kimya);
		s3.addBulkExamNote(50,20,70);
		s3.quiz(90,45,70);
		s3.isPass();
				
	}

}
