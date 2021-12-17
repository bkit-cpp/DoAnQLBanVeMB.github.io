package maybay;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		
		KhachHang[]kh=new KhachHang[10];
		QLDanhSachKhachHang ql=new QLDanhSachKhachHang();
		DatVe dv=new DatVe();
	     ql.LaPDs(0, kh);
	     dv.input();
			dv.toString();
			dv.tongtienphaitra();
			dv.tongtienphaitra();
	}

}
