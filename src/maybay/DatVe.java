package maybay;
import java.util.Scanner;
public class DatVe extends VeChuyenBay{
	protected int ngaydatVe;
	protected String maphieuDat;
	protected int soGhe;
	public DatVe() {
		
	}
	public DatVe(int ngaydatVe, String maphieuDat, int soGhe) {
		super();
		this.ngaydatVe = ngaydatVe;
		this.maphieuDat = maphieuDat;
		this.soGhe = soGhe;
		
	}
	public int getNgaydatVe() {
		return ngaydatVe;
	}
	public void setNgaydatVe(int ngaydatVe) {
		this.ngaydatVe = ngaydatVe;
	}
	public String getMaphieuDat() {
		return maphieuDat;
	}
	public void setMaphieuDat(String maphieuDat) {
		this.maphieuDat = maphieuDat;
	}
	public int getSoGhe() {
		return soGhe;
	}
	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}
	
	public void input()
	{
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ngay dat ve");
		ngaydatVe=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ma phieu dat");
		maphieuDat=sc.nextLine();
		System.out.println("Nhap so ghe");
		soGhe=Integer.parseInt(sc.nextLine());
	}
	public void Datvetruoc()
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Nhap vao so ghe can ");
		a=Integer.parseInt(sc.nextLine());
		if(a>soGhe)
		{
			System.out.println("Vuot qua so luong duoc phep");
		}
		else
		{
			
			System.out.println("OK");
		}
		
	}
	@Override
	public void tongtienphaitra()
	{
		System.out.println(" So tien phai tra:");
		float s;
		s=(super.giave+super.phidichvu+super.phiquantri+super.phisanbay)*soGhe;
		System.out.println("Ket qua:"+s);
		
	}
	public String toString()

	{
		return "ngaydatve:"+ngaydatVe+"maphieudat:"+maphieuDat+"soghe:"+soGhe;
	}
	
}
