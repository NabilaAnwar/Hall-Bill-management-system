
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Regester extends javax.swing.JFrame {

    public Regester() {
        initComponents();  //initialise components (set default values etc.)
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bsubmit = new javax.swing.JButton();
        rollfield = new javax.swing.JTextField();
        roll = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        seatrent = new javax.swing.JTextField();
        mealcharge = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btntotal = new javax.swing.JButton();
        service = new javax.swing.JTextField();
        servicecharge = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        bsubmit.setText("Submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });

        rollfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollfieldActionPerformed(evt);
            }
        });

        roll.setText("Enter the roll");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        mealcharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealchargeActionPerformed(evt);
            }
        });

        jLabel1.setText(" Month");

        jLabel2.setText("Name");

        jLabel3.setText("Seat rent");

        jLabel4.setText("Meal Charge");

        btntotal.setText("Total");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        servicecharge.setText("Service charge");
        servicecharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicechargeActionPerformed(evt);
            }
        });

        menu.setText("Main Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btntotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(servicecharge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(service)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(mealcharge, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatrent)
                    .addComponent(name)
                    .addComponent(month)
                    .addComponent(rollfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rollfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatrent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mealcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(servicecharge))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubmitActionPerformed
                                                   
       Integer roll; //reference of Integer class.
       roll = Integer.parseInt(rollfield.getText());  /*gets the string from rollffield,convert it in string 
                                                        and initialize in roll.*/
      
        File f; //File class reference created
        FileWriter fw = null; //create a FileWriter object and initialize valu.
        
         try {
                f = new File("G:\\project\\My project\\Feesmanagement\\"+roll.toString()+".txt"); //create File object in given location
                if(f.length()==0) //checks if the file is empty
                {
                fw = new FileWriter(f); //creates Filewriter object.
                fw.write(month.getText()+" "); //write in file from text area month
                fw.write(name.getText()+" "); //write in file from text area name
                fw.write(seatrent.getText()+" "); //write in file from text area seatrent
                fw.write(mealcharge.getText()+" "); //write in file from text area mealcharge
                fw.write(service.getText()+" "); //write in file from text area service
                fw.write(total.getText()+" "); //write in file from text area total
                }
                else
                {
                fw = new FileWriter(f,true);  //tells the FileWriter to append any given input 
                fw.append(month.getText()+" "); //append in file from text area month
                fw.append(name.getText()+" "); //append in file from text area name
                fw.append(seatrent.getText()+" "); //append in file from text area seatrent
                fw.append(mealcharge.getText()+" "); //append in file from text area mealcharge
                fw.write(service.getText()+" ");  //append in file from text area service
                fw.append(total.getText()+" "); //append in file from text area total
        
                }
                fw.close(); //close File.
                
               
            } catch (IOException ex) {     
                
            }

                                       
    
    }//GEN-LAST:event_bsubmitActionPerformed

    private void rollfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollfieldActionPerformed
        
    }//GEN-LAST:event_rollfieldActionPerformed

    private void mealchargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealchargeActionPerformed
        
    }//GEN-LAST:event_mealchargeActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
    }//GEN-LAST:event_nameActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        double s,m,t,sa;
        s = Double.parseDouble(seatrent.getText()); //converts the string of seatrent to double
        m = Double.parseDouble(mealcharge.getText()); //converts the string of mealcharge to double
        sa = Double.parseDouble(service.getText()); //converts the string of service to double
        t = s+m+sa;
        total.setText(Double.toString(t)); //convertss Double result to string and set it in total
    }//GEN-LAST:event_btntotalActionPerformed

    private void servicechargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicechargeActionPerformed
        double m,s;
        m = Double.parseDouble(mealcharge.getText()); //converts the string of mealcharge to double
        s = (m * 0.1);
        service.setText(Double.toString(s)); //convertss Double result to string and set it in service
    }//GEN-LAST:event_servicechargeActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
                Home h = new Home(); //creates a object of Home
                h.setVisible(true); //make Home visible.
                dispose(); //close Regester window
    }//GEN-LAST:event_menuActionPerformed
        

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regester().setVisible(true); //make Regester visible.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsubmit;
    private javax.swing.JButton btntotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mealcharge;
    private javax.swing.JButton menu;
    private javax.swing.JTextField month;
    private javax.swing.JTextField name;
    private javax.swing.JLabel roll;
    private javax.swing.JTextField rollfield;
    private javax.swing.JTextField seatrent;
    private javax.swing.JTextField service;
    private javax.swing.JButton servicecharge;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

}

