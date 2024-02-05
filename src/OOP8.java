public class OOP8 {
    public static void main(String[] args) {
        Date ngay1 = new Date(19, 7, 2002);
        Date ngay2 = new Date(17, 2, 2001);
        Date ngay3 = new Date(19, 7, 2002);


        Lop lop1 = new Lop("DH01", "Khoa Công nghệ Thông tin");
        Lop lop2 = new Lop("DH02", "Khoa Khoa học Máy tính");
        Lop lop3 = new Lop("DH03", "Khoa An ninh mạng");

        SinhVien sv1 = new SinhVien(1, "Tùng ITV", ngay1, 9.0, lop1);
        SinhVien sv2 = new SinhVien(2, "Peter Le", ngay2, 4.0, lop2);
        SinhVien sv3 = new SinhVien(3, "Lê Tùng", ngay3, 6.0, lop3);

        System.out.println("Tên khoa: ");
        System.out.println("SV1: "+ sv1.getTenKhoa());
        System.out.println("SV2: "+ sv2.getTenKhoa());
        System.out.println("SV3: "+ sv3.getTenKhoa());
        System.out.println("Kiểm tra thi đạt: ");
        System.out.println("SV1: "+ sv1.KiemTraCoDauHayKhong());
        System.out.println("SV2: "+ sv2.KiemTraCoDauHayKhong());
        System.out.println("SV3: "+ sv3.KiemTraCoDauHayKhong());
        System.out.println("Kiểm tra cùng ngày sinh:");
        System.out.println("sv1 và sv2: "+ sv1.KiemTraSinhVienCoTrungNgaySinhVoiSinhVienKhac(sv2));
        System.out.println("sv1 và sv3: "+ sv1.KiemTraSinhVienCoTrungNgaySinhVoiSinhVienKhac(sv3));
    }
}
