public class Program extends Karyawan{
	public void setGaji(int uang){
		if(uang<=90){
			System.out.println("Selamat Gaji Anda = "+uang);
		}else{
			System.out.println("Maaf Gaji Anda Tidak Sesuai");
		}
	}
}