package praktek02.mamed;

public class mobil {
    double harga;
    double jumlah;

    public mobil(){
        harga=500;
        jumlah=90;
        
    }
   
    
    void transportasi(){
        System.out.println("=========================");
        System.out.println("Harga           :"+harga);
        System.out.println("Jumlah          :"+jumlah);
        System.out.println("=========================");
    }
    
    
    
    double hitungJual(){
        double jual;
        jual=harga*jumlah;
        return jual;
        
    }
    
    void cetakHarga(){
        System.out.println("Harga Mobil = "+hitungJual());
    }
    
    
}
