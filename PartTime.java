package StudentTeacher;

public class PartTime extends Teacher{
    int set_salarry;
    String unit;

    public int getSet_salarry() {
        return this.set_salarry;
    }

    public void setSet_salarry(int set_salarry) {
        this.set_salarry = set_salarry;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public PartTime (){
        super();
        set_salarry =0;
        unit = "";

    }
    public PartTime (String name, int age, String subject, int set_salarry, String unit ){
        super(name, age, subject);
        this.set_salarry = set_salarry;
        this.unit = unit;
    }
    public void print (){
        super.print();
        System.out.println("Masukkan gaji tiap jam = " + set_salarry);
        System.out.println("MAsukkan unit kerja = " + unit);
    }


    
}
