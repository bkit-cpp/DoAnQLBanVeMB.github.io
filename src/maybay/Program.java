package maybay;
import java.util.Scanner;
import java.io.*;
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        KhachHang[]kh=new KhachHang[10];
		QLDanhSachKhachHang ql=new QLDanhSachKhachHang(0,kh);
		ChuyenBay[]cb=new ChuyenBay[20];
		QLDSCHYENBAY qlcb=new QLDSCHYENBAY(0,cb);
		DatVe dv=new DatVe();
		Hangve hv=new Hangve();
		do
		{
			System.out.println("\t\t\t\t ***********************************************\t\t\t\t\t\t");
	System.out.println("\t\t\t\t *        QUAN LY BAN VE MAY BAY               *\t\t\t\t");
System.out.println("\t\t\t\t *        Moi Chon Giao Dich                   * \t\t\t\t");
 System.out.println("\t\t\t\t *        1. Dich Vu Khach Hang                *  \t\t\t\t");
System.out.println("\t\t\t\t *        2. Xem Thong tin Chuyen Bay           *   \t\t\t\t");
System.out.println("\t\t\t\t *        3. Ghi ra File                       *\t\t\t\t");
System.out.println("\t\t\t\t *        4. Thoat                             *\t\t\t\t");
		    System.out.println("\t\t\t\t ***********************************************\t\t\t\t");
		    System.out.println("Moi Nhap lua Chon:");
		    int chon=Integer.parseInt(sc.nextLine());
		switch(chon)
		{
		
		case 1:
			
	     ql.LaPDs(0, kh);
	 
	     break;
		case 2:
	     qlcb.SetList(0, cb);
			break;
		case 3:
			ql.docfile();
		     ql.ghifile();
		case 4:
			System.out.println("See you again");
			break;
		
		}
	}while(true);
	}
}
