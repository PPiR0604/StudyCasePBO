package kuliah.studycasepbo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Bus extends Transportasi {

    Bus(String maskapai, String keberangkatan, String tujuan, String Harga, int bangku, String DataOrder) {
        super(maskapai, keberangkatan, tujuan, bangku, Harga, DataOrder);
    }

    Bus() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    void lessTheCapacity(int book) {
        capacity -= book;
    }
    @Override
    public void putDataOrder(String dataOrder) {
        // TODO Auto-generated method stub
        super.putDataOrder(dataOrder);
    }
    @Override
    public int getOrderedAt(String tanggal) {
        // TODO Auto-generated method stub
        return super.getOrderedAt(tanggal);
    }
    @Override
    public String getDataOrder() {
        // TODO Auto-generated method stub
        return super.getDataOrder();
    }
    @Override
    public String getHarga(){
        return super.getHarga();
    }


    ArrayList<Transportasi> searchData() {
        try {
            ArrayList<Transportasi> data=new ArrayList<>();
            File file = new File("C:\\Users\\ASUS\\Documents\\Dev\\DataBus.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] arr = line.split(";");
                if (arr.length==6) {
                    data.add(new Bus(arr[0], arr[1], arr[2], arr[3],Integer.parseInt(arr[4]), arr[5]));
                }else{
                    data.add(new Bus(arr[0], arr[1], arr[2], arr[3],Integer.parseInt(arr[4]), null));
                }
            }
            in.close();
            return data;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
}
