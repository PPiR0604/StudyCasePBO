package filkomtravel;

public abstract class Mobil implements CetakInfo {
    protected String noPlat;
    protected String merkMobil;
    protected String warnaMobil;
    protected int tahunKeluaran;

    public Mobil(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaran) {
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaran = tahunKeluaran;
    }

    public String getInfo() {
        return "No Plat: " + noPlat + ", Merk: " + merkMobil + ", Warna: " + warnaMobil + ", Tahun: " + tahunKeluaran;
    }

    public void setNoPlat(){
        this.noPlat = noPlat;
    }
    public String getNoPLat(){
        return noPlat;
    }
    
    public void setMerkMobil(){
        this.merkMobil = merkMobil;
    }
    public String getMerkMobil(){
        return merkMobil;
    }
    
    public void setWarnaMobil(){
        this.warnaMobil = warnaMobil;
    }
    public String getWarnaMobil(){
        return warnaMobil;
    }
    
    public void setTahunKeluaran(){
        this.tahunKeluaran = tahunKeluaran;
    }
    public int getTahunKeluaran(){
        return tahunKeluaran;
    }

    

    @Override
    public abstract String cetakInfo();

}

class MobilPribadi extends Mobil {
    public MobilPribadi(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaran) {
        super(noPlat, merkMobil, warnaMobil, tahunKeluaran);
    }

    @Override
    public String cetakInfo() {
        return "Mobil : " + getMerkMobil() + "\n" +
        "warna: " + getWarnaMobil() + "\n" +
        "plat nomer: " + getNoPLat() + "\n" +
        "tahun keluaran: " + getTahunKeluaran()+"\n";
    }
}

class MiniBus extends Mobil {
    public MiniBus(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaran) {
        super(noPlat, merkMobil, warnaMobil, tahunKeluaran);
    }

    @Override
    public String cetakInfo() {
        return "Mobil : " + getMerkMobil() + "\n" +
        "warna: " + getWarnaMobil() + "\n" +
        "no plat: " + getNoPLat() + "\n" +
        "tahun : " + getTahunKeluaran()+"\n";
    }
}

class Bus extends Mobil {
    public Bus(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaran) {
        super(noPlat, merkMobil, warnaMobil, tahunKeluaran);
    }

    @Override
    public String cetakInfo() {
            return "Mobil : " + getMerkMobil() + "\n" +
               "Warna : " + getWarnaMobil() + "\n" +
               "No Plat : " + getNoPLat() + "\n" +
               "Tahun : " + getTahunKeluaran()+"\n";

                  
    }
    
        
}
