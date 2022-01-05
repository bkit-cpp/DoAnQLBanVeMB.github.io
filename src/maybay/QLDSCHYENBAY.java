package maybay;
import java.util.Arrays;
import java.util.Scanner;
public class QLDSCHYENBAY extends ChuyenBay{
	int n;
	public ChuyenBay[]cb;
	public QLDSCHYENBAY(String machuyenBay, String noiDi, String noiDen, String ngaykhoiHanh, String cong) {
		cb=new ChuyenBay[0];
	}
	public  QLDSCHYENBAY(int n, ChuyenBay[]cb)
	{
		this.n=n;
		this.cb=cb;
	}
	public static void dauvao(ChuyenBay cb)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma may bay");
		cb.mamayBay=sc.nextLine();
		System.out.println("Nhap Loai may bay");
		cb.loaimayBay=sc.nextLine();
		System.out.println("Nhap tinh trang");
		cb.tinhTrang=sc.next();
		System.out.println("Nhap ma chuyen bay");
		cb.machuyenBay=sc.nextLine();
		System.out.println("Nhap  noi di");
		cb.noiDi=sc.nextLine();
		System.out.println("Nhap noi den");
		cb.noiDen=sc.nextLine();
		System.out.println("Nhap ngay khoi hanh");
		cb.ngaykhoiHanh=sc.nextLine();
		System.out.println("Nhap Cong");
		cb.cong=sc.nextLine();
	}
	public void SetList(int i, ChuyenBay[] cb)
	{
		Scanner sc=new Scanner(System.in);
		cb[i]=new ChuyenBay();
		do {
			System.out.println("1. Nhap Thong tin Chuyen Bay");
			System.out.println("2. Hien thi thong tin Chuyen Bay");
			System.out.println("3. Sua Thong tin Chuyen Bay");
			System.out.println("4. Tim Kiem  Thong tin Chuyen Bay");
			System.out.println("5. Them Thong tin Chuyen Bay");
			System.out.println("6. Xoa Thong tin Chuyen Bay");
			System.out.println("7.Thoat");
			System.out.println("Nhap lua chon cua ban");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1: System.out.println("Nhap so luong Chuyen Bay");
			n=Integer.parseInt(sc.nextLine());
			cb=new ChuyenBay[n];
			for( i=0;i<n;i++)
			{
				System.out.println("Nhap Chuyen Bay Thu"+(i+1));
				cb[i]=new ChuyenBay();
				dauvao(cb[i]);
				
			}
			break;
			case 2:
				for(i=0;i<cb.length;i++)
				{
					System.out.println("Hien thi ket qua:"+cb[i].toString());
					
				}
				break;
			case 3:
				System.out.println("Nhap thong tin Chuyen Bay can sua");
				int flag=0;
				String flightcode=sc.nextLine();
				for( i=0;i<cb.length;i++)
				{
					if(cb[i].getMachuyenBay().equals(flightcode))
					{
						flag=1;
						dauvao(cb[i]);
						break;
					}
					
				}
				if(flag==0)
				{
					System.out.println("Khong the sua doi");
				}
				break;
			case 4:
				System.out.println("Nhap Chuyen Bay can tim kiem");
				int flag1=0;
				String chuyenbay=sc.nextLine();
				for(i=0;i<n;i++)
				{
					if(cb[i].getMachuyenBay().equals(chuyenbay))
					{
						flag1=1;
						System.out.println("Ket qua:"+cb[i].toString());
						System.out.println();
						break;
					}
				}
				if(flag1==0)
				{
					System.out.println("Khong the tim thay");
				}
				
				break;
			case 5:
				int A=cb.length;
				cb=Arrays.copyOf(cb, A+1);
				cb[A]=new ChuyenBay();
				dauvao(cb[A]);
				break;
			case 6:
				while(cb.length!=0)
				{
					ChuyenBay flight=new ChuyenBay();
					System.out.println("Nhap ma Chuyen Bay");
					flight.machuyenBay=sc.nextLine();
					for(i=0;i<cb.length-1;i++)
					{
						if(cb[i].machuyenBay.equals(flight.machuyenBay))	
						{
							for(int j=i;j<cb.length;j++)
							{
								cb[j]=cb[j+1];
							}
							break;
						}
					}
					
				}
				cb=Arrays.copyOf(cb, cb.length-1);
				break;
			case 7:
				break;
			}
			
		}while(true);
	}
}