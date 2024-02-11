
package java_ticket;
import com.toedter.calendar.JCalendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author elean
 */
public class JavaTicket extends javax.swing.JFrame {
    private static int ultimoCodigoD = 102400, ultimoCodigoM=202400, ultimoCodigoR=302400;
    private int codigoD, codigoM, codigoR;
    private int contadorDeportivos = 0,  contadorMusicales = 0, contadorReligiosos = 0;
    /**
     * Creates new form JavaTicket
     */
    public JavaTicket() {
        
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
            inputUser.setText("");
            nombreTF.setText("");
            nombreTF.setVisible(false);
            usernameTextField.setText("");
            usernameTextField.setVisible(false);
            contraTF.setText("");
            contraTF.setVisible(false);
            edadTextField.setText("");
            edadTextField.setVisible(false);
            jToggleButton1.setVisible(false);
            jLabel19.setVisible(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jLabel22.setVisible(false);
        
        Usuario user1 = new UsuarioAdmin("Administracion", "admin", "supersecreto", 20); 
        Usuario user2 = new UsuarioContenido("Contenido", "contenido", "12345", 20);
        Usuario user3 = new UsuarioLimitado("Limitado", "limitado", "12345", 20);
        
        usuarios.add(user2);
        usuarios.add(user1);
        usuarios.add(user3);
        usuarios.add(admin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuAdmin = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminEventosButton = new javax.swing.JButton();
        adminUsuariosButton = new javax.swing.JButton();
        reportesButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MenuLimitado = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        salirButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MenuContenido = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        adminEventosContenido = new javax.swing.JButton();
        reportesContenido = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        AdminEventos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        crearEventoButton = new javax.swing.JButton();
        eliminarEventoButton = new javax.swing.JButton();
        editarEventoButton = new javax.swing.JButton();
        verEventoButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        CrearUsuario = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tipoUsuarioCB = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        nombreCompletoTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        edadTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        passwordTF = new javax.swing.JTextField();
        crearUsuarioButton = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        ManejoUsuario = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel107 = new javax.swing.JLabel();
        EditarUsuario = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel126 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        EditarunElemento = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        nombreCompletoRB = new javax.swing.JRadioButton();
        usernameRB = new javax.swing.JRadioButton();
        passwordRB = new javax.swing.JRadioButton();
        edadRB = new javax.swing.JRadioButton();
        atributoTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        cambiarButton = new javax.swing.JButton();
        atributoLabel = new javax.swing.JLabel();
        usuarioIngresado = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        atributoButtonGroup = new javax.swing.ButtonGroup();
        EditartodosElementos = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        edadTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        contraTF = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton54 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        inputUser = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        EliminarUsuario = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        eliminarLabel = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        EventoDeportivo = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        codigoEventoAdmin = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tituloEventoAdmin = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionEventoAdmin = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        fechaEventoAdmin = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        montoAcordadoEventoAdmin = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        deporteCB = new javax.swing.JComboBox<>();
        jLabel104 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        cantidadGenteTF = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        equipo1TF = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        equipo2TF = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        TipoEvento = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        EventoMusical = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        tituloEventoMusical = new javax.swing.JTextField();
        montoEventoMusical = new javax.swing.JTextField();
        codigoEventoMusical = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        fechaEventoMusical = new com.toedter.calendar.JDateChooser();
        jLabel50 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        genteEventoMusical = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionEventoMusical = new javax.swing.JTextArea();
        musicaCB = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        EventoReligioso = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        genteReligioso = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        codigoReligioso = new javax.swing.JTextField();
        tituloReligioso = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jButton42 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton43 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcionReligioso = new javax.swing.JTextArea();
        jLabel58 = new javax.swing.JLabel();
        fechaReligioso = new com.toedter.calendar.JDateChooser();
        jLabel59 = new javax.swing.JLabel();
        montoReligioso = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        IngresarCodigoEvento = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        codigoIngresadoTF = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel105 = new javax.swing.JLabel();
        EditarEventoMusical = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        listaMusicos = new javax.swing.JList<>();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        edicionTituloMusical = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        edicionCodigoMusical = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        edicionFechaMusical = new com.toedter.calendar.JDateChooser();
        jLabel75 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        edicionMontoMusical = new javax.swing.JTextField();
        edicionTipoMusica = new javax.swing.JComboBox<>();
        jButton45 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jButton49 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        edicionDescripcionMusical = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        edicionGenteMusical = new javax.swing.JTextField();
        musicoIngresadoTF = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        EditarEventoDeportivo = new javax.swing.JDialog();
        jPanel30 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        listaEquipo1 = new javax.swing.JList<>();
        jScrollPane16 = new javax.swing.JScrollPane();
        listaEquipo2 = new javax.swing.JList<>();
        jLabel62 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        agregarEquipo1 = new javax.swing.JButton();
        agregarEquipo2 = new javax.swing.JButton();
        jLabel187 = new javax.swing.JLabel();
        edicionCodigo = new javax.swing.JTextField();
        jLabel188 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        edicionDescripcion = new javax.swing.JTextArea();
        jLabel189 = new javax.swing.JLabel();
        edicionFecha = new com.toedter.calendar.JDateChooser();
        jLabel190 = new javax.swing.JLabel();
        edicionMonto = new javax.swing.JTextField();
        jLabel191 = new javax.swing.JLabel();
        edicionTitulo = new javax.swing.JTextField();
        jLabel192 = new javax.swing.JLabel();
        edicionGente = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        edicionEquipo1 = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        edicionEquipo2 = new javax.swing.JTextField();
        jLabel196 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        borrarEquipo1 = new javax.swing.JButton();
        edicionTipoDeporte = new javax.swing.JComboBox<>();
        borrarEquipo2 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jugadorIngresado1 = new javax.swing.JTextField();
        jugadorIngresado2 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        EditarEventoReligioso = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        edicionTituloReligioso = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        edicionCodigoReligioso = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        edicionFechaReligioso = new com.toedter.calendar.JDateChooser();
        jLabel67 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        edicionMontoReligioso = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jButton50 = new javax.swing.JButton();
        jLabel134 = new javax.swing.JLabel();
        edicionGenteReligioso = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        genteConvertida = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        edicionDescripcionReligioso = new javax.swing.JTextArea();
        jButton15 = new javax.swing.JButton();
        jLabel120 = new javax.swing.JLabel();
        EliminarEvento = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        codigoIngresadoEliminarEvento = new javax.swing.JTextField();
        jButton39 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        VerEventoDeportivo = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jButton51 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaEventoDeportivo = new javax.swing.JTable();
        IngresarCodigoVerEvento = new javax.swing.JDialog();
        jLabel81 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        codigoIngresadoVerEvento = new javax.swing.JTextField();
        jButton48 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel129 = new javax.swing.JLabel();
        VerEventoMusical = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jButton52 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaEventoMusical = new javax.swing.JTable();
        VerEventoReligioso = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jButton53 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaEventoReligioso = new javax.swing.JTable();
        Reportes = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel135 = new javax.swing.JLabel();
        VerPerfilAdmin = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaUsuarioAdmin = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaEventosAdmin = new javax.swing.JTable();
        jButton55 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        VerPerfilLimitado = new javax.swing.JDialog();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaUsuarioLimitado = new javax.swing.JTable();
        jLabel85 = new javax.swing.JLabel();
        VerPerfilContenido = new javax.swing.JDialog();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaUsuarioContenido = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablaEventosContenido = new javax.swing.JTable();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        EventosRealizados = new javax.swing.JDialog();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tablaEventosRealizados = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        tablaEstadisticaEventosRealizados = new javax.swing.JTable();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        EventosFuturos = new javax.swing.JDialog();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        EventosCancelados = new javax.swing.JDialog();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        IngresoGeneradoPorFecha = new javax.swing.JDialog();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel90 = new javax.swing.JLabel();
        totalGenerado = new javax.swing.JLabel();
        logInPanel = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        usernmaeLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        jLabel91 = new javax.swing.JLabel();

        MenuAdmin.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Bienvenido, ");
        jPanel1.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/woman.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Menú Principal Administrador");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        adminEventosButton.setBackground(new java.awt.Color(255, 144, 188));
        adminEventosButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        adminEventosButton.setForeground(new java.awt.Color(255, 255, 255));
        adminEventosButton.setText("Administracion de Eventos");
        adminEventosButton.setBorder(null);
        adminEventosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminEventosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEventosButtonActionPerformed(evt);
            }
        });
        jPanel1.add(adminEventosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 360, 80));

        adminUsuariosButton.setBackground(new java.awt.Color(255, 144, 188));
        adminUsuariosButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        adminUsuariosButton.setForeground(new java.awt.Color(255, 255, 255));
        adminUsuariosButton.setText("Administracion de Usuarios");
        adminUsuariosButton.setBorder(null);
        adminUsuariosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUsuariosButtonActionPerformed(evt);
            }
        });
        jPanel1.add(adminUsuariosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 360, 80));

        reportesButton.setBackground(new java.awt.Color(255, 144, 188));
        reportesButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        reportesButton.setForeground(new java.awt.Color(255, 255, 255));
        reportesButton.setText("Reportes");
        reportesButton.setBorder(null);
        reportesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(reportesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 360, 70));

        salirButton.setBackground(new java.awt.Color(255, 144, 188));
        salirButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        salirButton.setForeground(new java.awt.Color(255, 255, 255));
        salirButton.setText("Salir");
        salirButton.setBorder(null);
        salirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout MenuAdminLayout = new javax.swing.GroupLayout(MenuAdmin.getContentPane());
        MenuAdmin.getContentPane().setLayout(MenuAdminLayout);
        MenuAdminLayout.setHorizontalGroup(
            MenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuAdminLayout.setVerticalGroup(
            MenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MenuLimitado.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel10.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Bienvenido, ");
        jPanel10.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        jLabel32.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Menú Principal Limitado");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 560, 70));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/woman.png"))); // NOI18N
        jPanel10.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man.png"))); // NOI18N
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        jButton25.setBackground(new java.awt.Color(255, 144, 188));
        jButton25.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Ver Evento");
        jButton25.setBorder(null);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 300, 60));

        jButton26.setBackground(new java.awt.Color(255, 144, 188));
        jButton26.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Reportes");
        jButton26.setBorder(null);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 300, 60));

        salirButton1.setBackground(new java.awt.Color(255, 144, 188));
        salirButton1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        salirButton1.setForeground(new java.awt.Color(255, 255, 255));
        salirButton1.setText("Salir");
        salirButton1.setBorder(null);
        salirButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(salirButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu.png"))); // NOI18N
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout MenuLimitadoLayout = new javax.swing.GroupLayout(MenuLimitado.getContentPane());
        MenuLimitado.getContentPane().setLayout(MenuLimitadoLayout);
        MenuLimitadoLayout.setHorizontalGroup(
            MenuLimitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MenuLimitadoLayout.setVerticalGroup(
            MenuLimitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MenuContenido.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel3.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel3.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel98.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Bienvenido, ");
        jPanel3.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/woman.png"))); // NOI18N
        jPanel3.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Menú Principal Contenido");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man.png"))); // NOI18N
        jPanel3.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        adminEventosContenido.setBackground(new java.awt.Color(255, 144, 188));
        adminEventosContenido.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        adminEventosContenido.setForeground(new java.awt.Color(255, 255, 255));
        adminEventosContenido.setText("Administracion de Eventos");
        adminEventosContenido.setBorder(null);
        adminEventosContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEventosContenidoActionPerformed(evt);
            }
        });
        jPanel3.add(adminEventosContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 350, 70));

        reportesContenido.setBackground(new java.awt.Color(255, 144, 188));
        reportesContenido.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        reportesContenido.setForeground(new java.awt.Color(255, 255, 255));
        reportesContenido.setText("Reportes");
        reportesContenido.setBorder(null);
        reportesContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesContenidoActionPerformed(evt);
            }
        });
        jPanel3.add(reportesContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 350, 70));

        jButton3.setBackground(new java.awt.Color(255, 144, 188));
        jButton3.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 487, 130, 50));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menu.png"))); // NOI18N
        jPanel3.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout MenuContenidoLayout = new javax.swing.GroupLayout(MenuContenido.getContentPane());
        MenuContenido.getContentPane().setLayout(MenuContenidoLayout);
        MenuContenidoLayout.setHorizontalGroup(
            MenuContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuContenidoLayout.setVerticalGroup(
            MenuContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AdminEventos.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agenda.png"))); // NOI18N
        jPanel2.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        crearEventoButton.setBackground(new java.awt.Color(255, 89, 123));
        crearEventoButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        crearEventoButton.setForeground(new java.awt.Color(255, 255, 255));
        crearEventoButton.setText("Crear Evento");
        crearEventoButton.setBorder(null);
        crearEventoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearEventoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEventoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(crearEventoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 250, 70));

        eliminarEventoButton.setBackground(new java.awt.Color(255, 89, 123));
        eliminarEventoButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        eliminarEventoButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarEventoButton.setText("Cancelar Evento");
        eliminarEventoButton.setBorder(null);
        eliminarEventoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarEventoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEventoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(eliminarEventoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 250, 70));

        editarEventoButton.setBackground(new java.awt.Color(255, 89, 123));
        editarEventoButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        editarEventoButton.setForeground(new java.awt.Color(255, 255, 255));
        editarEventoButton.setText("Editar Evento");
        editarEventoButton.setBorder(null);
        editarEventoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarEventoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEventoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(editarEventoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 240, 70));

        verEventoButton.setBackground(new java.awt.Color(255, 89, 123));
        verEventoButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        verEventoButton.setForeground(new java.awt.Color(255, 255, 255));
        verEventoButton.setText("Ver Evento");
        verEventoButton.setBorder(null);
        verEventoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verEventoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEventoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(verEventoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 240, 70));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Administración de Eventos");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jButton32.setBackground(new java.awt.Color(255, 89, 123));
        jButton32.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Regresar");
        jButton32.setBorder(null);
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton32MouseClicked(evt);
            }
        });
        jPanel2.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 170, 40));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Administrar Evento.png"))); // NOI18N
        jPanel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout AdminEventosLayout = new javax.swing.GroupLayout(AdminEventos.getContentPane());
        AdminEventos.getContentPane().setLayout(AdminEventosLayout);
        AdminEventosLayout.setHorizontalGroup(
            AdminEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AdminEventosLayout.setVerticalGroup(
            AdminEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminEventosLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        CrearUsuario.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel4.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel4.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel4.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre Completo");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Edad");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Username");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        tipoUsuarioCB.setBackground(new java.awt.Color(238, 245, 255));
        tipoUsuarioCB.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        tipoUsuarioCB.setForeground(new java.awt.Color(0, 0, 0));
        tipoUsuarioCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contenido", "Limitado" }));
        jPanel4.add(tipoUsuarioCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 200, 40));

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Crear Usuario");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        nombreCompletoTF.setBackground(new java.awt.Color(255, 255, 255));
        nombreCompletoTF.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        nombreCompletoTF.setForeground(new java.awt.Color(0, 0, 0));
        nombreCompletoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCompletoTFActionPerformed(evt);
            }
        });
        jPanel4.add(nombreCompletoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 129, 250, 30));

        usernameTF.setBackground(new java.awt.Color(255, 255, 255));
        usernameTF.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        usernameTF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 220, 30));

        edadTF.setBackground(new java.awt.Color(255, 255, 255));
        edadTF.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edadTF.setForeground(new java.awt.Color(0, 0, 0));
        edadTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadTFActionPerformed(evt);
            }
        });
        edadTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadTFKeyTyped(evt);
            }
        });
        jPanel4.add(edadTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 250, 130, 30));

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo de Usuario");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jButton37.setBackground(new java.awt.Color(238, 245, 255));
        jButton37.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton37.setForeground(new java.awt.Color(153, 153, 153));
        jButton37.setText("Regresar");
        jButton37.setBorder(null);
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 120, 30));

        passwordTF.setBackground(new java.awt.Color(255, 255, 255));
        passwordTF.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        passwordTF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 230, 30));

        crearUsuarioButton.setBackground(new java.awt.Color(238, 245, 255));
        crearUsuarioButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        crearUsuarioButton.setForeground(new java.awt.Color(153, 153, 153));
        crearUsuarioButton.setText("Crear Usuario");
        crearUsuarioButton.setBorder(null);
        crearUsuarioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioButtonActionPerformed(evt);
            }
        });
        jPanel4.add(crearUsuarioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 140, 40));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Administrar Usuarios.png"))); // NOI18N
        jPanel4.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout CrearUsuarioLayout = new javax.swing.GroupLayout(CrearUsuario.getContentPane());
        CrearUsuario.getContentPane().setLayout(CrearUsuarioLayout);
        CrearUsuarioLayout.setHorizontalGroup(
            CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CrearUsuarioLayout.setVerticalGroup(
            CrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ManejoUsuario.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel5.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel5.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel5.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Administración de Usuarios");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jButton36.setBackground(new java.awt.Color(255, 208, 208));
        jButton36.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("Regresar");
        jButton36.setBorder(null);
        jButton36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton36MouseClicked(evt);
            }
        });
        jPanel5.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 160, 40));

        jButton1.setBackground(new java.awt.Color(255, 208, 208));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Crear Usuario");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 230, 40));

        jButton2.setBackground(new java.awt.Color(255, 208, 208));
        jButton2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar Usuario");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 230, 40));

        jButton4.setBackground(new java.awt.Color(255, 208, 208));
        jButton4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Editar Usuario");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 230, 40));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ingresar Codigo.png"))); // NOI18N
        jPanel5.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ManejoUsuarioLayout = new javax.swing.GroupLayout(ManejoUsuario.getContentPane());
        ManejoUsuario.getContentPane().setLayout(ManejoUsuarioLayout);
        ManejoUsuarioLayout.setHorizontalGroup(
            ManejoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ManejoUsuarioLayout.setVerticalGroup(
            ManejoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EditarUsuario.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel6.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel6.setMinimumSize(new java.awt.Dimension(875, 61));
        jPanel6.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/woman.png"))); // NOI18N
        jPanel6.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Editar Usuario");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/man.png"))); // NOI18N
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jButton46.setBackground(new java.awt.Color(243, 204, 243));
        jButton46.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton46.setForeground(new java.awt.Color(255, 255, 255));
        jButton46.setText("Regresar");
        jButton46.setBorder(null);
        jButton46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 150, 40));

        jButton5.setBackground(new java.awt.Color(243, 204, 243));
        jButton5.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Editar un elemento del Usuario");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 400, 40));

        jButton6.setBackground(new java.awt.Color(243, 204, 243));
        jButton6.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Editar todos los elementos del Usuario");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 480, 40));

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar Usuario.png"))); // NOI18N
        jPanel6.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EditarUsuarioLayout = new javax.swing.GroupLayout(EditarUsuario.getContentPane());
        EditarUsuario.getContentPane().setLayout(EditarUsuarioLayout);
        EditarUsuarioLayout.setHorizontalGroup(
            EditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditarUsuarioLayout.setVerticalGroup(
            EditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        EditarunElemento.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel7.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atributoButtonGroup.add(nombreCompletoRB);
        nombreCompletoRB.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        nombreCompletoRB.setForeground(new java.awt.Color(255, 255, 255));
        nombreCompletoRB.setText("Nombre Completo");
        nombreCompletoRB.setBorder(null);
        nombreCompletoRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nombreCompletoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCompletoRBActionPerformed(evt);
            }
        });
        jPanel7.add(nombreCompletoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 240, -1));

        atributoButtonGroup.add(usernameRB);
        usernameRB.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        usernameRB.setForeground(new java.awt.Color(255, 255, 255));
        usernameRB.setText("Username");
        usernameRB.setBorder(null);
        usernameRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usernameRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRBActionPerformed(evt);
            }
        });
        jPanel7.add(usernameRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 137, -1));

        atributoButtonGroup.add(passwordRB);
        passwordRB.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        passwordRB.setForeground(new java.awt.Color(255, 255, 255));
        passwordRB.setText("Contraseña");
        passwordRB.setBorder(null);
        passwordRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordRBActionPerformed(evt);
            }
        });
        jPanel7.add(passwordRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 160, -1));

        atributoButtonGroup.add(edadRB);
        edadRB.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        edadRB.setForeground(new java.awt.Color(255, 255, 255));
        edadRB.setText("Edad");
        edadRB.setBorder(null);
        edadRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edadRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadRBActionPerformed(evt);
            }
        });
        jPanel7.add(edadRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 110, -1));

        atributoTextField.setBackground(new java.awt.Color(255, 255, 255));
        atributoTextField.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        atributoTextField.setForeground(new java.awt.Color(0, 0, 0));
        atributoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atributoTextFieldActionPerformed(evt);
            }
        });
        jPanel7.add(atributoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 386, 360, 30));

        jLabel17.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Editar un Elemento");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jButton47.setBackground(new java.awt.Color(243, 204, 243));
        jButton47.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton47.setForeground(new java.awt.Color(255, 255, 255));
        jButton47.setText("Regresar");
        jButton47.setBorder(null);
        jButton47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 150, 30));

        cambiarButton.setBackground(new java.awt.Color(243, 204, 243));
        cambiarButton.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        cambiarButton.setForeground(new java.awt.Color(255, 255, 255));
        cambiarButton.setText("Cambiar");
        cambiarButton.setBorder(null);
        cambiarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarButtonActionPerformed(evt);
            }
        });
        jPanel7.add(cambiarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 150, 30));

        atributoLabel.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        atributoLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(atributoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 320, 26));

        usuarioIngresado.setBackground(new java.awt.Color(255, 255, 255));
        usuarioIngresado.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        usuarioIngresado.setForeground(new java.awt.Color(0, 0, 0));
        usuarioIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioIngresadoActionPerformed(evt);
            }
        });
        jPanel7.add(usuarioIngresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 330, -1));

        jLabel23.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Usuario");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 85, -1, -1));

        jLabel24.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Seleccione Elemento a Editar");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar Usuario.png"))); // NOI18N
        jPanel7.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EditarunElementoLayout = new javax.swing.GroupLayout(EditarunElemento.getContentPane());
        EditarunElemento.getContentPane().setLayout(EditarunElementoLayout);
        EditarunElementoLayout.setHorizontalGroup(
            EditarunElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditarunElementoLayout.setVerticalGroup(
            EditarunElementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EditartodosElementos.setMaximumSize(new java.awt.Dimension(875, 610));
        EditartodosElementos.setMinimumSize(new java.awt.Dimension(875, 610));
        EditartodosElementos.setPreferredSize(new java.awt.Dimension(875, 610));

        jPanel8.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel8.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel8.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Editar Usuario");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nombre");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel20.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Username");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, 60));

        jLabel21.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Edad");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 130, -1));

        jLabel22.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Contraseña");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loupe (2).png"))); // NOI18N
        jLabel137.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel137.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel137MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 80, 80));

        nombreTF.setBackground(new java.awt.Color(255, 255, 255));
        nombreTF.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        nombreTF.setForeground(new java.awt.Color(0, 0, 0));
        nombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTFActionPerformed(evt);
            }
        });
        jPanel8.add(nombreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 300, 40));

        edadTextField.setBackground(new java.awt.Color(255, 255, 255));
        edadTextField.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        edadTextField.setForeground(new java.awt.Color(0, 0, 0));
        edadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadTextFieldActionPerformed(evt);
            }
        });
        jPanel8.add(edadTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 128, 40));

        usernameTextField.setBackground(new java.awt.Color(255, 255, 255));
        usernameTextField.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(0, 0, 0));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        jPanel8.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 280, 40));

        contraTF.setBackground(new java.awt.Color(255, 255, 255));
        contraTF.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        contraTF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(contraTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 290, 40));

        jToggleButton1.setBackground(new java.awt.Color(243, 204, 243));
        jToggleButton1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Cambiar Elementos");
        jToggleButton1.setBorder(null);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 200, 40));

        jButton54.setBackground(new java.awt.Color(243, 204, 243));
        jButton54.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setText("Regresar");
        jButton54.setBorder(null);
        jButton54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 100, 40));

        jLabel25.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Ingrese Usuario a Editar");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        inputUser.setBackground(new java.awt.Color(255, 255, 255));
        inputUser.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        inputUser.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(inputUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 420, 50));

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar Usuario.png"))); // NOI18N
        jPanel8.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EditartodosElementosLayout = new javax.swing.GroupLayout(EditartodosElementos.getContentPane());
        EditartodosElementos.getContentPane().setLayout(EditartodosElementosLayout);
        EditartodosElementosLayout.setHorizontalGroup(
            EditartodosElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditartodosElementosLayout.setVerticalGroup(
            EditartodosElementosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EliminarUsuario.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel9.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel9.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel9.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Eliminar Usuario");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Ingrese Usuario");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        inputUsername.setBackground(new java.awt.Color(255, 255, 255));
        inputUsername.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 236, 260, 40));

        jButton7.setBackground(new java.awt.Color(241, 228, 195));
        jButton7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Eliminar");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 110, 40));

        jButton38.setBackground(new java.awt.Color(241, 228, 195));
        jButton38.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("Regresar");
        jButton38.setBorder(null);
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 110, 40));

        eliminarLabel.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        eliminarLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.add(eliminarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 360, 60));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Borrar Usuario.png"))); // NOI18N
        jPanel9.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EliminarUsuarioLayout = new javax.swing.GroupLayout(EliminarUsuario.getContentPane());
        EliminarUsuario.getContentPane().setLayout(EliminarUsuarioLayout);
        EliminarUsuarioLayout.setHorizontalGroup(
            EliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EliminarUsuarioLayout.setVerticalGroup(
            EliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EventoDeportivo.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel11.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel11.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel11.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Evento Deportivo");
        jPanel11.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel35.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Codigo del Evento");
        jPanel11.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        codigoEventoAdmin.setEditable(false);
        codigoEventoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        codigoEventoAdmin.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        codigoEventoAdmin.setForeground(new java.awt.Color(0, 0, 0));
        codigoEventoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEventoAdminActionPerformed(evt);
            }
        });
        jPanel11.add(codigoEventoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 210, 30));

        jLabel36.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Titulo del Evento");
        jPanel11.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        tituloEventoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        tituloEventoAdmin.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        tituloEventoAdmin.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(tituloEventoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, 30));

        jLabel37.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Descripcion del Evento");
        jPanel11.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        descripcionEventoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        descripcionEventoAdmin.setColumns(20);
        descripcionEventoAdmin.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        descripcionEventoAdmin.setForeground(new java.awt.Color(0, 0, 0));
        descripcionEventoAdmin.setRows(5);
        jScrollPane1.setViewportView(descripcionEventoAdmin);

        jPanel11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 410, 150));

        jLabel38.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Fecha del Evento");
        jPanel11.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        fechaEventoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        fechaEventoAdmin.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(fechaEventoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 190, -1));

        jButton8.setBackground(new java.awt.Color(255, 205, 168));
        jButton8.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Crear Evento");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 120, 30));

        jLabel39.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Lps.");
        jPanel11.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        montoAcordadoEventoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        montoAcordadoEventoAdmin.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        montoAcordadoEventoAdmin.setForeground(new java.awt.Color(0, 0, 0));
        montoAcordadoEventoAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoAcordadoEventoAdminKeyTyped(evt);
            }
        });
        jPanel11.add(montoAcordadoEventoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, 30));

        jLabel41.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Tipo de Deporte");
        jPanel11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        deporteCB.setBackground(new java.awt.Color(255, 205, 168));
        deporteCB.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        deporteCB.setForeground(new java.awt.Color(255, 255, 255));
        deporteCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol", "Tenis", "Rugby", "Baseball" }));
        deporteCB.setBorder(null);
        deporteCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deporteCB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        deporteCB.setKeySelectionManager(null);
        jPanel11.add(deporteCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 286, 150, 40));

        jLabel104.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 0, 0));
        jPanel11.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 230, 10));

        jLabel42.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Cantidad de Gente");
        jPanel11.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jButton35.setBackground(new java.awt.Color(255, 205, 168));
        jButton35.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Cambiar Evento");
        jButton35.setBorder(null);
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 170, 30));

        cantidadGenteTF.setBackground(new java.awt.Color(255, 255, 255));
        cantidadGenteTF.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        cantidadGenteTF.setForeground(new java.awt.Color(0, 0, 0));
        cantidadGenteTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadGenteTFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadGenteTFKeyTyped(evt);
            }
        });
        jPanel11.add(cantidadGenteTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 200, 30));

        jLabel43.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Equipo1");
        jPanel11.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        equipo1TF.setBackground(new java.awt.Color(255, 255, 255));
        equipo1TF.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        equipo1TF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(equipo1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 190, 30));

        jLabel44.setText("VS");
        jPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 421, -1, -1));

        jLabel45.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Equipo2");
        jPanel11.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        equipo2TF.setBackground(new java.awt.Color(255, 255, 255));
        equipo2TF.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        equipo2TF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel11.add(equipo2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 190, 30));

        jLabel103.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Monto Acordado");
        jPanel11.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jButton30.setBackground(new java.awt.Color(255, 205, 168));
        jButton30.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Regresar");
        jButton30.setBorder(null);
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 120, 30));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Deportivo.png"))); // NOI18N
        jPanel11.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EventoDeportivoLayout = new javax.swing.GroupLayout(EventoDeportivo.getContentPane());
        EventoDeportivo.getContentPane().setLayout(EventoDeportivoLayout);
        EventoDeportivoLayout.setHorizontalGroup(
            EventoDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EventoDeportivoLayout.setVerticalGroup(
            EventoDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TipoEvento.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));
        jPanel12.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel12.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Tipo de Evento");
        jPanel12.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jButton9.setBackground(new java.awt.Color(225, 174, 255));
        jButton9.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Evento Deportivo");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 280, 70));

        jButton10.setBackground(new java.awt.Color(225, 174, 255));
        jButton10.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Evento Musical");
        jButton10.setBorder(null);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 280, 70));

        jButton11.setBackground(new java.awt.Color(225, 174, 255));
        jButton11.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Evento Religioso");
        jButton11.setBorder(null);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 280, 70));

        jButton33.setBackground(new java.awt.Color(225, 174, 255));
        jButton33.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("Regresar");
        jButton33.setBorder(null);
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 110, 40));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Crear Evento.png"))); // NOI18N
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout TipoEventoLayout = new javax.swing.GroupLayout(TipoEvento.getContentPane());
        TipoEvento.getContentPane().setLayout(TipoEventoLayout);
        TipoEventoLayout.setHorizontalGroup(
            TipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TipoEventoLayout.setVerticalGroup(
            TipoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EventoMusical.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel13.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Evento Musical");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel46.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Titulo del Evento");
        jPanel13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel47.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Codigo del Evento");
        jPanel13.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel48.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Lps.");
        jPanel13.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        tituloEventoMusical.setBackground(new java.awt.Color(255, 255, 255));
        tituloEventoMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        tituloEventoMusical.setForeground(new java.awt.Color(0, 0, 0));
        tituloEventoMusical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloEventoMusicalActionPerformed(evt);
            }
        });
        jPanel13.add(tituloEventoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 250, 30));

        montoEventoMusical.setBackground(new java.awt.Color(255, 255, 255));
        montoEventoMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        montoEventoMusical.setForeground(new java.awt.Color(0, 0, 0));
        montoEventoMusical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                montoEventoMusicalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoEventoMusicalKeyTyped(evt);
            }
        });
        jPanel13.add(montoEventoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 140, 190, 30));

        codigoEventoMusical.setEditable(false);
        codigoEventoMusical.setBackground(new java.awt.Color(255, 255, 255));
        codigoEventoMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        codigoEventoMusical.setForeground(new java.awt.Color(0, 0, 0));
        codigoEventoMusical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEventoMusicalActionPerformed(evt);
            }
        });
        jPanel13.add(codigoEventoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 140, -1));

        jLabel113.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Lps.");
        jPanel13.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        jLabel49.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Fecha del Evento");
        jPanel13.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        fechaEventoMusical.setBackground(new java.awt.Color(255, 255, 255));
        fechaEventoMusical.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(fechaEventoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 190, -1));

        jLabel50.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Seguro");
        jPanel13.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel111.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Monto Acordado");
        jPanel13.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        jLabel51.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Tipo de Musica");
        jPanel13.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel52.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Descripcion del Evento");
        jPanel13.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel112.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Cantidad de Gente");
        jPanel13.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jButton40.setBackground(new java.awt.Color(185, 243, 252));
        jButton40.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("Cambiar Evento");
        jButton40.setBorder(null);
        jButton40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 180, 40));

        jLabel29.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jPanel13.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 190, 20));

        genteEventoMusical.setBackground(new java.awt.Color(255, 255, 255));
        genteEventoMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        genteEventoMusical.setForeground(new java.awt.Color(0, 0, 0));
        genteEventoMusical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                genteEventoMusicalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                genteEventoMusicalKeyTyped(evt);
            }
        });
        jPanel13.add(genteEventoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 180, 30));

        jButton41.setBackground(new java.awt.Color(185, 243, 252));
        jButton41.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("Regresar");
        jButton41.setBorder(null);
        jButton41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 160, 40));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 180, 30));

        descripcionEventoMusical.setBackground(new java.awt.Color(255, 255, 255));
        descripcionEventoMusical.setColumns(20);
        descripcionEventoMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        descripcionEventoMusical.setForeground(new java.awt.Color(0, 0, 0));
        descripcionEventoMusical.setRows(5);
        jScrollPane2.setViewportView(descripcionEventoMusical);

        jPanel13.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 390, 120));

        musicaCB.setBackground(new java.awt.Color(185, 243, 252));
        musicaCB.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        musicaCB.setForeground(new java.awt.Color(0, 0, 0));
        musicaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pop", "Rock", "Rap", "Clasica", "Reggeaton", "Otro" }));
        jPanel13.add(musicaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 180, 40));

        jButton12.setBackground(new java.awt.Color(185, 243, 252));
        jButton12.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Crear Evento");
        jButton12.setBorder(null);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 150, 40));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Musical.png"))); // NOI18N
        jPanel13.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EventoMusicalLayout = new javax.swing.GroupLayout(EventoMusical.getContentPane());
        EventoMusical.getContentPane().setLayout(EventoMusicalLayout);
        EventoMusicalLayout.setHorizontalGroup(
            EventoMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EventoMusicalLayout.setVerticalGroup(
            EventoMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EventoReligioso.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel14.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel14.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel14.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Evento Religioso");
        jPanel14.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel54.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Cantidad de Gente");
        jPanel14.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        genteReligioso.setBackground(new java.awt.Color(255, 255, 255));
        genteReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        genteReligioso.setForeground(new java.awt.Color(0, 0, 0));
        genteReligioso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                genteReligiosoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                genteReligiosoKeyTyped(evt);
            }
        });
        jPanel14.add(genteReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 220, -1));

        jLabel55.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Codigo del Evento");
        jPanel14.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jLabel56.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Titulo del Evento");
        jPanel14.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel116.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Seguro");
        jPanel14.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        codigoReligioso.setEditable(false);
        codigoReligioso.setBackground(new java.awt.Color(255, 255, 255));
        codigoReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        codigoReligioso.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(codigoReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 210, -1));

        tituloReligioso.setBackground(new java.awt.Color(255, 255, 255));
        tituloReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        tituloReligioso.setForeground(new java.awt.Color(0, 0, 0));
        tituloReligioso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloReligiosoActionPerformed(evt);
            }
        });
        jPanel14.add(tituloReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 330, -1));

        jLabel117.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Lps.");
        jPanel14.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel57.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Descripcion del Evento");
        jPanel14.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel115.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Lps.");
        jPanel14.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel118.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 0, 0));
        jPanel14.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 220, 10));

        jButton42.setBackground(new java.awt.Color(252, 233, 241));
        jButton42.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton42.setForeground(new java.awt.Color(0, 0, 0));
        jButton42.setText("Cambiar Evento");
        jButton42.setBorder(null);
        jButton42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 190, 40));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("2000");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 200, 30));

        jButton43.setBackground(new java.awt.Color(252, 233, 241));
        jButton43.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton43.setForeground(new java.awt.Color(0, 0, 0));
        jButton43.setText("Regresar");
        jButton43.setBorder(null);
        jButton43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 190, 40));

        descripcionReligioso.setBackground(new java.awt.Color(255, 255, 255));
        descripcionReligioso.setColumns(20);
        descripcionReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        descripcionReligioso.setForeground(new java.awt.Color(0, 0, 0));
        descripcionReligioso.setRows(5);
        jScrollPane3.setViewportView(descripcionReligioso);

        jPanel14.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 450, 170));

        jLabel58.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Fecha del Evento");
        jPanel14.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        fechaReligioso.setBackground(new java.awt.Color(255, 255, 255));
        fechaReligioso.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.add(fechaReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 200, 190, -1));

        jLabel59.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Monto Acordado");
        jPanel14.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        montoReligioso.setBackground(new java.awt.Color(255, 255, 255));
        montoReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        montoReligioso.setForeground(new java.awt.Color(0, 0, 0));
        montoReligioso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                montoReligiosoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoReligiosoKeyTyped(evt);
            }
        });
        jPanel14.add(montoReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 30));

        jButton13.setBackground(new java.awt.Color(252, 233, 241));
        jButton13.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setText("Crear Evento");
        jButton13.setBorder(null);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 190, 40));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Religioso.png"))); // NOI18N
        jPanel14.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EventoReligiosoLayout = new javax.swing.GroupLayout(EventoReligioso.getContentPane());
        EventoReligioso.getContentPane().setLayout(EventoReligiosoLayout);
        EventoReligiosoLayout.setHorizontalGroup(
            EventoReligiosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EventoReligiosoLayout.setVerticalGroup(
            EventoReligiosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        IngresarCodigoEvento.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel15.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel15.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel15.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Ingresar el Código del Evento");
        jPanel15.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel106.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Ingrese el Código del Evento a Editar");
        jPanel15.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 250, 210, -1));

        jButton44.setBackground(new java.awt.Color(255, 208, 208));
        jButton44.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("Regresar");
        jButton44.setBorder(null);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 417, 160, 40));

        codigoIngresadoTF.setBackground(new java.awt.Color(255, 255, 255));
        codigoIngresadoTF.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        codigoIngresadoTF.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(codigoIngresadoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 220, 40));

        jButton14.setBackground(new java.awt.Color(255, 208, 208));
        jButton14.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Editar");
        jButton14.setBorder(null);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 90, 40));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ingresar Codigo.png"))); // NOI18N
        jPanel15.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout IngresarCodigoEventoLayout = new javax.swing.GroupLayout(IngresarCodigoEvento.getContentPane());
        IngresarCodigoEvento.getContentPane().setLayout(IngresarCodigoEventoLayout);
        IngresarCodigoEventoLayout.setHorizontalGroup(
            IngresarCodigoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        IngresarCodigoEventoLayout.setVerticalGroup(
            IngresarCodigoEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EditarEventoMusical.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel16.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel16.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Edición Evento Musical");
        jPanel16.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        listaMusicos.setBackground(new java.awt.Color(255, 255, 255));
        listaMusicos.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        listaMusicos.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane19.setViewportView(listaMusicos);

        jPanel16.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 320, 140));

        jButton28.setBackground(new java.awt.Color(251, 161, 183));
        jButton28.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Editar Evento");
        jButton28.setBorder(null);
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 150, 40));

        jButton29.setBackground(new java.awt.Color(251, 161, 183));
        jButton29.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Agregar");
        jButton29.setBorder(null);
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 100, 30));

        jLabel71.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Grupo Musical/Instrumento");
        jPanel16.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel72.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Titulo del Evento");
        jPanel16.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        edicionTituloMusical.setBackground(new java.awt.Color(255, 255, 255));
        edicionTituloMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionTituloMusical.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(edicionTituloMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 260, -1));

        jLabel73.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Codigo del Evento");
        jPanel16.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 220, -1));

        edicionCodigoMusical.setEditable(false);
        edicionCodigoMusical.setBackground(new java.awt.Color(255, 255, 255));
        edicionCodigoMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionCodigoMusical.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(edicionCodigoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 160, -1));

        jLabel74.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Fecha del Evento");
        jPanel16.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        jLabel122.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("Seguro");
        jPanel16.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        edicionFechaMusical.setBackground(new java.awt.Color(255, 255, 255));
        edicionFechaMusical.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(edicionFechaMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 190, -1));

        jLabel75.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Lps.");
        jPanel16.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        jLabel124.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Lps.");
        jPanel16.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        jLabel123.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("Monto Acordado");
        jPanel16.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        edicionMontoMusical.setBackground(new java.awt.Color(255, 255, 255));
        edicionMontoMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionMontoMusical.setForeground(new java.awt.Color(0, 0, 0));
        edicionMontoMusical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edicionMontoMusicalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edicionMontoMusicalKeyTyped(evt);
            }
        });
        jPanel16.add(edicionMontoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 200, -1));

        edicionTipoMusica.setBackground(new java.awt.Color(251, 161, 183));
        edicionTipoMusica.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionTipoMusica.setForeground(new java.awt.Color(0, 0, 0));
        edicionTipoMusica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pop", "Rock", "Clasica", "Reggeaton", "Rap", "Otro" }));
        edicionTipoMusica.setBorder(null);
        edicionTipoMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(edicionTipoMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 170, 40));

        jButton45.setBackground(new java.awt.Color(251, 161, 183));
        jButton45.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setText("Regresar");
        jButton45.setBorder(null);
        jButton45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 150, 40));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 170, 30));

        jLabel76.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Tipo de Musica");
        jPanel16.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel77.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Descripcion del Evento");
        jPanel16.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jLabel133.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 0, 0));
        jPanel16.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 240, 20));

        jButton49.setBackground(new java.awt.Color(251, 161, 183));
        jButton49.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setText("Eliminar");
        jButton49.setBorder(null);
        jButton49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 90, 30));

        edicionDescripcionMusical.setBackground(new java.awt.Color(255, 255, 255));
        edicionDescripcionMusical.setColumns(20);
        edicionDescripcionMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionDescripcionMusical.setForeground(new java.awt.Color(0, 0, 0));
        edicionDescripcionMusical.setRows(5);
        jScrollPane5.setViewportView(edicionDescripcionMusical);

        jPanel16.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 470, 130));

        jLabel78.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Cantidad de Gente");
        jPanel16.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        edicionGenteMusical.setBackground(new java.awt.Color(255, 255, 255));
        edicionGenteMusical.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionGenteMusical.setForeground(new java.awt.Color(0, 0, 0));
        edicionGenteMusical.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edicionGenteMusicalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edicionGenteMusicalKeyTyped(evt);
            }
        });
        jPanel16.add(edicionGenteMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 230, 30));

        musicoIngresadoTF.setBackground(new java.awt.Color(255, 255, 255));
        musicoIngresadoTF.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        musicoIngresadoTF.setForeground(new java.awt.Color(0, 0, 0));
        musicoIngresadoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicoIngresadoTFActionPerformed(evt);
            }
        });
        jPanel16.add(musicoIngresadoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 320, -1));

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar Eventos.png"))); // NOI18N
        jPanel16.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EditarEventoMusicalLayout = new javax.swing.GroupLayout(EditarEventoMusical.getContentPane());
        EditarEventoMusical.getContentPane().setLayout(EditarEventoMusicalLayout);
        EditarEventoMusicalLayout.setHorizontalGroup(
            EditarEventoMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditarEventoMusicalLayout.setVerticalGroup(
            EditarEventoMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EditarEventoDeportivo.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel30.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel30.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel30.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Edicion Evento Deportivo");
        jPanel30.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        listaEquipo1.setBackground(new java.awt.Color(255, 255, 255));
        listaEquipo1.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        listaEquipo1.setForeground(new java.awt.Color(0, 0, 0));
        listaEquipo1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane15.setViewportView(listaEquipo1);

        jPanel30.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 180, 140));

        listaEquipo2.setBackground(new java.awt.Color(255, 255, 255));
        listaEquipo2.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        listaEquipo2.setForeground(new java.awt.Color(0, 0, 0));
        listaEquipo2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane16.setViewportView(listaEquipo2);

        jPanel30.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 180, 140));

        jLabel62.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Equipo 1");
        jPanel30.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel186.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setText("Equipo 2");
        jPanel30.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        agregarEquipo1.setBackground(new java.awt.Color(251, 161, 183));
        agregarEquipo1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        agregarEquipo1.setForeground(new java.awt.Color(255, 255, 255));
        agregarEquipo1.setText("Agregar");
        agregarEquipo1.setBorder(null);
        agregarEquipo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEquipo1ActionPerformed(evt);
            }
        });
        jPanel30.add(agregarEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 80, 30));

        agregarEquipo2.setBackground(new java.awt.Color(251, 161, 183));
        agregarEquipo2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        agregarEquipo2.setForeground(new java.awt.Color(255, 255, 255));
        agregarEquipo2.setText("Agregar");
        agregarEquipo2.setBorder(null);
        agregarEquipo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarEquipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEquipo2ActionPerformed(evt);
            }
        });
        jPanel30.add(agregarEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 80, 30));

        jLabel187.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setText("Codigo del Evento");
        jPanel30.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 210, -1));

        edicionCodigo.setEditable(false);
        edicionCodigo.setBackground(new java.awt.Color(255, 255, 255));
        edicionCodigo.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        edicionCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(edicionCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 210, 30));

        jLabel188.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel188.setText("Descripcion del Evento");
        jPanel30.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        edicionDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        edicionDescripcion.setColumns(20);
        edicionDescripcion.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        edicionDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        edicionDescripcion.setRows(5);
        jScrollPane17.setViewportView(edicionDescripcion);

        jPanel30.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 490, 110));

        jLabel189.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel189.setText("Fecha del Evento");
        jPanel30.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        edicionFecha.setBackground(new java.awt.Color(255, 255, 255));
        edicionFecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(edicionFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 190, -1));

        jLabel190.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(255, 255, 255));
        jLabel190.setText("Monto Acordado");
        jPanel30.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        edicionMonto.setBackground(new java.awt.Color(255, 255, 255));
        edicionMonto.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        edicionMonto.setForeground(new java.awt.Color(0, 0, 0));
        edicionMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edicionMontoKeyTyped(evt);
            }
        });
        jPanel30.add(edicionMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 190, 30));

        jLabel191.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(255, 255, 255));
        jLabel191.setText("Titulo del Evento");
        jPanel30.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        edicionTitulo.setBackground(new java.awt.Color(255, 255, 255));
        edicionTitulo.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        edicionTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(edicionTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 270, 30));

        jLabel192.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(255, 255, 255));
        jLabel192.setText("Cantidad de Gente");
        jPanel30.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        edicionGente.setBackground(new java.awt.Color(255, 255, 255));
        edicionGente.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        edicionGente.setForeground(new java.awt.Color(0, 0, 0));
        edicionGente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edicionGenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edicionGenteKeyTyped(evt);
            }
        });
        jPanel30.add(edicionGente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 210, -1));

        jLabel193.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel193.setText("Equipo 1");
        jPanel30.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        jLabel194.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(255, 255, 255));
        jLabel194.setText("Equipo 2");
        jPanel30.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        edicionEquipo1.setBackground(new java.awt.Color(255, 255, 255));
        edicionEquipo1.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        edicionEquipo1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(edicionEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 160, 30));

        jLabel195.setText("vs");
        jPanel30.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 460, -1, -1));

        edicionEquipo2.setBackground(new java.awt.Color(255, 255, 255));
        edicionEquipo2.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        edicionEquipo2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(edicionEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 160, 30));

        jLabel196.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setText("Tipo Deporte");
        jPanel30.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        jLabel125.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 0, 0));
        jPanel30.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 210, 20));

        borrarEquipo1.setBackground(new java.awt.Color(251, 161, 183));
        borrarEquipo1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        borrarEquipo1.setForeground(new java.awt.Color(255, 255, 255));
        borrarEquipo1.setText("Eliminar");
        borrarEquipo1.setBorder(null);
        borrarEquipo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarEquipo1ActionPerformed(evt);
            }
        });
        jPanel30.add(borrarEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 80, 30));

        edicionTipoDeporte.setBackground(new java.awt.Color(251, 161, 183));
        edicionTipoDeporte.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        edicionTipoDeporte.setForeground(new java.awt.Color(255, 255, 255));
        edicionTipoDeporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol", "Rugby", "Tenis", "Baseball" }));
        edicionTipoDeporte.setBorder(null);
        edicionTipoDeporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel30.add(edicionTipoDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 150, 30));

        borrarEquipo2.setBackground(new java.awt.Color(251, 161, 183));
        borrarEquipo2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        borrarEquipo2.setForeground(new java.awt.Color(255, 255, 255));
        borrarEquipo2.setText("Eliminar");
        borrarEquipo2.setBorder(null);
        borrarEquipo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarEquipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarEquipo2ActionPerformed(evt);
            }
        });
        jPanel30.add(borrarEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 80, 30));

        jButton34.setBackground(new java.awt.Color(251, 161, 183));
        jButton34.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Regresar");
        jButton34.setBorder(null);
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 110, 30));

        jButton16.setBackground(new java.awt.Color(251, 161, 183));
        jButton16.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Editar Evento");
        jButton16.setBorder(null);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 110, 30));

        jugadorIngresado1.setBackground(new java.awt.Color(255, 255, 255));
        jugadorIngresado1.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jugadorIngresado1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jugadorIngresado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 180, -1));

        jugadorIngresado2.setBackground(new java.awt.Color(255, 255, 255));
        jugadorIngresado2.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jugadorIngresado2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel30.add(jugadorIngresado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 180, -1));

        jLabel101.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar Eventos.png"))); // NOI18N
        jPanel30.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EditarEventoDeportivoLayout = new javax.swing.GroupLayout(EditarEventoDeportivo.getContentPane());
        EditarEventoDeportivo.getContentPane().setLayout(EditarEventoDeportivoLayout);
        EditarEventoDeportivoLayout.setHorizontalGroup(
            EditarEventoDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditarEventoDeportivoLayout.setVerticalGroup(
            EditarEventoDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Edición Evento Religioso");
        jPanel18.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel197.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setText("Titulo del Evento");
        jPanel18.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        edicionTituloReligioso.setBackground(new java.awt.Color(255, 255, 255));
        edicionTituloReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionTituloReligioso.setForeground(new java.awt.Color(0, 0, 0));
        edicionTituloReligioso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionTituloReligiosoActionPerformed(evt);
            }
        });
        jPanel18.add(edicionTituloReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 370, -1));

        jLabel65.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Codigo del Evento");
        jPanel18.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        edicionCodigoReligioso.setEditable(false);
        edicionCodigoReligioso.setBackground(new java.awt.Color(255, 255, 255));
        edicionCodigoReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionCodigoReligioso.setForeground(new java.awt.Color(0, 0, 0));
        jPanel18.add(edicionCodigoReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 210, -1));

        jLabel66.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Fecha del Evento");
        jPanel18.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        edicionFechaReligioso.setBackground(new java.awt.Color(255, 255, 255));
        edicionFechaReligioso.setForeground(new java.awt.Color(0, 0, 0));
        jPanel18.add(edicionFechaReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 190, -1));

        jLabel67.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Lps.");
        jPanel18.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel121.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("Monto Acordado");
        jPanel18.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        edicionMontoReligioso.setBackground(new java.awt.Color(255, 255, 255));
        edicionMontoReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionMontoReligioso.setForeground(new java.awt.Color(0, 0, 0));
        edicionMontoReligioso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionMontoReligiosoActionPerformed(evt);
            }
        });
        edicionMontoReligioso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edicionMontoReligiosoKeyTyped(evt);
            }
        });
        jPanel18.add(edicionMontoReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 200, -1));

        jLabel68.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Cantidad de Gente");
        jPanel18.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jButton50.setBackground(new java.awt.Color(251, 161, 183));
        jButton50.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton50.setForeground(new java.awt.Color(255, 255, 255));
        jButton50.setText("Regresar");
        jButton50.setBorder(null);
        jButton50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 110, 30));

        jLabel134.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 0, 0));
        jPanel18.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 156, 210, 20));

        edicionGenteReligioso.setBackground(new java.awt.Color(255, 255, 255));
        edicionGenteReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionGenteReligioso.setForeground(new java.awt.Color(0, 0, 0));
        edicionGenteReligioso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edicionGenteReligiosoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edicionGenteReligiosoKeyTyped(evt);
            }
        });
        jPanel18.add(edicionGenteReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 210, -1));

        jLabel132.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("Lps.");
        jPanel18.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        jLabel69.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Cantidad de Gente Convertida");
        jPanel18.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setText("2000");
        jPanel18.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 190, 30));

        jLabel131.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("Seguro");
        jPanel18.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        genteConvertida.setBackground(new java.awt.Color(255, 255, 255));
        genteConvertida.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        genteConvertida.setForeground(new java.awt.Color(0, 0, 0));
        jPanel18.add(genteConvertida, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 340, -1));

        jLabel70.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Descripcion del Evento");
        jPanel18.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        edicionDescripcionReligioso.setBackground(new java.awt.Color(255, 255, 255));
        edicionDescripcionReligioso.setColumns(20);
        edicionDescripcionReligioso.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        edicionDescripcionReligioso.setForeground(new java.awt.Color(0, 0, 0));
        edicionDescripcionReligioso.setRows(5);
        jScrollPane4.setViewportView(edicionDescripcionReligioso);

        jPanel18.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 410, 210));

        jButton15.setBackground(new java.awt.Color(251, 161, 183));
        jButton15.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Editar Evento");
        jButton15.setBorder(null);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 150, 30));

        jLabel120.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar Eventos.png"))); // NOI18N
        jPanel18.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EditarEventoReligiosoLayout = new javax.swing.GroupLayout(EditarEventoReligioso.getContentPane());
        EditarEventoReligioso.getContentPane().setLayout(EditarEventoReligiosoLayout);
        EditarEventoReligiosoLayout.setHorizontalGroup(
            EditarEventoReligiosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EditarEventoReligiosoLayout.setVerticalGroup(
            EditarEventoReligiosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EliminarEvento.setMinimumSize(new java.awt.Dimension(875, 610));

        jPanel19.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel19.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel19.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Eliminar Evento");
        jPanel19.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel80.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Codigo del Evento");
        jPanel19.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        codigoIngresadoEliminarEvento.setBackground(new java.awt.Color(255, 255, 255));
        codigoIngresadoEliminarEvento.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        codigoIngresadoEliminarEvento.setForeground(new java.awt.Color(0, 0, 0));
        codigoIngresadoEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoIngresadoEliminarEventoActionPerformed(evt);
            }
        });
        codigoIngresadoEliminarEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoIngresadoEliminarEventoKeyTyped(evt);
            }
        });
        jPanel19.add(codigoIngresadoEliminarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 230, 240, 30));

        jButton39.setBackground(new java.awt.Color(157, 60, 114));
        jButton39.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setText("Regresar");
        jButton39.setBorder(null);
        jButton39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 130, 40));

        jButton17.setBackground(new java.awt.Color(157, 60, 114));
        jButton17.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Eliminar Evento");
        jButton17.setBorder(null);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 190, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar Usuarios.png"))); // NOI18N
        jPanel19.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout EliminarEventoLayout = new javax.swing.GroupLayout(EliminarEvento.getContentPane());
        EliminarEvento.getContentPane().setLayout(EliminarEventoLayout);
        EliminarEventoLayout.setHorizontalGroup(
            EliminarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EliminarEventoLayout.setVerticalGroup(
            EliminarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VerEventoDeportivo.setMinimumSize(new java.awt.Dimension(1200, 410));
        VerEventoDeportivo.setResizable(false);

        jPanel17.setMaximumSize(new java.awt.Dimension(1200, 410));
        jPanel17.setMinimumSize(new java.awt.Dimension(1200, 410));
        jPanel17.setPreferredSize(new java.awt.Dimension(1200, 410));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton51.setBackground(new java.awt.Color(0, 204, 204));
        jButton51.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jButton51.setText("Regresar");
        jButton51.setBorder(null);
        jButton51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 160, -1));

        jScrollPane6.setMaximumSize(new java.awt.Dimension(1200, 410));
        jScrollPane6.setMinimumSize(new java.awt.Dimension(1200, 410));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(1200, 410));

        tablaEventoDeportivo.setBackground(new java.awt.Color(255, 255, 255));
        tablaEventoDeportivo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tablaEventoDeportivo.setForeground(new java.awt.Color(0, 0, 0));
        tablaEventoDeportivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Descripcion", "Fecha", "Monto", "Cantidad Gente", "Equipo1", "Equipo2", "Jugadores1", "Jugadores2", "TipoDeporte"
            }
        ));
        tablaEventoDeportivo.setMaximumSize(new java.awt.Dimension(1200, 410));
        tablaEventoDeportivo.setMinimumSize(new java.awt.Dimension(1200, 410));
        tablaEventoDeportivo.setPreferredSize(new java.awt.Dimension(1200, 410));
        tablaEventoDeportivo.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaEventoDeportivo.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(tablaEventoDeportivo);

        jPanel17.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 410));

        javax.swing.GroupLayout VerEventoDeportivoLayout = new javax.swing.GroupLayout(VerEventoDeportivo.getContentPane());
        VerEventoDeportivo.getContentPane().setLayout(VerEventoDeportivoLayout);
        VerEventoDeportivoLayout.setHorizontalGroup(
            VerEventoDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VerEventoDeportivoLayout.setVerticalGroup(
            VerEventoDeportivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        IngresarCodigoVerEvento.setMinimumSize(new java.awt.Dimension(400, 310));
        IngresarCodigoVerEvento.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Ver Evento");
        IngresarCodigoVerEvento.getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jLabel130.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("INGRESE EL CODIGO DEL EVENTO");
        IngresarCodigoVerEvento.getContentPane().add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        codigoIngresadoVerEvento.setBackground(new java.awt.Color(255, 255, 255));
        codigoIngresadoVerEvento.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        codigoIngresadoVerEvento.setForeground(new java.awt.Color(0, 0, 0));
        codigoIngresadoVerEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoIngresadoVerEventoActionPerformed(evt);
            }
        });
        codigoIngresadoVerEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoIngresadoVerEventoKeyTyped(evt);
            }
        });
        IngresarCodigoVerEvento.getContentPane().add(codigoIngresadoVerEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, -1));

        jButton48.setBackground(new java.awt.Color(255, 171, 171));
        jButton48.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setText("Regresar");
        jButton48.setBorder(null);
        jButton48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        IngresarCodigoVerEvento.getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 110, -1));

        jButton18.setBackground(new java.awt.Color(255, 171, 171));
        jButton18.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Ver Evento");
        jButton18.setBorder(null);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        IngresarCodigoVerEvento.getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, -1));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ver Evento.png"))); // NOI18N
        IngresarCodigoVerEvento.getContentPane().add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        VerEventoMusical.setMinimumSize(new java.awt.Dimension(1200, 410));

        jPanel20.setMaximumSize(new java.awt.Dimension(1200, 410));
        jPanel20.setMinimumSize(new java.awt.Dimension(1200, 410));
        jPanel20.setPreferredSize(new java.awt.Dimension(1200, 410));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton52.setBackground(new java.awt.Color(0, 204, 204));
        jButton52.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setText("Regresar");
        jButton52.setBorder(null);
        jButton52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 160, -1));

        jScrollPane7.setMaximumSize(new java.awt.Dimension(1200, 410));
        jScrollPane7.setMinimumSize(new java.awt.Dimension(1200, 410));
        jScrollPane7.setPreferredSize(new java.awt.Dimension(1200, 410));

        tablaEventoMusical.setBackground(new java.awt.Color(255, 255, 255));
        tablaEventoMusical.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tablaEventoMusical.setForeground(new java.awt.Color(0, 0, 0));
        tablaEventoMusical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Descripcion", "Fecha", "Monto", "CantidadGente", "EquipoMusical", "TipoMusica"
            }
        ));
        tablaEventoMusical.setMaximumSize(new java.awt.Dimension(1200, 410));
        tablaEventoMusical.setMinimumSize(new java.awt.Dimension(1200, 410));
        tablaEventoMusical.setPreferredSize(new java.awt.Dimension(1200, 410));
        tablaEventoMusical.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaEventoMusical.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(tablaEventoMusical);

        jPanel20.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 410));

        javax.swing.GroupLayout VerEventoMusicalLayout = new javax.swing.GroupLayout(VerEventoMusical.getContentPane());
        VerEventoMusical.getContentPane().setLayout(VerEventoMusicalLayout);
        VerEventoMusicalLayout.setHorizontalGroup(
            VerEventoMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VerEventoMusicalLayout.setVerticalGroup(
            VerEventoMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VerEventoReligioso.setMinimumSize(new java.awt.Dimension(1200, 410));

        jPanel21.setMaximumSize(new java.awt.Dimension(1200, 410));
        jPanel21.setMinimumSize(new java.awt.Dimension(1200, 410));
        jPanel21.setPreferredSize(new java.awt.Dimension(1200, 410));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton53.setBackground(new java.awt.Color(0, 204, 204));
        jButton53.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setText("Regresar");
        jButton53.setBorder(null);
        jButton53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 160, -1));

        jScrollPane8.setMaximumSize(new java.awt.Dimension(1200, 410));
        jScrollPane8.setMinimumSize(new java.awt.Dimension(1200, 410));
        jScrollPane8.setPreferredSize(new java.awt.Dimension(1200, 410));

        tablaEventoReligioso.setBackground(new java.awt.Color(255, 255, 255));
        tablaEventoReligioso.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tablaEventoReligioso.setForeground(new java.awt.Color(0, 0, 0));
        tablaEventoReligioso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Descripcion", "Fecha", "Monto", "CantidadGente", "CantidadGenteConvertida"
            }
        ));
        tablaEventoReligioso.setMaximumSize(new java.awt.Dimension(1200, 410));
        tablaEventoReligioso.setMinimumSize(new java.awt.Dimension(1200, 410));
        tablaEventoReligioso.setPreferredSize(new java.awt.Dimension(1200, 410));
        tablaEventoReligioso.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaEventoReligioso.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(tablaEventoReligioso);

        jPanel21.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 410));

        javax.swing.GroupLayout VerEventoReligiosoLayout = new javax.swing.GroupLayout(VerEventoReligioso.getContentPane());
        VerEventoReligioso.getContentPane().setLayout(VerEventoReligiosoLayout);
        VerEventoReligiosoLayout.setHorizontalGroup(
            VerEventoReligiosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerEventoReligiosoLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        VerEventoReligiosoLayout.setVerticalGroup(
            VerEventoReligiosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Reportes.setMaximumSize(new java.awt.Dimension(875, 610));
        Reportes.setMinimumSize(new java.awt.Dimension(875, 610));
        Reportes.setPreferredSize(new java.awt.Dimension(875, 610));

        jPanel22.setMaximumSize(new java.awt.Dimension(875, 610));
        jPanel22.setMinimumSize(new java.awt.Dimension(875, 610));
        jPanel22.setPreferredSize(new java.awt.Dimension(875, 610));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Reportes");
        jPanel22.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jButton19.setBackground(new java.awt.Color(193, 242, 176));
        jButton19.setFont(new java.awt.Font("Ebrima", 1, 28)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Listar Eventos Realizados");
        jButton19.setBorder(null);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 370, -1));

        jButton20.setBackground(new java.awt.Color(193, 242, 176));
        jButton20.setFont(new java.awt.Font("Ebrima", 1, 28)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Listar Eventos Futuros");
        jButton20.setBorder(null);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 310, -1));

        jButton21.setBackground(new java.awt.Color(193, 242, 176));
        jButton21.setFont(new java.awt.Font("Ebrima", 1, 28)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Listar Eventos Cancelados");
        jButton21.setBorder(null);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 370, -1));

        jButton22.setBackground(new java.awt.Color(193, 242, 176));
        jButton22.setFont(new java.awt.Font("Ebrima", 1, 28)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Ingreso Generado  por Fecha");
        jButton22.setBorder(null);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 420, -1));

        jButton23.setBackground(new java.awt.Color(193, 242, 176));
        jButton23.setFont(new java.awt.Font("Ebrima", 1, 28)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Ver Perfil");
        jButton23.setBorder(null);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 170, -1));

        jButton24.setBackground(new java.awt.Color(193, 242, 176));
        jButton24.setFont(new java.awt.Font("Ebrima", 1, 28)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Volver a Menu Principal");
        jButton24.setBorder(null);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 350, -1));

        jLabel135.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reportes.png"))); // NOI18N
        jPanel22.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ReportesLayout = new javax.swing.GroupLayout(Reportes.getContentPane());
        Reportes.getContentPane().setLayout(ReportesLayout);
        ReportesLayout.setHorizontalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReportesLayout.setVerticalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaUsuarioAdmin.setBackground(new java.awt.Color(255, 255, 255));
        tablaUsuarioAdmin.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tablaUsuarioAdmin.setForeground(new java.awt.Color(0, 0, 0));
        tablaUsuarioAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NombreCompleto", "Username", "Password", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarioAdmin.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(tablaUsuarioAdmin);
        if (tablaUsuarioAdmin.getColumnModel().getColumnCount() > 0) {
            tablaUsuarioAdmin.getColumnModel().getColumn(0).setResizable(false);
            tablaUsuarioAdmin.getColumnModel().getColumn(1).setResizable(false);
            tablaUsuarioAdmin.getColumnModel().getColumn(2).setResizable(false);
            tablaUsuarioAdmin.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel23.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 730, 80));

        tablaEventosAdmin.setBackground(new java.awt.Color(255, 255, 255));
        tablaEventosAdmin.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tablaEventosAdmin.setForeground(new java.awt.Color(0, 0, 0));
        tablaEventosAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Titulo", "Estado", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEventosAdmin.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tablaEventosAdmin);
        if (tablaEventosAdmin.getColumnModel().getColumnCount() > 0) {
            tablaEventosAdmin.getColumnModel().getColumn(0).setResizable(false);
            tablaEventosAdmin.getColumnModel().getColumn(1).setResizable(false);
            tablaEventosAdmin.getColumnModel().getColumn(2).setResizable(false);
            tablaEventosAdmin.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel23.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 730, 253));

        jButton55.setBackground(new java.awt.Color(165, 241, 233));
        jButton55.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton55.setForeground(new java.awt.Color(255, 255, 255));
        jButton55.setText("Regresar");
        jButton55.setBorder(null);
        jButton55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 160, -1));

        jLabel83.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Eventos");
        jPanel23.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel139.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setText("Perfil Administrativo");
        jPanel23.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel84.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Informacion del Usuario");
        jPanel23.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel138.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ver Perfil.png"))); // NOI18N
        jPanel23.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout VerPerfilAdminLayout = new javax.swing.GroupLayout(VerPerfilAdmin.getContentPane());
        VerPerfilAdmin.getContentPane().setLayout(VerPerfilAdminLayout);
        VerPerfilAdminLayout.setHorizontalGroup(
            VerPerfilAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        VerPerfilAdminLayout.setVerticalGroup(
            VerPerfilAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tablaUsuarioLimitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NomrbeCompleto", "Username", "Password", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarioLimitado.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(tablaUsuarioLimitado);
        if (tablaUsuarioLimitado.getColumnModel().getColumnCount() > 0) {
            tablaUsuarioLimitado.getColumnModel().getColumn(0).setResizable(false);
            tablaUsuarioLimitado.getColumnModel().getColumn(1).setResizable(false);
            tablaUsuarioLimitado.getColumnModel().getColumn(2).setResizable(false);
            tablaUsuarioLimitado.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel85.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel85.setText("Informacion del Usuario");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel85)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout VerPerfilLimitadoLayout = new javax.swing.GroupLayout(VerPerfilLimitado.getContentPane());
        VerPerfilLimitado.getContentPane().setLayout(VerPerfilLimitadoLayout);
        VerPerfilLimitadoLayout.setHorizontalGroup(
            VerPerfilLimitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerPerfilLimitadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        VerPerfilLimitadoLayout.setVerticalGroup(
            VerPerfilLimitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tablaUsuarioContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NombreCompleto", "Username", "Password", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarioContenido.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tablaUsuarioContenido);
        if (tablaUsuarioContenido.getColumnModel().getColumnCount() > 0) {
            tablaUsuarioContenido.getColumnModel().getColumn(0).setResizable(false);
            tablaUsuarioContenido.getColumnModel().getColumn(1).setResizable(false);
            tablaUsuarioContenido.getColumnModel().getColumn(2).setResizable(false);
            tablaUsuarioContenido.getColumnModel().getColumn(3).setResizable(false);
        }

        tablaEventosContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Titulo", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEventosContenido.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(tablaEventosContenido);
        if (tablaEventosContenido.getColumnModel().getColumnCount() > 0) {
            tablaEventosContenido.getColumnModel().getColumn(0).setResizable(false);
            tablaEventosContenido.getColumnModel().getColumn(1).setResizable(false);
            tablaEventosContenido.getColumnModel().getColumn(2).setResizable(false);
            tablaEventosContenido.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel86.setText("Informacion Del Usuario");

        jLabel87.setText("Eventos del Usuario");

        javax.swing.GroupLayout VerPerfilContenidoLayout = new javax.swing.GroupLayout(VerPerfilContenido.getContentPane());
        VerPerfilContenido.getContentPane().setLayout(VerPerfilContenidoLayout);
        VerPerfilContenidoLayout.setHorizontalGroup(
            VerPerfilContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerPerfilContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel86)
                .addGap(223, 223, 223))
            .addGroup(VerPerfilContenidoLayout.createSequentialGroup()
                .addGroup(VerPerfilContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VerPerfilContenidoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(VerPerfilContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(VerPerfilContenidoLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel87)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        VerPerfilContenidoLayout.setVerticalGroup(
            VerPerfilContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPerfilContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel87)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        tablaEventosRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Titulo", "Fecha", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(tablaEventosRealizados);
        if (tablaEventosRealizados.getColumnModel().getColumnCount() > 0) {
            tablaEventosRealizados.getColumnModel().getColumn(0).setResizable(false);
            tablaEventosRealizados.getColumnModel().getColumn(1).setResizable(false);
            tablaEventosRealizados.getColumnModel().getColumn(2).setResizable(false);
            tablaEventosRealizados.getColumnModel().getColumn(3).setResizable(false);
            tablaEventosRealizados.getColumnModel().getColumn(4).setResizable(false);
        }

        tablaEstadisticaEventosRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Deportivo", "Religiosos", "Musicales", "Monto "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(tablaEstadisticaEventosRealizados);
        if (tablaEstadisticaEventosRealizados.getColumnModel().getColumnCount() > 0) {
            tablaEstadisticaEventosRealizados.getColumnModel().getColumn(0).setResizable(false);
            tablaEstadisticaEventosRealizados.getColumnModel().getColumn(1).setResizable(false);
            tablaEstadisticaEventosRealizados.getColumnModel().getColumn(2).setResizable(false);
            tablaEstadisticaEventosRealizados.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel88.setText("Estadistica");

        jLabel89.setText("Eventos Realizados");

        jButton27.setText("Regresar");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel88))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel89))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButton27)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabel88)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton27)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout EventosRealizadosLayout = new javax.swing.GroupLayout(EventosRealizados.getContentPane());
        EventosRealizados.getContentPane().setLayout(EventosRealizadosLayout);
        EventosRealizadosLayout.setHorizontalGroup(
            EventosRealizadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventosRealizadosLayout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EventosRealizadosLayout.setVerticalGroup(
            EventosRealizadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventosRealizadosLayout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Titulo", "Fecha", "Monto "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane20.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Deportivos", "Religiosos", "Musicales", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane21.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EventosFuturosLayout = new javax.swing.GroupLayout(EventosFuturos.getContentPane());
        EventosFuturos.getContentPane().setLayout(EventosFuturosLayout);
        EventosFuturosLayout.setHorizontalGroup(
            EventosFuturosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventosFuturosLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EventosFuturosLayout.setVerticalGroup(
            EventosFuturosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "TItulo", "Fecha", "Multa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane22.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
        }

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Deportivos", "Musicales", "Religiosos", "Multa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane23.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EventosCanceladosLayout = new javax.swing.GroupLayout(EventosCancelados.getContentPane());
        EventosCancelados.getContentPane().setLayout(EventosCanceladosLayout);
        EventosCanceladosLayout.setHorizontalGroup(
            EventosCanceladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EventosCanceladosLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EventosCanceladosLayout.setVerticalGroup(
            EventosCanceladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EventosCanceladosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Titulo", "Fecha", "Multa"
            }
        ));
        jScrollPane24.setViewportView(jTable5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Deportivos", "Musicales", "Religiosos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane25.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel90.setText("Total Generado");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(totalGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel90)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout IngresoGeneradoPorFechaLayout = new javax.swing.GroupLayout(IngresoGeneradoPorFecha.getContentPane());
        IngresoGeneradoPorFecha.getContentPane().setLayout(IngresoGeneradoPorFechaLayout);
        IngresoGeneradoPorFechaLayout.setHorizontalGroup(
            IngresoGeneradoPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoGeneradoPorFechaLayout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        IngresoGeneradoPorFechaLayout.setVerticalGroup(
            IngresoGeneradoPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(875, 610));
        setMinimumSize(new java.awt.Dimension(875, 610));

        logInPanel.setBackground(new java.awt.Color(204, 204, 204));
        logInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton31.setBackground(new java.awt.Color(214, 52, 132));
        jButton31.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("SALIR");
        jButton31.setBorder(null);
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        logInPanel.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 210, 30));

        nameLabel.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("JAVA TICKET");
        logInPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 47));

        usernmaeLabel.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        usernmaeLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernmaeLabel.setText("Username:");
        logInPanel.add(usernmaeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        userTextField.setBackground(new java.awt.Color(255, 255, 255));
        userTextField.setFont(new java.awt.Font("Ebrima", 1, 40)); // NOI18N
        userTextField.setForeground(new java.awt.Color(0, 0, 0));
        logInPanel.add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 480, 50));

        passwordLabel.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");
        logInPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        logInButton.setBackground(new java.awt.Color(214, 52, 132));
        logInButton.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        logInButton.setForeground(new java.awt.Color(255, 255, 255));
        logInButton.setText("LOG IN");
        logInButton.setBorder(null);
        logInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logInButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        logInPanel.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 210, -1));

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(0, 0, 0));
        logInPanel.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 480, 50));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pantalla Principal.png"))); // NOI18N
        logInPanel.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //LogIn de los Usuarios
    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        int pos = searchUserIndex(userTextField.getText());
        boolean mensaje = logIn(userTextField.getText(), passwordTextField.getText()) == true;
        System.out.println(mensaje);
        if (mensaje/*logIn(userTextField.getText(), passwordTextField.getText()) == true*/) {
            if (usuarios.get(pos) instanceof UsuarioAdmin) {
                MenuAdmin.setVisible(true);
                MenuAdmin.setLocationRelativeTo(null);
                MenuAdmin.setResizable(false);
                MenuAdmin.pack();
                jLabel92.setText("¡Bienvenido, "+userTextField.getText()+"!");
                this.setVisible(false);
            } else if (usuarios.get(pos) instanceof UsuarioContenido) {
                MenuContenido.setVisible(true);
                MenuContenido.setLocationRelativeTo(null);
                MenuContenido.setResizable(false);
                MenuContenido.pack();
                jLabel98.setText("¡Bienvenido, "+userTextField.getText()+"!");                
                this.setVisible(false);
            } else if (usuarios.get(pos) instanceof UsuarioLimitado) {
                MenuLimitado.setVisible(true);
                MenuLimitado.setLocationRelativeTo(null);
                MenuLimitado.setResizable(false);
                MenuLimitado.pack();
                jLabel94.setText("¡Bienvenido, "+userTextField.getText()+"!");                
                this.setVisible(false);
            }

        } else {
            userTextField.setText("");
            passwordTextField.setText("");
        }
    }//GEN-LAST:event_logInButtonActionPerformed
  
    //Funcion Recursiva Para el LogIn
    private boolean logIn(String username, String password, int i) {
        if (i == usuarios.size()) {
            JOptionPane.showMessageDialog(null, "DICHO USUARIO NO EXISTE", "FALLO DE USUARIO", JOptionPane.ERROR_MESSAGE);
        }
        
        if (i < usuarios.size()) {
            if (usuarios.get(i).getUsername().equals(username)) {
                if (usuarios.get(i).getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(null, "¡Bienvenido "+username+" a Java Ticket!", "BIENVENIDO A JAVA TICKET", WIDTH);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA", "FALLO DE CONTRASEÑA", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }
        return logIn(username, password, i + 1);
    }

   private boolean logIn(String username, String password) {
         try {
            return logIn(username, password, 0);
        }catch(StackOverflowError e){
                //JOptionPane.showMessageDialog(null, "Datos Inválidos", "ERROR DE INICIO DE SESIÓN", JOptionPane.ERROR_MESSAGE);
                return false;
                }
            }

   //Visibilidad a ver Administrador de Eventos
    private void adminEventosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEventosButtonActionPerformed
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuAdmin.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_adminEventosButtonActionPerformed

    //Salir al LogIn ADMIN
    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro de Cerrar Sesión?","Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION){        
        MenuAdmin.setVisible(false);
        this.setVisible(true);
        userTextField.setText("");
        passwordTextField.setText("");
        }
        
    }//GEN-LAST:event_salirButtonActionPerformed

    //Direccionar al creador de eventos
    private void crearEventoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEventoButtonActionPerformed
        TipoEvento.setVisible(true);
        TipoEvento.setLocationRelativeTo(null);
        TipoEvento.setResizable(false);
        TipoEvento.pack();
        AdminEventos.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_crearEventoButtonActionPerformed

    //Salir al LogIn CONTENIDO
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro de Cerrar Sesión?","Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION){        
        MenuContenido.setVisible(false);
        this.setVisible(true);
        userTextField.setText("");
        passwordTextField.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nombreCompletoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCompletoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCompletoTFActionPerformed

    private void edadTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTFActionPerformed

    //funcion para validar user unico
   /* public boolean checkUser(String username) {
        for (Usuario user : usuarios) {
            if ((user.getUsername().replaceAll("\\s+", "").equalsIgnoreCase(username.replaceAll("\\s+", "")))) {
                return true;
            }
        }
        return false;
    }*/
    
    //Funcion Recursiva para validar que el usuario no se repita
    private boolean checkUser(String username,int i){
        if(i<usuarios.size()){
            if(usuarios.get(i).getUsername().replaceAll("\\s+", "").equalsIgnoreCase(username.replaceAll("\\s+", ""))){
                return true;
            }
        }
        return checkUser(username,i+1);
    }
    public boolean checkUser(String username){
        try{
            return checkUser(username,0);
        }catch(StackOverflowError e){
            return false;
        }
    }
    
    //CREAR USUSARIO
    private void crearUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioButtonActionPerformed
        String tipoUsuario = String.valueOf(tipoUsuarioCB.getSelectedItem());
        if (usernameTF.getText().isEmpty() || passwordTF.getText().isEmpty() || nombreCompletoTF.getText().isEmpty() || edadTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El usuario no se pudo crear! Llene todos los datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (tipoUsuario.equalsIgnoreCase("Administrador")) {
            //falta validacion de username unico
            try {
                String nombreCompleto = nombreCompletoTF.getText();
                String username = usernameTF.getText();
                String password = passwordTF.getText();
                int edad = Integer.parseInt(edadTF.getText());
                boolean validarUsuario = checkUser(username);
                if (validarUsuario == false) {
                    usuarios.add(new UsuarioAdmin(nombreCompleto, username, password, edad));
                    JOptionPane.showMessageDialog(null, "Usuario Creado!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    CrearUsuario.setVisible(false);
                    MenuAdmin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ya existe!", "MENSAJE", JOptionPane.PLAIN_MESSAGE);
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        } else if (tipoUsuario.equalsIgnoreCase("Contenido")) {
            try {
                String nombreCompleto = nombreCompletoTF.getText();
                String username = usernameTF.getText();
                String password = passwordTF.getText();
                int edad = Integer.parseInt(edadTF.getText());
                boolean validarUsuario = checkUser(username);
                if (validarUsuario == false) {
                    usuarios.add(new UsuarioContenido(nombreCompleto, username, password, edad));
                    JOptionPane.showMessageDialog(null, "Usuario Creado!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);                    
                    CrearUsuario.setVisible(false);
                    MenuAdmin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ya existe!", "MENSAJE", JOptionPane.PLAIN_MESSAGE);                }
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        } else if (tipoUsuario.equalsIgnoreCase("Limitado")) {
            try {
                String nombreCompleto = nombreCompletoTF.getText();
                String username = usernameTF.getText();
                String password = passwordTF.getText();
                int edad = Integer.parseInt(edadTF.getText());
                boolean validarUsuario = checkUser(username);
                if (validarUsuario == false) {
                    usuarios.add(new UsuarioLimitado(nombreCompleto, username, password, edad));
                    JOptionPane.showMessageDialog(null, "Usuario Creado!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);                
                    CrearUsuario.setVisible(false);
                    MenuAdmin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ya existe!", "MENSAJE", JOptionPane.PLAIN_MESSAGE);
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }

        nombreCompletoTF.setText("");
        usernameTF.setText("");
        passwordTF.setText("");
        edadTF.setText("");
        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_crearUsuarioButtonActionPerformed

    //DIALOG AL ADMINISTRADOR DE USUARIOS
    private void adminUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUsuariosButtonActionPerformed
        ManejoUsuario.setVisible(true);
        ManejoUsuario.setResizable(false);
        ManejoUsuario.setLocationRelativeTo(null);
        ManejoUsuario.pack();
        MenuAdmin.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUsuariosButtonActionPerformed

    //DIALOG AL CREAR USUARIO
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CrearUsuario.setVisible(true);
        CrearUsuario.setResizable(false);
        CrearUsuario.setLocationRelativeTo(null);
        CrearUsuario.pack();
        ManejoUsuario.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    //EDITAR SOLO ALGO DEL USUARIO
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EditarunElemento.setVisible(true);
        EditarunElemento.setResizable(false);
        EditarunElemento.setLocationRelativeTo(null);
        EditarunElemento.pack();
        EditarUsuario.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    //DIALOG DEL EDITAR USUARIO
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EditartodosElementos.setVisible(true);
        EditartodosElementos.setLocationRelativeTo(null);
        EditartodosElementos.setResizable(false);
        EditartodosElementos.pack();
        ManejoUsuario.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void edadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTextFieldActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFActionPerformed

    //EDITAR TODO DEL USUARIIO
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //funcion para editar todos los atributos
        int pos = searchUserIndex(inputUser.getText());
        if(nombreTF.getText().isEmpty() || usernameTextField.getText().isEmpty() || contraTF.getText().isEmpty() || edadTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "LLENE TODOS LOS DATOS");
        } else {
            if (pos != -1) {
            // Usuario encontrado, realizar las operaciones de edición
            usuarios.get(pos).setNombreCompleto(nombreTF.getText());
            usuarios.get(pos).setUsername(usernameTextField.getText());
            usuarios.get(pos).setPassword(contraTF.getText());
            int edad = Integer.parseInt(edadTextField.getText());
            usuarios.get(pos).setEdad(edad);

            // Restablecer los campos de texto y cambiar de visibilidad
            JOptionPane.showMessageDialog(null, "El Usuario ha sido modificado", "Editar Usuario", JOptionPane.INFORMATION_MESSAGE);
            inputUser.setText("");
            nombreTF.setText("");
            nombreTF.setVisible(false);
            usernameTextField.setText("");
            usernameTextField.setVisible(false);
            contraTF.setText("");
            contraTF.setVisible(false);
            edadTextField.setText("");
            edadTextField.setVisible(false);
            jLabel19.setVisible(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jLabel22.setVisible(false);
            jToggleButton1.setVisible(false);
            EditartodosElementos.setVisible(false);
            ManejoUsuario.setVisible(true);
        
            } else {
            // Usuario no encontrado, mostrar un JOptionPane
            JOptionPane.showMessageDialog(null, "El usuario no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            inputUser.setText("");
            }
        }
        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    //DIALOG AL EDITAR TODO LO DEL USUSARIO
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        EditartodosElementos.setVisible(true);
        EditartodosElementos.setLocationRelativeTo(null);
        EditartodosElementos.setResizable(false);
        EditartodosElementos.pack();
        EditarUsuario.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    //PURO SET TEXT
    private void nombreCompletoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCompletoRBActionPerformed
        atributoLabel.setText("Nombre Completo");
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCompletoRBActionPerformed

    private void usernameRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameRBActionPerformed
        atributoLabel.setText("Username");
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameRBActionPerformed

    private void passwordRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordRBActionPerformed
        atributoLabel.setText("Password");
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordRBActionPerformed

    private void edadRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadRBActionPerformed
        atributoLabel.setText("Edad");
        // TODO add your handling code here:
    }//GEN-LAST:event_edadRBActionPerformed

    //BOTON DE CAMBIAR LO EDITADO AL USUARIO
    private void cambiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarButtonActionPerformed
        Enumeration elements = atributoButtonGroup.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton button = (AbstractButton) elements.nextElement();
            if (button.isSelected()) {
                int pos = searchUserIndex(usuarioIngresado.getText());
                if (pos != -1 && pos < usuarios.size()) {
                    if (button.getText().equalsIgnoreCase("Nombre Completo")) {
                        usuarios.get(pos).setNombreCompleto(atributoTextField.getText());
                    } else if (button.getText().equalsIgnoreCase("Password")) {
                        usuarios.get(pos).setPassword(atributoTextField.getText());
                    } else if (button.getText().equalsIgnoreCase("Username")) {
                        usuarios.get(pos).setUsername(atributoTextField.getText());
                    } else if (button.getText().equalsIgnoreCase("Edad")) {
                        int edad = Integer.parseInt(atributoTextField.getText());
                        usuarios.get(pos).setEdad(edad);
                    }
                    JOptionPane.showMessageDialog(null, "SE MODIFICÓ \""+button.getText()+"\" EN EL USUARIO", "USUARIO MODIFICADO", JOptionPane.PLAIN_MESSAGE);
                    usuarioIngresado.setText("");
                    atributoTextField.setText("");
                    EditarunElemento.setVisible(false);
                    ManejoUsuario.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL USUARIO", "USUARIO NO ENCONTRADO", 3);
                    usuarioIngresado.setText("");
                    atributoTextField.setText("");
                    EditarunElemento.setVisible(false);
                    ManejoUsuario.setVisible(true);
                }
                JOptionPane.showMessageDialog(null, "NO SE SELECCIONO NINGUN ELEMENTO A EDITAR", "SELECCIONAR ELEMENTO", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        System.out.println("");
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiarButtonActionPerformed
    
    //BUSCAR USUSARIO FUNCION
    private int searchUserIndex(String username) {
        for (Usuario user : usuarios) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return usuarios.indexOf(user);
            }
        }
        return -1;
    }

    //UBICACION DEL EVENTO EN EL ARREGLO
    private int searchEventoIndex(int codigo) {
        for (Evento evento : eventosCreados) {
            System.out.println("1");
            if (evento.getCodigo() == codigo) {
                System.out.println("2");
                return eventosCreados.indexOf(evento);
            }
        }
        System.out.println("3");
        return -1;
    }

    //PURO MISCLICK
    private void usuarioIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioIngresadoActionPerformed

    private void atributoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atributoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atributoTextFieldActionPerformed

    //BOTON ELIMINAR USUARIO
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int pos = searchUserIndex(inputUsername.getText());
        if (pos != -1) {
            usuarios.remove(pos);
            eliminarLabel.setText("Eliminado Exitosamente!");
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe!");
            eliminarLabel.setText("");
        }
        inputUsername.setText("");
        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    //DIALOG A ELIMINAR USUARIO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EliminarUsuario.setVisible(true);
        EliminarUsuario.setResizable(false);
        EliminarUsuario.setLocationRelativeTo(null);
        EliminarUsuario.pack();
        ManejoUsuario.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    //CREAR EVENTO DEPORTIVO
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            
        try {
            String tipoDeporte = String.valueOf(deporteCB.getSelectedItem());
            int codigo = Integer.parseInt(codigoEventoAdmin.getText());
            String tituloEvento = tituloEventoAdmin.getText();
            String descripcion = descripcionEventoAdmin.getText();
            Date fechaEvento = fechaEventoAdmin.getDate();
            int montoRenta = Integer.parseInt(montoAcordadoEventoAdmin.getText());
            String montoD=String.valueOf(montoRenta);
            int cantidadGente = Integer.parseInt(cantidadGenteTF.getText());
            String cantidadD=String.valueOf(cantidadGente);
            boolean validarCodigo = codigoUnico(codigo);
            int pos = searchUserIndex(userTextField.getText());
            String equipo1 = equipo1TF.getText();
            String equipo2 = equipo2TF.getText();
            
            if (validarCodigo == false && cantidadGente <= 20000 && fechaEvento != null) {
                if (usuarios.get(pos) instanceof UsuarioAdmin) {
                    if (tipoDeporte.equalsIgnoreCase("Futbol")) {
                        eventosCreados.add(new EventoDeportivo(Deportes.FUTBOL, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoDeportivo(Deportes.FUTBOL, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO DEPORTIVO", JOptionPane.PLAIN_MESSAGE);
                        EventoDeportivo.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoDeporte.equalsIgnoreCase("Rugby")) {
                        eventosCreados.add(new EventoDeportivo(Deportes.RUGBY, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoDeportivo(Deportes.RUGBY, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO DEPORTIVO", JOptionPane.PLAIN_MESSAGE);
                        EventoDeportivo.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoDeporte.equalsIgnoreCase("Baseball")) {
                        eventosCreados.add(new EventoDeportivo(Deportes.BASEBALL, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoDeportivo(Deportes.BASEBALL, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO DEPORTIVO", JOptionPane.PLAIN_MESSAGE);
                        EventoDeportivo.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoDeporte.equalsIgnoreCase("Tenis")) {
                        eventosCreados.add(new EventoDeportivo(Deportes.TENIS, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoDeportivo(Deportes.TENIS, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO DEPORTIVO", JOptionPane.PLAIN_MESSAGE);
                        EventoDeportivo.setVisible(false);
                        AdminEventos.setVisible(true);
                    }
                    codigoEventoAdmin.setText("");
                    tituloEventoAdmin.setText("");
                    descripcionEventoAdmin.setText("");
                    montoAcordadoEventoAdmin.setText("");
                    cantidadGenteTF.setText("");
                    deporteCB.setSelectedIndex(0);
                    fechaEventoAdmin.setDate(null);
                    equipo1TF.setText("");
                    equipo2TF.setText("");
                    contadorDeportivos++;
                } else if (usuarios.get(pos) instanceof UsuarioContenido) {
                    if (tipoDeporte.equalsIgnoreCase("Futbol")) {
                        eventosCreados.add(new EventoDeportivo(Deportes.FUTBOL, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoDeportivo(Deportes.FUTBOL, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO DEPORTIVO", JOptionPane.PLAIN_MESSAGE);
                        EventoDeportivo.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoDeporte.equalsIgnoreCase("Rugby")) {
                        eventosCreados.add(new EventoDeportivo(Deportes.RUGBY, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoDeportivo(Deportes.RUGBY, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO DEPORTIVO", JOptionPane.PLAIN_MESSAGE);
                        EventoDeportivo.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoDeporte.equalsIgnoreCase("Baseball")) {
                        eventosCreados.add(new EventoDeportivo(Deportes.BASEBALL, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoDeportivo(Deportes.BASEBALL, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO DEPORTIVO", JOptionPane.PLAIN_MESSAGE);
                        EventoDeportivo.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoDeporte.equalsIgnoreCase("Tenis")) {
                        eventosCreados.add(new EventoDeportivo(Deportes.TENIS, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoDeportivo(Deportes.TENIS, cantidadGente, equipo1, equipo2, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO DEPORTIVO", JOptionPane.PLAIN_MESSAGE);
                        EventoDeportivo.setVisible(false);
                        AdminEventos.setVisible(true);
                    }
                    
                    codigoEventoAdmin.setText("");
                    tituloEventoAdmin.setText("");
                    descripcionEventoAdmin.setText("");
                    montoAcordadoEventoAdmin.setText("");
                    cantidadGenteTF.setText("");
                    deporteCB.setSelectedIndex(0);
                    fechaEventoAdmin.setDate(null);
                    equipo1TF.setText("");
                    equipo2TF.setText("");
                    contadorDeportivos++;
                }
            } else {
                JOptionPane.showMessageDialog(null, "ELIJA UNA FECHA/MINIMO DE GENTE", "ERROR", JOptionPane.ERROR_MESSAGE);                
                throw new NumberFormatException("¡El evento no se pudo crear!");
            }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "No se han ingresado todos los datos", "Error al crear evento", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
        

        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        System.out.println("");
        for (Evento evento : eventosCreados) {
            System.out.println(evento);
            System.out.println("");            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    //DIALOG A EVENTO DEPORTIVO
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        EventoDeportivo.setVisible(true);
        EventoDeportivo.setLocationRelativeTo(null);
        EventoDeportivo.setResizable(false);
        EventoDeportivo.pack();
        TipoEvento.setVisible(false);
        System.out.println("Incrementando ultimoCodigoD: " + ultimoCodigoD);
        codigoD = ++ultimoCodigoD;
        System.out.println("Nuevo valor de codigoD: " + codigoD);
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            codigoEventoAdmin.setText(String.valueOf(codigoD));
            System.out.println("Texto establecido en codigoEventoAdmin: " + codigoEventoAdmin.getText());
        }
        });
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tituloEventoMusicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloEventoMusicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloEventoMusicalActionPerformed

    //DIALOG A EVENTO MUSICAL
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //Esta funcion es para la creacion de eventos musicales
        EventoMusical.setVisible(true);
        EventoMusical.setLocationRelativeTo(null);
        EventoMusical.setResizable(false);
        EventoMusical.pack();
        TipoEvento.setVisible(false);
        System.out.println("Incrementando ultimoCodigoM: " + ultimoCodigoM);
        codigoM = ++ultimoCodigoM;
        System.out.println("Nuevo valor de codigoM: " + codigoM);
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            codigoEventoMusical.setText(String.valueOf(codigoM));
            System.out.println("Texto establecido en codigoEventoAdmin: " + codigoEventoMusical.getText());
        }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    //CREAR EVENTO MUSICAL
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //Esta es la funcion para crear eventos musicales
        try {
            String tipoMusica = String.valueOf(musicaCB.getSelectedItem());
            int codigo = Integer.parseInt(codigoEventoMusical.getText());
            String tituloEvento = tituloEventoMusical.getText();
            String descripcion = descripcionEventoMusical.getText();
            Date fechaEvento = fechaEventoMusical.getDate();
            int montoRenta = Integer.parseInt(montoEventoMusical.getText());
            String montoM=String.valueOf(montoRenta);
            double seguro=montoRenta*0.3;
            int cantidadGente = Integer.parseInt(genteEventoMusical.getText());
            String cantidadM=String.valueOf(cantidadGente);
            boolean validarCodigo = codigoUnico(codigo);
            int pos = searchUserIndex(userTextField.getText());
            if (validarCodigo == false && cantidadGente <= 25000 && fechaEvento!=null) {
                if (usuarios.get(pos) instanceof UsuarioAdmin) {
                    if (tipoMusica.equalsIgnoreCase("Pop")) {
                        eventosCreados.add(new EventoMusical(Musica.POP, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.POP, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Rock")) {
                        eventosCreados.add(new EventoMusical(Musica.ROCK, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.ROCK, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Rap")) {
                        eventosCreados.add(new EventoMusical(Musica.RAP, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.RAP, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Clasica")) {
                        eventosCreados.add(new EventoMusical(Musica.CLASICA, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.CLASICA, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Reggeaton")) {
                        eventosCreados.add(new EventoMusical(Musica.REGGEATON, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.REGGEATON, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Otro")) {
                        eventosCreados.add(new EventoMusical(Musica.OTRO, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.OTRO, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    }
                    codigoEventoMusical.setText("");
                    tituloEventoMusical.setText("");
                    descripcionEventoMusical.setText("");
                    montoEventoMusical.setText("");
                    genteEventoMusical.setText("");
                    jTextField1.setText("");
                    musicaCB.setSelectedIndex(0);
                    fechaEventoMusical.setDate(null);
                    contadorMusicales++;
                } else if (usuarios.get(pos) instanceof UsuarioContenido) {
                    if (tipoMusica.equalsIgnoreCase("Pop")) {
                        eventosCreados.add(new EventoMusical(Musica.POP, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.POP, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Rock")) {
                        eventosCreados.add(new EventoMusical(Musica.ROCK, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.ROCK, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Rap")) {
                        eventosCreados.add(new EventoMusical(Musica.RAP, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.RAP, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Clasica")) {
                        eventosCreados.add(new EventoMusical(Musica.CLASICA, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.CLASICA, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Reggeaton")) {
                        eventosCreados.add(new EventoMusical(Musica.REGGEATON, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.REGGEATON, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    } else if (tipoMusica.equalsIgnoreCase("Otro")) {
                        eventosCreados.add(new EventoMusical(Musica.OTRO, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoMusical(Musica.OTRO, cantidadGente, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                        JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO MUSICAL", JOptionPane.PLAIN_MESSAGE);
                        EventoMusical.setVisible(false);
                        AdminEventos.setVisible(true);
                    }
                    codigoEventoMusical.setText("");
                    tituloEventoMusical.setText("");
                    descripcionEventoMusical.setText("");
                    montoEventoMusical.setText("");
                    genteEventoMusical.setText("");
                    jTextField1.setText("");
                    musicaCB.setSelectedIndex(0);
                    fechaEventoMusical.setDate(null);
                    contadorMusicales++;
                }
            } else {
                JOptionPane.showMessageDialog(null, "ELIJA UNA FECHA/MINIMO DE FECHA", "ERROR", JOptionPane.ERROR_MESSAGE);                
                throw new NumberFormatException("¡El evento no se pudo crear!");
            }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "No se han ingresado todos los datos", "Error al crear evento", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
        
        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        for (Evento evento : eventosCreados) {
            System.out.println(evento);
            System.out.println("");            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tituloReligiosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloReligiosoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloReligiosoActionPerformed

    //CREAR EVENTO RELIGIOSO
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //funcion que permite crear un evento religioso
        try {
            int codigo = Integer.parseInt(codigoReligioso.getText());
            String tituloEvento = tituloReligioso.getText();
            String descripcion = descripcionReligioso.getText();
            Date fechaEvento = fechaReligioso.getDate();
            int montoRenta = Integer.parseInt(montoReligioso.getText());
            String montoR=String.valueOf(montoRenta);
            int cantidadGente = Integer.parseInt(genteReligioso.getText());
            String cantidadR=String.valueOf(cantidadGente);
            int cantidadGenteConvertida = 0;
            boolean validarCodigo = codigoUnico(codigo);
            int pos = searchUserIndex(userTextField.getText());
            if (validarCodigo == false && cantidadGente <= 30000 && fechaEvento!=null) {
                if (usuarios.get(pos) instanceof UsuarioAdmin) {
                    eventosCreados.add(new EventoReligioso(cantidadGente, cantidadGenteConvertida, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                    ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().add(new EventoReligioso(cantidadGente, cantidadGenteConvertida, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                    JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO RELIGIOSO", JOptionPane.PLAIN_MESSAGE);
                    EventoReligioso.setVisible(false);
                    AdminEventos.setVisible(true);
                    codigoReligioso.setText("");
                    tituloReligioso.setText("");
                    descripcionReligioso.setText("");
                    montoReligioso.setText("");
                    genteReligioso.setText("");
                    jTextField2.setText("");
                    fechaReligioso.setDate(null);
                    contadorReligiosos++;
                } else if (usuarios.get(pos) instanceof UsuarioContenido) {
                    eventosCreados.add(new EventoReligioso(cantidadGente, cantidadGenteConvertida, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                    ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().add(new EventoReligioso(cantidadGente, cantidadGenteConvertida, codigo, tituloEvento, descripcion, fechaEvento, montoRenta));
                    JOptionPane.showMessageDialog(null, "Se ha creado con éxito el evento "+tituloEvento, "CREAR EVENTO RELIGIOSO", JOptionPane.PLAIN_MESSAGE);
                    EventoReligioso.setVisible(false);
                    AdminEventos.setVisible(true);
                    codigoReligioso.setText("");
                    tituloReligioso.setText("");
                    descripcionReligioso.setText("");
                    montoReligioso.setText("");
                    genteReligioso.setText("");
                    jTextField2.setText("");
                    fechaReligioso.setDate(null);
                    contadorReligiosos++;
                }
            } else {
                JOptionPane.showMessageDialog(null, "ELIJA UNA FECHA/MINIMO DE GENTE", "ERROR", JOptionPane.ERROR_MESSAGE);                
                throw new NumberFormatException("¡El evento no se pudo crear!");
            }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "No se han ingresado todos los datos", "Error al crear evento", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
        
        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    //DIALOG ELIMINAR EVENTO
    private void eliminarEventoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEventoButtonActionPerformed
        //esta funcion permite eliminar un evento
        EliminarEvento.setVisible(true);
        EliminarEvento.setLocationRelativeTo(null);
        EliminarEvento.setResizable(false);
        EliminarEvento.pack();
        AdminEventos.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarEventoButtonActionPerformed

    //DIALOG INGRESAR CODIGO EDITAR EVENTO
    private void editarEventoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEventoButtonActionPerformed
        IngresarCodigoEvento.setVisible(true);
        IngresarCodigoEvento.setResizable(false);
        IngresarCodigoEvento.setLocationRelativeTo(null);
        IngresarCodigoEvento.pack();
        AdminEventos.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_editarEventoButtonActionPerformed

    //DIALOG EDIATR EVENTO DEPORTIVO
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int pos = searchEventoIndex(Integer.parseInt(codigoIngresadoTF.getText()));
        if (pos != -1) {
            Evento evento = eventosCreados.get(pos);
            
            if (evento.isEventoCancelado()) {
                JOptionPane.showMessageDialog(null, "El evento ha sido cancelado.\nEsta en modo solo ver.");
                
                if (evento instanceof EventoDeportivo) {
                EventoDeportivo eventoDeportivo = (EventoDeportivo) evento;

                //MOSTRAR LA INFORMACIÓN
                String deporteSeleccionado = eventoDeportivo.getDeporte().toString();
                DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) edicionTipoDeporte.getModel();
                
                model.setSelectedItem(deporteSeleccionado);
                
                edicionCodigo.setText(String.valueOf(evento.getCodigo()));
                edicionTitulo.setText(evento.getTituloEvento());
                edicionDescripcion.setText(evento.getDescripcion());
                edicionFecha.setDate(evento.getFechaEvento());
                edicionMonto.setText(String.valueOf(evento.getMontoRenta()));
                edicionGente.setText(String.valueOf(eventoDeportivo.getCantidadGente()));
                edicionEquipo1.setText(eventoDeportivo.getEquipo1());
                edicionEquipo2.setText(eventoDeportivo.getEquipo2());
                
                listaEquipo1.setModel(new DefaultListModel());
                for (String jugador : eventoDeportivo.getListadoJugadores1()) {
                ((DefaultListModel) listaEquipo1.getModel()).addElement(jugador);
                }
                listaEquipo2.setModel(new DefaultListModel());
                for (String jugador : eventoDeportivo.getListadoJugadores2()) {
                ((DefaultListModel) listaEquipo2.getModel()).addElement(jugador);
                }
                
                //INICIAR
                EditarEventoDeportivo.setVisible(true);
                EditarEventoDeportivo.setResizable(false);
                EditarEventoDeportivo.setLocationRelativeTo(null);
                EditarEventoDeportivo.pack();
                codigoIngresadoTF.setText("");
                IngresarCodigoEvento.setVisible(false);
                
                //DESHABILITAR
                edicionTitulo.setEditable(false);
                edicionFecha.setEnabled(false);
                edicionGente.setEditable(false);
                jugadorIngresado1.setEditable(false);
                jugadorIngresado2.setEditable(false);
                edicionMonto.setEditable(false);
                edicionEquipo1.setEditable(false);
                edicionEquipo2.setEditable(false);
                edicionTipoDeporte.setEnabled(false);
                agregarEquipo1.setEnabled(false);
                agregarEquipo2.setEnabled(false);
                borrarEquipo1.setEnabled(false);
                borrarEquipo2.setEnabled(false);
                edicionDescripcion.setEditable(false);
                jButton16.setEnabled(false);
                
            } else if (eventosCreados.get(pos) instanceof EventoMusical) {
                EventoMusical eventoMusical = (EventoMusical) evento;
                
                //MOSTRAR LA INFORMACIÓN
                String musicaSeleccionada = eventoMusical.getTipoMusica().toString();
                DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) edicionTipoMusica.getModel();
                
                model.setSelectedItem(musicaSeleccionada);
                
                edicionTituloMusical.setText(evento.getTituloEvento());
                edicionCodigoMusical.setText(String.valueOf(evento.getCodigo()));
                edicionDescripcionMusical.setText(evento.getDescripcion());
                edicionFechaMusical.setDate(evento.getFechaEvento());
                edicionMontoMusical.setText(String.valueOf(evento.getMontoRenta()));
                edicionGenteMusical.setText(String.valueOf(eventoMusical.getCantidadGente()));
                jTextField4.setText(String.valueOf(eventoMusical.getSeguro()));
                
                listaMusicos.setModel(new DefaultListModel());
                for (String musico : eventoMusical.getListadoEquipoMusical()) {
                ((DefaultListModel) listaMusicos.getModel()).addElement(musico);
                }
                
                //INICIAR
                EditarEventoMusical.setVisible(true);
                EditarEventoMusical.setResizable(false);
                EditarEventoMusical.setLocationRelativeTo(null);
                EditarEventoMusical.pack();
                codigoIngresadoTF.setText("");
                IngresarCodigoEvento.setVisible(false);
            } else if (eventosCreados.get(pos) instanceof EventoReligioso) {
                EventoReligioso eventoReligioso = (EventoReligioso) evento;
                
                //MOSTRAR LA INFORMACIÓN
                edicionTituloReligioso.setText(evento.getTituloEvento());
                edicionCodigoReligioso.setText(String.valueOf(evento.getCodigo()));
                edicionDescripcionReligioso.setText(evento.getDescripcion());
                edicionGenteReligioso.setText(String.valueOf(eventoReligioso.getCantidadGente()));
                genteConvertida.setText(String.valueOf(eventoReligioso.getCantidadGenteConvertidas()));
                
                //INICIAR
                EditarEventoReligioso.setVisible(true);
                EditarEventoReligioso.setResizable(false);
                EditarEventoReligioso.setLocationRelativeTo(null);
                EditarEventoReligioso.pack();
                codigoIngresadoTF.setText("");
                IngresarCodigoEvento.setVisible(false);
            }
                
            }
            
            if (evento instanceof EventoDeportivo) {
                EventoDeportivo eventoDeportivo = (EventoDeportivo) evento;

                //MOSTRAR LA INFORMACIÓN
                String deporteSeleccionado = eventoDeportivo.getDeporte().toString();
                DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) edicionTipoDeporte.getModel();
                
                model.setSelectedItem(deporteSeleccionado);
                
                edicionCodigo.setText(String.valueOf(evento.getCodigo()));
                edicionTitulo.setText(evento.getTituloEvento());
                edicionDescripcion.setText(evento.getDescripcion());
                edicionFecha.setDate(evento.getFechaEvento());
                edicionMonto.setText(String.valueOf(evento.getMontoRenta()));
                edicionGente.setText(String.valueOf(eventoDeportivo.getCantidadGente()));
                edicionEquipo1.setText(eventoDeportivo.getEquipo1());
                edicionEquipo2.setText(eventoDeportivo.getEquipo2());
                
                listaEquipo1.setModel(new DefaultListModel());
                for (String jugador : eventoDeportivo.getListadoJugadores1()) {
                ((DefaultListModel) listaEquipo1.getModel()).addElement(jugador);
                }
                listaEquipo2.setModel(new DefaultListModel());
                for (String jugador : eventoDeportivo.getListadoJugadores2()) {
                ((DefaultListModel) listaEquipo2.getModel()).addElement(jugador);
                }
                
                //INICIAR
                EditarEventoDeportivo.setVisible(true);
                EditarEventoDeportivo.setResizable(false);
                EditarEventoDeportivo.setLocationRelativeTo(null);
                EditarEventoDeportivo.pack();
                codigoIngresadoTF.setText("");
                IngresarCodigoEvento.setVisible(false);
                
                //HABILITAR
                edicionTitulo.setEditable(true);
                edicionFecha.setEnabled(true);
                edicionGente.setEditable(true);
                jugadorIngresado1.setEditable(true);
                jugadorIngresado2.setEditable(true);
                edicionMonto.setEditable(true);
                edicionEquipo1.setEditable(true);
                edicionEquipo2.setEditable(true);
                edicionTipoDeporte.setEnabled(true);
                agregarEquipo1.setEnabled(true);
                agregarEquipo2.setEnabled(true);
                borrarEquipo1.setEnabled(true);
                borrarEquipo2.setEnabled(true);
                edicionDescripcion.setEditable(true);
                jButton16.setEnabled(true);
                
            } else if (eventosCreados.get(pos) instanceof EventoMusical) {
                EventoMusical eventoMusical = (EventoMusical) evento;
                
                //MOSTRAR LA INFORMACIÓN
                String musicaSeleccionada = eventoMusical.getTipoMusica().toString();
                DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) edicionTipoMusica.getModel();
                
                model.setSelectedItem(musicaSeleccionada);
                
                edicionTituloMusical.setText(evento.getTituloEvento());
                edicionCodigoMusical.setText(String.valueOf(evento.getCodigo()));
                edicionDescripcionMusical.setText(evento.getDescripcion());
                edicionFechaMusical.setDate(evento.getFechaEvento());
                edicionMontoMusical.setText(String.valueOf(evento.getMontoRenta()));
                edicionGenteMusical.setText(String.valueOf(eventoMusical.getCantidadGente()));
                jTextField4.setText(String.valueOf(eventoMusical.getSeguro()));
                
                listaMusicos.setModel(new DefaultListModel());
                for (String musico : eventoMusical.getListadoEquipoMusical()) {
                ((DefaultListModel) listaMusicos.getModel()).addElement(musico);
                }
                
                //INICIAR
                EditarEventoMusical.setVisible(true);
                EditarEventoMusical.setResizable(false);
                EditarEventoMusical.setLocationRelativeTo(null);
                EditarEventoMusical.pack();
                codigoIngresadoTF.setText("");
                IngresarCodigoEvento.setVisible(false);
            } else if (eventosCreados.get(pos) instanceof EventoReligioso) {
                EventoReligioso eventoReligioso = (EventoReligioso) evento;
                
                //MOSTRAR LA INFORMACIÓN
                edicionTituloReligioso.setText(evento.getTituloEvento());
                edicionCodigoReligioso.setText(String.valueOf(evento.getCodigo()));
                edicionDescripcionReligioso.setText(evento.getDescripcion());
                edicionGenteReligioso.setText(String.valueOf(eventoReligioso.getCantidadGente()));
                genteConvertida.setText(String.valueOf(eventoReligioso.getCantidadGenteConvertidas()));
                
                //INICIAR
                EditarEventoReligioso.setVisible(true);
                EditarEventoReligioso.setResizable(false);
                EditarEventoReligioso.setLocationRelativeTo(null);
                EditarEventoReligioso.pack();
                codigoIngresadoTF.setText("");
                IngresarCodigoEvento.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Evento No Existe!");
                codigoIngresadoTF.setText("");
                IngresarCodigoEvento.setVisible(false);
                AdminEventos.setVisible(true);
            }
        } else {
            codigoIngresadoTF.setText("");
            IngresarCodigoEvento.setVisible(false);
            AdminEventos.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void edicionTituloReligiosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionTituloReligiosoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edicionTituloReligiosoActionPerformed

    private void edicionMontoReligiosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionMontoReligiosoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edicionMontoReligiosoActionPerformed

    //BOTON PARA HACER LOS CAMBIOS DE EVENTO DEPORTIVO
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        //Esta funcion permite editar el tipo de evento Deportivo
        
            System.out.println("Antes de la conversión de valores...");
            String tipoDeporte = String.valueOf(edicionTipoDeporte.getSelectedItem());
            int codigo = Integer.parseInt(edicionCodigo.getText());
            String tituloEvento = edicionTitulo.getText();
            String descripcion = edicionDescripcion.getText();
            Date fechaEvento = edicionFecha.getDate();
            int montoRenta = Integer.parseInt(edicionMonto.getText());
            int cantidadGente = Integer.parseInt(edicionGente.getText());
            int pos = searchEventoIndex(Integer.parseInt(edicionCodigo.getText()));
            System.out.println(pos);
            boolean validarCodigo = codigoUnico(codigo);
            String equipo1 = edicionEquipo1.getText();
            String equipo2 = edicionEquipo2.getText();
            int userPos = searchUserIndex(userTextField.getText());
            int userEventoPos = searchUserEventos(Integer.parseInt(edicionCodigo.getText()), userPos);
            System.out.println(validarCodigo);
            if (listaEquipo1.getModel().getSize() > 0 && listaEquipo2.getModel().getSize() > 0) {
            if (validarCodigo==true && cantidadGente <= 20000 ) {
                if (tipoDeporte.equalsIgnoreCase("Futbol")) {
                    //lista de Eventos Creados
                    ((EventoDeportivo) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoDeportivo) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoDeportivo) eventosCreados.get(pos)).setDeporte(Deportes.FUTBOL);
                    ((EventoDeportivo) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoDeportivo) eventosCreados.get(pos)).setEquipo1(equipo1);
                    ((EventoDeportivo) eventosCreados.get(pos)).setEquipo2(equipo2);
                    ((EventoDeportivo) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoDeportivo) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    ((EventoDeportivo) eventosCreados.get(pos)).setTituloEvento(tituloEvento);
                    for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                        ((EventoDeportivo) eventosCreados.get(pos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                    }
                    for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                        ((EventoDeportivo) eventosCreados.get(pos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                    }
                    //////////////////////////////////////////////////////////////////////////////////////////////////
                    //lista de eventos del usuarios loggeado
                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDeporte(Deportes.FUTBOL);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo1(equipo1);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo2(equipo2);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                        }
                        for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDeporte(Deportes.FUTBOL);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo1(equipo1);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo2(equipo2);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                        }
                        for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                        }
                    }
                    /////////////////////////////////////////////////////////////////////////////////////////////////////////
                } else if (tipoDeporte.equalsIgnoreCase("Rugby")) {
                    ((EventoDeportivo) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoDeportivo) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoDeportivo) eventosCreados.get(pos)).setDeporte(Deportes.RUGBY);
                    ((EventoDeportivo) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoDeportivo) eventosCreados.get(pos)).setEquipo1(equipo1);
                    ((EventoDeportivo) eventosCreados.get(pos)).setEquipo2(equipo2);
                    ((EventoDeportivo) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoDeportivo) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                        ((EventoDeportivo) eventosCreados.get(pos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                    }
                    for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                        ((EventoDeportivo) eventosCreados.get(pos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                    }
                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDeporte(Deportes.RUGBY);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo1(equipo1);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo2(equipo2);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                        }
                        for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDeporte(Deportes.RUGBY);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo1(equipo1);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo2(equipo2);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                        }
                        for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                        }
                    }
                    //////////////////////////////////////////////////////////////////////////////////////////
                } else if (tipoDeporte.equalsIgnoreCase("Baseball")) {
                    ((EventoDeportivo) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoDeportivo) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoDeportivo) eventosCreados.get(pos)).setDeporte(Deportes.BASEBALL);
                    ((EventoDeportivo) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoDeportivo) eventosCreados.get(pos)).setEquipo1(equipo1);
                    ((EventoDeportivo) eventosCreados.get(pos)).setEquipo2(equipo2);
                    ((EventoDeportivo) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoDeportivo) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                        ((EventoDeportivo) eventosCreados.get(pos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                    }
                    for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                        ((EventoDeportivo) eventosCreados.get(pos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                    }

                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDeporte(Deportes.BASEBALL);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo1(equipo1);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo2(equipo2);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                        }
                        for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDeporte(Deportes.BASEBALL);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo1(equipo1);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo2(equipo2);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                        }
                        for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                        }
                    }
                    //////////////////////////////////////////////////////////////////////////////////////////////
                } else if (tipoDeporte.equalsIgnoreCase("Tenis")) {
                    ((EventoDeportivo) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoDeportivo) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoDeportivo) eventosCreados.get(pos)).setDeporte(Deportes.TENIS);
                    ((EventoDeportivo) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoDeportivo) eventosCreados.get(pos)).setEquipo1(equipo1);
                    ((EventoDeportivo) eventosCreados.get(pos)).setEquipo2(equipo2);
                    ((EventoDeportivo) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoDeportivo) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                        ((EventoDeportivo) eventosCreados.get(pos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                    }
                    for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                        ((EventoDeportivo) eventosCreados.get(pos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                    }
                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDeporte(Deportes.TENIS);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo1(equipo1);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo2(equipo2);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                        }
                        for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDeporte(Deportes.TENIS);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo1(equipo1);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setEquipo2(equipo2);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        for (int i = 0; i < listaEquipo1.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores1().add(listaEquipo1.getModel().getElementAt(i));
                        }
                        for (int i = 0; i < listaEquipo2.getModel().getSize(); i++) {
                            ((EventoDeportivo) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoJugadores2().add(listaEquipo2.getModel().getElementAt(i));
                        }
                    }
                    //////////////////////////////////////////////////////////////////////////////////////////////////////
                }
                JOptionPane.showMessageDialog(null, "El evento se ha guardado correctamente.");
                edicionCodigo.setText("");
                edicionTitulo.setText("");
                edicionDescripcion.setText("");
                edicionMonto.setText("");
                edicionGente.setText("");
                edicionEquipo1.setText("");
                edicionEquipo2.setText("");
                listaEquipo1.clearSelection();
                listaEquipo2.clearSelection();
                edicionFecha.setDate(null);
                listaEquipo1.setModel(dml);
                dml.removeAllElements();
                listaEquipo2.setModel(dml2);
                dml2.removeAllElements();
                EditarEventoDeportivo.setVisible(false);
                AdminEventos.setVisible(true);
                AdminEventos.setLocationRelativeTo(null);
                AdminEventos.setResizable(false);
                AdminEventos.pack();
                
            } else {
                JOptionPane.showMessageDialog(null, "El evento no se pudo Editar!");
            } 
            } else {
                JOptionPane.showMessageDialog(null, "Las listas de equipos no pueden estar vacías.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        

        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        for (Evento evento : eventosCreados) {
            System.out.println(evento);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed
    
    //AGREGAR LOS JUGADORES
    DefaultListModel dml = new DefaultListModel();
    private void agregarEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEquipo1ActionPerformed
        dml.addElement(jugadorIngresado1.getText());
        listaEquipo1.setModel(dml);
        jugadorIngresado1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarEquipo1ActionPerformed
    DefaultListModel dml2 = new DefaultListModel();
    private void agregarEquipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEquipo2ActionPerformed
        dml2.addElement(jugadorIngresado2.getText());
        listaEquipo2.setModel(dml2);
        jugadorIngresado2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarEquipo2ActionPerformed

    //BOTON DE EDITAR EL EVENTO MUSICAL
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        //Esta es la funcion para poder editar un evento Musical
        
            String tipoMusica = String.valueOf(edicionTipoMusica.getSelectedItem());
            int codigo = Integer.parseInt(edicionCodigoMusical.getText());
            String tituloEvento = edicionTituloMusical.getText();
            String descripcion = edicionDescripcionMusical.getText();
            Date fechaEvento = edicionFechaMusical.getDate();
            int montoRenta = Integer.parseInt(edicionMontoMusical.getText());
            double seguro = Double.parseDouble(jTextField4.getText());
            int cantidadGente = Integer.parseInt(edicionGenteMusical.getText());
            int pos = searchEventoIndex(Integer.parseInt(edicionCodigoMusical.getText()));
            boolean validarCodigo = codigoUnico(codigo);
            int userPos = searchUserIndex(userTextField.getText());
            int userEventoPos = searchUserEventos(Integer.parseInt(edicionCodigoMusical.getText()), userPos);
            if (validarCodigo == true && cantidadGente <= 25000) {
                if (tipoMusica.equalsIgnoreCase("Pop")) {
                    //lista de Eventos Creados
                    ((EventoMusical) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoMusical) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoMusical) eventosCreados.get(pos)).setTipoMusica(Musica.POP);
                    ((EventoMusical) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoMusical) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoMusical) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setTituloEvento(tituloEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setSeguro(seguro);
                    for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                        ((EventoMusical) eventosCreados.get(pos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                    }
                    //////////////////////////////////////////////////////////////////////////////////////////////////
                    //lista de eventos del usuarios loggeado
                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.POP);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.POP);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    }
                    /////////////////////////////////////////////////////////////////////////////////////////////////////////
                } else if (tipoMusica.equalsIgnoreCase("Rock")) {
                    ((EventoMusical) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoMusical) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoMusical) eventosCreados.get(pos)).setTipoMusica(Musica.ROCK);
                    ((EventoMusical) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoMusical) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoMusical) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setTituloEvento(tituloEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setSeguro(seguro);
                    for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                        ((EventoMusical) eventosCreados.get(pos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                    }

                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.ROCK);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.ROCK);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    }
                    //////////////////////////////////////////////////////////////////////////////////////////
                } else if (tipoMusica.equalsIgnoreCase("Rap")) {
                    ((EventoMusical) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoMusical) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoMusical) eventosCreados.get(pos)).setTipoMusica(Musica.RAP);
                    ((EventoMusical) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoMusical) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoMusical) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setTituloEvento(tituloEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setSeguro(seguro);
                    for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                        ((EventoMusical) eventosCreados.get(pos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                    }

                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.RAP);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.RAP);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    }
                    //////////////////////////////////////////////////////////////////////////////////////////////
                } else if (tipoMusica.equalsIgnoreCase("Clasica")) {
                    ((EventoMusical) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoMusical) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoMusical) eventosCreados.get(pos)).setTipoMusica(Musica.CLASICA);
                    ((EventoMusical) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoMusical) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoMusical) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setTituloEvento(tituloEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setSeguro(seguro);
                    for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                        ((EventoMusical) eventosCreados.get(pos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                    }
                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.CLASICA);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.CLASICA);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    }

                    //////////////////////////////////////////////////////////////////////////////////////////////////////
                } else if (tipoMusica.equalsIgnoreCase("Reggeaton")) {
                    ((EventoMusical) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoMusical) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoMusical) eventosCreados.get(pos)).setTipoMusica(Musica.REGGEATON);
                    ((EventoMusical) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoMusical) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoMusical) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setTituloEvento(tituloEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setSeguro(seguro);
                    for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                        ((EventoMusical) eventosCreados.get(pos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                    }
                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.REGGEATON);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.REGGEATON);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    }

                    //////////////////////////////////////////////////////////////////////////////////////////////////////
                } else if (tipoMusica.equalsIgnoreCase("Otro")) {
                    ((EventoMusical) eventosCreados.get(pos)).setCodigo(codigo);
                    ((EventoMusical) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                    ((EventoMusical) eventosCreados.get(pos)).setTipoMusica(Musica.OTRO);
                    ((EventoMusical) eventosCreados.get(pos)).setDescripcion(descripcion);
                    ((EventoMusical) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                    ((EventoMusical) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setTituloEvento(tituloEvento);
                    ((EventoMusical) eventosCreados.get(pos)).setSeguro(seguro);
                    for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                        ((EventoMusical) eventosCreados.get(pos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                    }
                    if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.OTRO);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTipoMusica(Musica.OTRO);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                        ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setSeguro(seguro);
                        for (int i = 0; i < listaMusicos.getModel().getSize(); i++) {
                            ((EventoMusical) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).getListadoEquipoMusical().add(listaMusicos.getModel().getElementAt(i));
                        }
                    }

                    //////////////////////////////////////////////////////////////////////////////////////////////////////
                }
                    System.out.println("Después de la conversión de valores...");
                    JOptionPane.showMessageDialog(null, "El evento se ha guardado correctamente.");
                edicionCodigoMusical.setText("");
                edicionTituloMusical.setText("");
                edicionDescripcionMusical.setText("");
                edicionMontoMusical.setText("");
                edicionGenteMusical.setText("");
                edicionFechaMusical.setDate(null);
                listaMusicos.setModel(dml3);
                dml3.removeAllElements();
                EditarEventoMusical.setVisible(false);
                AdminEventos.setVisible(true);
                AdminEventos.setLocationRelativeTo(null);
                AdminEventos.setResizable(false);
                AdminEventos.pack();
                
            } else {
                JOptionPane.showMessageDialog(null, "El evento no se pudo Editar!");
            }

        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        for (Evento evento : eventosCreados) {
            System.out.println(evento);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed
    
    //BOTON LISTADO DE MUSICO-INSTRUMENTO
    DefaultListModel dml3 = new DefaultListModel();
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        dml3.addElement(musicoIngresadoTF.getText());
        listaMusicos.setModel(dml3);
        musicoIngresadoTF.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    //BOTON DE EDITAR EVENTO RELIGIOSO
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        //esta funcion permite editar un evento religioso
            
            int codigo = Integer.parseInt(edicionCodigoReligioso.getText());
            String tituloEvento = edicionTituloReligioso.getText();
            String descripcion = edicionDescripcionReligioso.getText();
            Date fechaEvento = edicionFechaReligioso.getDate();
            int montoRenta = Integer.parseInt(edicionMontoReligioso.getText());
            int cantidadGente = Integer.parseInt(edicionGenteReligioso.getText());
            int cantidadGenteConvertida = Integer.parseInt(genteConvertida.getText());
            int pos = searchEventoIndex(Integer.parseInt(edicionCodigoReligioso.getText()));
            boolean validarCodigo = codigoUnico(codigo);
            int userPos = searchUserIndex(userTextField.getText());
            int userEventoPos = searchUserEventos(Integer.parseInt(edicionCodigoReligioso.getText()), userPos);
            
            if (validarCodigo == true && cantidadGente <= 30000) {
                ((EventoReligioso) eventosCreados.get(pos)).setCodigo(codigo);
                ((EventoReligioso) eventosCreados.get(pos)).setCantidadGente(cantidadGente);
                ((EventoReligioso) eventosCreados.get(pos)).setDescripcion(descripcion);
                ((EventoReligioso) eventosCreados.get(pos)).setMontoRenta(montoRenta);
                ((EventoReligioso) eventosCreados.get(pos)).setFechaEvento(fechaEvento);
                ((EventoReligioso) eventosCreados.get(pos)).setTituloEvento(tituloEvento);
                ((EventoReligioso) eventosCreados.get(pos)).setCantidadGenteConvertidas(cantidadGenteConvertida);

                //////////////////////////////////////////////////////////////////////////////////////////////////
                //lista de eventos del usuarios loggeado
                if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                    ((EventoReligioso) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                    ((EventoReligioso) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                    ((EventoReligioso) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                    ((EventoReligioso) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                    ((EventoReligioso) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                    ((EventoReligioso) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                    ((EventoReligioso) ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGenteConvertidas(cantidadGenteConvertida);

                } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                    ((EventoReligioso) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCodigo(codigo);
                    ((EventoReligioso) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGente(cantidadGente);
                    ((EventoReligioso) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setDescripcion(descripcion);
                    ((EventoReligioso) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setMontoRenta(montoRenta);
                    ((EventoReligioso) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setFechaEvento(fechaEvento);
                    ((EventoReligioso) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setTituloEvento(tituloEvento);
                    ((EventoReligioso) ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().get(userEventoPos)).setCantidadGenteConvertidas(cantidadGenteConvertida);
                }
                JOptionPane.showMessageDialog(null, "El evento se ha guardado correctamente.");
                edicionCodigoReligioso.setText("");
                edicionTituloReligioso.setText("");
                edicionDescripcionReligioso.setText("");
                edicionMontoReligioso.setText("");
                edicionGenteReligioso.setText("");
                edicionFechaReligioso.setDate(null);
                genteConvertida.setText("");
                EditarEventoReligioso.setVisible(false);
                AdminEventos.setVisible(true);
                AdminEventos.setLocationRelativeTo(null);
                AdminEventos.setResizable(false);
                AdminEventos.pack();
            } else {
                JOptionPane.showMessageDialog(null, "El evento no se pudo Editar!");
            }
        
        
        for (Usuario user : usuarios) {
            System.out.println(user);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    //DIALOG A EVENTO RELIGIOSO
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        EventoReligioso.setVisible(true);
        EventoReligioso.setLocationRelativeTo(null);
        EventoReligioso.setResizable(false);
        EventoReligioso.pack();
        TipoEvento.setVisible(false);
        jTextField2.setText("2000");
        System.out.println("Incrementando ultimoCodigoR: " + ultimoCodigoR);
        codigoR = ++ultimoCodigoR;
        System.out.println("Nuevo valor de codigoR: " + codigoR);
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            codigoReligioso.setText(String.valueOf(codigoR));
            System.out.println("Texto establecido en codigoEventoAdmin: " + codigoEventoMusical.getText());
        }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void codigoIngresadoEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoIngresadoEliminarEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoIngresadoEliminarEventoActionPerformed

    //ELIMINAR EVENTO
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        /*Funcion para eliminar el evento
          si la fecha es apenas 1 dia antes de su realizacion se cobrara el 50% del monto acordado
          a excepcion de los eventos religiosos que no pagan nada*/
        int userPos = searchUserIndex(userTextField.getText());
        int codigo = Integer.parseInt(codigoIngresadoEliminarEvento.getText());
        Evento evento = searchEvento(codigo);
        int userEventoPos = searchUserEventos(codigo, userPos);

        if (evento != null && userEventoPos != -1) {
            evento.cancelarEvento();
            /*
            // Eliminar evento de la lista general
            eventosCreados.remove(evento);

            // Eliminar evento de la lista del usuario
            if (usuarios.get(userPos) instanceof UsuarioAdmin) {
                ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().remove(userEventoPos);
            } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
                ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().remove(userEventoPos);
            }
            */
            // Decrementar el contador según el tipo de evento
            if (evento instanceof EventoDeportivo) {
                contadorDeportivos--;
            } else if (evento instanceof EventoMusical) {
                contadorMusicales--;
            } else if (evento instanceof EventoReligioso) {
                contadorReligiosos--;
            }
            
            String datosCancelados = evento.datosCancelados();
            
            
            JOptionPane.showMessageDialog(null, "SE ELIMINO EL EVENTO \n"+datosCancelados, "ELIMINAR EVENTO", JOptionPane.INFORMATION_MESSAGE);
            codigoIngresadoEliminarEvento.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar o eliminar el evento.", "Error al eliminar evento", JOptionPane.ERROR_MESSAGE);
            codigoIngresadoEliminarEvento.setText("");
        }
        
        for(Evento e: eventosCreados){
            System.out.println(e.datosCancelados());
        }
        
        System.out.println("");
        for(Usuario user:usuarios){
            System.out.println(user);
        }
      
        // TODO add your handling code here:*/
    }//GEN-LAST:event_jButton17ActionPerformed

    //DIALOG A INGRESAR EL CODIGO PARA VER EL EVENTO
    private void verEventoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEventoButtonActionPerformed
        //Pasar a ingresar el codigo del evento
        AdminEventos.setVisible(false);
        IngresarCodigoVerEvento.setVisible(true);
        IngresarCodigoVerEvento.setLocationRelativeTo(null);
        IngresarCodigoVerEvento.setResizable(false);
        IngresarCodigoVerEvento.pack();
        // TODO add your handling code here:
    }//GEN-LAST:event_verEventoButtonActionPerformed

    private void codigoIngresadoVerEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoIngresadoVerEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoIngresadoVerEventoActionPerformed
    
    //VER EL EVENTO
    public void llenarEventoReligioso(EventoReligioso evento) {
        DefaultTableModel model = (DefaultTableModel) tablaEventoReligioso.getModel();
        Object rowData[] = new Object[7];
        rowData[0] = evento.getCodigo();
        rowData[1] = evento.getTituloEvento();
        rowData[2] = evento.getDescripcion();
        rowData[3] = formatter.format(evento.getFechaEvento());
        rowData[4] = evento.getMontoRenta();
        rowData[5] = evento.getCantidadGente();
        rowData[6] = evento.getCantidadGenteConvertidas();
        model.addRow(rowData);
    }

    public void llenarEventoMusical(EventoMusical evento) {
        DefaultTableModel model = (DefaultTableModel) tablaEventoMusical.getModel();
        Object rowData[] = new Object[8];
        rowData[0] = evento.getCodigo();
        rowData[1] = evento.getTituloEvento();
        rowData[2] = evento.getDescripcion();
        rowData[3] = formatter.format(evento.getFechaEvento());
        rowData[4] = evento.getMontoRenta();
        rowData[5] = evento.getCantidadGente();
        rowData[6] = evento.getListadoEquipoMusical();
        rowData[7] = evento.getTipoMusica();
        model.addRow(rowData);
    }

    public void llenarEventoDeportivo(EventoDeportivo evento) {
        DefaultTableModel model = (DefaultTableModel) tablaEventoDeportivo.getModel();
        Object rowData[] = new Object[11];
        rowData[0] = evento.getCodigo();
        rowData[1] = evento.getTituloEvento();
        rowData[2] = evento.getDescripcion();
        rowData[3] = formatter.format(evento.getFechaEvento());
        rowData[4] = evento.getMontoRenta();
        rowData[5] = evento.getCantidadGente();
        rowData[6] = evento.getEquipo1();
        rowData[7] = evento.getEquipo2();
        rowData[8] = evento.getListadoJugadores1();
        rowData[9] = evento.getListadoJugadores2();
        rowData[10] = evento.getTipoDeporte();
        model.addRow(rowData);
    }

    
    //CODIGO PARA VER EVENTO
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        //ver evento
        try {
            int codigo = Integer.parseInt(codigoIngresadoVerEvento.getText());
            int pos = searchEventoIndex(codigo);
            Evento evento = eventosCreados.get(pos);
            if (pos == -1) {
                JOptionPane.showMessageDialog(null, "Evento No Existe!");
                
                codigoIngresadoVerEvento.setText("");
            } else {
                
                if (evento != null) {
                    // Verificar si el evento está cancelado antes de mostrar la información
                    if (evento.isEventoCancelado()) {
                        JOptionPane.showMessageDialog(null, "El evento ha sido cancelado\n" + evento.datosCancelados());
                        return; // No mostrar más información si el evento está cancelado y la multa pagada.
                    }

                    DefaultTableModel model;

                    if (searchEvento(codigo) instanceof EventoDeportivo) {
                        IngresarCodigoVerEvento.setVisible(false);
                        VerEventoDeportivo.setVisible(true);
                        VerEventoDeportivo.setResizable(false);
                        VerEventoDeportivo.setLocationRelativeTo(null);
                        VerEventoDeportivo.pack();
                        codigoIngresadoVerEvento.setText("");
                        model = (DefaultTableModel) tablaEventoDeportivo.getModel();
                        model.setRowCount(0);
                        llenarEventoDeportivo((EventoDeportivo) eventosCreados.get(pos));
                    } else if (searchEvento(codigo) instanceof EventoMusical) {
                        IngresarCodigoVerEvento.setVisible(false);
                        VerEventoMusical.setVisible(true);
                        VerEventoMusical.setResizable(false);
                        VerEventoMusical.setLocationRelativeTo(null);
                        VerEventoMusical.pack();
                        codigoIngresadoVerEvento.setText("");
                        model = (DefaultTableModel) tablaEventoMusical.getModel();
                        model.setRowCount(0);
                        llenarEventoMusical((EventoMusical) eventosCreados.get(pos));
                    } else if (searchEvento(codigo) instanceof EventoReligioso) {
                        IngresarCodigoVerEvento.setVisible(false);
                        VerEventoReligioso.setVisible(true);
                        VerEventoReligioso.setResizable(false);
                        VerEventoReligioso.setLocationRelativeTo(null);
                        VerEventoReligioso.pack();
                        codigoIngresadoVerEvento.setText("");
                        model = (DefaultTableModel) tablaEventoReligioso.getModel();
                        model.setRowCount(0);
                        llenarEventoReligioso((EventoReligioso) eventosCreados.get(pos));
                    } else {
                        JOptionPane.showMessageDialog(null, "Evento no existe");
                         if (evento.isEventoCancelado()) {
                        JOptionPane.showMessageDialog(null, "El evento ha sido cancelado\n" + evento.datosCancelados());
                        return; // No mostrar más información si el evento está cancelado y la multa pagada.
                    }
                        codigoIngresadoVerEvento.setText("");
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un código válido");
        }
        

    }//GEN-LAST:event_jButton18ActionPerformed

    //CHEQUEAR USER PARA REPORTES
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        int pos = searchUserIndex(userTextField.getText());
        if (usuarios.get(pos) instanceof UsuarioAdmin) {
            Reportes.setVisible(false);
            Reportes.setLocationRelativeTo(null);
            Reportes.setResizable(false);
            MenuAdmin.setVisible(true);
        } else if (usuarios.get(pos) instanceof UsuarioContenido) {
            Reportes.setVisible(false);
            Reportes.setLocationRelativeTo(null);
            Reportes.setResizable(false);
            MenuContenido.setVisible(true);
        } else if (usuarios.get(pos) instanceof UsuarioLimitado){
            Reportes.setVisible(false);
            Reportes.setLocationRelativeTo(null);
            Reportes.setResizable(false);
            MenuLimitado.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    //DIALOG A REPORTES
    private void reportesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesButtonActionPerformed
        MenuAdmin.setVisible(false);
        Reportes.setVisible(true);
        Reportes.setResizable(false);
        Reportes.setLocationRelativeTo(null);
        Reportes.pack();
        // TODO add your handling code here:
    }//GEN-LAST:event_reportesButtonActionPerformed
    
    //REPORTES
    public void llenarPerfilAdmin() {
        DefaultTableModel model = (DefaultTableModel) tablaUsuarioAdmin.getModel();
        Object rowData[] = new Object[4];
        int pos = searchUserIndex(userTextField.getText());
        rowData[0] = ((UsuarioAdmin) usuarios.get(pos)).getNombreCompleto();
        rowData[1] = ((UsuarioAdmin) usuarios.get(pos)).getUsername();
        rowData[2] = ((UsuarioAdmin) usuarios.get(pos)).getPassword();
        rowData[3] = ((UsuarioAdmin) usuarios.get(pos)).getEdad();
        model.addRow(rowData);

    }

    public void llenarPerfilEventosAdmin() {
        DefaultTableModel model = (DefaultTableModel) tablaEventosAdmin.getModel();
        Object rowData[] = new Object[5];
        int pos = searchUserIndex(userTextField.getText());
        for (int i = 0; i < ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().size(); i++) {
            rowData[0] = ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().get(i).getCodigo();
            if (((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().get(i) instanceof EventoDeportivo) {
                rowData[1] = "Evento Deportivo";
            } else if (((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().get(i) instanceof EventoMusical) {
                rowData[1] = "Evento Musical";
            } else if (((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().get(i) instanceof EventoReligioso) {
                rowData[1] = "Evento Religioso";
            }
            rowData[2] = ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().get(i).getTituloEvento();
            rowData[3] = ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().get(i).getEventoCancelado() ? "Cancelado" : "Activo";
            rowData[4] = ((UsuarioAdmin) usuarios.get(pos)).getEventosCreados().get(i).getMontoRenta();
            model.addRow(rowData);
        }
    }

    public void llenarPerfilContenido() {
        DefaultTableModel model = (DefaultTableModel) tablaUsuarioContenido.getModel();
        Object rowData[] = new Object[4];
        int pos = searchUserIndex(userTextField.getText());
        rowData[0] = ((UsuarioContenido) usuarios.get(pos)).getNombreCompleto();
        rowData[1] = ((UsuarioContenido) usuarios.get(pos)).getUsername();
        rowData[2] = ((UsuarioContenido) usuarios.get(pos)).getPassword();
        rowData[3] = ((UsuarioContenido) usuarios.get(pos)).getEdad();
        model.addRow(rowData);
    }

    public void llenarPerfilEventosContenido() {
        DefaultTableModel model = (DefaultTableModel) tablaEventosContenido.getModel();
        Object rowData[] = new Object[4];
        int pos = searchUserIndex(userTextField.getText());
        for (int i = 0; i < ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().size(); i++) {
            rowData[0] = ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().get(i).getCodigo();
            if (((UsuarioContenido) usuarios.get(pos)).getEventosCreados().get(i) instanceof EventoDeportivo) {
                rowData[1] = "Evento Deportivo";
            } else if (((UsuarioContenido) usuarios.get(pos)).getEventosCreados().get(i) instanceof EventoMusical) {
                rowData[1] = "Evento Musical";
            } else if (((UsuarioContenido) usuarios.get(pos)).getEventosCreados().get(i) instanceof EventoReligioso) {
                rowData[1] = "Evento Religioso";
            }
            rowData[2] = ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().get(i).getTituloEvento();
            rowData[3] = ((UsuarioContenido) usuarios.get(pos)).getEventosCreados().get(i).getMontoRenta();
            model.addRow(rowData);
        }
    }

    public void llenarPerfilLimitado() {
        DefaultTableModel model = (DefaultTableModel) tablaUsuarioLimitado.getModel();
        Object rowData[] = new Object[4];
        int pos = searchUserIndex(userTextField.getText());
        rowData[0] = ((UsuarioLimitado) usuarios.get(pos)).getNombreCompleto();
        rowData[1] = ((UsuarioLimitado) usuarios.get(pos)).getUsername();
        rowData[2] = ((UsuarioLimitado) usuarios.get(pos)).getPassword();
        rowData[3] = ((UsuarioLimitado) usuarios.get(pos)).getEdad();
        model.addRow(rowData);
    }
    
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        //Funcion para poder ver la info del usuario loggeado
        String userLogged = userTextField.getText();
        int pos = searchUserIndex(userLogged);
        if (usuarios.get(pos) instanceof UsuarioAdmin) {
            VerPerfilAdmin.setVisible(true);
            VerPerfilAdmin.setResizable(false);
            VerPerfilAdmin.setLocationRelativeTo(null);
            VerPerfilAdmin.pack();
            Reportes.setVisible(false);
            llenarPerfilAdmin();
            llenarPerfilEventosAdmin();
        } else if (usuarios.get(pos) instanceof UsuarioContenido) {
            VerPerfilContenido.setVisible(true);
            VerPerfilContenido.setResizable(false);
            VerPerfilContenido.setLocationRelativeTo(null);
            VerPerfilContenido.pack();
            Reportes.setVisible(false);
            llenarPerfilContenido();
            llenarPerfilEventosContenido();
        } else if (usuarios.get(pos) instanceof UsuarioLimitado) {
            VerPerfilLimitado.setVisible(true);
            VerPerfilLimitado.setResizable(false);
            VerPerfilLimitado.setLocationRelativeTo(null);
            VerPerfilLimitado.pack();
            Reportes.setVisible(false);
            llenarPerfilLimitado();
            llenarPerfilLimitado();
        }
        //desplegarInfo del usuario
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    //ADMINISTRADOR DE EVENTOS PPARA CONTENIDO
    private void adminEventosContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEventosContenidoActionPerformed
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuContenido.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_adminEventosContenidoActionPerformed

    //REPORSTE SPARA CONTENIDO
    private void reportesContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesContenidoActionPerformed
        Reportes.setVisible(true);
        Reportes.setLocationRelativeTo(null);
        Reportes.setResizable(false);
        Reportes.pack();
        MenuContenido.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_reportesContenidoActionPerformed

    //VER EVENTO PARA LIMITADO
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        IngresarCodigoVerEvento.setVisible(true);
        IngresarCodigoVerEvento.setResizable(false);
        IngresarCodigoVerEvento.setLocationRelativeTo(null);
        IngresarCodigoVerEvento.pack();
        MenuLimitado.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    //reportes
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        EventosRealizados.setVisible(true);
        EventosRealizados.setResizable(false);
        EventosRealizados.setLocationRelativeTo(null);
        EventosRealizados.pack();
        Reportes.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        EventosFuturos.setVisible(true);
        EventosFuturos.setResizable(false);
        EventosFuturos.setLocationRelativeTo(null);
        EventosFuturos.pack();
        Reportes.setVisible(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        EventosCancelados.setVisible(true);
        EventosCancelados.setResizable(false);
        EventosCancelados.setLocationRelativeTo(null);
        EventosCancelados.pack();
        Reportes.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        IngresoGeneradoPorFecha.setVisible(true);
        IngresoGeneradoPorFecha.setResizable(false);
        IngresoGeneradoPorFecha.setLocationRelativeTo(null);
        IngresoGeneradoPorFecha.pack();
        Reportes.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        EventosRealizados.setVisible(false);
        MenuAdmin.setVisible(false);
        Reportes.setVisible(true);
        Reportes.setResizable(false);
        Reportes.setLocationRelativeTo(null);
        Reportes.pack();
    }//GEN-LAST:event_jButton27ActionPerformed

    //REGRESAR DESDE DEPORTIVO
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        EventoDeportivo.setVisible(false);
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuAdmin.setVisible(false);
    }//GEN-LAST:event_jButton30ActionPerformed

    //CONDICION DE CASILLA
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Cerrar Aplicación?","Cerrar Programa", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION)
                System.exit(0);
    }//GEN-LAST:event_jButton31ActionPerformed

    //SALIR
    private void salirButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButton1ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro de Cerrar Sesión?","Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION){        
        MenuLimitado.setVisible(false);
        this.setVisible(true);
        userTextField.setText("");
        passwordTextField.setText("");
        }
    }//GEN-LAST:event_salirButton1ActionPerformed

    //DIALOG A LOS USERS
    private void jButton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton32MouseClicked
        int pos = searchUserIndex(userTextField.getText());
        if (usuarios.get(pos) instanceof UsuarioAdmin) {
            AdminEventos.setVisible(false);
            MenuAdmin.setVisible(true);
        } else if (usuarios.get(pos) instanceof UsuarioContenido) {
            AdminEventos.setVisible(false);
            MenuContenido.setVisible(true);
        }
    }//GEN-LAST:event_jButton32MouseClicked

    //REGRESAR A ADMINISTRADOR DE EVENTOS DESDE EL TIPO DE EVENTO
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        TipoEvento.setVisible(false);
    }//GEN-LAST:event_jButton33ActionPerformed

    //PROBANDO
    private void codigoEventoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEventoAdminActionPerformed
        System.out.println("Incrementando ultimoCodigoD: " + ultimoCodigoD);
        codigoD = ++ultimoCodigoD;
        System.out.println("Nuevo valor de codigoD: " + codigoD);
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            codigoEventoAdmin.setText(String.valueOf(codigoD));
            System.out.println("Texto establecido en codigoEventoAdmin: " + codigoEventoAdmin.getText());
        }
        });
    }//GEN-LAST:event_codigoEventoAdminActionPerformed

    //VALIDACION DE CASILLAS
    private void montoAcordadoEventoAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoAcordadoEventoAdminKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_montoAcordadoEventoAdminKeyTyped

    private void cantidadGenteTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadGenteTFKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_cantidadGenteTFKeyTyped

    private void codigoIngresadoVerEventoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoIngresadoVerEventoKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_codigoIngresadoVerEventoKeyTyped

    private void cantidadGenteTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadGenteTFKeyReleased
        String textoCantidad = cantidadGenteTF.getText();

    if (!textoCantidad.isEmpty()) {
        try {
            int longitud = Integer.parseInt(textoCantidad);
            int max = 20000;

            if (longitud > max) {
                jLabel104.setText("CANTIDAD MÁXIMA 20000");
            } else {
                jLabel104.setText("");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si el texto no es un número válido
            jLabel104.setText("Ingrese un número válido");
        }
    } else {
        jLabel104.setText("");  // Limpiar el mensaje si el campo está vacío
    }
    }//GEN-LAST:event_cantidadGenteTFKeyReleased

    //CAMBIAR EVENTO DESDE DEPORTIVO
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro de cambiar? Se perderan todos los cambios.","CAMBIAR EVENTO", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION){
        TipoEvento.setVisible(true);
        TipoEvento.setLocationRelativeTo(null);
        TipoEvento.setResizable(false);
        TipoEvento.pack();
        EventoDeportivo.setVisible(false);
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    //SALIR DEL ADMIN USUSARIOS
    private void jButton36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton36MouseClicked
        ManejoUsuario.setVisible(false);
        MenuAdmin.setVisible(true);
    }//GEN-LAST:event_jButton36MouseClicked

    //SALIR DESDE CREAR USER
    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        ManejoUsuario.setVisible(true);
        ManejoUsuario.setResizable(false);
        ManejoUsuario.setLocationRelativeTo(null);
        ManejoUsuario.pack();
        CrearUsuario.setVisible(false);
    }//GEN-LAST:event_jButton37ActionPerformed

    //VALIDACION DE CASILLAS
    private void edadTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadTFKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_edadTFKeyTyped

    //REGRESAR A ADMIN USUSARIOS DESDE ELIMINAR USER
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        EliminarUsuario.setVisible(false);
        ManejoUsuario.setVisible(true);
    }//GEN-LAST:event_jButton38ActionPerformed

    //VALIDACION DE CASILLAS
    private void codigoIngresadoEliminarEventoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoIngresadoEliminarEventoKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_codigoIngresadoEliminarEventoKeyTyped

    //REGRESAR A ADMINISTRADOR DE EVENTOS DESDE ELIMINAR EVENTO
    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        EliminarEvento.setVisible(false);
    }//GEN-LAST:event_jButton39ActionPerformed

    //FIELD DE SEGURO MUSICA
    private void montoEventoMusicalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoEventoMusicalKeyReleased
        try {
            String montoTexto = montoEventoMusical.getText();
            if (!montoTexto.isEmpty()) {
                int seguro = Integer.parseInt(montoTexto);
                double cobrar = seguro * 0.3;
                jTextField1.setText(String.valueOf(cobrar));
            } else {
                // Puedes manejar el caso cuando el campo está vacío
                jTextField1.setText("");
            }
        } catch (NumberFormatException e) {
            // Puedes manejar la excepción si el texto no es un número válido
            jTextField1.setText("Número válido");
        }
    }//GEN-LAST:event_montoEventoMusicalKeyReleased

    private void codigoEventoMusicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEventoMusicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEventoMusicalActionPerformed

    //MÁS VALIDACION DE CASILLAS 
    private void montoEventoMusicalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoEventoMusicalKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_montoEventoMusicalKeyTyped

    private void genteEventoMusicalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genteEventoMusicalKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_genteEventoMusicalKeyTyped

    private void genteEventoMusicalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genteEventoMusicalKeyReleased
        String textoCantidad = genteEventoMusical.getText();

    if (!textoCantidad.isEmpty()) {
        try {
            int longitud = Integer.parseInt(textoCantidad);
            int max = 25000;

            if (longitud > max) {
                jLabel29.setText("CANTIDAD MÁXIMA 25000");
            } else {
                jLabel29.setText("");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si el texto no es un número válido
            jLabel29.setText("Ingrese un número válido");
        }
    } else {
        jLabel29.setText("");  // Limpiar el mensaje si el campo está vacío
    }
    }//GEN-LAST:event_genteEventoMusicalKeyReleased

    //CAMBIAR EVENTO DESDE MUSICAL
    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro de cambiar? Se perderan todos los cambios.","CAMBIAR EVENTO", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION){
        TipoEvento.setVisible(true);
        TipoEvento.setLocationRelativeTo(null);
        TipoEvento.setResizable(false);
        TipoEvento.pack();
        EventoMusical.setVisible(false);
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    //REGRESAR DESDE MUSICAL
    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        EventoMusical.setVisible(false);
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuAdmin.setVisible(false);
    }//GEN-LAST:event_jButton41ActionPerformed

    //SEGURO FIELD RELIGIOSO
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jTextField2.setText("2000");
    }//GEN-LAST:event_jTextField2ActionPerformed

    //AUN MAS VALIDACION DE TECLAS 
    private void montoReligiosoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoReligiosoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_montoReligiosoKeyReleased

    private void montoReligiosoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoReligiosoKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_montoReligiosoKeyTyped

    private void genteReligiosoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genteReligiosoKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_genteReligiosoKeyTyped

    private void genteReligiosoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genteReligiosoKeyReleased
        String textoCantidad = genteReligioso.getText();

    if (!textoCantidad.isEmpty()) {
        try {
            int longitud = Integer.parseInt(textoCantidad);
            int max = 30000;

            if (longitud > max) {
                jLabel118.setText("CANTIDAD MÁXIMA 30000");
            } else {
                jLabel118.setText("");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si el texto no es un número válido
            jLabel118.setText("Ingrese un número válido");
        }
    } else {
        jLabel118.setText("");  // Limpiar el mensaje si el campo está vacío
    }
    }//GEN-LAST:event_genteReligiosoKeyReleased

    //CAMBIAR EVENTO DESDE RELIGIOSO
    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro de cambiar? Se perderan todos los cambios.","CAMBIAR EVENTO", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION){
        TipoEvento.setVisible(true);
        TipoEvento.setLocationRelativeTo(null);
        TipoEvento.setResizable(false);
        TipoEvento.pack();
        EventoReligioso.setVisible(false);
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    //REGRESAR DESDE MUSICAL
    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        EventoMusical.setVisible(false);
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuAdmin.setVisible(false);
    }//GEN-LAST:event_jButton43ActionPerformed

    //REGRESAR DESDE INGRESAR CODIGO A EDITAR
    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        IngresarCodigoEvento.setVisible(false);
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuAdmin.setVisible(false);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void musicoIngresadoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicoIngresadoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicoIngresadoTFActionPerformed

    //REGRESAR DESDE EDITAR MUSICAL
    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        EditarEventoMusical.setVisible(false);
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuAdmin.setVisible(false);
    }//GEN-LAST:event_jButton45ActionPerformed

    //Y SIGUEN LAS VALIDACIONES DE CASILLAS
    private void edicionGenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionGenteKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_edicionGenteKeyTyped

    private void edicionGenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionGenteKeyReleased
        String textoCantidad = edicionGente.getText();

    if (!textoCantidad.isEmpty()) {
        try {
            int longitud = Integer.parseInt(textoCantidad);
            int max = 20000;

            if (longitud > max) {
                jLabel125.setText("CANTIDAD MÁXIMA 20000");
            } else {
                jLabel125.setText("");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si el texto no es un número válido
            jLabel125.setText("Ingrese un número válido");
        }
    } else {
        jLabel125.setText("");  // Limpiar el mensaje si el campo está vacío
    }
    }//GEN-LAST:event_edicionGenteKeyReleased

    private void edicionMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionMontoKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_edicionMontoKeyTyped

    //REGRESAR DE EDITAR DEPORTIVO
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        EditarEventoDeportivo.setVisible(false);
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuAdmin.setVisible(false);
    }//GEN-LAST:event_jButton34ActionPerformed

    //SALIR DE EDITAR USUSARIO
    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        EditarUsuario.setVisible(false);
        ManejoUsuario.setVisible(true);
    }//GEN-LAST:event_jButton46ActionPerformed

    //SALIR DE EDITAR UN ELEMENTO
    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        EditarunElemento.setVisible(false);
        ManejoUsuario.setVisible(true);
        ManejoUsuario.setLocationRelativeTo(null);
        ManejoUsuario.setResizable(false);
    }//GEN-LAST:event_jButton47ActionPerformed

   //BORRAR JUGADOR
    private void borrarEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarEquipo1ActionPerformed
        int selectedIndex = listaEquipo1.getSelectedIndex();
        if (selectedIndex != -1 && dml.getSize() > selectedIndex) {
            dml.remove(selectedIndex);
            listaEquipo1.setModel(dml);
        }
    }//GEN-LAST:event_borrarEquipo1ActionPerformed

    private void borrarEquipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarEquipo2ActionPerformed
        int selectedIndex = listaEquipo2.getSelectedIndex();
        if (selectedIndex != -1 && dml2.getSize() > selectedIndex) {
            dml2.remove(selectedIndex);
            listaEquipo2.setModel(dml2);
        }
    }//GEN-LAST:event_borrarEquipo2ActionPerformed

    //SALIR DESDE CODIGO VER EVENTO
    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        int pos = searchUserIndex(userTextField.getText());
        if (usuarios.get(pos) instanceof UsuarioAdmin) {
            IngresarCodigoVerEvento.setVisible(false);
            AdminEventos.setVisible(true);
            AdminEventos.setLocationRelativeTo(null);
            AdminEventos.setResizable(false);
            AdminEventos.pack();
            MenuAdmin.setVisible(false);
        } else if (usuarios.get(pos) instanceof UsuarioContenido) {
            IngresarCodigoVerEvento.setVisible(false);
            AdminEventos.setVisible(true);
            AdminEventos.setLocationRelativeTo(null);
            AdminEventos.setResizable(false);
            AdminEventos.pack();
            MenuContenido.setVisible(false);
        } else if (usuarios.get(pos) instanceof UsuarioLimitado){
            IngresarCodigoVerEvento.setVisible(false);
            MenuLimitado.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton48ActionPerformed

    //MAS VALIDACIONES
    private void edicionMontoMusicalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionMontoMusicalKeyReleased
        try {
            String montoTexto = edicionMontoMusical.getText();
            if (!montoTexto.isEmpty()) {
                int seguro = Integer.parseInt(montoTexto);
                double cobrar = seguro * 0.3;
                jTextField4.setText(String.valueOf(cobrar));
            } else {
                // Puedes manejar el caso cuando el campo está vacío
                jTextField4.setText("");
            }
        } catch (NumberFormatException e) {
            // Puedes manejar la excepción si el texto no es un número válido
            jTextField4.setText("Número válido");
        }
    }//GEN-LAST:event_edicionMontoMusicalKeyReleased

    private void edicionMontoMusicalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionMontoMusicalKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_edicionMontoMusicalKeyTyped

    private void edicionGenteMusicalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionGenteMusicalKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_edicionGenteMusicalKeyTyped

    private void edicionGenteMusicalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionGenteMusicalKeyReleased
        String textoCantidad = edicionGenteMusical.getText();

    if (!textoCantidad.isEmpty()) {
        try {
            int longitud = Integer.parseInt(textoCantidad);
            int max = 25000;

            if (longitud > max) {
                jLabel133.setText("CANTIDAD MÁXIMA 25000");
            } else {
                jLabel133.setText("");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si el texto no es un número válido
            jLabel133.setText("Ingrese un número válido");
        }
    } else {
        jLabel133.setText("");  // Limpiar el mensaje si el campo está vacío
    }
    }//GEN-LAST:event_edicionGenteMusicalKeyReleased

    //REGRESAR DESDE EDITAR RELIGIOSO
    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        EditarEventoReligioso.setVisible(false);
        AdminEventos.setVisible(true);
        AdminEventos.setLocationRelativeTo(null);
        AdminEventos.setResizable(false);
        AdminEventos.pack();
        MenuAdmin.setVisible(false);
    }//GEN-LAST:event_jButton50ActionPerformed

    //BORRAR MUSICO/INSTRUMENTO
    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        int selectedIndex = listaMusicos.getSelectedIndex();
        if (selectedIndex != -1 && dml3.getSize() > selectedIndex) {
            dml3.remove(selectedIndex);
            listaMusicos.setModel(dml3);
        }
    }//GEN-LAST:event_jButton49ActionPerformed

    //VALIDACIONES VALIDACIONES Y VALIDACIONES
    private void edicionMontoReligiosoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionMontoReligiosoKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_edicionMontoReligiosoKeyTyped

    private void edicionGenteReligiosoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionGenteReligiosoKeyReleased
        String textoCantidad = edicionGenteMusical.getText();

    if (!textoCantidad.isEmpty()) {
        try {
            int longitud = Integer.parseInt(textoCantidad);
            int max = 30000;

            if (longitud > max) {
                jLabel134.setText("CANTIDAD MÁXIMA 30000");
            } else {
                jLabel134.setText("");
            }
        } catch (NumberFormatException e) {
            // Manejar la excepción si el texto no es un número válido
            jLabel134.setText("Ingrese un número válido");
        }
    } else {
        jLabel134.setText("");  // Limpiar el mensaje si el campo está vacío
    }
    }//GEN-LAST:event_edicionGenteReligiosoKeyReleased

    private void edicionGenteReligiosoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edicionGenteReligiosoKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;
        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_edicionGenteReligiosoKeyTyped

    //VER EVENTO
    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        VerEventoDeportivo.setVisible(false);
        AdminEventos.setVisible(true);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        VerEventoMusical.setVisible(false);
        AdminEventos.setVisible(true);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        VerEventoReligioso.setVisible(false);
        AdminEventos.setVisible(true);
    }//GEN-LAST:event_jButton53ActionPerformed

    //LUPITA EDITAR USUARIO
    private void jLabel137MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel137MouseClicked
        int pos = searchUserIndex(inputUser.getText());
        if (pos != -1) {
            
            // Usuario encontrado, realizar las operaciones de edición

            // Restablecer los campos de texto y cambiar de visibilidad
            //JOptionPane.showMessageDialog(null, "El Uusario ha sido modificado", "Editar Usuario", JOptionPane.INFORMATION_MESSAGE);
            nombreTF.setText(usuarios.get(pos).getNombreCompleto().toString());
            nombreTF.setVisible(true);
            
            usernameTextField.setText(usuarios.get(pos).getUsername().toString());
            usernameTextField.setVisible(true);
            
            contraTF.setText(usuarios.get(pos).getPassword().toString());
            contraTF.setVisible(true);
            
            edadTextField.setText(String.valueOf(usuarios.get(pos).getEdad()));
            edadTextField.setVisible(true);
            
            jToggleButton1.setVisible(true);
            jLabel19.setVisible(true);
            jLabel20.setVisible(true);
            jLabel21.setVisible(true);
            jLabel22.setVisible(true);
            
        } else {
            // Usuario no encontrado, mostrar un JOptionPane
            JOptionPane.showMessageDialog(null, "El usuario no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            inputUser.setText("");
            EditartodosElementos.setVisible(false);
            ManejoUsuario.setVisible(true);
        }
    }//GEN-LAST:event_jLabel137MouseClicked

    //BOTONES
    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        EditartodosElementos.setVisible(false);
        ManejoUsuario.setVisible(true);
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        MenuLimitado.setVisible(false);
        Reportes.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        VerPerfilAdmin.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) tablaEventosAdmin.getModel();
        model.setRowCount(0); 
        Reportes.setVisible(true);
        Reportes.setLocationRelativeTo(null);
        Reportes.setResizable(false);
        Reportes.pack();
    }//GEN-LAST:event_jButton55ActionPerformed

    //Funcion Recursiva
    private  Evento searchEvento(int codigo, int i){
        if (i < eventosCreados.size()) {
            if (eventosCreados.get(i).getCodigo() == codigo) {
                return eventosCreados.get(i);
            }
        }
        return searchEvento(codigo, i + 1);
    }

    private Evento searchEvento(int codigo) {
        try{
        return searchEvento(codigo, 0);
        }catch(StackOverflowError e){
            JOptionPane.showMessageDialog(null, "El evento no Existe");
            return null;
        }
    }

    private boolean codigoUnico(int codigo) {
        for (Evento evento : eventosCreados) {
            if (evento.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    private int searchUserEventos(int codigo, int userPos) {
        if (usuarios.get(userPos) instanceof UsuarioAdmin) {
            for (Evento evento : ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados()) {
                if (evento.getCodigo() == codigo) {
                    return ((UsuarioAdmin) usuarios.get(userPos)).getEventosCreados().indexOf(evento);
                }
            }
        } else if (usuarios.get(userPos) instanceof UsuarioContenido) {
            for (Evento evento : ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados()) {
                if (evento.getCodigo() == codigo) {
                    return ((UsuarioContenido) usuarios.get(userPos)).getEventosCreados().indexOf(evento);
                }
            }
        }
        return -1;
    }
   


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JavaTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AdminEventos;
    private javax.swing.JDialog CrearUsuario;
    private javax.swing.JDialog EditarEventoDeportivo;
    private javax.swing.JDialog EditarEventoMusical;
    private javax.swing.JDialog EditarEventoReligioso;
    private javax.swing.JDialog EditarUsuario;
    private javax.swing.JDialog EditartodosElementos;
    private javax.swing.JDialog EditarunElemento;
    private javax.swing.JDialog EliminarEvento;
    private javax.swing.JDialog EliminarUsuario;
    private javax.swing.JDialog EventoDeportivo;
    private javax.swing.JDialog EventoMusical;
    private javax.swing.JDialog EventoReligioso;
    private javax.swing.JDialog EventosCancelados;
    private javax.swing.JDialog EventosFuturos;
    private javax.swing.JDialog EventosRealizados;
    private javax.swing.JDialog IngresarCodigoEvento;
    private javax.swing.JDialog IngresarCodigoVerEvento;
    private javax.swing.JDialog IngresoGeneradoPorFecha;
    private javax.swing.JDialog ManejoUsuario;
    private javax.swing.JDialog MenuAdmin;
    private javax.swing.JDialog MenuContenido;
    private javax.swing.JDialog MenuLimitado;
    private javax.swing.JDialog Reportes;
    private javax.swing.JDialog TipoEvento;
    private javax.swing.JDialog VerEventoDeportivo;
    private javax.swing.JDialog VerEventoMusical;
    private javax.swing.JDialog VerEventoReligioso;
    private javax.swing.JDialog VerPerfilAdmin;
    private javax.swing.JDialog VerPerfilContenido;
    private javax.swing.JDialog VerPerfilLimitado;
    private javax.swing.JButton adminEventosButton;
    private javax.swing.JButton adminEventosContenido;
    private javax.swing.JButton adminUsuariosButton;
    private javax.swing.JButton agregarEquipo1;
    private javax.swing.JButton agregarEquipo2;
    private javax.swing.ButtonGroup atributoButtonGroup;
    private javax.swing.JLabel atributoLabel;
    private javax.swing.JTextField atributoTextField;
    private javax.swing.JButton borrarEquipo1;
    private javax.swing.JButton borrarEquipo2;
    private javax.swing.JButton cambiarButton;
    private javax.swing.JTextField cantidadGenteTF;
    private javax.swing.JTextField codigoEventoAdmin;
    private javax.swing.JTextField codigoEventoMusical;
    private javax.swing.JTextField codigoIngresadoEliminarEvento;
    private javax.swing.JTextField codigoIngresadoTF;
    private javax.swing.JTextField codigoIngresadoVerEvento;
    private javax.swing.JTextField codigoReligioso;
    private javax.swing.JTextField contraTF;
    private javax.swing.JButton crearEventoButton;
    private javax.swing.JButton crearUsuarioButton;
    private javax.swing.JComboBox<String> deporteCB;
    private javax.swing.JTextArea descripcionEventoAdmin;
    private javax.swing.JTextArea descripcionEventoMusical;
    private javax.swing.JTextArea descripcionReligioso;
    private javax.swing.JRadioButton edadRB;
    private javax.swing.JTextField edadTF;
    private javax.swing.JTextField edadTextField;
    private javax.swing.JTextField edicionCodigo;
    private javax.swing.JTextField edicionCodigoMusical;
    private javax.swing.JTextField edicionCodigoReligioso;
    private javax.swing.JTextArea edicionDescripcion;
    private javax.swing.JTextArea edicionDescripcionMusical;
    private javax.swing.JTextArea edicionDescripcionReligioso;
    private javax.swing.JTextField edicionEquipo1;
    private javax.swing.JTextField edicionEquipo2;
    private com.toedter.calendar.JDateChooser edicionFecha;
    private com.toedter.calendar.JDateChooser edicionFechaMusical;
    private com.toedter.calendar.JDateChooser edicionFechaReligioso;
    private javax.swing.JTextField edicionGente;
    private javax.swing.JTextField edicionGenteMusical;
    private javax.swing.JTextField edicionGenteReligioso;
    private javax.swing.JTextField edicionMonto;
    private javax.swing.JTextField edicionMontoMusical;
    private javax.swing.JTextField edicionMontoReligioso;
    private javax.swing.JComboBox<String> edicionTipoDeporte;
    private javax.swing.JComboBox<String> edicionTipoMusica;
    private javax.swing.JTextField edicionTitulo;
    private javax.swing.JTextField edicionTituloMusical;
    private javax.swing.JTextField edicionTituloReligioso;
    private javax.swing.JButton editarEventoButton;
    private javax.swing.JButton eliminarEventoButton;
    private javax.swing.JLabel eliminarLabel;
    private javax.swing.JTextField equipo1TF;
    private javax.swing.JTextField equipo2TF;
    private com.toedter.calendar.JDateChooser fechaEventoAdmin;
    private com.toedter.calendar.JDateChooser fechaEventoMusical;
    private com.toedter.calendar.JDateChooser fechaReligioso;
    private javax.swing.JTextField genteConvertida;
    private javax.swing.JTextField genteEventoMusical;
    private javax.swing.JTextField genteReligioso;
    private javax.swing.JTextField inputUser;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jugadorIngresado1;
    private javax.swing.JTextField jugadorIngresado2;
    private javax.swing.JList<String> listaEquipo1;
    private javax.swing.JList<String> listaEquipo2;
    private javax.swing.JList<String> listaMusicos;
    private javax.swing.JButton logInButton;
    private javax.swing.JPanel logInPanel;
    private javax.swing.JTextField montoAcordadoEventoAdmin;
    private javax.swing.JTextField montoEventoMusical;
    private javax.swing.JTextField montoReligioso;
    private javax.swing.JComboBox<String> musicaCB;
    private javax.swing.JTextField musicoIngresadoTF;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton nombreCompletoRB;
    private javax.swing.JTextField nombreCompletoTF;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JRadioButton passwordRB;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton reportesButton;
    private javax.swing.JButton reportesContenido;
    private javax.swing.JButton salirButton;
    private javax.swing.JButton salirButton1;
    private javax.swing.JTable tablaEstadisticaEventosRealizados;
    private javax.swing.JTable tablaEventoDeportivo;
    private javax.swing.JTable tablaEventoMusical;
    private javax.swing.JTable tablaEventoReligioso;
    private javax.swing.JTable tablaEventosAdmin;
    private javax.swing.JTable tablaEventosContenido;
    private javax.swing.JTable tablaEventosRealizados;
    private javax.swing.JTable tablaUsuarioAdmin;
    private javax.swing.JTable tablaUsuarioContenido;
    private javax.swing.JTable tablaUsuarioLimitado;
    private javax.swing.JComboBox<String> tipoUsuarioCB;
    private javax.swing.JTextField tituloEventoAdmin;
    private javax.swing.JTextField tituloEventoMusical;
    private javax.swing.JTextField tituloReligioso;
    private javax.swing.JLabel totalGenerado;
    private javax.swing.JTextField userTextField;
    private javax.swing.JRadioButton usernameRB;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel usernmaeLabel;
    private javax.swing.JTextField usuarioIngresado;
    private javax.swing.JButton verEventoButton;
    // End of variables declaration//GEN-END:variables
    private final ArrayList<Evento> eventosCreados = new ArrayList();
    private final Usuario admin = new UsuarioAdmin("administrador", "prueba", "123", 20);
    private final ArrayList<Usuario> usuarios = new ArrayList();
    static SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

}
