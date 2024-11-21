package filkomtravel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.JOptionPane;


public class Database {
    //Karyawan
    List<SupirTravel> daftarSupirTravel = new ArrayList<>();
    List<SupirRentCar> daftarSupirRentCar = new ArrayList<>();
    List<Admin> daftarAdmin = new ArrayList<>();

    //pesanan
    List<Pelanggan> daftarPelanggan = new ArrayList<>();
    List<pesanan> daftarpesanan = new ArrayList<>();

    //Mobil
    List<MobilPribadi> daftarMobilProbadi = new ArrayList<>();
    List<MiniBus> daftarMiniBus = new ArrayList<>();
    List<Bus> daftarBus = new ArrayList<>();

    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
    String formattedDate = currentDate.format(formatter);

    public void sortSupirTravel() {
        Collections.sort(daftarSupirTravel, new Comparator<SupirTravel>() {
            @Override
            public int compare(SupirTravel a1, SupirTravel a2) {
                return Integer.compare(a1.getUmur(), a2.getUmur());
            }
        });
    }

    public void sortSupirRentCar() {
        Collections.sort(daftarSupirRentCar, new Comparator<SupirRentCar>() {
            @Override
            public int compare(SupirRentCar a1, SupirRentCar a2) {
                return Integer.compare(a1.getUmur(), a2.getUmur());
            }
        });
    }

    public void sortAdmin() {
        Collections.sort(daftarAdmin, new Comparator<Admin>() {
            @Override
            public int compare(Admin a1, Admin a2) {
                return Integer.compare(a1.getUmur(), a2.getUmur());
            }
        });
    }

    public String output(List<Admin> daftarAdmin) {
        StringBuilder result = new StringBuilder();
        result.append("LIST Admin\n\n");
        for (Admin admin : daftarAdmin) {
            result.append(admin.cetakInfo()).append("\n");
        }
        return result.toString();
    }
    public String outputsupirTravel(List<SupirTravel> daftarSupirTravel) {
        StringBuilder result = new StringBuilder();
        result.append("LIST Supir Travel\n\n");
        for (SupirTravel admin : daftarSupirTravel) {
            result.append(admin.cetakInfo()).append("\n");
        }
        return result.toString();
    }
    public String outputsemuamobil(List<MobilPribadi> MOBIL,List<Bus> bus,List<MiniBus> minibus) {
        StringBuilder result = new StringBuilder();
        result.append("TANGGAL DAN BULAN : "+ formattedDate+"\n\n");
        result.append("LIST MOBIL\n\n");
        for (MobilPribadi admin : MOBIL) {
            result.append(admin.cetakInfo()).append("\n");
        }
        result.append("LIST BUS\n\n");
        for (Bus admin : bus) {
            result.append(admin.cetakInfo()).append("\n");
        }
        result.append("LIST MIINIBUS\n\n");
        
        for (MiniBus admin : minibus) {
            result.append(admin.cetakInfo()).append("\n");
        }
        return result.toString();
    }
    public String outputsemuakaryawan (List<Admin> MOBIL,List<SupirTravel> bus,List<SupirRentCar> minibus) {
        StringBuilder result = new StringBuilder();
        result.append("TANGGAL DAN BULAN : "+ formattedDate+"\n\n");
        result.append("LIST ADMIN\n\n");
        for (Admin admin : MOBIL) {
            result.append(admin.cetakInfo()).append("\n");
        }
        result.append("LIST SUPIR TRAVEL\n\n");
        for (SupirTravel admin : bus) {
            result.append(admin.cetakInfo()).append("\n");
        }
        result.append("LIST MINIBUS\n\n");
        for (SupirRentCar admin : minibus) {
            result.append(admin.cetakInfo()).append("\n");
        }
        return result.toString();
    }
    public String outputsupirrent(List<SupirRentCar> daftarSupirren) {
        StringBuilder result = new StringBuilder();
        result.append("LIST Admin\n\n");
        for (SupirRentCar admin : daftarSupirren) {
            result.append(admin.cetakInfo()).append("\n");
        }
        return result.toString();
    }
    public String outputpesan(List<pesanan> daftarpesanan) {
        StringBuilder result = new StringBuilder();
        result.append("LIST Admin\n\n");
        for (pesanan pesanan : daftarpesanan) {
            result.append(pesanan.cetakInfo()).append("\n");
        }
        return result.toString();
    }


    public pesanan dapatkanpesanan(Pelanggan pelanggan) {
        pesanan pesan = new pesanan();
        Pelanggan temp = pelanggan;
        SupirTravel supir = new SupirTravel("kosong", formattedDate, formattedDate, formattedDate, formattedDate, 0, null);
        
        Jurusan rute= temp.getrute() ;
        boolean ditemukan=false;
        int hapus=-1;
        for (int idx = 0; idx < daftarSupirTravel.size(); idx++) {
            SupirTravel elem = daftarSupirTravel.get(idx);
            
            if(elem.getRute().equals(rute)){
                ditemukan=true;
                hapus=idx;
                supir= daftarSupirTravel.get(idx);
                break;
            }
            
                
        }

        if(ditemukan){
              
        daftarPelanggan.remove(temp);
        daftarSupirTravel.remove(hapus);
        int randomNum = (int) (Math.random() * 3) + 1;
        
        if(randomNum==1) {
            int randommobil= (int)(Math.random()*daftarMobilProbadi.size());
            MobilPribadi mobil = daftarMobilProbadi.get(randommobil);
            daftarMobilProbadi.remove(randommobil);
            pesanan pesanan = new pesanan(temp, supir, mobil ,pelanggan.getrute());
            daftarpesanan.add(pesanan);
            JOptionPane.showMessageDialog(null, "SUPIR ANDA :"+supir.getNama()+"\n"+"RUTE :"+supir.getRute(), "BERHASIL MEMESAN", JOptionPane.INFORMATION_MESSAGE);
            return pesanan;
        }
            
        if(randomNum==2 ){
            int randommobil= (int)(Math.random()*daftarBus.size());
            Bus bus = daftarBus.get(randommobil);
            daftarBus.remove(randommobil);
            pesanan pesanan = new pesanan(temp, supir, bus, pelanggan.getrute());
            daftarpesanan.add(pesanan);
            JOptionPane.showMessageDialog(null, "SUPIR ANDA :"+supir.getNama()+"\n"+"RUTE :"+supir.getRute(), "BERHASIL MEMESAN", JOptionPane.INFORMATION_MESSAGE);
            return pesanan;
        }
          
        if(randomNum==3 ){
            int randommobil= (int)(Math.random()*daftarMiniBus.size());
            MiniBus minibus = daftarMiniBus.get(randommobil);
            daftarMiniBus.remove(randommobil);
            pesanan pesanan = new pesanan(temp, supir, minibus,pelanggan.getrute());
            daftarpesanan.add(pesanan);
            JOptionPane.showMessageDialog(null, "SUPIR ANDA :"+supir.getNama()+"\n"+"RUTE :"+supir.getRute(), "BERHASIL MEMESAN", JOptionPane.INFORMATION_MESSAGE);
            return pesanan;
        }
        JOptionPane.showMessageDialog(null, "TIDAK ADA SUPIR UNTUK RUTE INI", "GAGAL MEMESAN", JOptionPane.ERROR_MESSAGE);
            return pesan;
        }
        else{
            JOptionPane.showMessageDialog(null, "TIDAK ADA SUPIR UNTUK RUTE INI", "GAGAL MEMESAN", JOptionPane.ERROR_MESSAGE);
            return pesan ;}
        
}
        


    }

