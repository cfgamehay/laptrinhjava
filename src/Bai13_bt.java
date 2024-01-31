import java.util.Scanner;

public class Bai13_bt {
    public static void main(String[] args) {
        //Bai tap hinh tron
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap r: ");
        r = sc.nextDouble();

        chuVi = Math.round(2*Math.PI*r * 100.0)/100.0;
        dienTich = Math.round(Math.PI * Math.pow(r,2)*100.0)/100.0;

        System.out.println("Chu vi: "+ chuVi);
        System.out.println("Dien tich: "+dienTich);
    }
}
