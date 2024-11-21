package kuliah.studycasepbo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public abstract class Transportasi  {
    String maskapai;
    String tujuan;
    String keberangkatan;
    String harga;
    int capacity;
    Map<String, Integer> beenOrder=new HashMap<>();

    Transportasi(String maskapai, String keberangkatan, String tujuan, int capacity, String harga, String dataOrder){
        this.capacity=capacity;
        this.tujuan=tujuan;
        this.keberangkatan=keberangkatan;
        this.harga=harga;
        this.maskapai=maskapai;
        putDataOrder(dataOrder);
    }
    Transportasi(){}
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return maskapai + ";" + keberangkatan + ";" + tujuan + ";" + harga + ";" + capacity+";"+getDataOrder();
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
    public String getHarga() {
        return harga;
    }
    public int getCapacity() {
        return capacity;
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

    abstract void lessTheCapacity(int book);
    abstract ArrayList<Transportasi> searchData();
}
class AscendingPrice implements Comparator<Transportasi>{
    @Override
    public int compare(Transportasi o1, Transportasi o2) {
        // TODO Auto-generated method stub
        return Integer.parseInt(o1.harga)-Integer.parseInt(o2.harga);
    }
}
class DiscendingPrice implements Comparator<Transportasi>{
    @Override
    public int compare(Transportasi o1, Transportasi o2) {
        // TODO Auto-generated method stub
        return Integer.parseInt(o2.harga)-Integer.parseInt(o1.harga);
    }
}
class AscendingCapacity implements Comparator<Transportasi>{
    @Override
    public int compare(Transportasi o1, Transportasi o2) {
        // TODO Auto-generated method stub
        return o1.capacity-o2.capacity;
    }
}
class DiscendingCapacity implements Comparator<Transportasi>{
    @Override
    public int compare(Transportasi o1, Transportasi o2) {
        // TODO Auto-generated method stub
        return o2.capacity-o1.capacity;
    }
}
