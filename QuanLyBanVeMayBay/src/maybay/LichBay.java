package maybay;
import java.util.Scanner;;
public  class LichBay extends MayBay {
	protected String malichBay;
	protected int ngaycohieuLuc;
	protected int ngayHethieuLuc;
	public LichBay() {
		
	}
	public LichBay(String malichBay, int ngaycohieuLuc, int ngayHethieuLuc) {
		this.malichBay = malichBay;
		this.ngaycohieuLuc = ngaycohieuLuc;
		this.ngayHethieuLuc = ngayHethieuLuc;
	}
	public String getMalichBay() {
		return malichBay;
	}
	public void setMalichBay(String malichBay) {
		this.malichBay = malichBay;
	}
	public int getNgaycohieuLuc() {
		return ngaycohieuLuc;
	}
	public void setNgaycohieuLuc(int ngaycohieuLuc) {
		this.ngaycohieuLuc = ngaycohieuLuc;
	}
	public int getNgayHethieuLuc() {
		return ngayHethieuLuc;
	}
	public void setNgayHethieuLuc(int ngayHethieuLuc) {
		this.ngayHethieuLuc = ngayHethieuLuc;
	}

public void nhap()
{
	super.dauvao();
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap vao ma lich bay");
	malichBay=sc.nextLine();
	System.out.println("Nhap ngay co hieu luc");
	ngaycohieuLuc=Integer.parseInt(sc.nextLine());
	System.out.println("Nhap ngay het hieu luc");
	ngayHethieuLuc=Integer.parseInt(sc.nextLine());
	
}
public String toString()
{
	super.daura();
	return "ma lich bay:"+malichBay+"ngay co hieu luc"+ngaycohieuLuc+"ngay het hieu luc:"+ngayHethieuLuc;
}
}
