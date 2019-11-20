package XuatNhap_Cang;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NhapXuat {
    Scanner sc = new Scanner(System.in);
    Container ctn = new Container();
    //    ArrayList<HocSinh> listHocSinh;
    //   HocSinh hs;
    int stopFlag = 1;
    public ArrayList<Container> nhapThongTinContainer() {
        ArrayList<Container> danhSachContainer = new ArrayList<>();
        while (stopFlag == 1) {
            danhSachContainer = new ArrayList<>();
            ctn = new Container();
            System.out.println("Vui long nhap so Container: ");
            ctn.setSoContainer(sc.nextInt());
            sc.nextLine();
            while (true) {
                System.out.println("Vui long nhap trang thai Container (Trong/Ngoai) kho: ");
                ctn.setTrangThaiContainer(sc.nextLine());
                Pattern p;
                Matcher m = null;
                p = Pattern.compile(("(Trong|Ngoai)"));
                m = p.matcher(ctn.getTrangThaiContainer());
                if (m.matches()) {
                    break;
                } else {
                    System.out.println("Format ban phai nhap la Trong/Ngoai");
                    continue;
                }
            }
            //  sc.nextLine();
            while (true) {
                System.out.println("Container co chua hang hoa hay khong (Co/Khong): ");
                ctn.setChuaHang(sc.nextLine());
                Pattern p;
                Matcher m = null;
                p = Pattern.compile(("(Co|Khong)"));
                m = p.matcher(ctn.getChuaHang());
                if (m.matches()) {
                    break;
                } else {
                    System.out.println("Format ban phai nhap la Co/Khong");
                    continue;
                }
            }
            System.out.println("Vui long nhap ngay nhap cang cua Container: ");
            ctn.setNgayVaoCang(sc.nextLine());
            stringToDate(ctn.getNgayVaoCang());
            System.out.println("Vui long nhap ngay xuat cang cua Container: ");
            ctn.setNgayXuatCang(sc.nextLine());
            stringToDate(ctn.getNgayXuatCang());
            danhSachContainer.add(ctn);
            System.out.println("Nhap 1 de tiep tuc them lop - Nhap -1 de ket thuc them lop");
            stopFlag = sc.nextInt();
            sc.nextLine();
        }
        return danhSachContainer;
    }
    public void inDanhSachContainer(ArrayList<Container> dsContainer) {
        for (Container l : dsContainer) {
            System.out.println("Ma so Container: " + l.getSoContainer()
                    + " - Trang thai Container: " + l.getTrangThaiContainer()
                    + " - Co chua hang hay khong?: " + l.getChuaHang()
                    + " - Ngay nhap cang: " + l.getNgayVaoCang()
                    + " - Ngay xuat cang: " + l.getNgayXuatCang());
        }
    }
    public void kiemTra(ArrayList<Container> dsContainer) {
        String a;
        System.out.println("Vui long nhap ngay de kiem tra:");
        a = sc.nextLine();
        stringToDate(a);
        for (int i = 0; i < dsContainer.size() ; i++) {
            if (dsContainer.get(i).getNgayVaoCang().before(a))
                System.out.println(dsContainer.get(i));
        };


    }
    public java.util.Date stringToDate (String time){
        java.util.Date date = new java.util.Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        try {
            date = df.parse(time);
            return date;
        } catch (Exception e) {

        }
        return date;
    }
}
