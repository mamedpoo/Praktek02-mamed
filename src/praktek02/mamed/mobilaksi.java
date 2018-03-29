package praktek02.mamed;

public class mobilaksi {
    public static void main(String[] args) {
        mobil Q1 = new mobil();
        Q1.harga = 900;
        Q1.jumlah = 5;
        
        Q1.transportasi();
        System.out.println("Harga jual mobilnya = "+Q1.hitungJual());
    }
    
}
