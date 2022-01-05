package maybay;
import java.util.Scanner;
public abstract class VeChuyenBay extends KhachHang{
	protected String maVe;
	 protected String tinhtrangVe;
	 protected String loaiVe;
	 protected float giave;
	 protected float VAT;
	 protected float phiquantri;
	 protected float phidichvu;
	 protected float phisanbay;
	public VeChuyenBay() {
		
	}
	public VeChuyenBay(String maVe, String tinhtrangVe, String loaiVe,float giave, float VAT,float phiquantri, float phidichvu, float phisanbay ) {
		this.maVe = maVe;
		this.tinhtrangVe = tinhtrangVe;
		this.loaiVe = loaiVe;
		this.giave=giave;
		this.VAT=VAT;
		this.phiquantri=phiquantri;
		this.phidichvu=phidichvu;
		this.phisanbay=phisanbay;
		}
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	
	public String getLoaiVe() {
		return loaiVe;
	}
	public void setLoaiVe(String loaiVe) {
		this.loaiVe = loaiVe;
	}
	public float getgiave()
	{
		return giave;
	}
	public void setgiave(float giave)
	{
		this.giave=giave;
	}
	public float getVAT()
	{
		return VAT;
	}
	public void setVAT(float VAT)
	{
		this.VAT=VAT;
	}
	public float getphiquantri()
	{
		return phiquantri;
	}
	public void setphiquantri(float phiquantri)
	{
		this.phiquantri=phiquantri;
	}
	public float getphidichvu()
	{
		return phidichvu;
	}
	public void setphidichvu(float phidichvu)
	{
		this.phidichvu=phidichvu;
	}
	public float getphisanbay()
	{
		return phisanbay;
	}
	public void setphisanbay(float phisanbay)
	{
		this.phisanbay=phisanbay;
	}
	public void nhap() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Moi nhap ma ve ");
		maVe=sc.nextLine();
		System.out.println("Moi loai ve ");
		loaiVe=sc.nextLine();
		System.out.println("Moi nhap tinh trang ve ");
		tinhtrangVe=sc.nextLine();
		System.out.println("Nhap gia ve");
		giave=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap phi VAT");
		VAT=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap phi dich vu: ");
		phidichvu=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap phi san bay:");
		phisanbay=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap phi quan tri:");
		phiquantri=Float.parseFloat(sc.nextLine());
		
			}
	public abstract void tongtienphaitra();
	public String toString() {
		
		return "ma ve "+maVe+" loai ve "+loaiVe+" tinh trang ve "+tinhtrangVe+"giave:"+giave+"VAT:"+VAT+"phi dich vu:"+phidichvu+"phi san bay:"+phisanbay+"phi dich vu:"+phidichvu;
	}
	
	public boolean checkve(String s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma ve ");
		s=sc.nextLine();
		if(s!=maVe || s!=loaiVe)
		return false ;
		return true;
		
	}

}
