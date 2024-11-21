package filkomtravel;

public class pesanan  {
 Pelanggan pelanggan;
 SupirTravel supir;
 Mobil mobil;
 Jurusan rute;
 boolean ada=false;

    public pesanan() {
    }
 
 pesanan(Pelanggan pelanggan,SupirTravel supir,MobilPribadi mobil,Jurusan rute)
 {
    this.pelanggan=pelanggan;
    this.supir=supir;
    this.mobil=mobil;
    this.rute=rute;
    
 }
 pesanan(Pelanggan pelanggan,SupirTravel supir,Bus mobil,Jurusan rute)
 {
    this.pelanggan=pelanggan;
    this.supir=supir;
    this.mobil=mobil;
    this.rute=rute;
    
 }
 pesanan(Pelanggan pelanggan,SupirTravel supir,MiniBus mobil,Jurusan rute)
 {
    this.pelanggan=pelanggan;
    this.supir=supir;
    this.mobil=mobil;
    this.rute=rute;
    
 }

    public void setAda(boolean ada) {
        this.ada = ada;
    }
    
    public Mobil getMobil() {
        return mobil;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }
    public Jurusan getRute() {
    return rute;
}

    public SupirTravel getSupir() {
        return supir;
    }
    
    public String cetakInfo() {
        return "pelanggan : " + getPelanggan().cetakInfo()+ "\n" +
        "kendaraan: " + getMobil().cetakInfo() + "\n" +
        "Supir: " + getSupir().cetakInfo() + "\n" +
        "Rute: " + getRute() +"\n";
    }
}
