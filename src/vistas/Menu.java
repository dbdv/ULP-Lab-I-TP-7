/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.HashSet;
import objetos.Alumno;
import objetos.Materia;

/**
 *
 * @author daniel
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAgregarM = new javax.swing.JMenu();
        jmAgregarA = new javax.swing.JMenu();
        jmInscribir = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Colegio");

        escritorio.setName("Administrador de colegio"); // NOI18N

        jmAgregarM.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jmAgregarM.setForeground(new java.awt.Color(22, 72, 249));
        jmAgregarM.setText("Agregar materia ||");
        jmAgregarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmAgregarM.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jmAgregarM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmAgregarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAgregarMMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmAgregarM);

        jmAgregarA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jmAgregarA.setForeground(new java.awt.Color(22, 72, 249));
        jmAgregarA.setText("Agregar alumno ||");
        jmAgregarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmAgregarA.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jmAgregarA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmAgregarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAgregarAMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmAgregarA);

        jmInscribir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jmInscribir.setForeground(new java.awt.Color(22, 72, 249));
        jmInscribir.setText("Inscribir alumno a materia || ");
        jmInscribir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmInscribir.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jmInscribir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmInscribir.setMargin(new java.awt.Insets(0, 2, 0, 0));
        jmInscribir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmInscribirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmInscribir);

        jmSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jmSalir.setForeground(new java.awt.Color(255, 34, 0));
        jmSalir.setText("Salir");
        jmSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jmSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAgregarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAgregarMMouseClicked
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AltaMaterias alta = new AltaMaterias();
        alta.setVisible(true);
        escritorio.add(alta);
    }//GEN-LAST:event_jmAgregarMMouseClicked

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmAgregarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAgregarAMouseClicked
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AltaAlumnos alta = new AltaAlumnos();
        alta.setVisible(true);
        escritorio.add(alta);
    }//GEN-LAST:event_jmAgregarAMouseClicked

    private void jmInscribirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmInscribirMouseClicked
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion form = new FormularioInscripcion();
        form.setVisible(true);
        escritorio.add(form);
    }//GEN-LAST:event_jmInscribirMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    public static HashSet<Alumno> getAlumnos(){
        return alumnos;
    }
    
    public static HashSet<Materia> getMaterias(){
        return materias;
    }
    
    final static private HashSet<Alumno> alumnos = new HashSet<>();
    final static private HashSet<Materia> materias = new HashSet<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAgregarA;
    private javax.swing.JMenu jmAgregarM;
    private javax.swing.JMenu jmInscribir;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
