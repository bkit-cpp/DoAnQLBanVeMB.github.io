package maybay;
import java.util.Scanner;
public abstract class DonGia extends VeChuyenBay {
	protected String madonGia;
	protected float vnd;
	protected float usd;
	public DonGia() {
	
	}
	public DonGia(String madonGia, float vnd,float usd) {
		this.madonGia = madonGia;
		this.vnd=vnd;
		this.usd=usd;
		
	}
	public String getMadonGia() {
		return madonGia;
	}
	public void setMadonGia(String madonGia) {
		this.madonGia = madonGia;
	}
	public float getvnd()
	{
		return vnd;
	}
	public void setvnd()
	{
		this.vnd=vnd;
	}
	public float getusd()
	{
		return usd;
	}
	public void setusd()
	{
		this.usd=usd;
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma don gia");
		madonGia=sc.nextLine();
		System.out.println("Nhap Tien VND");
		vnd=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap Dong USD");
		usd=Float.parseFloat(sc.nextLine());
	}
	public float ThanhTienVietNam()
	{
		return usd*23000;
	}
	public float ThanhTienDola()
	{
		return vnd/23000;
	}
	public String toString()
	{
		return "madongia:"+madonGia;
	}
	@Override
	public void tongtienphaitra()
	{
	  float s;
	  float s1;
	  s=super.getphidichvu()+super.getphiquantri()+super.getphisanbay()+super.getgiave()*23000;
	  System.out.println("Tong tien phai tra theo VND:"+s);
	  s1=super.getphidichvu()+super.getgiave()+super.getphisanbay()+super.getphiquantri();
	  System.out.println("Tong tien phai tra theo USD:"+s1);
	}
	public abstract void Tongdoanhthu();
	
}
