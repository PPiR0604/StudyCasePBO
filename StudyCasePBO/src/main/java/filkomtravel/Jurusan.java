package filkomtravel;

public enum Jurusan {
    SURABAYA_MALANG("Surabaya-Malang"),
    MADURA_MALANG("Madura-Malang"),
    BANYUWANGI_MALANG("Banyuwangi-Malang"),
    SITUBONDO_MALANG("Situbondo-Malang"),
    TULUNGAGUNG_MALANG("Tulungagung-Malang"),
    KOSONG("");

    private String type;

    Jurusan(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}