package maybay;
import java.util.Arrays;
import java.util.Scanner;
public class KhachHang implements TongCong {
	KhachHang[]kh;
	private  String makhachHang;
	private  String diaChi;
	private  String choNgoi;
	private  String hangVe;
	private  String loaiVe;
	private  int sohanhLi;
	public KhachHang() {
		
	}
	public KhachHang(String makhachHang, String diaChi, String choNgoi, String hangVe, String loaiVe, int  sohanhLi) {
		this.makhachHang = makhachHang;
		this.diaChi = diaChi;
		this.choNgoi = choNgoi;
		this.hangVe = hangVe;
		this.loaiVe = loaiVe;
		this.sohanhLi = sohanhLi;
	}
	public String getMakhachHang() {
		return makhachHang;
	}
	public void setMakhachHang(String makhachHang) {
		this.makhachHang = makhachHang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getChoNgoi() {
		return choNgoi;
	}
	public void setChoNgoi(String choNgoi) {
		this.choNgoi = choNgoi;
	}
	public String getHangVe() {
		return hangVe;
	}
	public void setHangVe(String hangVe) {
		this.hangVe = hangVe;
	}
	public String getLoaiVe() {
		return loaiVe;
	}
	public void setLoaiVe(String loaiVe) {
		this.loaiVe = loaiVe;
	}
	public int getSohanhLi() {
		return sohanhLi;
	}
	public void setSohanhLi(int sohanhLi) {
		this.sohanhLi = sohanhLi;
	}
	
	 public String toString()
	 {
	  return makhachHang+" "+diaChi+" "+choNgoi+" "+loaiVe+" "+hangVe+" "+sohanhLi;
		 
	 }
	
	 public void TongsoNguoi() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Nhap so cho ngoi");
		 int a=Integer.parseInt(sc.nextLine());
		 System.out.println("Nhap so ma khach hang");
		 int b=Integer.parseInt(sc.nextLine());
		 int s=a*b;
		 System.out.println("Tong so hanhKhach:"+s);
	 }
	 
	
}