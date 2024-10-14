package StudentTeacher;

public class Student extends Person {
    private String Major;
    private int absen;
    private int score;

	public String getMajor() {
		return this.Major;
	}

	public void setMajor(String Major) {
		this.Major = Major;
	}

	public int getAbsen() {
		return this.absen;
	}

	public void setAbsen(int absen) {
		this.absen = absen;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}
    public Student(){
        super();
        Major = "";
        absen =0;
        score =0;
    }
    public Student(String name, int age, String Major, int absen, int score){
        super(name, age);
        this.Major = Major;
        this.absen = absen;
        this.score = score;

    }
    public void print (){
        super.print();
        System.out.println("Major = " + Major);
        System.out.println("Absen = " + absen);
        System.out.println("Score = " + score);
    }


    
    
}
