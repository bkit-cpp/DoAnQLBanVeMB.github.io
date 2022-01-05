package maybay;
import java.util.Scanner;
public class TuyenBay extends MayBay {
	protected  String sanbaycatCanh;
	protected  String sanbayhaCanh;
	protected  int giohaCanh;
	protected  int giocatCanh;
	public TuyenBay() {
	
	}
	public TuyenBay(String sanbaycatCanh, String sanbayhaCanh, int giohaCanh, int giocatCanh) {
		this.sanbaycatCanh = sanbaycatCanh;
		this.sanbayhaCanh = sanbayhaCanh;
		this.giohaCanh = giohaCanh;
		this.giocatCanh = giocatCanh;
	}
	public String getSanbaycatCanh() {
		return sanbaycatCanh;
	}
	public void setSanbaycatCanh(String sanbaycatCanh) {
		this.sanbaycatCanh = sanbaycatCanh;
	}
	public String getSanbayhaCanh() {
		return sanbayhaCanh;
	}
	public void setSanbayhaCanh(String sanbayhaCanh) {
		this.sanbayhaCanh = sanbayhaCanh;
	}
	public int getGiohaCanh() {
		return giohaCanh;
	}
	public void setGiohaCanh(int giohaCanh) {
		this.giohaCanh = giohaCanh;
	}
	public int getGiocatCanh() {
		return giocatCanh;
	}
	public void setGiocatCanh(int giocatCanh) {
		this.giocatCanh = giocatCanh;
	}
	public  void nhap()
	{
		super.dauvao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap San bay cat canh:");
		sanbaycatCanh=sc.nextLine();
		System.out.println("Nhap San bay ha canh");
		sanbayhaCanh=sc.nextLine();
		System.out.println("Nhap gio ha canh");
		giohaCanh=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap gio cat canh");
		giocatCanh=Integer.parseInt(sc.nextLine());
	}
	
	public int thoigianbay()
	{
		return giocatCanh-giohaCanh;
	}
	public String toString()
	{
		super.daura();
		return "Thong tin hien thi:"+"San bay cat canh:"+sanbaycatCanh+"San bay ha canh:"+sanbayhaCanh+ "Gio ha canh"+giohaCanh+"Gio cat canh"+giocatCanh;
	}
	
	
}
