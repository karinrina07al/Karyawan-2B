public class Karyawan{
	String nama;
	String alamat;
	private int gaji;
	public int getGaji(){
		return this.gaji;
	}
	public void setGaji(int uang){
		this.gaji=uang;
	}
	public void setNama(String nama){
		System.out.println("Nama = "+nama);
	}
	public void setAlamat(String alamat){
		System.out.println("Alamat = "+alamat);
	}
	public void tampilKar(){
		System.out.println("Nama = "+nama);
		System.out.println("Alamat = "+alamat);
		System.out.println("Gaji = "+gaji);

	}
	public void setGaji(int uang, String pesan){
		gaji = uang;
		System.out.println(uang);
		System.out.println(pesan);
	}
}