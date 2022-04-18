package tugas2;

/**
 *
 *@NiLuhPutuTrisnaKantinaDewi 20103001
 */
public class volumebalok {
    double panjang;
    double lebar;
    double tinggi;
    double volume;
    
    public volumebalok(double Pj, double Lb, double Tg){
        this.setPj (Pj);
        this.setLb(Lb);
        this.setTg(Tg);
        
        this.panjang = Pj;
        this.lebar = Lb;
        this.tinggi = Tg;
    }
    public void setPj(double Pj){
        this.panjang = Pj;    
    }
    public void setTg (double Tg){
        this.tinggi = Tg;
    }
     public void setLb (double Lb) {
        this.lebar = Lb;
    }
     double Hitungvolume (){
           this.volume = this.panjang*this.lebar*this.tinggi;
           return this.volume;
       }
       public void cetakvolume (){
        this.Hitungvolume();
        System.out.println("******MENGHITUNG VOLUME BALOK******");
        System.out.println("NILAI Panjang   :"+this.panjang+"cm");
        System.out.println("NILAI Lebar     :"+this.lebar+"cm");
        System.out.println("NILAI Tinggi    :"+this.tinggi+"cm");
        System.out.println("Volume Balok    :"+this.volume+"cm");
       }
}
