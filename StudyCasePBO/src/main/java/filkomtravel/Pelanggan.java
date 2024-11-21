package filkomtravel;

public class Pelanggan implements CetakInfo {
    protected String nama;
    protected String alamat;
    protected String noTelp;
    protected String jenisKelamin;
    protected String NIK; //tambahan
    protected int noPesan; //tambahan
    protected Jurusan rute;

    public Pelanggan(){};

    public Pelanggan(String nama, String alamat, String noTelp, String jenisKelamin, String NIK, Jurusan rute) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jenisKelamin = jenisKelamin;
        this.NIK = NIK;
        this.rute=rute;
    }
    
    public void setNama(){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public void setAlamat(){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    
    public void setNoTelp(){
        this.noTelp = noTelp;
    }
    public String getNoTelp(){
        return noTelp;
    }
    
    public void setJenisKelamin(){
        this.jenisKelamin = jenisKelamin;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    
    public void setNIK(){
        this.NIK = NIK;
    }
    public String getNIK(){
        return NIK;
    }
    public Jurusan getrute(){
        return rute;
    }
    
    public String cetakInfo(){
        return "Nama : " + getNama() + "\n" +
        "Jenis Kelamin: " + getJenisKelamin() + "\n" +
        "Alamat: " + getAlamat() + "\n" +
        "No Telepon : "+ getNoTelp()+"\n";

    };
}
