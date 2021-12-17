package maybay;
import java.util.Scanner;
public  class MayBay {
	protected  String mamayBay;
	protected  String loaimayBay;
	protected   String tinhTrang;
	public MayBay() {
		
	}
	public MayBay(String mamayBay, String loaimayBay, String tinhTrang) {
		this.mamayBay = mamayBay;
		this.loaimayBay = loaimayBay;
		this.tinhTrang = tinhTrang;
	}
	public String getMamayBay() {
		return mamayBay;
	}
	public void setMamayBay(String mamayBay) {
		this.mamayBay = mamayBay;
	}
	public String getLoaimayBay() {
		return loaimayBay;
	}
	public void setLoaimayBay(String loaimayBay) {
		this.loaimayBay = loaimayBay;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public  void dauvao()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma may bay");
		mamayBay=sc.nextLine();
		System.out.println("Nhap loai may bay");
		loaimayBay=sc.nextLine();
		System.out.println("Nhap tinh trang");
		tinhTrang=sc.nextLine();
	}
	
	public  void daura()
	{
		System.out.println("Ma may bay"+mamayBay);
		System.out.println("Loai may bay:"+loaimayBay);
		System.out.println("Tinh trang:"+tinhTrang);
		
	}
	
	
	
}
