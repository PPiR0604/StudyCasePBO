/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kuliah.studycasepbo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author ASUS
 */
public class TransportasiGui extends javax.swing.JFrame {

    /**
     * Creates new form Transportasi
     */
    LoginGui logingui;
    ArrayList<Transportasi> data = new ArrayList<>();
    Transportasi search;
    HomeGui home;
    Akun akun;
    boolean sortprice = true;
    boolean sortcapacity = true;

    public TransportasiGui(LoginGui logingui, Transportasi trans, HomeGui home, Akun akun) {
        this.logingui = logingui;
        this.setVisible(true);
        this.search = trans;
        this.akun = akun;
        this.home = home;
        data = search.searchData();
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        KursiSpiner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TanggalSpiner = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        sortSpin = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Keliling");

        jPanel1.setBackground(new java.awt.Color(25, 22, 22));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(search.getClass().getSimpleName());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 30, 250, 25));

        jComboBox1.setBackground(new java.awt.Color(60, 63, 65));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(getDataDepdandes(2)));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, 25));

        jComboBox2.setBackground(new java.awt.Color(60, 63, 65));
        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(getDataDepdandes(1)));
        jComboBox2.setBorder(null);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 25));

        KursiSpiner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        KursiSpiner.setBorder(null);
        KursiSpiner.setOpaque(true);
        jPanel1.add(KursiSpiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 60, 25));

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kursi :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Keberangkatan : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tujuan :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(70, 73, 75));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cari");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 130, 25));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setForeground(new java.awt.Color(60, 63, 65));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 620, 290));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kursi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Maskpai");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Keberangkatan dan Tujuan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Harga");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        TanggalSpiner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        TanggalSpiner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_WEEK));
        TanggalSpiner.setEditor(new javax.swing.JSpinner.DateEditor(TanggalSpiner, "dd/MM/yyyy"));
        jPanel1.add(TanggalSpiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 100, 25));

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tanggal :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jButton4.setBackground(new java.awt.Color(70, 73, 75));
        jButton4.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Kembali");
        jButton4.setBorder(null);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, 25));

        sortSpin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending by Capacity", "Discending by Capacity", "Ascending by Price", "Discending by Price" }));
        sortSpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortSpinActionPerformed(evt);
            }
        });
        jPanel1.add(sortSpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 135, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.removeAll();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void sortSpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortSpinActionPerformed
        Date date = (Date) TanggalSpiner.getValue();
        SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
        String tanggal = simple.format(date);
        if (sortSpin.getSelectedItem().equals("Discending by Price")) {
            Collections.sort(data, new DiscendingPrice());
            sortprice = false;
            searchAllData();
        } else if (sortSpin.getSelectedItem().equals("Ascending by Price")) {
            Collections.sort(data, new AscendingPrice());
            sortprice = true;
            searchAllData();
        } else if (sortSpin.getSelectedItem().equals("Discending by Capacity")) {
            Collections.sort(data, new DiscendingCapacity());
            sortcapacity = false;
            searchAllData();
        } else {
            Collections.sort(data, new AscendingCapacity());
            sortcapacity = true;
            searchAllData();
        }


    }//GEN-LAST:event_sortSpinActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox1ActionPerformed

    private void pesanbuttonAcvtion(java.awt.event.ActionEvent ect, Transportasi bus, int capacity) {
        Date date = (Date) TanggalSpiner.getValue();
        SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
        String tanggal = simple.format(date);
        if (!tanggal.isBlank()) {
            OpenDataDiri(bus, tanggal, capacity);
        }
    }

    private String[] getDataDepdandes(int n) {
        ArrayList<String> temp = new ArrayList<>();
        if (n == 1) {
            for (Transportasi entry : data) {
                if (!temp.contains(entry.keberangkatan)) {
                    temp.add(entry.keberangkatan);
                }
            }
        } else {
            for (Transportasi entry : data) {
                if (!temp.contains(entry.tujuan)) {
                    temp.add(entry.tujuan);
                }
            }
        }
        return temp.toArray(new String[0]);
    }

    private void searchAllData() {
        String Departure = (String) jComboBox2.getSelectedItem();
        String Destination = (String) jComboBox1.getSelectedItem();
        Date date = (Date) TanggalSpiner.getValue();
        SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
        String tanggal = simple.format(date);
        jPanel2.removeAll(); // Clear previous results
        for (Transportasi bus2 : data) {
            if (bus2.keberangkatan.equals(Departure) && bus2.tujuan.equals(Destination)) {
                addLabel(bus2, tanggal);
            }
        }
        jPanel2.revalidate(); // Refresh the panel
        jPanel2.repaint(); // Repaint to update the
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST
        searchAllData();

    }

    private void addLabel(Transportasi bus, String date) {
        int capacity=bus.getOrderedAt(date);
        JPanel item = new JPanel();
        item.setLayout(new BoxLayout(item, BoxLayout.X_AXIS));
        item.setBackground(new java.awt.Color(70, 73, 75));
        item.setForeground(new java.awt.Color(255, 255, 255));
        item.setMaximumSize(new java.awt.Dimension(615, 50));
        item.setMinimumSize(new java.awt.Dimension(615, 50));
        item.setPreferredSize(new java.awt.Dimension(615, 50));
        item.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JLabel transportLabel = new JLabel("  " + bus.maskapai);
        transportLabel.setForeground(new java.awt.Color(225, 225, 225));
        transportLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        transportLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 12));
        JLabel Destination = new JLabel(bus.keberangkatan + " ke " + bus.tujuan);
        Destination.setForeground(new java.awt.Color(225, 225, 225));
        Destination.setMaximumSize(new java.awt.Dimension(210, 20));
        Destination.setFont(new java.awt.Font("Montserrat Medium", 0, 12));
        JLabel Harga = new JLabel("Rp" + bus.harga);
        Harga.setForeground(new java.awt.Color(225, 225, 225));
        Harga.setMaximumSize(new java.awt.Dimension(120, 20));
        Harga.setFont(new java.awt.Font("Montserrat Medium", 0, 12));
        JLabel kursi = new JLabel(String.valueOf(bus.capacity-capacity));
        kursi.setForeground(new java.awt.Color(225, 225, 225));
        kursi.setMaximumSize(new java.awt.Dimension(50, 20));
        kursi.setFont(new java.awt.Font("Montserrat Medium", 0, 12));
        JButton pesan = new JButton();
        pesan.setText("Pesan");
        pesan.setBackground(new java.awt.Color(70, 73, 75));
        pesan.setForeground(new java.awt.Color(255, 255, 255));
       
        
        item.add(transportLabel);
        item.add(Destination);
        item.add(Harga);
        item.add(kursi);
        jPanel2.add(item);
        
         if (bus.capacity-capacity>0) {
            pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanbuttonAcvtion(evt, bus, capacity);
            }
        });
            item.add(pesan);
        }

    }

    private void OpenDataDiri(Transportasi bus, String tanggal, int capacity) {
        int kursi = (Integer) KursiSpiner.getValue();
        if (kursi>bus.capacity-capacity||bus.capacity==0) {
            JOptionPane.showMessageDialog(null,
                "Kapasitas Penuh");
        }
        else{
        new DatadiriPenumpang(this, bus, tanggal, kursi, akun, home);
        this.setVisible(false);
        }
        

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner KursiSpiner;
    private javax.swing.JSpinner TanggalSpiner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sortSpin;
    // End of variables declaration//GEN-END:variables
}
