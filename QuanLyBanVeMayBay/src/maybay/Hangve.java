package maybay;
import java.util.Scanner;
public class Hangve {
	protected String mahangVe;
	protected String tenhangVe;
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

public void nhaptt()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap ma hang ve");
	mahangVe=sc.nextLine();
	System.out.println("Nhap ten hang ve ");
	tenhangVe=sc.nextLine();
}
public String toString()
{
	return "mahangve:"+mahangVe+"tenhangve:"+tenhangVe;
}


}
