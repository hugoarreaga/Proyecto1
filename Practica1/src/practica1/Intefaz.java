/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author Arreaga
 */
public class Intefaz extends javax.swing.JFrame {

    int probabilidad = (int) (Math.random() * 10 + 0);
    String avionTipo = "";
    int pasajeros = 0;
    int desabordaje = 0;
    int mantenimiento = 0;
    int pasajeros_M[][] = new int[pasajeros][4];

    /**
     * Creates new form Intefaz
     */
    public Intefaz() {
        initComponents();
        setResizable(false);
    }
    int turnos = 0, turnoactual = 0, aviones, cant_escritorios, tam_fila_registro, est_registro, tam_fila_servicio;
    int maletas_totales = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TurnosSimulacion = new javax.swing.JTextField();
        Cant_aviones = new javax.swing.JTextField();
        Cant_registros = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fila_registro = new javax.swing.JTextField();
        Est_mantenimiento = new javax.swing.JTextField();
        Fila_servicio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 320));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Turnos para finalizar la simulacion:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Cantidad de aviones:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Cantidad de escritorios de registro:");

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Tamaño de la fila de registros:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Estaciones de mantenimiento:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Tamaño de la fila de servicios:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fila_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(Est_mantenimiento)
                    .addComponent(Fila_servicio)
                    .addComponent(Cant_aviones)
                    .addComponent(Cant_registros)
                    .addComponent(TurnosSimulacion))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TurnosSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Cant_aviones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Cant_registros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Fila_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Est_mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Fila_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jButton1.setText("Nueva Simulación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente >>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i = 1;
        this.turnoactual = 0;

            
        Texto.setText("  "+"\n"); 
        
        try {
            turnos = Integer.parseInt(TurnosSimulacion.getText());       
        } catch (NumberFormatException e) {
            Texto.append("  ''"+TurnosSimulacion.getText()+"''  no es un numero "+"\n");         
        }
        
        try {
            aviones = Integer.parseInt(Cant_aviones.getText());       
        } catch (NumberFormatException e) {
            Texto.append("  ''"+Cant_aviones.getText()+"''  no es un numero "+"\n");         
        }
        try {
            cant_escritorios = Integer.parseInt(Cant_registros.getText());       
        } catch (NumberFormatException e) {
            Texto.append("  ''"+Cant_registros.getText()+"''  no es un numero "+"\n");         
        }
     

        try {
            tam_fila_registro = Integer.parseInt(Fila_registro.getText());
        } catch (NumberFormatException e) {
            Texto.append("  ''"+Fila_registro.getText()+"''  no es un numero "+"\n");      
        }

        try {
            est_registro = Integer.parseInt(Est_mantenimiento.getText());
        } catch (NumberFormatException e) {
            Texto.append("  ''"+Est_mantenimiento.getText()+"''  no es un numero "+"\n");  
        }

        try {
            tam_fila_servicio = Integer.parseInt(Fila_servicio.getText());
        } catch (NumberFormatException e) {
            Texto.append("  ''"+Fila_servicio.getText()+"''  no es un numero "+"\n");  
        }
        if (turnos == Integer.parseInt(TurnosSimulacion.getText()) && aviones == Integer.parseInt(Cant_aviones.getText())&&cant_escritorios == Integer.parseInt(Cant_registros.getText())&&tam_fila_registro == Integer.parseInt(Fila_registro.getText())&&est_registro == Integer.parseInt(Est_mantenimiento.getText())&&tam_fila_servicio == Integer.parseInt(Fila_servicio.getText())) {
            Texto.setText("TURNO NUMERO:     " + i++ + "\n");
            Ejecucion();
            Sim_turnos();
            Mantenimiento();
        }
        /*if (Integer.parseInt(TurnosSimulacion.getText()) < i) {
            Texto.setText("");
            Texto.append("Turnos finalizados");
        } else {*/
            
        //}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Texto.setText("" + "\n");
        if (this.turnoactual > this.turnos) {

            Texto.append("- - - - - - - - - - - - - - - - - - - -" + "\n");
            Texto.append("FIN DE LA SIMULACION" + "\n");

        } else {
            Texto.setText("TURNO NUMERO:     " + (this.turnoactual + 1) + "\n");
            Texto.append("- - - - - - - - - - - - - - - - - - - -" + "\n");
            Sim_turnos();
            Texto.append("- - - - - - - - - - - - - - - - - - - -" + "\n");
            Mantenimiento();
            Texto.append("- - - - - - - - - - - - - - - - - - - -" + "\n");

        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Intefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intefaz().setVisible(true);
            }
        });
    }

    private void Ejecucion() {

        switch (probabilidad) {
            case 0:
                avionTipo = "pequeño";
                pasajeros = (int) (Math.random() * 5 + 5);
                mantenimiento = (int) (Math.random() * 3 + 1);
                desabordaje = 1;
                break;
            case 1:
                avionTipo = "pequeño";
                pasajeros = (int) (Math.random() * 5 + 5);
                mantenimiento = (int) (Math.random() * 3 + 1);
                desabordaje = 1;
                break;
            case 2:
                avionTipo = "pequeño";
                pasajeros = (int) (Math.random() * 5 + 5);
                mantenimiento = (int) (Math.random() * 3 + 1);
                desabordaje = 1;
                break;
            case 3:
                avionTipo = "pequeño";
                pasajeros = (int) (Math.random() * 5 + 5);
                mantenimiento = (int) (Math.random() * 3 + 1);
                desabordaje = 1;
                break;
            case 4:
                avionTipo = "pequeño";
                pasajeros = (int) (Math.random() * 5 + 5);
                mantenimiento = (int) (Math.random() * 3 + 1);
                desabordaje = 1;
                break;
            case 5:
                avionTipo = "mediano";
                pasajeros = (int) (Math.random() * 10 + 15);
                mantenimiento = (int) (Math.random() * 3 + 2);
                desabordaje = 2;
                break;
            case 6:
                avionTipo = "mediano";
                pasajeros = (int) (Math.random() * 10 + 15);
                mantenimiento = (int) (Math.random() * 3 + 2);
                desabordaje = 2;
                break;
            case 7:
                avionTipo = "mediano";
                pasajeros = (int) (Math.random() * 10 + 15);
                mantenimiento = (int) (Math.random() * 3 + 2);
                desabordaje = 2;
                break;
            case 8:
                avionTipo = "mediano";
                pasajeros = (int) (Math.random() * 10 + 15);
                mantenimiento = (int) (Math.random() * 3 + 2);
                desabordaje = 2;
                break;
            case 9:
                avionTipo = "mediano";
                pasajeros = (int) (Math.random() * 10 + 15);
                mantenimiento = (int) (Math.random() * 3 + 2);
                desabordaje = 2;
                break;

            case 10:
                avionTipo = "mediano";
                pasajeros = (int) (Math.random() * 10 + 15);
                mantenimiento = (int) (Math.random() * 3 + 2);
                desabordaje = 2;
                break;
            case 11:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;
            case 22:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;
            case 13:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;
            case 14:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;
            case 15:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;
            case 16:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;
            case 17:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;
            case 18:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;
            case 19:
                avionTipo = "grande";
                pasajeros = (int) (Math.random() * 10 + 30);
                mantenimiento = (int) (Math.random() * 4 + 3);
                desabordaje = 3;
                break;

        }
        Texto.append("El avion es de tipo:  " + avionTipo + "\n");
        Texto.append("El avion cuenta con:  " + pasajeros + " pasajeros" + "\n");
        Texto.append("\n");
        Texto.append("- - - - - - - -" + "\n");
        Texto.append("Escritorios de registro" + "\n");
        Texto.append("- - - - - - - -" + "\n");

        
        

    }

    private void Sim_turnos() {
        
        int documentos = (int) (Math.random() * 10 + 1);
        int maletas = (int) (Math.random() * 4 + 1);
        int registros = (int) (Math.random() * 3 + 1);

        for (int i = 0; i < this.pasajeros; i++) {
            
        
        for (int j = 1; j <= Integer.parseInt(Cant_registros.getText()); j++) {
            Texto.append("" + "\n");
            Texto.append("Esta siendo atendido el pasajero:   " + (turnoactual + 1) + "\n");
            for (int k = registros; k>0; k--) {

                Texto.append("      Escritorio:    " + j + "\n");
                Texto.append("              Cantidad de maletas :    " + maletas + "\n");
                Texto.append("              Cantidad de docuemtnos :    " + documentos + "\n");
                Texto.append("              Turnos de registros faltantes:    " + k+ "\n");
                if (registros <= 0) {
                    Texto.append("              El pasajero: " + this.turnoactual + " ha salido del sistema" + "\n");
                }

                this.maletas_totales = this.maletas_totales + maletas;
                Pasajeros pasajero = new Pasajeros(maletas, documentos, turnos, k);
                
                //pasajeros_M[j][i]= pasajero;

            }

        }
        }
        Texto.append("\n");
        Texto.append("- - - - - - - - - - - -"+"\n");
        Texto.append("LISTADO DE MALETAS"+"\n");
        String List_maletas[]= new String[this.maletas_totales];
        for (int i = 0; i < this.pasajeros; i++) {
            for (int j = 0; j <maletas; j++) {
                
                List_maletas[i]= i+"-"+j;
                Texto.append(List_maletas[i]+"\n");
            }
            
        }
        

        this.turnoactual++;

    }

    private void Mantenimiento() {
        Texto.append("- - - - - - - - - - - - - - - - - - -" + "\n");
        Texto.append("ESTACION DE MANTENIMIENTO" + "\n");
        Texto.append("- - - - - - - - - - - - - - - - - - -" + "\n");

        for (int j = 0; j < Integer.parseInt(Est_mantenimiento.getText()); j++) {
            for (int k = mantenimiento; k >0; k--) {
                Texto.append("" + "\n");
                Texto.append("Estacion no. " + j + "\n");
                Texto.append("  Turnos Restantes " + k + "\n");
                if (k <= 0) {
                    Texto.append("  Avion en mantenimiento " + pasajeros + " ha salido del sistema" + "\n");
                }
            }

        }

        this.aviones++;
        Texto.append("- - - - - - - - - - - - - -" + "\n");
        
        
        Texto.append("TURNO NUMERO:     " + this.turnoactual + "\n");
        Texto.append("TURNO SIGUIENTE:     " + (this.turnoactual + 1) + "\n");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cant_aviones;
    private javax.swing.JTextField Cant_registros;
    private javax.swing.JTextField Est_mantenimiento;
    private javax.swing.JTextField Fila_registro;
    private javax.swing.JTextField Fila_servicio;
    private javax.swing.JTextArea Texto;
    private javax.swing.JTextField TurnosSimulacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
