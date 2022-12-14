/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import dao.HoaDonDAO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import pojo.DoanhThu;

/**
 *
 * @author PC
 */
public class QL_DoanhThu extends javax.swing.JFrame {

    ArrayList<DoanhThu> lstDoanhThu = new ArrayList<>();
    DefaultTableModel dtm = new DefaultTableModel();
    
    public QL_DoanhThu() {
        initComponents();
        display();
        loadComboBox();
        dtm = (DefaultTableModel)tblKetQuaTK.getModel();
        loadTableInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnKetQuaDoanhThu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKetQuaTK = new javax.swing.JTable();
        pnTimKiem = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbTimKiem = new javax.swing.JLabel();
        cboDMY = new javax.swing.JComboBox<>();
        lbNgayThangNam = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        lbIconPrinter = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblKetQuaTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ng??y", "Th??ng", "N??m", "T???ng ti???n (VND)"
            }
        ));
        jScrollPane1.setViewportView(tblKetQuaTK);

        javax.swing.GroupLayout pnKetQuaDoanhThuLayout = new javax.swing.GroupLayout(pnKetQuaDoanhThu);
        pnKetQuaDoanhThu.setLayout(pnKetQuaDoanhThuLayout);
        pnKetQuaDoanhThuLayout.setHorizontalGroup(
            pnKetQuaDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        pnKetQuaDoanhThuLayout.setVerticalGroup(
            pnKetQuaDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKetQuaDoanhThuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnTimKiem.setBackground(new java.awt.Color(153, 153, 255));
        pnTimKiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitle.setText("Th??ng tin t??m ki???m");

        lbTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTimKiem.setText("T??m ki???m theo:");

        cboDMY.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDMYItemStateChanged(evt);
            }
        });

        lbNgayThangNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNgayThangNam.setText("Nh???p ng??y");

        lbIconPrinter.setBackground(new java.awt.Color(153, 153, 255));
        lbIconPrinter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_printer.png"))); // NOI18N
        lbIconPrinter.setOpaque(true);
        lbIconPrinter.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbIconPrinterMouseMoved(evt);
            }
        });
        lbIconPrinter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIconPrinterMouseExited(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(0, 102, 102));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setText("Th???ng k??");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTimKiemLayout = new javax.swing.GroupLayout(pnTimKiem);
        pnTimKiem.setLayout(pnTimKiemLayout);
        pnTimKiemLayout.setHorizontalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addContainerGap(533, Short.MAX_VALUE))
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNgayThangNam, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboDMY, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(btnThongKe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbIconPrinter)
                        .addGap(160, 160, 160))))
        );
        pnTimKiemLayout.setVerticalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbIconPrinter))
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(48, 48, 48)
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTimKiem)
                            .addComponent(cboDMY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgayThangNam)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongKe))))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnKetQuaDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnKetQuaDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbIconPrinterMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconPrinterMouseMoved
        // TODO add your handling code here:
        lbIconPrinter.setBackground(new Color(235,184,50));
        lbIconPrinter.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0,Color.WHITE));
    }//GEN-LAST:event_lbIconPrinterMouseMoved

    private void lbIconPrinterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIconPrinterMouseExited
        // TODO add your handling code here:
        lbIconPrinter.setBackground(new Color(153,153,255));
        lbIconPrinter.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0,Color.WHITE));
    }//GEN-LAST:event_lbIconPrinterMouseExited

    private void cboDMYItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDMYItemStateChanged
        // TODO add your handling code here:
        lbNgayThangNam.setText("Nh???p " + cboDMY.getSelectedItem().toString() + ":");
    }//GEN-LAST:event_cboDMYItemStateChanged

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        if(txtTimKiem.getText().isEmpty())
            JOptionPane.showMessageDialog(btnThongKe, "M???i b???n nh???p th??ng tin theo ki???u t??m ki???m", "Th??ng b??o", JOptionPane.INFORMATION_MESSAGE);
        else{
            String type = cboDMY.getSelectedItem().toString();
            if (type.equalsIgnoreCase("Ng??y")){
                lstDoanhThu = HoaDonDAO.doanhThu_theoNgayThangNam(txtTimKiem.getText());
            }
            else if (type.equalsIgnoreCase("Th??ng")){
                lstDoanhThu = HoaDonDAO.doanhThu_theoThangNam(txtTimKiem.getText());
            }
            else if(type.equalsIgnoreCase("N??m")){
                lstDoanhThu = HoaDonDAO.doanhThu_theoNam(txtTimKiem.getText());
            }
            
            loadTableInfo();
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QL_DoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_DoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_DoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_DoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_DoanhThu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThongKe;
    private javax.swing.JComboBox<String> cboDMY;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIconPrinter;
    private javax.swing.JLabel lbNgayThangNam;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pnKetQuaDoanhThu;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnTimKiem;
    private javax.swing.JTable tblKetQuaTK;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void display() {
        this.setSize(770, 420);
        this.setTitle("Qu???n l?? doanh thu");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private void loadComboBox() {
        cboDMY.addItem("Ng??y");
        cboDMY.addItem("Th??ng");
        cboDMY.addItem("N??m");
    }

    private void loadTableInfo() {
        dtm.setRowCount(0);
        
        for(DoanhThu dt : lstDoanhThu){
            Vector<Object> dong = new Vector<Object>();
            
            dong.add(dt.getNgay());
            dong.add(dt.getThang());
            dong.add(dt.getNam());
            dong.add(dt.getTongtien());
            
            dtm.addRow(dong);
        }
    }
}
