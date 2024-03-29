/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Prolog;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.text.DefaultCaret;
import modelo.Util;

/**
 *
 * @author Ademaro
 */
public class AlimentarBaseConhecimento extends javax.swing.JFrame {

    private List<String> listaTermosDesconhecidos = null;

    private InserirNumero_e_Genero inserirNum_e_Gen;
    private InserirNumero inserirNum;
    
    public AlimentarBaseConhecimento(List<String> listaTermosDesconhecidos) {
        this.setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagens/pipes.png"))));
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        URL caminhoImagem = this.getClass().getClassLoader().getResource("imagens/grammar (2).png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
        
        termoTxt.setEditable(false);
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // nunca mostra a barra de rolagem horizontal
        termoTxt.setLineWrap(true);
        
        this.listaTermosDesconhecidos = listaTermosDesconhecidos;
        termoTxt.setText(this.listaTermosDesconhecidos.get(0));
        
        carregarComboBox_classeGramaticais();
    }

    public AlimentarBaseConhecimento() {
        this.setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagens/textura branca 1.png"))));
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        URL caminhoImagem = this.getClass().getClassLoader().getResource("imagens/grammar (2).png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
        
        termoTxt.setEditable(false);
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // nunca mostra a barra de rolagem horizontal
        termoTxt.setLineWrap(true);
        
        carregarComboBox_classeGramaticais();
        
    }
    
    public void carregarComboBox_classeGramaticais()
    {
        classeGramaticaisJCB.removeAllItems();
        classeGramaticaisJCB.addItem("Selecione");
        for(String str : Util.retornarTodasClassesGramaticais())
        {
            classeGramaticaisJCB.addItem(str);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sairBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        termoTxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        salvarrBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        classeGramaticaisJCB = new javax.swing.JComboBox<>();
        novaClasseGramaticalBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gramática - Termo");
        setBackground(new java.awt.Color(255, 255, 255));

        sairBtn.setBackground(new java.awt.Color(255, 255, 255));
        sairBtn.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        sairBtn.setText("Voltar");
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/grammar (3).png"))); // NOI18N

        termoTxt.setColumns(20);
        termoTxt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        termoTxt.setRows(5);
        jScrollPane2.setViewportView(termoTxt);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel2.setText("<html><body>Classe gramatical:</body></html>");

        salvarrBtn.setBackground(new java.awt.Color(255, 255, 255));
        salvarrBtn.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        salvarrBtn.setText("Salvar");
        salvarrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarrBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel3.setText("<html><body>Termo:</body></html>");

        classeGramaticaisJCB.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        classeGramaticaisJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        classeGramaticaisJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classeGramaticaisJCBActionPerformed(evt);
            }
        });

        novaClasseGramaticalBtn.setBackground(new java.awt.Color(255, 255, 255));
        novaClasseGramaticalBtn.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        novaClasseGramaticalBtn.setText("Nova Classe Gramatical");
        novaClasseGramaticalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaClasseGramaticalBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel4.setText("Gramática");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(classeGramaticaisJCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novaClasseGramaticalBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvarrBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel4)))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classeGramaticaisJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novaClasseGramaticalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        new NovaConsulta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairBtnActionPerformed

    private void salvarrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarrBtnActionPerformed
        String termo = termoTxt.getText().replace(" ", "");
        if(termo.equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(null, "Não existe nenhum termo");
        else if(classeGramaticaisJCB.getSelectedIndex() == 0)
            JOptionPane.showMessageDialog(null, "Não selecionaste a classe gramatical");
        else
        {
            try {
                String classeGramatical = classeGramaticaisJCB.getSelectedItem().toString();
                if(classeGramatical.equalsIgnoreCase("artigo") || classeGramatical.equalsIgnoreCase("substantivo")){
                    Prolog.salvarNovoTermoComNumero_e_Genero(termo, classeGramatical, inserirNum_e_Gen.getNumero(), inserirNum_e_Gen.getGenero());
                }
                else if(classeGramatical.equalsIgnoreCase("verbo")){
                    Prolog.salvarNovoTermoComNumero(termo, classeGramatical, inserirNum.getNumero());
                }
                else{
                    Prolog.salvarNovoTermo(termo, classeGramatical);
                }
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                listaTermosDesconhecidos.remove(0);

                if(listaTermosDesconhecidos.isEmpty())
                {
                    termoTxt.setText("");
                    salvarrBtn.setEnabled(false);
                }
                else
                {
                    termoTxt.setText(listaTermosDesconhecidos.get(0));
                }
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi salvo");
            }
        }
    }//GEN-LAST:event_salvarrBtnActionPerformed

    private void novaClasseGramaticalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaClasseGramaticalBtnActionPerformed
        new NovaClasseGramatical(listaTermosDesconhecidos).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_novaClasseGramaticalBtnActionPerformed

    private void classeGramaticaisJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classeGramaticaisJCBActionPerformed
        inserirNum_e_Gen = null;
        inserirNum = null;
        if(classeGramaticaisJCB.getSelectedItem() != null)
        {
            if(classeGramaticaisJCB.getSelectedItem().toString().equalsIgnoreCase("artigo")){
                inserirNum_e_Gen = new InserirNumero_e_Genero("artigo");
            }
            else if(classeGramaticaisJCB.getSelectedItem().toString().equalsIgnoreCase("substantivo")){
                inserirNum_e_Gen = new InserirNumero_e_Genero("substantivo");
            }
            else if(classeGramaticaisJCB.getSelectedItem().toString().equalsIgnoreCase("verbo")){
                inserirNum = new InserirNumero("verbo");
            }
        }
    }//GEN-LAST:event_classeGramaticaisJCBActionPerformed

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
            java.util.logging.Logger.getLogger(NovaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlimentarBaseConhecimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classeGramaticaisJCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton novaClasseGramaticalBtn;
    private javax.swing.JButton sairBtn;
    private javax.swing.JButton salvarrBtn;
    private javax.swing.JTextArea termoTxt;
    // End of variables declaration//GEN-END:variables
}
