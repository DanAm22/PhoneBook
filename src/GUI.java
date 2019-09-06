
import Exceptii.FileCSVHeaderException;
import Exceptii.ItemNotSelectedException;
import Exceptii.NumarTelefonExceptie;
import Exceptii.NumeEronatExceptie;
import Exceptii.PrenumeEronatExceptie;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    static final int cod = 748981; // Codul de inregistrare in aplicatie
    static ImageIcon poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 1.jpg");
    DefaultListModel model = new DefaultListModel();
    List<Contact> listaContacte = new ArrayList<>();
    Agenda agenda = new Agenda(listaContacte);
    
    // Metoda de rulare a reclamelor
    public static void rulareReclame() {
        while (true) {
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 2.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 3.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 4.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 5.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 6.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 7.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 8.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 9.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTel\\src\\Resources\\Reclama 1.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    
    // Metoda de actualizare a elementelor din lista in momentul modificarii acesteia
    private void actualizeazaModel() {
        model.clear();
        listaContacte.forEach((o) -> {
            model.addElement(o);
        });
    }
    
    // La deschidere, functionalitatile aplicatiei vor fi "disabled" pana la introducerea codului de inregistrare corect
    public GUI() {
        initComponents();
        miDeschidere.setEnabled(false);
        miSalvare.setEnabled(false);
        miInregistrare.setEnabled(true);
        lblReclama.setIcon(poza);
        btnGroup.add(cbFix);
        btnGroup.add(cbMobil);
        ContactList.setModel(model);
        btnAdauga.setEnabled(false);
        btnModifica.setEnabled(false);
        btnSterge.setEnabled(false);
        cbFiltre.setEnabled(false);
        cbOrdonari.setEnabled(false);
        tfPersonalizat.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diAdauga = new javax.swing.JDialog();
        lblAdauga = new javax.swing.JLabel();
        lblNume = new javax.swing.JLabel();
        lblPrenume = new javax.swing.JLabel();
        lblDataNasterii = new javax.swing.JLabel();
        lblNumarTelefon = new javax.swing.JLabel();
        tfNume = new javax.swing.JTextField();
        tfPrenume = new javax.swing.JTextField();
        tfDataNasterii = new javax.swing.JTextField();
        tfNumarTelefon = new javax.swing.JTextField();
        btnConfirma = new javax.swing.JButton();
        cbFix = new javax.swing.JCheckBox();
        cbMobil = new javax.swing.JCheckBox();
        btnUpdate = new javax.swing.JButton();
        btnGroup = new javax.swing.ButtonGroup();
        diInfo = new javax.swing.JDialog();
        TxPane = new javax.swing.JScrollPane();
        InfoApp = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblPanel = new javax.swing.JPanel();
        lblFiltrare = new javax.swing.JLabel();
        lblOrdonare = new javax.swing.JLabel();
        cbOrdonari = new javax.swing.JComboBox<>();
        cbFiltre = new javax.swing.JComboBox<>();
        lblPersonalizat = new javax.swing.JLabel();
        tfPersonalizat = new javax.swing.JTextField();
        btnFiltrare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContactList = new javax.swing.JList<>();
        btnAdauga = new javax.swing.JButton();
        btnSterge = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        lblReclama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        mFisiere = new javax.swing.JMenu();
        miDeschidere = new javax.swing.JMenuItem();
        miSalvare = new javax.swing.JMenuItem();
        miIesire = new javax.swing.JMenuItem();
        mAjutor = new javax.swing.JMenu();
        miInregistrare = new javax.swing.JMenuItem();
        miDespre = new javax.swing.JMenuItem();

        diAdauga.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        diAdauga.setMinimumSize(new java.awt.Dimension(400, 400));
        diAdauga.setPreferredSize(new java.awt.Dimension(900, 400));

        lblAdauga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAdauga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdauga.setText("Adauga Contact");

        lblNume.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNume.setText("Nume:");

        lblPrenume.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPrenume.setText("Prenume:");

        lblDataNasterii.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDataNasterii.setText("Data Nasterii:");

        lblNumarTelefon.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNumarTelefon.setText("Numar Telefon:");

        btnConfirma.setText("Confirma");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        cbFix.setText("Fix");

        cbMobil.setText("Mobil");

        btnUpdate.setText("Modifica");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout diAdaugaLayout = new javax.swing.GroupLayout(diAdauga.getContentPane());
        diAdauga.getContentPane().setLayout(diAdaugaLayout);
        diAdaugaLayout.setHorizontalGroup(
            diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diAdaugaLayout.createSequentialGroup()
                .addGroup(diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diAdaugaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblAdauga, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diAdaugaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblNume, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfNume, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diAdaugaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblDataNasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfDataNasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diAdaugaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblNumarTelefon)
                        .addGap(18, 18, 18)
                        .addComponent(tfNumarTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diAdaugaLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(cbFix, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diAdaugaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diAdaugaLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );
        diAdaugaLayout.setVerticalGroup(
            diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diAdaugaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblAdauga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNume, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNume, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataNasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumarTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumarTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(diAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFix)
                    .addComponent(cbMobil))
                .addGap(9, 9, 9)
                .addComponent(btnConfirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        diAdauga.getAccessibleContext().setAccessibleDescription("");

        diInfo.setTitle("App Info");
        diInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        diInfo.setMinimumSize(new java.awt.Dimension(700, 400));
        diInfo.setResizable(false);

        InfoApp.setEditable(false);
        InfoApp.setColumns(20);
        InfoApp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        InfoApp.setRows(5);
        InfoApp.setText("Despre aplicatie\n\nSimularea unei agende de telefon\n\nPastrati agenda organizata si actualizata\n\n* Vedeti persoanele de contact in ordinea numelui, prenumelui, a datei nasterii si a numarului de telefon;\n\n* Adaugati, editati si stergeti contacte;\n\n* Beneficiati de securitate prin introducerea codului de activare;\n\n* Vizualizati ultimele noutati prin afisarea reclamelor.\n\n");
        TxPane.setViewportView(InfoApp);

        jLabel1.setText("Author:");

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Amariutei Marius-Daniel");

        jLabel2.setText("Versiunea: 1.0");

        javax.swing.GroupLayout diInfoLayout = new javax.swing.GroupLayout(diInfo.getContentPane());
        diInfo.getContentPane().setLayout(diInfoLayout);
        diInfoLayout.setHorizontalGroup(
            diInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
            .addComponent(TxPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        diInfoLayout.setVerticalGroup(
            diInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(diInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(TxPane, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFiltrare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFiltrare.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblFiltrare.setText("Tip filtrare:");
        lblFiltrare.setMaximumSize(new java.awt.Dimension(63, 17));
        lblFiltrare.setMinimumSize(new java.awt.Dimension(63, 17));
        lblFiltrare.setName(""); // NOI18N
        lblFiltrare.setPreferredSize(new java.awt.Dimension(63, 17));

        lblOrdonare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOrdonare.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOrdonare.setText("Tip ordonare:");
        lblOrdonare.setMaximumSize(new java.awt.Dimension(63, 17));
        lblOrdonare.setMinimumSize(new java.awt.Dimension(63, 17));
        lblOrdonare.setName(""); // NOI18N
        lblOrdonare.setPreferredSize(new java.awt.Dimension(63, 17));

        cbOrdonari.setBackground(new java.awt.Color(51, 220, 252));
        cbOrdonari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbOrdonari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nume", "Prenume", "Data nasterii", "Telefon" }));
        cbOrdonari.setSelectedIndex(-1);
        cbOrdonari.setToolTipText("");
        cbOrdonari.setMinimumSize(new java.awt.Dimension(63, 17));
        cbOrdonari.setPreferredSize(new java.awt.Dimension(63, 17));
        cbOrdonari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdonariActionPerformed(evt);
            }
        });

        cbFiltre.setBackground(new java.awt.Color(51, 220, 252));
        cbFiltre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbFiltre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fix", "Mobil", "Nascuti azi", "Nascuti in luna curenta", "Personalizat" }));
        cbFiltre.setSelectedIndex(-1);
        cbFiltre.setToolTipText("");
        cbFiltre.setMinimumSize(new java.awt.Dimension(63, 17));
        cbFiltre.setPreferredSize(new java.awt.Dimension(63, 17));
        cbFiltre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltreActionPerformed(evt);
            }
        });

        lblPersonalizat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPersonalizat.setText("Personalizat:");
        lblPersonalizat.setMaximumSize(new java.awt.Dimension(63, 17));
        lblPersonalizat.setMinimumSize(new java.awt.Dimension(63, 17));
        lblPersonalizat.setName(""); // NOI18N
        lblPersonalizat.setPreferredSize(new java.awt.Dimension(63, 17));

        tfPersonalizat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPersonalizatActionPerformed(evt);
            }
        });

        btnFiltrare.setText("Aranjare Lista");
        btnFiltrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrareActionPerformed(evt);
            }
        });

        ContactList.setBackground(new java.awt.Color(133, 227, 40));
        ContactList.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));
        ContactList.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ContactList.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(ContactList);

        btnAdauga.setText("Adauga Contact");
        btnAdauga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugaActionPerformed(evt);
            }
        });

        btnSterge.setText("Sterge Contact");
        btnSterge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStergeActionPerformed(evt);
            }
        });

        btnModifica.setText("Modifica Contact");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Daniel's PhoneBook ©, All rights reserved");

        lblCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCod.setText("Introduceti codul de inregistrare pentru accesarea functionalitatii!");

        javax.swing.GroupLayout lblPanelLayout = new javax.swing.GroupLayout(lblPanel);
        lblPanel.setLayout(lblPanelLayout);
        lblPanelLayout.setHorizontalGroup(
            lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(lblPanelLayout.createSequentialGroup()
                            .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPersonalizat, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbFiltre, 0, 180, Short.MAX_VALUE)
                                .addComponent(tfPersonalizat))
                            .addGap(18, 18, 18)
                            .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(lblPanelLayout.createSequentialGroup()
                                    .addComponent(lblOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbOrdonari, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(lblPanelLayout.createSequentialGroup()
                            .addComponent(btnAdauga, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSterge, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(btnModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPanelLayout.createSequentialGroup()
                .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReclama, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
        );
        lblPanelLayout.setVerticalGroup(
            lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFiltre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbOrdonari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPersonalizat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPersonalizat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(lblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdauga)
                    .addComponent(btnSterge)
                    .addComponent(btnModifica))
                .addGap(27, 27, 27)
                .addComponent(lblReclama, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBar.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        mFisiere.setText("Fisiere");

        miDeschidere.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miDeschidere.setText("Deschidere");
        miDeschidere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeschidereActionPerformed(evt);
            }
        });
        mFisiere.add(miDeschidere);

        miSalvare.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSalvare.setText("Salvare");
        miSalvare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalvareActionPerformed(evt);
            }
        });
        mFisiere.add(miSalvare);

        miIesire.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        miIesire.setText("Iesire");
        miIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIesireActionPerformed(evt);
            }
        });
        mFisiere.add(miIesire);

        MenuBar.add(mFisiere);

        mAjutor.setText("Ajutor");

        miInregistrare.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        miInregistrare.setText("Inregistrare");
        miInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInregistrareActionPerformed(evt);
            }
        });
        mAjutor.add(miInregistrare);

        miDespre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        miDespre.setText("Despre");
        miDespre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDespreActionPerformed(evt);
            }
        });
        mAjutor.add(miDespre);

        MenuBar.add(mAjutor);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Butonul din meniu pentru iesirea din aplicatie
    private void miIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIesireActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Doriti sa parasiti aplicatia?", "Confirmare", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_miIesireActionPerformed
    
    //Buton tip comboBox pentru setarea tipului de filtru
    private void cbFiltreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltreActionPerformed
        if (cbFiltre.getSelectedIndex() == 0) {
            agenda.filtreazaNrFix();
        }
        if (cbFiltre.getSelectedIndex() == 1) {
            agenda.filtreazaNrMobil();
        }
        if (cbFiltre.getSelectedIndex() == 2) {
            agenda.filtreazaNascutiAstazi();
        }
        if (cbFiltre.getSelectedIndex() == 3) {
            agenda.filtreazaNascutiLunaCurenta();
        }
        if (cbFiltre.getSelectedIndex() == 4) {
            agenda.filtreazaPersonalizat(tfPersonalizat.getText());
        }
    }//GEN-LAST:event_cbFiltreActionPerformed
    
    //Buton pentru deschiderea ferestrei ce permite introducerea codului de inregistrare
    private void miInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInregistrareActionPerformed
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Introduceti codul de validare:", "Confirmare", JOptionPane.QUESTION_MESSAGE));
            if (n == cod) {
                // In cazul introducerii codului de inregistrare corect, toate functionalitatile aplicatiei devin accesibile, altfel se genereaza exceptie
                lblReclama.setVisible(false);
                miDeschidere.setEnabled(true);
                miSalvare.setEnabled(true);
                miInregistrare.setEnabled(false);
                btnAdauga.setEnabled(true);
                btnModifica.setEnabled(true);
                btnSterge.setEnabled(true);
                lblCod.setVisible(false);
                cbFiltre.setEnabled(true);
                cbOrdonari.setEnabled(true);
                tfPersonalizat.setEditable(true);
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Cod de validare eronat!");
        }

    }//GEN-LAST:event_miInregistrareActionPerformed

    //Buton pentru deschiderea ferestrei de dialog unde vom introduce datele noului contact
    private void btnAdaugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugaActionPerformed
        diAdauga.setVisible(true);
        btnUpdate.setVisible(false);
    }//GEN-LAST:event_btnAdaugaActionPerformed
    
    //Buton ce adauga un nou contact in agenda, validand datele acestuia
    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        try {
            String nume = tfNume.getText();
            String prenume = tfPrenume.getText();
            String dataNasterii = tfDataNasterii.getText();
            Contact c = new Contact(nume, prenume, dataNasterii);
            if (c.getDataNasterii().getMonth().equals(LocalDate.now().getMonth()) && c.getDataNasterii().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                JOptionPane.showMessageDialog(this, "Data de nasterii a contactului este astazi!");
            }
            String numarTelefon = tfNumarTelefon.getText();
            if (cbFix.isSelected()) {
                NrTel nrTel = new NrTelFix(numarTelefon);
                c.setNrTel(nrTel);
            } else if (cbMobil.isSelected()) {
                NrTel nrTel = new NrTelMobil(numarTelefon);
                c.setNrTel(nrTel);
            } else {
                throw new NullPointerException("");
            }
            for (Contact ct : listaContacte) {
                if (ct.getNume().equals(c.getNume()) && ct.getPrenume().equals(c.getPrenume()) && ct.getDataNasterii().equals(c.getDataNasterii()) && ct.getNrTel().equals(c.getNrTel())) {
                    throw new ContactExistentException("");
                }
            }
            listaContacte.add(c);
            model.addElement(c);
            tfNume.setText("");
            tfPrenume.setText("");
            tfDataNasterii.setText("");
            tfNumarTelefon.setText("");
            btnGroup.clearSelection();
            btnUpdate.setVisible(true);
            diAdauga.setVisible(false);
            actualizeazaModel();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Numele/prenumele nu a fost introdus!");
        } catch (NumeEronatExceptie e) {
            JOptionPane.showMessageDialog(this, "Numele a fost introdus eronat!");
        } catch (PrenumeEronatExceptie e) {
            JOptionPane.showMessageDialog(this, "Prenumele a fost introdus eronat!");
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Data nasterii nu este valida!");
        } catch (NumarTelefonExceptie e) {
            JOptionPane.showMessageDialog(this, "Numarul de telefon introdus este invalid!");
        } catch (ContactExistentException e) {
            JOptionPane.showMessageDialog(this, "Contactul exista deja in agenda!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Nu ai selectat tipul de telefon!");
        }

    }//GEN-LAST:event_btnConfirmaActionPerformed
    
    //Buton pentru stergerea contactului selectat din agenda
    private void btnStergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStergeActionPerformed
        if (!model.isEmpty()) {
            Contact c = (Contact) model.getElementAt(ContactList.getSelectedIndex());
            int response = JOptionPane.showConfirmDialog(this, "Doriti sa stergeti contactul " + c.getNume() + " " + c.getPrenume() + " ?", "Confirmare", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                model.removeElementAt(ContactList.getSelectedIndex());
                listaContacte.remove(c);
                actualizeazaModel();
            }
        }
    }//GEN-LAST:event_btnStergeActionPerformed
    
    //Buton pentru deschiderea ferestrei de modificare a contactului, aducand datele existente ale acestuia in campuri
    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        try {
            // Exceptie pentru neselectarea unui element
            if (ContactList.isSelectionEmpty()) {
                throw new ItemNotSelectedException();
            }
            // Prelucrarea datelor contactului selectat pentru a le prelua in campurile din fereastra de dialog
            Contact actual = (Contact) model.getElementAt(ContactList.getSelectedIndex());
            String sc[] = actual.toString().split(",");
            diAdauga.setVisible(true);
            String name[] = sc[0].split(" ");
            tfNume.setText(name[0]);
            tfPrenume.setText(name[1]);
            tfNumarTelefon.setText(sc[1].trim());
            if (tfNumarTelefon.getText().substring(0, 2).equals("02") || tfNumarTelefon.getText().substring(0, 2).equals("03")) {
                cbFix.setSelected(true);
            } else {
                cbMobil.setSelected(true);
            }
            String d = sc[2].trim();
            String dataNasterii[] = d.split("-");
            String a = dataNasterii[0];
            String l = dataNasterii[1];
            String z = dataNasterii[2];
            String dt = z + "." + l + "." + a;
            tfDataNasterii.setText(dt);
            btnConfirma.setVisible(false);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Lista este goala!");
        } catch (ItemNotSelectedException e) {
            JOptionPane.showMessageDialog(this, "Nu exista un index selectat");
        }


    }//GEN-LAST:event_btnModificaActionPerformed
    
    //Buton pentru modificarea contactului selectat, validand datele acestuia
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            //Efectuam validarea numarului de telefon inainte de a schimba datele contactului din model
            String numarTelefon = tfNumarTelefon.getText();
            if (cbFix.isSelected()) {
                NrTel nrTel = new NrTelFix(numarTelefon);
            } else if (cbMobil.isSelected()) {
                NrTel nrTel = new NrTelMobil(numarTelefon);
            } else {
                JOptionPane.showMessageDialog(this, "Nu ati selectat tipul de numar de telefon!");
            }
            Contact s = (Contact) model.getElementAt(ContactList.getSelectedIndex());
            listaContacte.remove(s);
            // Setam datele din model luand in considerare modificarile efectuate
            model.setElementAt(new Contact(tfNume.getText(), tfPrenume.getText(), tfDataNasterii.getText()), ContactList.getSelectedIndex());
            Contact c = (Contact) model.getElementAt(ContactList.getSelectedIndex());
            //Parcurgem din nou algoritmul de validare al numarului de telefon pentru a il seta
            if (cbFix.isSelected()) {
                NrTel nrTel = new NrTelFix(numarTelefon);
                c.setNrTel(nrTel);
            } else if (cbMobil.isSelected()) {
                NrTel nrTel = new NrTelMobil(numarTelefon);
                c.setNrTel(nrTel);
            } else {
                throw new NullPointerException("");
            }
            if (c.getDataNasterii().getMonth().equals(LocalDate.now().getMonth()) && c.getDataNasterii().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                JOptionPane.showMessageDialog(this, "Data de nasterii a contactului este astazi!");
            }
            for (Contact ct : listaContacte) {
                if (ct.getNume().equals(c.getNume()) && ct.getPrenume().equals(c.getPrenume()) && ct.getDataNasterii().equals(c.getDataNasterii()) && ct.getNrTel().equals(c.getNrTel())) {
                    throw new ContactExistentException("");
                }
            }
            // Stergem datele din campuri pentru a nu afisate cand se apasa din nou Adauga/Modifica pentru alt contact;
            listaContacte.add(c);
            tfNume.setText("");
            tfPrenume.setText("");
            tfDataNasterii.setText("");
            tfNumarTelefon.setText("");
            btnGroup.clearSelection();
            btnConfirma.setVisible(true);
            diAdauga.setVisible(false);
            actualizeazaModel();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Numele/prenumele nu a fost introdus!");
        } catch (NumeEronatExceptie e) {
            JOptionPane.showMessageDialog(this, "Numele a fost introdus eronat!");
        } catch (PrenumeEronatExceptie e) {
            JOptionPane.showMessageDialog(this, "Prenumele a fost introdus eronat!");
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Data nasterii nu este valida!");
        } catch (NumarTelefonExceptie e) {
            JOptionPane.showMessageDialog(this, "Numarul de telefon introdus este invalid!");
        } catch (ContactExistentException e) {
            JOptionPane.showMessageDialog(this, "Contactul exista deja in agenda!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Nu ai selectat tipul de telefon!");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed
    
    //Buton ce afiseaza o scurta descriere despre aplicatie
    private void miDespreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDespreActionPerformed
        diInfo.setVisible(true);
    }//GEN-LAST:event_miDespreActionPerformed
    
    //Buton tip comboBox pentru setarea tipului de ordonare
    private void cbOrdonariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdonariActionPerformed
        if (cbOrdonari.getSelectedIndex() == 0) {
            agenda.ordoneaza(Agenda.CriteriuOrdonare.DUPA_NUME);
        }
        if (cbOrdonari.getSelectedIndex() == 1) {
            agenda.ordoneaza(Agenda.CriteriuOrdonare.DUPA_PRENUME);
        }
        if (cbOrdonari.getSelectedIndex() == 2) {
            agenda.ordoneaza(Agenda.CriteriuOrdonare.DUPA_DATA_NASTERII);
        }
        if (cbOrdonari.getSelectedIndex() == 3) {
            agenda.ordoneaza(Agenda.CriteriuOrdonare.DUPA_NUMAR_TELEFON);
        }
    }//GEN-LAST:event_cbOrdonariActionPerformed
    
    //Butonul aranjeaza lista in functie de filtrul si ordonarea selectata
    private void btnFiltrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrareActionPerformed
        List<Contact> lista = (List<Contact>) listaContacte.stream().filter(Agenda.predicate).sorted(Agenda.map.get(Agenda.criteriu)).collect(Collectors.toList());
        model.clear();
        lista.forEach((o) -> {
            model.addElement(o);
        });
    }//GEN-LAST:event_btnFiltrareActionPerformed
    
    //TextField pentru filtrare personalizata
    private void tfPersonalizatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPersonalizatActionPerformed
        cbFiltreActionPerformed(evt);
    }//GEN-LAST:event_tfPersonalizatActionPerformed
    
    //Salvarea in format CSV a listei
    private void miSalvareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalvareActionPerformed
        if (!model.isEmpty()) {
            int response = JOptionPane.showConfirmDialog(this, "Doriti sa salvati lista de contacte?", "Salvare", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                try {
                    JFileChooser chooser = new JFileChooser();
                    chooser.showSaveDialog(this);
                    File list = new File(chooser.getSelectedFile().getAbsolutePath() + ".csv");
                    PrintWriter writer = new PrintWriter(list);
                    StringBuilder sb = new StringBuilder();

                    sb.append("Nume");
                    sb.append(",");
                    sb.append("Prenume");
                    sb.append(",");
                    sb.append("Data nasterii");
                    sb.append(",");
                    sb.append("Numar Telefon");
                    sb.append(",");
                    sb.append("\r\n");

                    listaContacte.stream().map((c) -> {
                        sb.append(c.getNume());
                        return c;
                    }).map((c) -> {
                        sb.append(",");
                        sb.append(c.getPrenume());
                        return c;
                    }).map((c) -> {
                        sb.append(",");
                        String dataNasterii[] = c.getDataNasterii().toString().split("-");
                        String a = dataNasterii[0];
                        String l = dataNasterii[1];
                        String z = dataNasterii[2];
                        String dt = z + "." + l + "." + a;
                        sb.append(dt);
                        sb.append(",");
                        sb.append(c.getNrTel().toString());
                        return c;
                    }).forEachOrdered((_item) -> {
                        sb.append("\r\n");
                    });

                    writer.write(sb.toString());
                    writer.close();

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_miSalvareActionPerformed
    
    //Deschiderea si incarcarea unei lista, validand datele acesteia
    private void miDeschidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeschidereActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Doriti sa incarcati lista de contacte?", "Incarcare", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File list = chooser.getSelectedFile();
                try {
                    FileReader reader = new FileReader(list);
                    Scanner input = new Scanner(reader);
                    String[] headLine = input.nextLine().split(",");
                    if (!headLine[0].equals("Nume") || !headLine[1].equals("Prenume") || !headLine[2].equals("Data nasterii") || !headLine[3].equals("Numar Telefon")) {
                        throw new FileCSVHeaderException("");
                    }
                    while (input.hasNextLine()) {
                        String[] contactLine = input.nextLine().split(",");
                        String nume = contactLine[0];
                        String prenume = contactLine[1];
                        String dataNasterii = contactLine[2];
                        String numarTelefon = contactLine[3];
                        Contact c = new Contact(nume, prenume, dataNasterii);
                        if (numarTelefon.substring(0, 2).equals("02") || numarTelefon.substring(0, 2).equals("03")) {
                            NrTel nrTel = new NrTelFix(numarTelefon);
                            c.setNrTel(nrTel);
                        } else if (numarTelefon.substring(0, 2).equals("07")) {
                            NrTel nrTel = new NrTelMobil(numarTelefon);
                            c.setNrTel(nrTel);
                        } else {
                            JOptionPane.showMessageDialog(this, "Nu ati selectat tipul de numar de telefon!");
                        }
                        for (Contact ct : listaContacte) {
                            if (ct.getNume().equals(c.getNume()) && ct.getPrenume().equals(c.getPrenume()) && ct.getDataNasterii().equals(c.getDataNasterii()) && ct.getNrTel().equals(c.getNrTel())) {
                                throw new ContactExistentException("");
                            }
                        }
                        listaContacte.add(c);
                        model.addElement(c);
                        actualizeazaModel();
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this, "Numele/prenumele nu a fost introdus!");
                } catch (NumeEronatExceptie e) {
                    JOptionPane.showMessageDialog(this, "Numele a fost introdus eronat!");
                } catch (PrenumeEronatExceptie e) {
                    JOptionPane.showMessageDialog(this, "Prenumele a fost introdus eronat!");
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(this, "Data nasterii nu este valida!");
                } catch (NumarTelefonExceptie e) {
                    JOptionPane.showMessageDialog(this, "Numarul de telefon introdus este invalid!");
                } catch (ContactExistentException e) {
                    JOptionPane.showMessageDialog(this, "Contactul exista deja in agenda!");
                } catch (FileCSVHeaderException ex) {
                    JOptionPane.showMessageDialog(this, "Capul de tabul nu e formatat corect");
                }
            }
        }


    }//GEN-LAST:event_miDeschidereActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ContactList;
    private javax.swing.JTextArea InfoApp;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JScrollPane TxPane;
    private javax.swing.JButton btnAdauga;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnFiltrare;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnSterge;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbFiltre;
    private javax.swing.JCheckBox cbFix;
    private javax.swing.JCheckBox cbMobil;
    private javax.swing.JComboBox<String> cbOrdonari;
    private javax.swing.JDialog diAdauga;
    private javax.swing.JDialog diInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAdauga;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDataNasterii;
    private javax.swing.JLabel lblFiltrare;
    private javax.swing.JLabel lblNumarTelefon;
    private javax.swing.JLabel lblNume;
    private javax.swing.JLabel lblOrdonare;
    private javax.swing.JPanel lblPanel;
    private javax.swing.JLabel lblPersonalizat;
    private javax.swing.JLabel lblPrenume;
    public static javax.swing.JLabel lblReclama;
    private javax.swing.JMenu mAjutor;
    private javax.swing.JMenu mFisiere;
    private javax.swing.JMenuItem miDeschidere;
    private javax.swing.JMenuItem miDespre;
    private javax.swing.JMenuItem miIesire;
    private javax.swing.JMenuItem miInregistrare;
    private javax.swing.JMenuItem miSalvare;
    private javax.swing.JTextField tfDataNasterii;
    private javax.swing.JTextField tfNumarTelefon;
    private javax.swing.JTextField tfNume;
    private javax.swing.JTextField tfPersonalizat;
    private javax.swing.JTextField tfPrenume;
    // End of variables declaration//GEN-END:variables
}
