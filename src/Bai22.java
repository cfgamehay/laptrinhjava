import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        String nhiPhan = "";

        while(n > 0 )
        {
            nhiPhan = (n%2) + nhiPhan;
            n/=2;
        }
        System.out.println(nhiPhan);
    }
}
