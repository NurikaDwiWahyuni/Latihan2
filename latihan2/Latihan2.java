package latihan2;


class HotMenu {
    
    String seblak, Mi;
    int jumlahMi, jumlahseblak;
    int hargaS, hargaM;
    int Harga;
    
    void Menu (String seblak, String Mi) {
        this.seblak = seblak;
        this.Mi = Mi;
    }   
   
    void Jumlah (int jumlahMi, int jumlahseblak) {
        this.jumlahseblak = jumlahseblak;
        this.jumlahMi = jumlahMi;
    }
    
    int Harga (int hargaS, int hargaM){
        hargaS = jumlahseblak;
        hargaM = jumlahMi;
        return Harga;
        
    }
    
    void tampil () {
        System.out.println("Menu makanan Seblak : "+ seblak);
        System.out.println("Menu makanan Mi : "+ Mi);
        System.out.println("Menu makanan Seblak : "+ seblak + "(" + jumlahseblak + ")");
        System.out.println("Menu makanan Mi : "+ Mi + " (" + jumlahMi + ")");
        System.out.println("Harga Seblak = " + (jumlahseblak * 10000));
        System.out.println("Harga Mi = " + (jumlahMi * 80000));
       
    }
    
    
}
public class Latihan2 {

    
    public static void main(String[] args) {
     
    }
    
}
