
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
public class ContenedorPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ContenedorPrincipal
     */
    private MantenimientoAlumno ventanaAlumno;
    private MantenimientoMaestro ventanaMaestro;
    private MantenimientoFacultades ventanaFacultades;
    private MantenimientoCarreras ventanaCarreras;
    private MantenimientoCursos ventanaCursos;
    private MantenimientoSecciones ventanaSecciones;
    private MantenimientoSedes ventanaSedes;
    private MantenimientoAulas ventanaAulas;
    private MantenimientoJornadas ventanaJornadas;
    private AsignacionCursoAlumno ventantaAsignacionA;
    private AsignacionCursoMaestro ventanaAsignacionM;
    private ConsultasAsignacionAlumnos ventanaconsultas;
    private AsignacionNota ventanaNota;
    /*private IngresoCliente ventanaCliente;
    private IngresoAutor ventanaAutor;
    private IngresoProducto ventanaProducto;*/
    public ContenedorPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(ContenedorPrincipal.MAXIMIZED_BOTH);
        this.setTitle("SIU");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon= new ImageIcon(getClass().getResource("/Imagenes/FondoF.jpg"));
        Image image= icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuBuscar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jMenu3.setBorder(null);
        jMenu3.setText("Archivo");
        jMenu3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu1.setText("Catálogos");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem2.setText("Mantenimiento Alumno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem3.setText("Mantenimiento Maestro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem4.setText("Mantenimiento Facultades");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem5.setText("Mantenimiento Carreras");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem6.setText("Mantenimiento Cursos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem7.setText("Mantenimiento Secciones");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem8.setText("Mantenimiento Sedes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem9.setText("Mantenimiento Aulas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem10.setText("Mantenimiento Jornadas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("Procesos");
        jMenu6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuItem17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem17.setText("Asignacion Curso Alumno");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenuItem18.setText("Asignacion Curso Maestro");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem1.setText("Asignar NOTA Alumno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Informes");
        jMenu4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jMenuBuscar.setText("Buscar alumnos asignados a cursos");
        jMenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuBuscar);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ayuda");
        jMenu5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu7.setText("JORGE CASTANEDA 9959-18-4964");
        jMenu7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ventanaAlumno =  new MantenimientoAlumno();
        jDesktopPane1.add(ventanaAlumno);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaAlumno.getSize();
         ventanaAlumno.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ventanaMaestro = new MantenimientoMaestro();
        jDesktopPane1.add(ventanaMaestro);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaMaestro.getSize();
         ventanaMaestro.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        ventanaFacultades = new MantenimientoFacultades();
        jDesktopPane1.add(ventanaFacultades);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaFacultades.getSize();
         ventanaFacultades.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        ventanaCarreras = new MantenimientoCarreras();
        jDesktopPane1.add(ventanaCarreras);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaCarreras.getSize();
         ventanaCarreras.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        ventanaCursos = new MantenimientoCursos();
        jDesktopPane1.add(ventanaCursos);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaCursos.getSize();
         ventanaCursos.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        ventanaSecciones = new MantenimientoSecciones();
        jDesktopPane1.add(ventanaSecciones);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaSecciones.getSize();
         ventanaSecciones.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        ventanaSedes = new MantenimientoSedes();
        jDesktopPane1.add(ventanaSedes);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaSedes.getSize();
         ventanaSedes.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        ventanaAulas = new MantenimientoAulas();
        jDesktopPane1.add(ventanaAulas);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaAulas.getSize();
         ventanaAulas.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        ventanaJornadas = new MantenimientoJornadas();
        jDesktopPane1.add(ventanaJornadas);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaJornadas.getSize();
         ventanaJornadas.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        ventantaAsignacionA = new AsignacionCursoAlumno();
        jDesktopPane1.add(ventantaAsignacionA);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventantaAsignacionA.getSize();
         ventantaAsignacionA.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        ventanaAsignacionM = new AsignacionCursoMaestro();
        jDesktopPane1.add(ventanaAsignacionM);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaAsignacionM.getSize();
         ventanaAsignacionM.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarActionPerformed
        // TODO add your handling code here:
        ventanaconsultas = new ConsultasAsignacionAlumnos();
        jDesktopPane1.add(ventanaconsultas);
            Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaconsultas.getSize();
         ventanaconsultas.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuBuscarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        ventanaNota = new AsignacionNota();
        jDesktopPane1.add(ventanaNota);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventanaNota.getSize();
        ventanaNota.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContenedorPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContenedorPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBuscar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
