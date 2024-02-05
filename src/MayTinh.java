public class MayTinh {
    private NhaSanXuat2 nhaSanXuat;
    private Date ngaySanXuat;
    private double giaBan;
    private double thoiGianBaoHanh;

    public MayTinh(NhaSanXuat2 nhaSanXuat, Date ngaySanXuat, double giaBan, double thoiGianBaoHanh) {
        this.nhaSanXuat = nhaSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public NhaSanXuat2 getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(NhaSanXuat2 nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public boolean KiemTraGiaThapHon(MayTinh mayTinhKhac)
    {
        return this.giaBan<mayTinhKhac.getGiaBan();
    }
    public String GetTenQuocGia()
    {
        return this.nhaSanXuat.getQuocGia().getTenQuocGia();
    }
}
