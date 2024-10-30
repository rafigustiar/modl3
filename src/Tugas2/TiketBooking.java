package Tugas2;

import java.util.Scanner;

/**
 * Kelas Event yang menyimpan detail mengenai nama event yang dipilih.
 */
class Event {
    private String eventName;

    /**
     * Mengatur nama event berdasarkan pilihan event yang dipilih pengguna.
     *
     * @param eventChoice Pilihan event yang diberikan (1 untuk Event A, 2 untuk Event B, 3 untuk Event C).
     */
    public void setEventName(int eventChoice) {
        switch (eventChoice) {
            case 1:
                this.eventName = "Event A";
                break;
            case 2:
                this.eventName = "Event B";
                break;
            case 3:
                this.eventName = "Event C";
                break;
            default:
                this.eventName = "Invalid Event";
        }
    }

    /**
     * Mengambil nama event yang telah diset.
     *
     * @return Nama event sebagai String.
     */
    public String getEventName() {
        return this.eventName;
    }
}

/**
 * Kelas Seat yang menyimpan kategori kursi beserta harga dan tipe kursi.
 */
class Seat {
    public static final int VVIP = 1000000;
    private String seatType;
    private int seatPrice;

    /**
     * Mengatur kategori kursi berdasarkan pilihan kursi pengguna.
     *
     * @param seatChoice Pilihan kursi (1 untuk VVIP, 2 untuk VIP, 3 untuk Reguler).
     */
    public void setSeat(int seatChoice) {
        ChoiceSeat(seatChoice);
    }

    /**
     * Menentukan tipe dan harga kursi berdasarkan pilihan kursi.
     *
     * @param seatChoice Pilihan kursi (1 untuk VVIP, 2 untuk VIP, 3 untuk Reguler).
     */
    private void ChoiceSeat(int seatChoice) {
        switch (seatChoice) {
            case 1:
                this.setSeatType("VVIP");
                this.setSeatPrice(VVIP);
                break;
            case 2:
                this.setSeatType("VIP");
                this.setSeatPrice(500000);
                break;
            case 3:
                this.setSeatType("Reguler");
                this.setSeatPrice(200000);
                break;
            default:
                this.setSeatType("Invalid Seat");
                this.setSeatPrice(0);
        }
    }

    /**
     * Mengambil tipe kursi.
     *
     * @return Tipe kursi sebagai String.
     */
    public String getSeatType() {
        return this.seatType;
    }

    /**
     * Mengambil harga kursi.
     *
     * @return Harga kursi sebagai int.
     */
    public int getSeatPrice() {
        return this.seatPrice;
    }

    /**
     * Mengatur tipe kursi.
     *
     * @param seatType Tipe kursi sebagai String.
     */
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    /**
     * Mengatur harga kursi.
     *
     * @param seatPrice Harga kursi sebagai int.
     */
    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }
}

/**
 * Kelas Food yang menyimpan pilihan makanan beserta harga makanan per item.
 */
class Food {
    private int foodCount;
    private final int foodPrice = 50000;

    /**
     * Mengatur jumlah makanan yang dipesan.
     *
     * @param foodCount Jumlah makanan yang dipesan.
     */
    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    /**
     * Menghitung total biaya makanan berdasarkan jumlah makanan yang dipesan.
     *
     * @return Total biaya makanan sebagai int.
     */
    public int getFoodCost() {
        return this.foodCount * foodPrice;
    }











}
