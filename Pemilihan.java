package StudentTeacher;

import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih posisi anda sekarang = \n 1. Murid \n 2. Guru");
        int pilihan = in.nextInt();
        if (pilihan == 1) {
            System.out.println("Name = ");
            String name = in.nextLine();
            System.out.println("Major = ");
            String Major = in.next();
            System.out.println("Age = ");
            int age = in.nextInt();
            System.out.println("Absen = ");
            int Absen = in. nextInt();
            System.out.println("Score = ");
            int Score = in.nextInt();
            Student Student1 = new Student(name, age, Major , Absen, Score);
            Student1.print();
        } else if (pilihan == 2) {
            System.out.println("Karyawan = \n 1. Fulltime \n 2. Parttime");
            int milih = in.nextInt();
            if (milih == 1) {
                System.out.println("Name = ");
                String name = in.nextLine();
                System.out.println("Subject");
                String Subject = in.next();
                System.out.println("Unit = ");
                String Unit = in.next();
                System.out.println("Age = ");
                int age = in.nextInt();
                System.out.println("Gaji Pertahun = ");
                int gaji_tahunan = in.nextInt();
                Fulltime Fulltime1 = new Fulltime(name, age, Subject, gaji_tahunan, Unit);
                Fulltime1.print();
            }else if  (milih == 2){
                System.out.println("Name = ");
                String name = in.nextLine();
                System.out.println("Subject = ");
                String Subject = in.next();
                System.out.println("Unit = ");
                String Unit = in.next();
                System.out.println("Age = ");
                int age = in.nextInt();
                System.out.println("Gaji per-jam = ");
                int set_salarry = in.nextInt();
                PartTime PartTime1 = new PartTime(name, age, Subject, set_salarry, Unit);
                PartTime1.print();
            } System.out.println("Maaf inputan anda salah");

        } System.out.println("Maaf inputan anda salah");
    }

}
