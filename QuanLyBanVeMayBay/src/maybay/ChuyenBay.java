package maybay;
import java.util.Scanner;
public class ChuyenBay extends TuyenBay {
	protected  String machuyenBay;
	protected String noiDi;
	protected String noiDen;
	protected String ngaykhoiHanh;
	protected  String cong;
	public ChuyenBay() {
		
	}
	public ChuyenBay(String machuyenBay, String noiDi, String noiDen, String ngaykhoiHanh, String cong) {
		this.machuyenBay = machuyenBay;
		this.noiDi = noiDi;
		this.noiDen = noiDen;
		this.ngaykhoiHanh = ngaykhoiHanh;
		this.cong = cong;
	}
	public String getMachuyenBay() {
		return machuyenBay;
	}
	public void setMachuyenBay(String machuyenBay) {
		this.machuyenBay = machuyenBay;
	}
	public String getNoiDi() {
		return noiDi;
	}
	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public String getNgaykhoiHanh() {
		return ngaykhoiHanh;
	}
	public void setNgaykhoiHanh(String ngaykhoiHanh) {
		this.ngaykhoiHanh = ngaykhoiHanh;
	}
	public String getCong() {
		return cong;
	}
	public void setCong(String cong) {
		this.cong = cong;
	}
public void nhap()
{
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap ma chuyen bay");
	machuyenBay=sc.nextLine();
	System.out.println("Nhap noi di:");
	noiDi=sc.nextLine();
	System.out.println("Nhap noi den:");
	noiDen=sc.nextLine();
	System.out.println("Nhap ngay khoi hanh");
	ngaykhoiHanh=sc.nextLine();
	System.out.println("Nhap cong");
	cong=sc.nextLine();
	
}
public String toString()
{
	super.toString();
	return "Ma Chuyen Bay:"+machuyenBay+"noiDi:"+noiDi+"noiDen:"+noiDen+"ngaykhoiHanh:"+ngaykhoiHanh+"Cong:"+cong;
}

}
