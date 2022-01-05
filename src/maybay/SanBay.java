package maybay;
import java.util.Scanner;
public class SanBay extends MayBay {
	private String masanBay;
	private String tensanbay;
	public SanBay() {
		
	}
	public SanBay(String masanBay, String tensanbay) {
		this.masanBay = masanBay;
		this.tensanbay = tensanbay;
	}
	public String getMasanBay() {
		return masanBay;
	}
	public void setMasanBay(String masanBay) {
		this.masanBay = masanBay;
	}
	public String getTensanbay() {
		return tensanbay;
	}
	public void setTensanbay(String tensanbay) {
		this.tensanbay = tensanbay;
	}
public void dauvao()
{
	super.dauvao();
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap ma san bay");
	masanBay=sc.nextLine();
	System.out.println("Nhap ten san bay");
	tensanbay=sc.nextLine();
}
public String toString()
{
	super.daura();
	return "ma san bay:"+masanBay+" ten san bay"+tensanbay;
}
}
