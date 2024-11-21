package filkomtravel;

public abstract class Karyawan {
    protected String nama;
    protected String alamat;
    protected String noTelp;
    protected String jenisKelamin;
    protected String kategori;
    protected String NIK; //tambahan
    protected int umur; //tambahan

    public Karyawan(String nama, String alamat, String noTelp, String jenisKelamin, String kategori, String NIK, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jenisKelamin = jenisKelamin;
        this.kategori = kategori;
        this.NIK = NIK;
        this.umur = umur;
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
    
    public void setKategori(){
        this.kategori = kategori;
    }
    public String getKategori(){
        return kategori;
    }
    
    public void setNIK(){
        this.NIK = NIK;
    }
    public String getNIK(){
        return NIK;
    }
    
    public void setUmur(){
        this.umur = umur;
    }
    public int getUmur(){
        return umur;
    }
    
    public abstract String cetakInfo();
}

class SupirTravel extends Karyawan {
    protected Jurusan rute;
    public SupirTravel(String nama, String alamat, String noTelp, String jenisKelamin, String NIK, int umur, Jurusan rute) {
        super(nama, alamat, noTelp, jenisKelamin, "Supir Travel", NIK, umur);
        this.rute = rute;
    }
    public Jurusan getRute() {
        return rute;
    }

    @Override
    public String cetakInfo() {
        return "Nama : " + getNama() + "\n" +
           "Jenis Kelamin: " + getJenisKelamin() + "\n" +
           "Alamat: " + getAlamat() + "\n" +
           "Kategori: " + getKategori()+"\n"+
           "No Telepon : "+ getNoTelp()+"\n";
              
}
   
}

class SupirRentCar extends Karyawan {
    protected Jurusan rute;
    public SupirRentCar(String nama, String alamat, String noTelp, String jenisKelamin, String NIK, int umur,Jurusan rute) {
        super(nama, alamat, noTelp, jenisKelamin, "Supir Rent Car", NIK, umur);
        this.rute=rute;
    }

    @Override
    public String cetakInfo() {
        return "Nama : " + getNama() + "\n" +
           "Jenis Kelamin: " + getJenisKelamin() + "\n" +
           "Alamat: " + getAlamat() + "\n" +
           "Kategori: " + getKategori()+"\n"+
           "No Telepon : "+ getNoTelp()+"\n";
              
}

}

class Admin extends Karyawan {
    public Admin(String nama, String alamat, String noTelp, String jenisKelamin, String NIK, int umur) {
        super(nama, alamat, noTelp, jenisKelamin, "Admin", NIK, umur);
    }
    
    @Override
    public String cetakInfo() {
        return "Nama : " + getNama() + "\n" +
           "Jenis Kelamin: " + getJenisKelamin() + "\n" +
           "Alamat: " + getAlamat() + "\n" +
           "Kategori: " + getKategori()+"\n"+
           "No Telepon : "+ getNoTelp()+"\n"+
           "NIK : "+ getNIK()+"\n"+
           "umur : "+getUmur()+"\n" ;

              
    }
}

