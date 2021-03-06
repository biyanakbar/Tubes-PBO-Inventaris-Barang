/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Reynaldi
 */
public class ViewPetugasTambahBarang extends javax.swing.JFrame {

    /**
     * Creates new form ViewPetugasTambahBarang
     */
    public ViewPetugasTambahBarang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTambah = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txNamaBarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txJumlah = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        txGudang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTambah.setText("Tambah");

        btnCancel.setText("Cancel");

        jLabel1.setText("ID Barang");

        jLabel3.setText("Jumlah");

        txJumlah.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel2.setText("ID Gudang");

        txGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txGudangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addComponent(txJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txGudang, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnTambah))
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txGudangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txGudangActionPerformed

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnTambah() {
        return btnTambah;
    }

    public void addListener(ActionListener e) {
        btnTambah.addActionListener(e);
        btnCancel.addActionListener(e);
    }
    
    public void setNamaBarang(String s) {
        txNamaBarang.setText(s);
    }
    
    public void setGudang(String s) {
        txGudang.setText(s);
    }
               
    public void setStock(int i) {
        txJumlah.setValue(i);
    }
    
    public String getNamaBarang() {
        return txNamaBarang.getText();
    }
    
    public String getGudang() {
        return txGudang.getText();
    }
    
    public int getJumlah() {
        return (int) txJumlah.getValue();
    }
    
    public void resetJum(){
        txJumlah.setValue(1);
    }
    
    public void reset(){
        txNamaBarang.setText(null);
        txJumlah.setValue(1);
        txGudang.setText(null);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txGudang;
    private javax.swing.JSpinner txJumlah;
    private javax.swing.JTextField txNamaBarang;
    // End of variables declaration//GEN-END:variables
}
