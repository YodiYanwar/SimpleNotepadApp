package notepad;

//<editor-fold defaultstate="collapsed" desc="Import Class yang dibutuhkan">
import com.alee.laf.WebLookAndFeel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
//</editor-fold>

/**
 *
 * @author YODI YANWAR
 */
public class NotepadForm extends javax.swing.JFrame {
    
   
//<editor-fold defaultstate="collapsed" desc="Instance Variabel">
    public ConfirmDialog confirm;
    public About about;
    public Developer developer;
    NotepadForm nf;
    private String defaultTitle = "New Document";
    private Boolean isSaved = false;
    private String filePath = "";
    public String title = "";
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Cunstructor">
    public NotepadForm() {
        try{
            UIManager.setLookAndFeel(WebLookAndFeel.class
                    .getCanonicalName());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "LookAndFeel Tidak Cocok !\n"+e,"ERROR",0);
        }
        
        initComponents();
        icon();
        setLocationRelativeTo(this);
    }
//</editor-fold>
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaNotepad = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        newItem = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        savefiles = new javax.swing.JMenuItem();
        saveAsFile = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        menuInsert = new javax.swing.JMenu();
        menuItemTime = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemDeveloper = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimpleNotepad");
        setIconImages(null);

        textAreaNotepad.setColumns(20);
        textAreaNotepad.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        textAreaNotepad.setRows(5);
        jScrollPane1.setViewportView(textAreaNotepad);

        file.setText("File");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        newItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank_page.png"))); // NOI18N
        newItem.setText("New");
        newItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemActionPerformed(evt);
            }
        });
        file.add(newItem);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder.png"))); // NOI18N
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        file.add(open);

        savefiles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        savefiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        savefiles.setText("Save");
        savefiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefilesActionPerformed(evt);
            }
        });
        file.add(savefiles);

        saveAsFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        saveAsFile.setText("Save As");
        saveAsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsFileActionPerformed(evt);
            }
        });
        file.add(saveAsFile);
        file.add(jSeparator1);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shut_down.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        menuInsert.setText("Insert");
        menuInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertActionPerformed(evt);
            }
        });

        menuItemTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar_date.png"))); // NOI18N
        menuItemTime.setText("Time");
        menuItemTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTimeActionPerformed(evt);
            }
        });
        menuInsert.add(menuItemTime);

        jMenuBar1.add(menuInsert);

        jMenu1.setText("Help");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attachment.png"))); // NOI18N
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuItemDeveloper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/process.png"))); // NOI18N
        menuItemDeveloper.setText("Developer");
        menuItemDeveloper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDeveloperActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemDeveloper);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if(confirm == null){
            
            confirm = new ConfirmDialog();
           
        } else{
            confirm.toFront();
        }
        confirm.setVisible(true);
        confirm.setAlwaysOnTop(true);
        
    }//GEN-LAST:event_exitActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        
    }//GEN-LAST:event_fileActionPerformed

    private void saveAsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsFileActionPerformed
        // TODO add your handling code here:
        if(textAreaNotepad.getText().equals("")){
            int app = JOptionPane.showConfirmDialog(null,"Yakin akan menyimpan file kosong ?","Perhatian",JOptionPane.YES_NO_OPTION);
            if(app == 0){
                 saveAsFile();
            }
        } else{
            saveAsFile();
        }
        
    }//GEN-LAST:event_saveAsFileActionPerformed

    private void newItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemActionPerformed
        // TODO add your handling code here:
        newFile();
    }//GEN-LAST:event_newItemActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_openActionPerformed

    private void savefilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefilesActionPerformed
        // TODO add your handling code here:
        if (textAreaNotepad.getText().equals("")) {
            int app = JOptionPane.showConfirmDialog(null, "Yakin akan menyimpan file kosong ?","Perhatian",JOptionPane.YES_NO_OPTION);
            if(app == 0){
                saveFile();
            }
        } else {
            saveFile();
        }
    }//GEN-LAST:event_savefilesActionPerformed

    private void menuItemTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTimeActionPerformed
        // TODO add your handling code here:
        Date now = new Date();
        textAreaNotepad.append(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(now));
        
    }//GEN-LAST:event_menuItemTimeActionPerformed

    private void menuInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_menuInsertActionPerformed
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(about == null){
            
            about = new About();
           
        } else{
            about.toFront();
        }
        about.setVisible(true);
        about.setAlwaysOnTop(true);
     
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void menuItemDeveloperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeveloperActionPerformed
        // TODO add your handling code here:
        if(developer == null){
            
            developer = new Developer();
           
        } else{
            developer.toFront();
        }
        developer.setVisible(true);
        developer.setAlwaysOnTop(true);
    }//GEN-LAST:event_menuItemDeveloperActionPerformed

    /**
     * @param args the command line arguments
     */
    //<editor-fold defaultstate="collapsed" desc="Main Method">
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
            java.util.logging.Logger.getLogger(NotepadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadForm().setVisible(true);
            }
        });
    }
