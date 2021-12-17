package maybay;

import java.util.Scanner;

public  class ThongKe extends VeChuyenBay {
	protected String mathongKe;
	protected String tenhangVe;
	protected int soluongVe;
	public ThongKe() {
		
	}
	public ThongKe(String mathongKe, String tenhangVe, int soluongVe) {
		this.mathongKe = mathongKe;
		this.tenhangVe = tenhangVe;
		this.soluongVe = soluongVe;
	}
	public String getMathongKe() {
		return mathongKe;
	}
	public void setMathongKe(String mathongKe) {
		this.mathongKe = mathongKe;
	}
	public String getTenhangVe() {
		return tenhangVe;
	}
	public void setTenhangVe(String tenhangVe) {
		this.tenhangVe = tenhangVe;
	}
	public int getSoluongVe() {
		return soluongVe;
	}
	public void setSoluongVe(int soluongVe) {
		this.soluongVe = soluongVe;
	}
	@Override
	public  void tongtienphaitra()
	{
		float s= super.phidichvu+super.phiquantri+super.phisanbay+super.giave*soluongVe;
		System.out.println("KQ:"+s);
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao ma thong ke");
		mathongKe=sc.nextLine();
		System.out.println("Nhap vao ten hang ve");
		tenhangVe=sc.nextLine();
	}
	public String toString()
	{
		return mathongKe+" "+tenhangVe;
	}
}
