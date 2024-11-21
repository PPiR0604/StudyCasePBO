/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filkomtravel;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author rafia
 */
public class MAIN {

    
    public static void main(String[] args) {
       
        Database database = new Database();
        
        // try  {
        //         File filePath = new File("data.txt")  ;
        //         Scanner in = new Scanner(filePath);
        //     String line;
        //     while ((in.hasNextLine())) {
        //         line = in.nextLine();
        //         String[]temp=line.split(" ");
        //         String nama= temp[0];
        //         String alamat = temp [1];
        //         String no = temp[2];
        //         String jenis = temp[3];
        //         String nik = temp[4];
        //         int umur = Integer.parseInt(temp[5]);
        //         database.daftarAdmin.add(new Admin (nama,alamat,no,jenis,nik,umur));
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        database.daftarAdmin.add(new Admin ("RAFI","BATU","12231","L","nik",9));
        database.daftarAdmin.add(new Admin ("RAAKSY", "BATU", "12992931", "L", "nik", 7));
        database.daftarAdmin.add(new Admin ("RAFI","BATU","12231","L","nik",6));
        database.daftarAdmin.add(new Admin ("RAAKSY", "BATU", "12992931", "L", "nik", 5));
        database.daftarSupirRentCar.add(new SupirRentCar ("BUDI", "BATU", "12992931", "L", "nik", 7,Jurusan.MADURA_MALANG));
        database.daftarSupirTravel.add(new SupirTravel ("BAMBANG", "BAb", "12992931", "L", "nik", 7,Jurusan.BANYUWANGI_MALANG));
        database.daftarSupirTravel.add(new SupirTravel ("RASKY", "BAb", "12992931", "L", "nik", 7,Jurusan.SURABAYA_MALANG));
        database.daftarMobilProbadi.add(new MobilPribadi("M 45 BRO", "Roger Sumatera", "Hitam", 2015));
        database.daftarMobilProbadi.add(new MobilPribadi("M 45 BRO", "Roger Sulawesi", "Hitam", 2015));
        database.daftarMobilProbadi.add(new MobilPribadi("M 45 BRO", "Roger Jawa", "Hitam", 2015));
        database.daftarBus.add(new Bus("F 6009 UC", "Hino Jetbus SHD", "Putih", 2010));
        database.daftarBus.add(new Bus("F 6009 UC", "Hino Dutro", "Putih", 2010));
        database.daftarBus.add(new Bus("F 6009 UC", "Hinono", "Putih", 2010));
        database.daftarMiniBus.add(new MiniBus("B 5168 FA", "HAC", "Merah", 2019));
        database.daftarMiniBus.add(new MiniBus("B 5168 FA", "Hi ACE", "Merah", 2019));
        database.daftarMiniBus.add(new MiniBus("B 5168 FA", "goks", "Merah", 2019));

        database.sortAdmin();
        
        MENU menu = new MENU(database);
        menu.setVisible(true);
        
        
    }
}
