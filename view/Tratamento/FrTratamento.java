/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.haras.view.Tratamento;

import br.com.haras.controller.TratamentoController;
import br.com.haras.model.Doenca;
import br.com.haras.model.Equino;
import br.com.haras.model.TipoTratamento;
import br.com.haras.view.FrMenu;
import br.com.haras.view.component.Message;
import br.com.haras.view.component.swing.ButtonOutLine;
import br.com.haras.view.component.swing.MyButton;
import br.com.haras.view.component.swing.MyFormattedTextField;
import br.com.haras.view.component.swing.MyTextField;
import br.com.haras.view.component.swing.SearchableComboBox;
import br.com.haras.view.equino.EquinoDialog;
import br.com.haras.view.equino.PanelCoverEquino;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListDataListener;
import javax.swing.text.MaskFormatter;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author alice
 */
public class FrTratamento extends javax.swing.JFrame {

    /**
     * Creates new form FrTratamento
     */
    private ButtonOutLine btnVoltar;
    private MyButton btnSalvar;   
    private MyButton btnCalcular;
    private MigLayout layout;
    private PanelCoverEquino cover;
    private TratamentoPn tratamentoPn;
    private Equino eqSelecionado;
    /**
     * Creates new form FrTratamento
     */
    public FrTratamento() {
        initComponents();
        this.setSize(1080,720);
        ActionListener eventSave = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        };

        ActionListener evt = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ActionListener eventBuscaEq = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EquinoDialog dialog = new EquinoDialog(FrTratamento.this,true);
                eqSelecionado =dialog.getEquinoSelecionado();
            }
        };

        
        
        layout = new MigLayout("fill");
        tratamentoPn = new TratamentoPn(eventSave,eventBuscaEq);
        bg.setLayout(layout);



        cover = new PanelCoverEquino();
        btnVoltar = new ButtonOutLine();
        btnVoltar.setBackground(new Color(255,255,255));
        btnVoltar.setForeground(new Color(255,255,255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
                new FrMenu();
                dispose();   
            }
        });
        
        btnSalvar = new MyButton();
        btnSalvar.setBackground(new Color(255,255,255));
        btnSalvar.setForeground(new Color(128,52,11));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
                
            }
        });
         btnCalcular = new MyButton();
        btnCalcular.setBackground(new Color(255,255,255));
        btnCalcular.setForeground(new Color(128,52,11));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
                
            }
        });
        cover.add(btnCalcular,"center,w 20%, h 5%, gapbottom 10");
        cover.add(btnSalvar,"center,w 20%, h 5%, gaptop 0");
        cover.add(btnVoltar, "center,bottom, pad -20 0 -20 0, w 20%, h 5%");
        bg.add(cover,"width 20%, pos 1al 0 n 100%");
        bg.add(tratamentoPn,"width 80%, pos 0al 0 n 100%");
        
         this.setVisible(true);
         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrTratamento().setVisible(true);
            }
        });
    }
    private void showMessage(Message.MessageType  messageType, String message){
        Message ms = new Message();
        //ms.setOpaque(true);
        
        ms.showMessage(messageType, message);
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void begin() {
                if(!ms.isShow()){
                    bg.add(ms,"pos 0.5al -30",0);
                    ms.setVisible(true);
                    bg.repaint();
                }
            }

            @Override
            public void timingEvent(float fraction) {
                float f;   
                if (ms.isShow()){
                    f= 40 *(1f- fraction);
                }else{
                    f= 40 * fraction;
                }
                layout.setComponentConstraints(ms, "pos 0.5al "+(int)(f - 30));
                bg.repaint();
                bg.revalidate();
            }

            @Override
            public void end() {
                if(ms.isShow()){
                    bg.remove(ms);
                    bg.repaint();
                    bg.revalidate();
                }else{
                    ms.setShow(true);
                }
            }
            
        };
        Animator animator = new Animator(300, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                    animator.start();
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
        }).start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}

class TratamentoPn extends javax.swing.JPanel {
     

    public TratamentoPn(ActionListener evtSave, ActionListener eventBuscaEq) {
        initComponents();
        this.setBackground(new Color(255,255,255));
        
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new MigLayout("fill","[center]","push[center]push"));
        panelTitulo.setBackground(new Color (204, 83, 18));
        JLabel titulo = new JLabel("Registro Veterinário");
        titulo.setFont(new Font("sansserif",3,36));
        titulo.setForeground(Color.white);
        panelTitulo.add(titulo);
        
