import java.util.Scanner;

public class Main {
    private static int money=100;
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String[] list={
                "Jakarta 1 tiket $40","Bandung 1 tiket $50", "Semarang 1 tiket $20", "Yogyakarta 1 tiket $30", "Surabaya 1 tiket $70"
        };
        System.out.println("Pilih tujuan destinasi wisata :");
        for (var i=0;i<list.length;i++){
            System.out.println(i+1+". "+list[i]);
        }
        System.out.print("Destinasi: ");
        if (!input.hasNextInt()){
            System.err.println("Input harus berupa angka");
            return;
        }
        int value1=input.nextInt();
        System.out.print("Jumlah tiket: ");
        if (!input.hasNextInt()){
            System.err.println("Input harus berupa angka");
            return;
        }
        int value2=input.nextInt();
        switch (value1){
            case 1:
                if   (!tiket(value2, 40))return;
                System.out.println("Kamu beli tiket ke Jakarta "+value2+" tiket");
                System.out.println("Uang kamu sisa "+money);
                break;
            case 2:
                if (!tiket(value2, 50))return;
                System.out.println("Kamu beli tiket ke Bandung "+value2+" tiket");
                System.out.println("Uang kamu sisa "+money);
                break;
            case 3:
                if (!tiket(value2, 20))return;
                System.out.println("Kamu beli tiket ke Semarang "+value2+" tiket");
                System.out.println("Uang kamu sisa "+money);
                break;
            case 4:
                if (!tiket(value2, 30))return;
                System.out.println("Kamu beli tiket ke Yogyakarta "+value2+" tiket");
                System.out.println("Uang kamu sisa "+money);
                break;
            case 5:
                if (!tiket(value2, 70))return;
                System.out.println("Kamu beli tiket ke Surabaya "+value2+" tiket");
                System.out.println("Uang kamu sisa "+money);
                break;
            default:
                System.err.println("Pilihan tidak ada");
        }
    }
    static boolean tiket(int totalTiket, int price){
        int res=money-totalTiket*price;
        if (res<0){
            System.err.println("Uang kamu kurang "+res*-1);
            return false;
        }
        money=res;
        return true;
    }
}
