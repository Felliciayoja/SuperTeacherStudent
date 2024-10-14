package StudentTeacher;

public class Fulltime extends Teacher{
    private int gaji_tahunan;
    private String unit;

	public int getGaji_tahunan() {
		return this.gaji_tahunan;
	}

	public void setGaji_tahunan(int gaji_tahunan) {
		this.gaji_tahunan = gaji_tahunan;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
    public Fulltime (){
        super();
        gaji_tahunan =0;
        unit = "";

    }
    public Fulltime (String name, int age, String subject, int gaji_tahunan, String unit){
        super(name, age, subject);
        this.gaji_tahunan = gaji_tahunan;
        this.unit = unit;
        
    }
    public void print (){
        super.print();
        System.out.println(" Masukkan Gaji tiap bulan = " + gaji_tahunan);
        System.out.println("Masukkan tempat unit = " + unit);
    }

    
    
}
