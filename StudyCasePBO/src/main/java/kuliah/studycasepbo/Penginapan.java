package kuliah.studycasepbo;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Penginapan {
    String nama;
    String jenis;
    int kamar;
    String harga;
    Map<String, Integer> beenOrder=new HashMap<>();

    Penginapan(String jenis, String nama, int kamar, String harga, String dataOrder){
        this.jenis=jenis;
        this.nama=nama;
        this.harga=harga;
        this.kamar=kamar;
        putDataOrder(dataOrder);
    }
    Penginapan(){}
    ArrayList<Penginapan> Searchdata(){
        ArrayList<Penginapan> temp=new ArrayList<>();
        try {
            File file=new File("C:\\Users\\ASUS\\Documents\\Dev\\DataPenginapan.txt");
            Scanner in=new Scanner(file);
            while (in.hasNextLine()) {
                String line=in.nextLine();
                String[] arr=line.split(";");
                if (arr.length==5) {
                    temp.add(new Penginapan(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], arr[4]));
                }else{
                    temp.add(new Penginapan(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], null));

                }
            }
            in.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return temp;
    } 
    public void putDataOrder(String dataOrder) {
        if (dataOrder!=null) {
            String[] temp=dataOrder.split(" ");
            for (int i = 0; i < temp.length; i+=2) {
                if (beenOrder.containsKey(temp[i])) {
                   int data=Integer.parseInt(temp[i+1]);
                   int tempData=beenOrder.get(temp[i]);
                   beenOrder.replace(temp[i], data+tempData);
                }else{
                    beenOrder.put(temp[i], Integer.parseInt(temp[i+1]));
                }
            }
        }

    }
    public String getDataOrder(){
        String temp="";
        for (Map.Entry<String, Integer> entry: beenOrder.entrySet()) {
            temp+=entry.getKey()+" "+entry.getValue()+" ";
        }
        return temp;
    }
    public int getOrderedAt(String tanggal){
        if (beenOrder.containsKey(tanggal)) {
            return beenOrder.get(tanggal);
        }return 0;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return jenis+";"+nama+";"+kamar+";"+harga+";"+getDataOrder();
    }
}

class PAscendingCapacity implements Comparator<Penginapan>{
    @Override
    public int compare(Penginapan o1, Penginapan o2) {
        // TODO Auto-generated method stub
        return o1.kamar-o2.kamar;
    }
}
class PDiscendingCapacity implements Comparator<Penginapan>{
    @Override
    public int compare(Penginapan o1, Penginapan o2) {
        // TODO Auto-generated method stub
        return o2.kamar-o1.kamar;
    }
}
class PAscendingPrice implements Comparator<Penginapan>{
    @Override
    public int compare(Penginapan o1, Penginapan o2) {
        double temp=Double.parseDouble(o1.harga)-Double.parseDouble(o2.harga);
        return (int) temp;
    }
}
class PDiscendingPrice implements Comparator<Penginapan>{
    @Override
    public int compare(Penginapan o1, Penginapan o2) {
        // TODO Auto-generated method stub
        double temp=Double.parseDouble(o2.harga)-Double.parseDouble(o1.harga);
        return (int) temp;
    }
}
