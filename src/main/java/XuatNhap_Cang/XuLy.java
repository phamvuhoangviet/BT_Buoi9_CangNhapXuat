package XuatNhap_Cang;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {
    public static void main(String[] args) {
        ArrayList<Container> danhSachContainer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i;

        NhapXuat nx = new NhapXuat();
        while (true){
            System.out.println("Vui long chon chuc nang cua chuong trinh: ");
            System.out.println("0. Dung chuong trinh: ");
            System.out.println("1. Nhap thong tin Container: ");
            System.out.println("2. In danh sach Container: ");
            i = sc.nextInt();
            sc.nextLine();
            switch (i){
                case 0:
                    System.exit(1);
                case 1:
                    danhSachContainer = nx.nhapThongTinContainer();
                    break;
                case 2:
                    nx.inDanhSachContainer(danhSachContainer);
                    break;
            }
        }
    }
}

