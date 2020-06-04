/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class AsignacionCursoMaestro extends javax.swing.JInternalFrame {

    /**
     * Creates new form AsignacionCursoMaestro
     */
    public AsignacionCursoMaestro() {
        initComponents();
        cboDBMaestroAlumnos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_status = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonG1 = new BottonGuardar.buttonG();
        cboCodigoCurso = new javax.swing.JComboBox<>();
        cboCodigoSede = new javax.swing.JComboBox<>();
        cboCodigoSeccion = new javax.swing.JComboBox<>();
        cboCodigoMaestro = new javax.swing.JComboBox<>();
        cboCodigoAula = new javax.swing.JComboBox<>();
        cboCodigoJornada = new javax.swing.JComboBox<>();
        cboCodigoCarrera = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Código de Carrera:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Código de Jornada:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Código de Aula:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Código de Maestro:");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Código de Sede:");
        jLabel1.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Código de Sección:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Código de Curso:");

        buttonG1.setText("buttonG1");
        buttonG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonG1MouseClicked(evt);
            }
        });

        cboCodigoCarrera.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cboCodigoCarrera.setBorder(null);
        cboCodigoCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboCodigoCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCodigoCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoSede, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(label_status)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(label_status))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonG1MouseClicked
        //Codigo que permite insertar registros en al base de datos
        String codc, codj, coda, codm, cods, codsec, codcur;
        codc = cboCodigoCarrera.getSelectedItem().toString();
        codj = cboCodigoJornada.getSelectedItem().toString();
        coda = cboCodigoAula.getSelectedItem().toString();
        codm = cboCodigoMaestro.getSelectedItem().toString();
        cods = cboCodigoSede.getSelectedItem().toString();
        codsec = cboCodigoSeccion.getSelectedItem().toString();
        codcur = cboCodigoCurso.getSelectedItem().toString();

        if (codc == "." || codj == "." || coda == "." || cods == "." || codsec == "." || codcur == "." || codc == "" || codj == "" || coda == "" || cods == "" || codsec == "" || codcur == "") {

            JOptionPane.showMessageDialog(null, "Complete los campos vacios.");

            cboCodigoCarrera.setSelectedItem(0);
            cboCodigoJornada.setSelectedItem(0);
            cboCodigoAula.setSelectedItem(0);
            cboCodigoMaestro.setSelectedItem(0);
            cboCodigoSede.setSelectedItem(0);
            cboCodigoSeccion.setSelectedItem(0);
            cboCodigoCurso.setSelectedItem(0);

        } else {

            try{
                

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");

                PreparedStatement pst = cn.prepareStatement("insert into asignacioncursosmastros values(?,?,?,?,?,?,?)");

                pst.setString(1, codc);
                pst.setString(2, cods);
                pst.setString(3, codj);
                pst.setString(4, codsec);
                pst.setString(5, coda);
                pst.setString(6, codcur);
                pst.setString(7, codm);
                pst.executeUpdate();

                cboCodigoCarrera.setSelectedItem(0);
                cboCodigoJornada.setSelectedItem(0);
                cboCodigoAula.setSelectedItem(0);
                cboCodigoMaestro.setSelectedItem(0);
                cboCodigoSede.setSelectedItem(0);
                cboCodigoSeccion.setSelectedItem(0);
                cboCodigoCurso.setSelectedItem(0);

                JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ERROR AL REGISTRAR", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
            }catch(Exception e){
            
            JOptionPane.showMessageDialog(this, "ERROR NO SE PUEDE ACCEDER A LOS DATOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
        {
    }
         
    }//GEN-LAST:event_buttonG1MouseClicked
    
    private void cboCodigoCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCodigoCarreraActionPerformed
        
    }//GEN-LAST:event_cboCodigoCarreraActionPerformed
    
    public void cboDBMaestroAlumnos() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");

            PreparedStatement pst = cn.prepareStatement("select nombre_carrera from carreras");
            ResultSet rs = pst.executeQuery();

            cboCodigoCarrera.addItem("Seleccione una opción");
            while (rs.next()) {
                cboCodigoCarrera.addItem(rs.getString("nombre_carrera"));
            }
            PreparedStatement pst1 = cn.prepareStatement("select nombre_sede from sedes");
            ResultSet rs1 = pst1.executeQuery();

            cboCodigoSede.addItem("Seleccione una opción");
            while (rs1.next()) {
                cboCodigoSede.addItem(rs.getString("nombre_sede"));
            }
            PreparedStatement pst2 = cn.prepareStatement("select nombre_jornada from jornadas");
            ResultSet rs2 = pst2.executeQuery();

            cboCodigoJornada.addItem("Seleccione una opción");
            while (rs2.next()) {
                cboCodigoJornada.addItem(rs.getString("nombre_jornada"));
            }
            PreparedStatement pst3 = cn.prepareStatement("select nombre_seccion from secciones");
            ResultSet rs3 = pst3.executeQuery();

            cboCodigoSeccion.addItem("Seleccione una opción");
            while (rs3.next()) {
                cboCodigoSeccion.addItem(rs.getString("nombre_seccion"));
            }
            PreparedStatement pst4 = cn.prepareStatement("select nombre_aula from aulas");
            ResultSet rs4 = pst4.executeQuery();

            cboCodigoAula.addItem("Seleccione una opción");
            while (rs4.next()) {
                cboCodigoAula.addItem(rs.getString("nombre_aula"));
            }
            PreparedStatement pst5 = cn.prepareStatement("select nombre_curso from cursos");
            ResultSet rs5 = pst5.executeQuery();

            cboCodigoCurso.addItem("Seleccione una opción");
            while (rs5.next()) {
                cboCodigoCurso.addItem(rs.getString("nombre_curso"));
            }
            PreparedStatement pst6 = cn.prepareStatement("select nombre_maestro from maestros");
            ResultSet rs6 = pst6.executeQuery();

            cboCodigoMaestro.addItem("Seleccione una opción");
            while (rs6.next()) {
                cboCodigoMaestro.addItem(rs.getString("nombre_maestro"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BottonGuardar.buttonG buttonG1;
    private javax.swing.JComboBox<String> cboCodigoAula;
    private javax.swing.JComboBox<String> cboCodigoCarrera;
    private javax.swing.JComboBox<String> cboCodigoCurso;
    private javax.swing.JComboBox<String> cboCodigoJornada;
    private javax.swing.JComboBox<String> cboCodigoMaestro;
    private javax.swing.JComboBox<String> cboCodigoSeccion;
    private javax.swing.JComboBox<String> cboCodigoSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    // End of variables declaration//GEN-END:variables
}
