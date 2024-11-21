package kuliah.studycasepbo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class History {
    String uname;
    String service;
    String harga;
    String tujuanOrHari;
    String nama;

    History(String uname, String service, String harga, String tujuanOrHari) {
        this.harga = "Rp" + harga;
        this.service = service;
        this.tujuanOrHari = tujuanOrHari;
        this.uname = uname;
        
    }
    History(String uname, String service, String harga, String tujuanOrHari, String nama) {
        this.harga = "Rp" + harga;
        this.service = service;
        this.tujuanOrHari = tujuanOrHari;
        this.uname = uname;
        this.nama=nama;
        
    }

    History() {
    }

    ArrayList<History> searchData(String nama, int service) {
        ArrayList<History> temp = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\ASUS\\Documents\\Dev\\DataHistory.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] arr = line.split(";");
                if (arr[0].equals(nama)) {
                    if (service==1&&!arr[1].equals("Penginapan")) {
                        temp.add(new History(arr[0], arr[1], arr[2], arr[3]));
                    }else if (service==2&&arr[1].equals("Penginapan")) {
                        temp.add(new History(arr[0], arr[1], arr[2], arr[3], arr[4]));
                    }

                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        Collections.reverse(temp);
        return temp;
    }
}
