package XuatNhap_Cang;

import java.util.ArrayList;

public class Container {
    private int soContainer;

    public int getSoContainer() {
        return soContainer;
    }

    public void setSoContainer(int soContainer) {
        this.soContainer = soContainer;
    }

    public String getTrangThaiContainer() {
        return trangThaiContainer;
    }

    public void setTrangThaiContainer(String trangThaiContainer) {
        this.trangThaiContainer = trangThaiContainer;
    }

    public String getChuaHang() {
        return chuaHang;
    }

    public void setChuaHang(String chuaHang) {
        this.chuaHang = chuaHang;
    }

    public String getNgayVaoCang() {
        return ngayVaoCang;
    }

    public void setNgayVaoCang(String ngayVaoCang) {
        this.ngayVaoCang = ngayVaoCang;
    }

    public String getNgayXuatCang() {
        return ngayXuatCang;
    }

    public void setNgayXuatCang(String ngayXuatCang) {
        this.ngayXuatCang = ngayXuatCang;
    }

    private String trangThaiContainer;
    private String chuaHang;
    private String ngayVaoCang;
    private String ngayXuatCang;

}