        layout = new MigLayout("wrap","[center]","[top]push[]");
        setLayout(layout);
        this.add(panelTitulo,"span,w 100%,h 15%, pad -10 -15 0 5, wrap");
        
        
        pnCamposTratamento panelCampos = new pnCamposTratamento(evtSave, eventBuscaEq);
        
        panelCampos.setBackground(Color.WHITE);
        this.add(panelCampos,"span,w 100%,h 85%, pad 0 -15 10 5");
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>                        
        
    private TratamentoController tratamentoController= new TratamentoController(); 
    private MigLayout layout;
    private ButtonOutLine btnCancelar;
    private ButtonOutLine btnSalvar;
    
   
    // Variables declaration - do not modify                     
    // End of variables declaration 
}
class pnCamposTratamento extends JPanel{
    
    private HashMap<String,String> infoTratamento = new HashMap<>();
    private MyTextField edtPosologia;
    private MyTextField edtEquino;
    private MyTextField edtVeterinario;
    private MyTextField edtMedicacao;
    private MyFormattedTextField edtVlFinalTratamento;
    private MyFormattedTextField edtDtConsulta;
    private MyFormattedTextField edtVlMedicacao;
    private MaskFormatter maskFormatter;
    private MaskFormatter maskFormatterData;
    private SearchableComboBox comboBoxTipoTratamento;
    private SearchableComboBox comboBoxDoenca;
    private JTextArea txLaudo;
    private ButtonOutLine btnFindVeterinario;
    private ButtonOutLine btnAddDoenca;
    private ButtonOutLine btnFindEquino;
    private ButtonOutLine btnAddTipoTratamento;

