package maybay;
import java.util.Scanner;
public class HangMayBay extends MayBay {
	protected  String maHang;
	protected  String tenHang;
	public HangMayBay() {
		
	}
	public HangMayBay(String maHang, String tenHang) {
		
		this.maHang = maHang;
		this.tenHang = tenHang;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public void dauvao()
	{
		super.dauvao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma hang");
		maHang=sc.nextLine();
		System.out.println("Nhap ten hang");
		tenHang=sc.nextLine();
	}
	public String toString()
	{
		super.toString();
		return "mahang:"+maHang+"Ten Hang:"+tenHang;
	}

}
