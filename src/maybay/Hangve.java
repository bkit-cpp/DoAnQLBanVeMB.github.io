package maybay;
import java.util.Scanner;
public class Hangve extends VeChuyenBay {
	protected String mahangVe;
	protected String tenhangVe;
	protected float GiaLoaiVe;
	public Hangve() {
		
	}
	public Hangve(String mahangVe, String tenhangVe) {
		this.mahangVe = mahangVe;
		this.tenhangVe = tenhangVe;
	}
	public String getMahangVe() {
		return mahangVe;
	}
	public void setMahangVe(String mahangVe) {
		this.mahangVe = mahangVe;
	}
	public String getTenhangVe() {
		return tenhangVe;
	}
	public void setTenhangVe(String tenhangVe) {
		this.tenhangVe = tenhangVe;
	}
	public float getGiaLoaiVe()
	{
		return GiaLoaiVe;
	}
	public void setGiaLoaiVe(float GiaLoaiVe)
	{
		this.GiaLoaiVe=GiaLoaiVe;
	}

public void nhaptt()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap ma hang ve");
	mahangVe=sc.nextLine();
	System.out.println("Nhap ten hang ve ");
	tenhangVe=sc.nextLine();
	System.out.println("Nhap Gia Loai Ve");
	GiaLoaiVe=Integer.parseInt(sc.nextLine());
}
@Override
public void tongtienphaitra()
{
	float s=super.getphidichvu()+super.getphiquantri()+super.getphisanbay()+super.getgiave()*23000+GiaLoaiVe;
}
public String toString()
{
	return "mahangve:"+mahangVe+"tenhangve:"+tenhangVe;
}


}