    private TratamentoController controller = new TratamentoController();
    private Equino equino;
    public pnCamposTratamento(ActionListener evtSave, ActionListener eventBuscaEq) {
        this.setLayout(new MigLayout("wrap","push[]10[]20[]10[]push","push[]20[]20[]20[]20[]20[]20[]20[]20[]push"));
        
        JLabel lblEquino = new JLabel("Equino");
        lblEquino.setFont(new Font("sansserif",1,15));
        lblEquino.setForeground(new Color(74,37,20));
        edtEquino = new MyTextField();
        this.add(lblEquino,"");
        this.add(edtEquino,"w 40%,left,span2");
        
        btnFindEquino = new ButtonOutLine();
        btnFindEquino.setBackground(new Color(204, 83, 18));
        btnFindEquino.setForeground(new Color(204, 83, 18));
        btnFindEquino.setIcon(new ImageIcon(getClass().getResource("/imgs/lupa.png"))); 
        btnFindEquino.addActionListener(eventBuscaEq);
        this.add(btnFindEquino,"w 10%,left");

        
        JLabel lblVeterinario = new JLabel("Veterinário");
        lblVeterinario.setFont(new Font("sansserif",1,15));
        lblVeterinario.setForeground(new Color(74,37,20));
        edtVeterinario = new MyTextField();
        this.add(lblVeterinario,"");
        this.add(edtVeterinario,"w 40%,left,span 3");
        

        
       
        
        JLabel lblTipoTratamento = new JLabel("Tipo tratamento");
        lblTipoTratamento.setFont(new Font("sansserif",1,15));
        lblTipoTratamento.setForeground(new Color(74,37,20));
        comboBoxTipoTratamento = new SearchableComboBox();
        this.add(lblTipoTratamento,"");
        this.add(comboBoxTipoTratamento,"w 40%, h 35, span 2");
        btnAddTipoTratamento = new ButtonOutLine();
        btnAddTipoTratamento.setBackground(new Color(204, 83, 18));
        btnAddTipoTratamento.setForeground(new Color(204, 83, 18));
        btnAddTipoTratamento.setFocusable(false);
        btnAddTipoTratamento.setIcon(new ImageIcon(getClass().getResource("/imgs/mais.png")));
        btnAddTipoTratamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //model tipo tratamento
                atualizarTipoTratamento();
            }
        });
        this.add(btnAddTipoTratamento,"w 10%,left");
        
        
        
        
        JLabel lblDoenca = new JLabel("Doença");
        lblDoenca.setFont(new Font("sansserif",1,15));
        lblDoenca.setForeground(new Color(74,37,20));
        comboBoxDoenca = new SearchableComboBox();
        this.add(lblDoenca,"");
        this.add(comboBoxDoenca,"w 40%, h 35, span 2");
        btnAddDoenca = new ButtonOutLine();
        btnAddDoenca.setBackground(new Color(204, 83, 18));
        btnAddDoenca.setForeground(new Color(204, 83, 18));
        btnAddDoenca.setFocusable(false);
        btnAddDoenca.setIcon(new ImageIcon(getClass().getResource("/imgs/mais.png")));
        btnAddDoenca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //modal doenca
                atualizarDoenca();
            }
        });
        this.add(btnAddDoenca,"w 10%,left");
        
        
        JLabel lblMedicacao = new JLabel("Medicação");
        lblMedicacao.setFont(new Font("sansserif",1,15));
        lblMedicacao.setForeground(new Color(74,37,20));
        edtMedicacao = new MyTextField();
        this.add(lblMedicacao,"");
        this.add(edtMedicacao,"w 25%,left");
        
        JLabel lblVlMedicacao = new JLabel("Valor medicação");
        lblVlMedicacao.setFont(new Font("sansserif",1,15));
        lblVlMedicacao.setForeground(new Color(74,37,20));
        edtVlMedicacao = new MyFormattedTextField();
        this.add(lblVlMedicacao,"");
        this.add(edtVlMedicacao,"w 25%,left");
        
        
        JLabel lblPosologia = new JLabel("Posologia");
        lblPosologia.setFont(new Font("sansserif",1,15));
        lblPosologia.setForeground(new Color(74,37,20));
        edtPosologia = new MyTextField();
        this.add(lblPosologia,"");
        this.add(edtPosologia,"w 60%,left,span 3");
         
        JLabel lblDtConsulta = new JLabel("Data consulta");
        lblDtConsulta.setFont(new Font("sansserif",1,15));
        lblDtConsulta.setForeground(new Color(74,37,20));
        edtDtConsulta = new MyFormattedTextField(); 
        this.add(lblDtConsulta,"");
        this.add(edtDtConsulta,"w 25%,center");
        
        JLabel lblVlFinal = new JLabel("Valor final");
        lblVlFinal.setFont(new Font("sansserif",1,15));
        lblVlFinal.setForeground(new Color(74,37,20));
        edtVlFinalTratamento = new MyFormattedTextField(); 
        this.add(lblVlFinal,"");
        this.add(edtVlFinalTratamento,"w 25%,center");
        
        
        JLabel lblLaudo = new JLabel("Laudo veterinário");
        lblLaudo.setFont(new Font("sansserif",1,15));
        lblLaudo.setForeground(new Color(74,37,20));
        txLaudo = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(txLaudo);
        jScrollPane.setBackground(Color.red);
        this.add(lblLaudo,"");
        this.add(jScrollPane,"gapleft 10,w 80%, h 15%,span,newline");
         try{
            maskFormatter = new MaskFormatter("R$ ###,##");
            maskFormatterData = new MaskFormatter("##/##/####");
            maskFormatterData.setPlaceholderCharacter('-');
            
            maskFormatterData.install(edtDtConsulta);
            maskFormatter.install(edtVlFinalTratamento);
             maskFormatter.install(edtVlMedicacao);
        }catch(Exception e){
            //log
        }
         this.atualizarDoenca();
         this.atualizarTipoTratamento();

    }

    private void atualizarTipoTratamento(){
        List<TipoTratamento> lsTpTratamento = controller.listTpTratamento();
        comboBoxTipoTratamento.setModel(new DefaultComboBoxModel(lsTpTratamento.toArray()) );
    }
    private void atualizarDoenca(){
        List<Doenca> lsDoenca = controller.listDoenca();
        comboBoxDoenca.setModel(new DefaultComboBoxModel(lsDoenca.toArray()) );
    }
    public void setEqSelecionado(String nmEquino){
        this.edtEquino.setText(nmEquino);
    }
    public HashMap<String,String> getInfoTratamento(){
        infoTratamento.put("posologia",edtPosologia.getText());

        infoTratamento.put("nmMedicacao", edtMedicacao.getText());
        infoTratamento.put("vlFinalTratamento",  edtVlFinalTratamento.getText());
        infoTratamento.put("dtConsulta",edtDtConsulta.getText());
        infoTratamento.put("vlMedicacao",edtVlMedicacao.getText());
        infoTratamento.put("posologia",edtPosologia.getText());
        //infoTratamento.put("", edtEquino.getText());
        //infoTratamento.put("posologia",edtVeterinario.getText());
        //comboBoxTipoTratamento.getSelectedItem();
        //comboBoxDoenca.getSelectedItem();
        return infoTratamento;
    }
}
