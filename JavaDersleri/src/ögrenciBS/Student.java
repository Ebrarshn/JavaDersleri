package ögrenciBS;

public class Student {

	String name,stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double avarage;
	boolean isPass;
	
	Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya){
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		calcAvarage();
		this.isPass = false;
	
	}
	
	public void addBulkExamNote(int mat, int fizik, int kimya) {
		
		if (mat >= 0 && mat <=100) {
			this.mat.note = mat;
		}
		
		if (fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
		}
		
		if (kimya >= 0 && kimya <= 100) {
			this.kimya.note=kimya;
		}
	}
	
	public void isPass() {
		if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
			System.out.println("Notlar tam olarak girilmemiş");
		}else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Ortalama : " + this.avarage);
			if (this.isPass) {
				System.out.println("Sınıfı geçti");
			}else {
				System.out.println("Sınıfta kaldı");
			}
		}
	}
	
	public void calcAvarage() {
		this.avarage = ((this.fizik.note*0.8 + this.fizik.quiz*0.2) + (this.kimya.note*0.8 + this.kimya.quiz*0.2 )+ (this.mat.note*0.8 + this.mat.quiz*0.2))/3;
	}
	
	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}
	
	public void printNote() {
		System.out.println("--------------");
		System.out.println("Öğrenci : " + this.name);
		System.out.println("Matematik notu : " + this.mat.note + "  Sözlüsü : " + this.mat.quiz);
		System.out.println("fizik notu : " + this.fizik.note + "  Sözlüsü : " + this.fizik.quiz);
		System.out.println("kimya notu : " + this.kimya.note + "  Sözlüsü : " + this.kimya.quiz);
		
	}

	public void quiz(int mat, int kimya, int fizik) {
		if (mat >= 0 && mat <=100) {
			this.mat.quiz = mat;
		}
		
		if (fizik >= 0 && fizik <= 100) {
			this.fizik.quiz = fizik;
		}
		
		if (kimya >= 0 && kimya <= 100) {
			this.kimya.quiz = kimya;
		}
	}
}
