public class TKaryawan{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Projek Manager");
	ProjekManager pm = new ProjekManager();
	pm.setNama("Karina Jaya Mahudi");
	pm.setAlamat("Bandung");
	pm.setGaji(90);
	System.out.println(" ");

	System.out.println("Jabatan Programmer");
	Program pr = new Program();
	pr.setNama("Ayu Amalayah");
	pr.setAlamat("Brebes");
	pr.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Riskah");
	d.setAlamat("Balongan");
	d.setGaji(50);
	}
}