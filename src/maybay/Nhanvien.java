package maybay;
import java.util.Scanner;
public class Nhanvien  {
protected  String manhanVien;
protected   String TennhanVien;
	
	public Nhanvien() {
		
	}


	public Nhanvien(String manhanVien,String TennhanVien) {
		this.manhanVien = manhanVien;
		this.TennhanVien=TennhanVien;
	}


	public String getManhanVien() {
		return manhanVien;
	}


	public void setManhanVien(String manhanVien) {
		this.manhanVien = manhanVien;
	}
    public  void nhap()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Nhap vao ma nhan vien");
    	manhanVien=sc.nextLine();
    	System.out.println("Nhap vao ten nhan vien");
    	TennhanVien=sc.nextLine();
    }
    public String toString()
    {
    	return manhanVien+" "+TennhanVien;
    }

}
