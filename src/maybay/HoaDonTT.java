
package maybay;
import java.util.Scanner;
public abstract class HoaDonTT extends DonGia {
protected float thanhTien;

	
	public HoaDonTT() {
		
	}


	public HoaDonTT(float thanhTien) {
		this.thanhTien = thanhTien;
	}


	public float getThanhTien() {
		return thanhTien;
	}


	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc=new Scanner(System.in);
	 System.out.println("Nhap Thanh Tien");
	 thanhTien=Float.parseFloat(sc.nextLine());
	}
	public  void Tongdoanhthu(){}
	public String toString()
	{
		super.toString();
		return "Thanh Tien:"+thanhTien;
	}
	

}
