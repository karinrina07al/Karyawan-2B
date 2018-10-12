public class Desain extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Selamat Gaji Anda = "+gaji);
		}else{
			System.out.println("Maaf Gaji Anda Tidak Sesuai");
		}
	}
}