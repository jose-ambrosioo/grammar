/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.text.DefaultCaret;
import modelo.Pergunta;
import org.jpl7.Query;
import modelo.Util;

/**
 *
 * @author Ademaro
 */
public class NovaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form Janela1
     */
    public NovaConsulta() {
        this.setContentPane(new JLabel(new ImageIcon(getClass().getResource("/imagens/pipes.png"))));
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        URL caminhoImagem = this.getClass().getClassLoader().getResource("imagens/grammar (2).png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
        
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // nunca mostra a barra de rolagem horizontal
        fraseTxt.setLineWrap(true);

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
        fraseTxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        analisarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gramática - Análise");
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

        fraseTxt.setColumns(20);
        fraseTxt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        fraseTxt.setRows(5);
        jScrollPane2.setViewportView(fraseTxt);

        jLabel2.setDisplayedMnemonic('N');
        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel2.setText("<html><body>Insira uma frase.</body></html>");

        analisarBtn.setBackground(new java.awt.Color(255, 255, 255));
        analisarBtn.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        analisarBtn.setText("Analisar");
        analisarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisarBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setText("Gramática");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(analisarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analisarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairBtnActionPerformed

    private void analisarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisarBtnActionPerformed
        
        String fraseInserida = fraseTxt.getText().trim().toLowerCase().replaceAll("\\s+"," ");
        
        fraseInserida = formatacoesPontoOuPontoDeInterrogação(fraseInserida);
        
        fraseInserida = fraseInserida.replaceAll("\\s+"," ").replace(" ", ",");
        
        try
        {
            List<String> listaTermosDesconhecidos = Util.listaTermosDesconhecidos(fraseInserida.split(","));

            if(listaTermosDesconhecidos.isEmpty())
            {
                String[] strTemp = fraseInserida.split(",");
                if(strTemp[strTemp.length-1].equalsIgnoreCase("?"))
                {
                    String str = fraseInserida.replace(",", " ");
                    Pergunta pergunta = Util.procurarPergunta(str);

                    if(pergunta != null)
                    {
                        new ResultadoConsulta(fraseInserida, pergunta).setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        new SalvarRespostaDaPergunta(str).setVisible(true);
                        this.dispose();
                    }
                }
                else
                {                
                    new ResultadoConsulta(fraseInserida).setVisible(true);
                    this.dispose();
                }
            }
            else
            {
                new AlimentarBaseConhecimento(listaTermosDesconhecidos).setVisible(true);
                this.dispose();
            }
//            new BarraProgresso();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Palavras com certos caracteres especiais o sistema não permite");
        }
    }//GEN-LAST:event_analisarBtnActionPerformed

    /*
        Caso a frase termine com ou ponto de interrogação
        colado com a penultima palavra  o metodo faz a
        separação entre o sinal de pontuação e a palavra
    */
    public String formatacoesPontoOuPontoDeInterrogação(String fraseInserida)
    {
        if(fraseInserida.endsWith("?"))
        {
                int quantidadePontoInterrogacao = fraseInserida.length() - fraseInserida.replaceAll("\\?", "").length();
                if( quantidadePontoInterrogacao == 1)
                {
                    fraseInserida = fraseInserida.replaceAll("\\?", " ?");
                }
        }
        else if(fraseInserida.endsWith("."))
        {
                int quantidadePontoInterrogacao = fraseInserida.length() - fraseInserida.replaceAll("\\.", "").length();
                if( quantidadePontoInterrogacao == 1)
                {   
                    String strTemp = fraseInserida.replaceAll("\\.", "").trim().replace(" ", ",");
                    Util.conectarComFicheiroBaseDeConhecimento();
                    Query consulta = new Query("frase(_, ["+strTemp+"], []).");
                    System.err.println("frase(_, ["+strTemp+"], []).");
                    consulta.hasSolution();    
                    if(consulta.isOpen() == false)
                    {
                        fraseInserida = fraseInserida.replaceAll("\\.", " .");
                    }                    
                    fraseInserida = strTemp.replace(",", " ");
                }
        }
        return fraseInserida;
    }
    
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
                new NovaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analisarBtn;
    private javax.swing.JTextArea fraseTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sairBtn;
    // End of variables declaration//GEN-END:variables
}