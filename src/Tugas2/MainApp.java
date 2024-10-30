package Tugas2;

import java.util.Scanner;

// Kelas utama TicketBooking yang mengelola semua komponen
public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Event event = new Event();
        Seat seat = new Seat();
        Food food = new Food();

        // Pemilihan Event Pertandingan
        System.out.println("Pilih Event Pertandingan:");
        System.out.println("1. Event A");
        System.out.println("2. Event B");
        System.out.println("3. Event C");
        System.out.print("Masukkan pilihan event (1-3): ");
        event.setEventName(scanner.nextInt());

        // Pemilihan Kategori Kursi
        System.out.println("\nPilih Kategori Kursi:");
        System.out.println("1. VVIP (Rp 1.000.000)");
        System.out.println("2. VIP (Rp 500.000)");
        System.out.println("3. Reguler (Rp 200.000)");
        System.out.print("Masukkan pilihan kursi (1-3): ");
        seat.setSeat(scanner.nextInt());

        // Pemilihan Jumlah Tiket
        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int ticketCount = scanner.nextInt();
        int totalCost = seat.getSeatPrice() * ticketCount;

        // Pemilihan Makanan
        System.out.println("\nApakah Anda ingin membeli makanan? (Y/N)");
        char foodChoice = scanner.next().charAt(0);
        if (foodChoice == 'Y' || foodChoice == 'y') {
            System.out.print("Masukkan jumlah makanan yang ingin dibeli: ");
            int foodCount = scanner.nextInt();
            food.setFoodCount(foodCount);
            totalCost += food.getFoodCost();
        }

        // Ringkasan Pemesanan
        System.out.println("\nRingkasan Pemesanan:");
        System.out.println("Event: " + event.getEventName());
        System.out.println("Kategori Kursi: " + seat.getSeatType());
        System.out.println("Jumlah Tiket: " + ticketCount);
        System.out.println("Total Biaya: Rp " + totalCost);

        scanner.close();
    }
}
