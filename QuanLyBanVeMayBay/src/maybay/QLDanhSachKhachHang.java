package maybay;
import java.util.Scanner;
import java.util.Arrays;
public class QLDanhSachKhachHang extends KhachHang {
KhachHang[]kh;
int n;
Scanner sc=new Scanner(System.in);
public QLDanhSachKhachHang() {
	kh=new KhachHang[0];
}
public QLDanhSachKhachHang(int n, KhachHang[] kh)
{
	this.n=n;
	this.kh=kh;
}


public static void input(KhachHang kh)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap vao ma khach hang:");
	   kh.setMakhachHang(sc.nextLine());
	System.out.print("Nhap vao dia chi:");
	  kh.setDiaChi(sc.nextLine());
	System.out.println("Nhap So hanh Ly");
 kh.setSohanhLi(Integer.parseInt(sc.nextLine()));
	System.out.println("Nhap cho ngoi");
kh.setChoNgoi(sc.nextLine());
	System.out.println("Nhap Loai ve");
kh.setLoaiVe(sc.nextLine());
	System.out.println( "Nhap Hang ve");
	kh.setHangVe(sc.nextLine());
	
	
   
}

public void LaPDs(int i, KhachHang[]kh)
{
	do {
		System.out.println("1.Nhap va hien thi Thong tin Khach Hang");
		System.out.println("2. Sap xep thong tin tang dan theo cho ngoi");
		System.out.println("3.Tim Kiem Thong tin Khach Hang theo Ma Khach Hang");
		System.out.println("4.Them thong tin Khach Hang");
		System.out.println("5. Xoa thong tin Khach Hang");
		System.out.println("6.Thoat");
		
		kh[i]=new KhachHang();
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		
		case 1:
			System.out.println("Nhap so luong Hanh Khach");
			n=Integer.parseInt(sc.nextLine());
			kh=new KhachHang[n];

			for(i=0;i<n;i++)
			{
				System.out.println("----Nhap Khach Hang:-----"+(i+1));
				kh[i]=new KhachHang();
				input(kh[i]);
			}
			for(i=0;i<n;i++)
			{
				kh[i].toString();
			}
				break;
				
		case 2:
			input(kh[i]);
			for(i=0;i<kh.length-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(kh[i].getChoNgoi().compareTo(kh[j].getChoNgoi())>0)
					{
					KhachHang t=kh[i];
					kh[i]=kh[j];
					kh[j]=t;
					}
				}
			}
			System.out.println("Da Duoc sap xep");
			break;
			
		case 3:
			input(kh[i]);
			String Customer;
			Scanner sc=new Scanner(System.in);
				Customer=sc.nextLine();
				for(i=0;i<kh.length;i++)
				{
					if(kh[i].getMakhachHang().equals(Customer))
					{
						System.out.println("Tim Thay:"+kh[i].toString());
						System.out.println();
					}
					else
					{
						System.out.println("Khong tim thay ket qua");
					}
				}
				
		break;
		case 4:
			Scanner A=new Scanner(System.in);
			input(kh[i]);
			int B=kh.length;
			kh=Arrays.copyOf(kh, B+1);
			kh[B].getMakhachHang().equals(A.nextLine());
			System.out.println("KQ:"+kh[i].toString());
				break;
			
		case 5:
			input(kh[i]);
			Scanner C=new Scanner(System.in);
			for( i = 0; i < kh.length; i++)
	        {
	        if(kh[i].getMakhachHang().equals(C.nextLine()))
	            {
	            for(int j = i; j < n-1; j++)
	            kh[j] = kh[j+1];
	            kh= Arrays.copyOf(kh, n-1);
	            n--;
	            break;
	            }
	        }
			System.out.println(kh[i].toString());
			
			break;
		case 6:
			
			break;
		}
	}
		
	while(true);
}
}
