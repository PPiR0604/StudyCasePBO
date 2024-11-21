package kuliah.studycasepbo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Travel extends Transportasi {
    Travel(String maskapai, String keberangkatan, String tujuan, String Harga, int bangku, String dataOrder) {
        super(maskapai, keberangkatan, tujuan, bangku, Harga,dataOrder);
    }

    Travel() {

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
 ArrayList<Transportasi> searchData() {
     ArrayList<Transportasi> data=new ArrayList<>();
    try {
        File file=new File("C:\\Users\\ASUS\\Documents\\Dev\\DataTravel.txt");
        Scanner in=new Scanner(file);
        while (in.hasNextLine()) {
           String line=in.nextLine();
           String[] temp=line.split(";");
           if (temp.length==6) {
            data.add(new Travel(temp[0],temp[1],temp[2],temp[3],Integer.parseInt(temp[4]), temp[5]));
         }else{
            data.add(new Travel(temp[0],temp[1],temp[2],temp[3],Integer.parseInt(temp[4]), null));

        }
        }
        in.close();
    } catch (Exception e) {
        // TODO: handle exception
    }

     return data;
 }

}
