/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lista08.view;

import java.util.ArrayList;
import lista08.model.Aluno;
import lista08.model.Professor;
import lista08.model.Titulacao;
import lista08.model.Turma;
import lista08.model.Turno;


/**
 *
 * @author leandro
 */
public class TelaPrincipal extends javax.swing.JFrame {
    protected Turma turma;
    protected Aluno aluno;
    protected Professor professor;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
<<<<<<< HEAD
        turma = new Turma();
=======
>>>>>>> e5da6513f3e111f0b2238aaba04c5281a54dd422
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrTurno = new javax.swing.ButtonGroup();
        btnGrTitulacao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTfdDisciplina = new javax.swing.JTextField();
        jRdbMatutino = new javax.swing.JRadioButton();
        jRdbVespertino = new javax.swing.JRadioButton();
        jRdbNoturno = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTfdNome = new javax.swing.JTextField();
        jTfdEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRdbGraduacao = new javax.swing.JRadioButton();
        jRdbMestrado = new javax.swing.JRadioButton();
        jRdbDoutorado = new javax.swing.JRadioButton();
        jBtnIncluirAluno = new javax.swing.JButton();
        jBtnListarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Turma"));

        jLabel1.setText("Disciplina:");

        jLabel2.setText("Turno:");

        btnGrTurno.add(jRdbMatutino);
        jRdbMatutino.setText("Matutino");

        btnGrTurno.add(jRdbVespertino);
        jRdbVespertino.setText("Vespertino");

        btnGrTurno.add(jRdbNoturno);
        jRdbNoturno.setText("Noturno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTfdDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRdbMatutino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbVespertino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbNoturno)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTfdDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRdbMatutino)
                    .addComponent(jRdbVespertino)
                    .addComponent(jRdbNoturno)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Professor"));

        jLabel3.setText("Nome:");

        jLabel4.setText("Email:");

        jLabel5.setText("Titulação:");

        btnGrTitulacao.add(jRdbGraduacao);
        jRdbGraduacao.setText("Graduação");

        btnGrTitulacao.add(jRdbMestrado);
        jRdbMestrado.setText("Mestrado");

        btnGrTitulacao.add(jRdbDoutorado);
        jRdbDoutorado.setText("Doutorado");
        jRdbDoutorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdbDoutoradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTfdEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbGraduacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbMestrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRdbDoutorado)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRdbGraduacao)
                    .addComponent(jRdbMestrado)
                    .addComponent(jRdbDoutorado)))
        );

        jBtnIncluirAluno.setText("Incluir Aluno");
        jBtnIncluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirAlunoActionPerformed(evt);
            }
        });

        jBtnListarDados.setText("Listar Dados da Turma");
        jBtnListarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnListarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jBtnIncluirAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnListarDados)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluirAluno)
                    .addComponent(jBtnListarDados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
         
=======
>>>>>>> e5da6513f3e111f0b2238aaba04c5281a54dd422
    private void jRdbDoutoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdbDoutoradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdbDoutoradoActionPerformed

    private void jBtnIncluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirAlunoActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
=======
         turma = new Turma();
>>>>>>> e5da6513f3e111f0b2238aaba04c5281a54dd422
        //ArrayList<Aluno> alunos = new ArrayList<>();
        
        turma.setDisciplina(jTfdDisciplina.getText());
        
        if(jRdbNoturno.isSelected()) {
            turma.setTurno(Turno.NOTURNO);
        }else if(jRdbMatutino.isSelected()) {
            turma.setTurno(Turno.MATUTINO);
        }else{
            turma.setTurno(Turno.VESPERTINO);
        }
        
         professor = new Professor(jTfdNome.getText(), jTfdEmail.getText());
        
        if(jRdbGraduacao.isSelected()) {
            professor.setTitulacao(Titulacao.GRADUACAO);
        }else if(jRdbMestrado.isSelected()) {
            professor.setTitulacao(Titulacao.MESTRADO);
        }else{
            professor.setTitulacao(Titulacao.DOUTORADO);
        }
        
        turma.setProfessor(professor);
        
        TelaAluno tela1 = new TelaAluno(this, true);
        
        tela1.setVisible(true);
        turma.incluirAluno(tela1.getAluno());
    }//GEN-LAST:event_jBtnIncluirAlunoActionPerformed

    private void jBtnListarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnListarDadosActionPerformed
        // TODO add your handling code here:
        TelaRelatorio tela2 = new TelaRelatorio(this, true);
        if(turma == null) {
            System.out.println("Turma esta null!");
        }
       
        tela2.setText("Turno : " + turma.getTurno().toString());
        tela2.setText("-----------------------------");
<<<<<<< HEAD
        tela2.setText("Professor: " + turma.getProfessor().getNome());
        tela2.setText("Titulacao: " + turma.getProfessor().getTitulacao().toString());
        tela2.setText("-----------------------------");
        tela2.setText("Total de alunos: " + turma.getAlunos().size());
        turma.getAlunos().forEach((estudante) -> tela2.setText(estudante.toString() + "\n"));
        tela2.setText("Aluno(a) com a melhor nota: " + turma.obterMelhorNotaEnem().toString());
=======
        tela2.setText("Professor: " + turma.getProfessor());
        tela2.setText("Titulacao: " + turma.getProfessor().getTitulacao().toString());
        tela2.setText("-----------------------------");
        tela2.setText("Total de alunos: " + turma.getAlunos().size());
        turma.getAlunos().forEach((estudante) -> tela2.setText(estudante + "\n"));
        tela2.setText("Aluno(a) com a melhor nota: " + turma.obterMelhorNotaEnem());
>>>>>>> e5da6513f3e111f0b2238aaba04c5281a54dd422
        
        tela2.setVisible(true);
    }//GEN-LAST:event_jBtnListarDadosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrTitulacao;
    private javax.swing.ButtonGroup btnGrTurno;
    private javax.swing.JButton jBtnIncluirAluno;
    private javax.swing.JButton jBtnListarDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRdbDoutorado;
    private javax.swing.JRadioButton jRdbGraduacao;
    private javax.swing.JRadioButton jRdbMatutino;
    private javax.swing.JRadioButton jRdbMestrado;
    private javax.swing.JRadioButton jRdbNoturno;
    private javax.swing.JRadioButton jRdbVespertino;
    private javax.swing.JTextField jTfdDisciplina;
    private javax.swing.JTextField jTfdEmail;
    private javax.swing.JTextField jTfdNome;
    // End of variables declaration//GEN-END:variables
}