//</editor-fold>
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuInsert;
    private javax.swing.JMenuItem menuItemDeveloper;
    private javax.swing.JMenuItem menuItemTime;
    private javax.swing.JMenuItem newItem;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem saveAsFile;
    private javax.swing.JMenuItem savefiles;
    private javax.swing.JTextArea textAreaNotepad;
    // End of variables declaration//GEN-END:variables
    
    
    //<editor-fold defaultstate="collapsed" desc="Method newFile()">
    private void newFile() {
        textAreaNotepad.setText("");
        this.setTitle(defaultTitle);
        isSaved = false;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Method saveAsFile()">
    private void saveAsFile() {
        
            JFileChooser saves;
            saves = new JFileChooser();
            int option = saves.showSaveDialog(saves);

            String path = saves.getSelectedFile().getPath();
            String fileName = saves.getSelectedFile().getName();
            String isiFile = textAreaNotepad.getText();

            if(option == JFileChooser.APPROVE_OPTION){
                System.out.println("return Integer option value for saveAsFile : "+option);
                try{
                    //Buat File
                    File f = new File(path);

                    // 2. Buat writer
                    FileWriter fw = new FileWriter(f);

                    // 3. Tulis data ke objek writer
                    fw.write(isiFile);

                    // 4. Setelah selesai, tutup
                    fw.close();

                    this.setTitle(fileName);
                    isSaved = true;

                } catch(IOException e){ 
                    e.printStackTrace();
            }
            
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Method openFile()">
    private void openFile() {
        JFileChooser jfc = new JFileChooser();
        int option = jfc.showOpenDialog(open);
        
        if (option == JFileChooser.APPROVE_OPTION) {
            System.out.println("return Integer option value for openFile : "+option);
            textAreaNotepad.setText("");
            try {
                Scanner scan = new Scanner(new FileReader(jfc.getSelectedFile().getPath()));
                if (scan == null) {
                    System.out.println("Canceled Operation");
                } else{
                    while (scan.hasNext()) {
                        textAreaNotepad.append(scan.nextLine()+"\n");
                    }
                    title = jfc.getSelectedFile().getName();
                    this.setTitle(title);
                    isSaved = true;
                    filePath = jfc.getSelectedFile().getPath();
                }
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Method tambahKata">
    public void setAppend(String tambahKata){
        textAreaNotepad.append(tambahKata);
        
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Method icon()">
    public void icon(){
        ImageIcon ico = new ImageIcon("src/images/whack_notepad48x48.png");
        setIconImage(ico.getImage());
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Method saveFile()">
    private void saveFile() {
        
            if (isSaved == true) {
            try(BufferedWriter out = new BufferedWriter(new FileWriter(filePath))) {
                out.write(textAreaNotepad.getText());
                JOptionPane.showMessageDialog(null, "Isi file berhasil diupdate","SUKSES",1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else{
            JFileChooser saves;
            saves = new JFileChooser();
            int option = saves.showSaveDialog(saves);
            
            String path = saves.getSelectedFile().getPath();
            String fileName = saves.getSelectedFile().getName();
            String isiFile = textAreaNotepad.getText();

                if(option == JFileChooser.APPROVE_OPTION){
                    System.out.println("return Integer option value for saveFile : "+option);
                    try{
                        //Buat File
                        File f = new File(path);

                        // 2. Buat writer
                        FileWriter fw = new FileWriter(f);

                        // 3. Tulis data ke objek writer
                        fw.write(isiFile);

                        // 4. Setelah selesai, tutup
                        fw.close();

                        this.setTitle(fileName);
                        isSaved = true;

                    } catch(IOException e){
                        e.printStackTrace();
                    }
            }
        
        
        
        }
    }
//</editor-fold>
}

