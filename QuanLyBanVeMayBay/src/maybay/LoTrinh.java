package maybay;
import java.util.Scanner;
public class LoTrinh extends TuyenBay {
	protected String maloTrinh;
	protected String tenloTrinh;
	public LoTrinh() {
		
	}
	public LoTrinh(String maloTrinh, String tenloTrinh) {
		this.maloTrinh = maloTrinh;
		this.tenloTrinh = tenloTrinh;
	}
	public String getMaloTrinh() {
		return maloTrinh;
	}
	public void setMaloTrinh(String maloTrinh) {
		this.maloTrinh = maloTrinh;
	}
	public String getTenloTrinh() {
		return tenloTrinh;
	}
	public void setTenloTrinh(String tenloTrinh) {
		this.tenloTrinh = tenloTrinh;
	}

public void nhap()
{
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap ma lo trinh");
	maloTrinh=sc.nextLine();
	System.out.println("Nhap ten lo trinh");
	tenloTrinh=sc.nextLine();
}
public String toString()
{
	super.toString();
	return "MaLoTrinh:"+maloTrinh+"TenLoTrinh:"+tenloTrinh;
}

}
