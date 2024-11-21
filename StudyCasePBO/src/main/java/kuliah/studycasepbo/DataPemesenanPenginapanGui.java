/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuliah.studycasepbo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DataPemesenanPenginapanGui extends javax.swing.JFrame {

    /**
     * Creates new form DataPemesenanPenginapanGui
     */
    HomeGui home;
    DataDiriTamuGui tamu;
    int kamar;
    int days;
    String nama;
    Akun akun;
    String Checkin;
    String Checkout;
    Penginapan penginapan;
    

    public DataPemesenanPenginapanGui(DataDiriTamuGui tamu, HomeGui home, Akun akun, String nama, String Checkin,
            String Checkout, Penginapan penginapan, int kamar, int days) {
        this.home = home;
        this.akun = akun;
        this.nama = nama;
        this.Checkin = Checkin;
        this.Checkout = Checkout;
        this.penginapan = penginapan;
        this.tamu = tamu;
        this.kamar = kamar;
        this.days = days;
        this.setVisible(true);
        initComponents();
    }

    String getHarga() {
        double temp=Double.parseDouble(penginapan.harga) * days * kamar;
        return String.format("%.0f", temp);
    }

    String getPajak() {
         double temp=Double.parseDouble(getHarga())*5/100;
        return String.format("%.0f", temp);
    }

    String getTotal() {
         double temp=Double.parseDouble(penginapan.harga)+Double.parseDouble(getPajak()) ;
        return String.format("%.0f", temp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 560, Short.MAX_VALUE));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText(Checkout);

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText(Checkout);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 22, 22));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(44, 41, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Penginapan");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tanggal Check-in");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tanggal Check-out");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 560, Short.MAX_VALUE));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 560, 2));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Harga");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Pajak 5%");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Rp" + String.valueOf(getTotal()));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nama");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText(nama);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText(penginapan.jenis + " " + penginapan.nama);
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText(Checkin);
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText(Checkout);
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Rp" + String.valueOf(getHarga()));
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel19.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Rp" + String.valueOf(getPajak()));
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(70, 73, 75));
        jButton1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Bayar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 275, 100, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 620, 320));

        jLabel2.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detail Pemesanan");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 5, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 620, 360));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,
                "Booking " + penginapan.nama + " from " + Checkin + " to " + Checkout + " berhasil");
        datahistory();
        Updatedata();
        this.removeAll();
        this.setVisible(false);
        home.UpdatePane3();
        home.revalidate();
        home.setVisible(true);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void datahistory() {
        String data = akun.nama + ";" + penginapan.getClass().getSimpleName() + ";" + getTotal() + ";" + days + " hari;"+penginapan.nama;
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:\\Users\\ASUS\\Documents\\Dev\\DataHistory.txt", true))) {
            writer.write(data);
            writer.newLine();
            System.out.println("Data pembelian berhasil disimpan.");
        } catch (IOException e) {
            System.err.println("Gagal menyimpan data pembelian: " + e.getMessage());
        }
    }

    private void Updatedata(){
        try {
            // Baca isi file
            FileReader fileReader = new FileReader("C:\\Users\\ASUS\\Documents\\Dev\\DataPenginapan.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            StringBuilder fileContent = new StringBuilder();
            String line;
            String temp=penginapan.toString();
            // Baca setiap baris dalam file
            while ((line = bufferedReader.readLine()) != null) {
                // Cek jika baris mengandung "ABCD"
                if (temp.contains(line)) {
                    penginapan.putDataOrder(Checkin+" "+kamar);
                    String dateTemp="";
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(Checkin, formatter);
                    for (int i = 1; i <= days; i++) {
                        LocalDate nextDate = date.plusDays(i);
                        dateTemp=formatter.format(nextDate);
                        penginapan.putDataOrder(dateTemp+" "+kamar);
                        System.out.println(dateTemp+" "+kamar);
                    }
                    line=penginapan.toString();
                }
                // Tambahkan baris ke file content
                fileContent.append(line).append("\n");
            }
            // Tutup pembaca file
            bufferedReader.close();
            
            // Tulis ulang isi file dengan teks yang ditambahkan
            FileWriter fileWriter = new FileWriter("C:\\Users\\ASUS\\Documents\\Dev\\DataPenginapan.txt");
            fileWriter.write(fileContent.toString());
            // Tutup file writer
            fileWriter.close();
            
            System.out.println("Teks berhasil ditambahkan ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}