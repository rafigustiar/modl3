package Tugas1;

import java.util.ArrayList;
import java.util.Scanner;

class Menu{
    private String makanan;
    private double harga;
    public Menu(String makanan, double harga){
        this.setMakanan(makanan);
        this.setHarga(harga);
    }
    public String getMakanan() {
        return makanan;
    }
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
}
class Hitungpesanan{ //menghitung harga makanan + jumlah pesanan
    public static double hitungTotal(double harga, int jumlah){
        return harga * jumlah;
    }
}
class Pesanan { //menyimpan pesanan yang telah dipesan
    private Menu menu;
    private int jumlah;
    public Pesanan(Menu menu, int jumlah){
        this.setMenu(menu);
        this.setJumlah(jumlah);
    }

    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
class OrderMakanan{
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Pesanan> daftarpesanan = new ArrayList<>(); //untuk menyimpan pesanan ke class Tugas1.Pesanan
    public void tampilkanMenuMakanan(ArrayList<Menu> menuMakanan){
        int input;
        int kuantitas = 0;
        double  totalHargaPesanan = 0;

        while (true){
            //menampilkan menu
            System.out.println("Daftar Tugas1.Menu: ");
            for (int i = 0; i < menuMakanan.size(); i++) {
                System.out.println(i+1+"."+menuMakanan.get(i).getMakanan()+" Rp."+menuMakanan.get(i).getHarga());
            }
            //pesanan user
            System.out.print("Pilih menu (1-8): ");
            input = scanner.nextInt();

            if (input >=1 && input <=menuMakanan.size()){
                System.out.print("Masukkan jumlah pesanan: ");
                kuantitas = scanner.nextInt();
                scanner.nextLine();
                Menu menuDipilih = menuMakanan.get(input - 1);

                //menambahkan menu ke daftar menu
                Pesanan pesanan = new Pesanan(menuDipilih,kuantitas);
                daftarpesanan.add(pesanan);

                //hitung total harga
                double hargapesanan = Hitungpesanan.hitungTotal(menuDipilih.getHarga(),kuantitas);
                totalHargaPesanan += hargapesanan;

                //menanyakan ingin pesan lagi atau tidak
                System.out.print("Ingin pesan lagi (y/t): ");
                String pesanLagi = scanner.nextLine();
                if (pesanLagi.equalsIgnoreCase("t") || pesanLagi.equalsIgnoreCase("T")){
                    //mencetak struk
                    break;
                }
            }else {
                System.out.println("\ninputan anda tidak valid!!!\n\n");
            }
        }
    }
    public void cetakstruk(double totalHargaPesanan){
        System.out.println("======Struk Belanja======");
        for (int i = 0; i < daftarpesanan.size(); i++) {
            System.out.println(i+1+". "+daftarpesanan.get(i).getMenu().getMakanan()+" - Rp."+daftarpesanan.get(i).getMenu().getHarga()+" x "+daftarpesanan.get(i).getJumlah()+" = Rp."+Hitungpesanan.hitungTotal(daftarpesanan.get(i).getMenu().getHarga(),daftarpesanan.get(i).getJumlah()));
        }
        System.out.print("Total belanjaan anda: ");
        System.out.println(totalHargaPesanan);
    }
    public ArrayList<Pesanan> getDaftarpesanan() {
        return daftarpesanan;
    }

    public void setDaftarpesanan(ArrayList<Pesanan> daftarpesanan) {
        this.daftarpesanan = daftarpesanan;
    }
}

public class Main {
    public static void main(String[] args) {
        //Daftar
        ArrayList<Menu> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Menu("Indomie",8000));
        daftarMenu.add(new Menu("Nasi Goreng", 15000));
        daftarMenu.add(new Menu("Ayam Geprek", 10000));
        daftarMenu.add(new Menu("Lalapan", 20000));
        daftarMenu.add(new Menu("Es Teh",3000));
        daftarMenu.add(new Menu("Es Jeruk", 5000));
        daftarMenu.add(new Menu("Kopi", 5000));
        daftarMenu.add(new Menu("Lemeneral", 4000));


        //memanggil class / method order
        OrderMakanan orderMakanan = new OrderMakanan();
        orderMakanan.tampilkanMenuMakanan(daftarMenu);
    }
}