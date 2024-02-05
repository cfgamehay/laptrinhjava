public class OOP9 {
    public static void main(String[] args) {
        Date ngay1 = new Date(15, 8, 2025);
        Date ngay2 = new Date(1, 3, 2025);
        Date ngay3 = new Date(6, 9, 2025);

        QuocGia quocGia1 = new QuocGia("VN", "Việt Nam");
        QuocGia quocGia2 = new QuocGia("USA", "Hoa Kỳ");
        QuocGia quocGia3 = new QuocGia("TW", "Đài Loan");

        NhaSanXuat2 hangSanXuat1 = new NhaSanXuat2("VNLaptop", quocGia1);
        NhaSanXuat2 hangSanXuat2 = new NhaSanXuat2("Macbook", quocGia2);
        NhaSanXuat2 hangSanXuat3 = new NhaSanXuat2("Asus", quocGia3);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 1500, 12);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 2000, 24);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 1000, 12);

        System.out.println("So sanh gia thấp hơn: ");
        System.out.println("M1 < M2: "+ mayTinh1.KiemTraGiaThapHon(mayTinh2));
        System.out.println("M1 < M3: "+ mayTinh1.KiemTraGiaThapHon(mayTinh3));


        System.out.println("Tên quốc gia: ");
        System.out.println("M1: "+ mayTinh1.GetTenQuocGia());
        System.out.println("M2: "+ mayTinh2.GetTenQuocGia());
        System.out.println("M3: "+ mayTinh3.GetTenQuocGia());
    }
}
