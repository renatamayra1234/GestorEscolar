/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author guest.jb
 */
public class RelatoriosConsultas extends javax.swing.JFrame {

    
    public RelatoriosConsultas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Usuários");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Turmas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alunos por Turma");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Boletim");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Média Final");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Relatórios e Consultas");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane5.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane6.setViewportView(jTextArea5);

        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(47, 47, 47)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4))
                        .addGap(104, 104, 104)
                        .addComponent(jButton5)
                        .addGap(61, 61, 61))))
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addGap(32, 32, 32)
                .addComponent(jButton6)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Connection conn = conexao.Conexao.conectar();
            String sql = "SELECT id_usuario, usuario FROM login";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            jTextArea1.setText("");
            while (rs.next()) {
                jTextArea1.append(rs.getInt("id_usuario") + " - " + rs.getString("usuario") + "\n");
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Connection conn = conexao.Conexao.conectar();
            String sql = "SELECT id_turma, nome FROM turma";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            jTextArea2.setText("");
            while (rs.next()) {
                jTextArea2.append(rs.getInt("id_turma") + " - " + rs.getString("nome") + "\n");
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Connection conn = conexao.Conexao.conectar();

            String sqlTurmas = "SELECT id_turma, nome FROM turma";
            PreparedStatement stmtTurmas = conn.prepareStatement(sqlTurmas);
            ResultSet rsTurmas = stmtTurmas.executeQuery();

            jTextArea3.setText("");
            while (rsTurmas.next()) {
                int idTurma = rsTurmas.getInt("id_turma");
                String nomeTurma = rsTurmas.getString("nome");

                jTextArea3.append("== " + nomeTurma + " ==\n");

                String sqlAlunos = "SELECT nome FROM aluno WHERE id_turma=?";
                PreparedStatement stmtAlunos = conn.prepareStatement(sqlAlunos);
                stmtAlunos.setInt(1, idTurma);
                ResultSet rsAlunos = stmtAlunos.executeQuery();

                while (rsAlunos.next()) {
                    jTextArea3.append("- " + rsAlunos.getString("nome") + "\n");
                }
                stmtAlunos.close();
            }
            stmtTurmas.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Connection conn = conexao.Conexao.conectar();

            String sqlAlunos = "SELECT id_aluno, nome FROM aluno ORDER BY nome";
            PreparedStatement stmtAlunos = conn.prepareStatement(sqlAlunos);
            ResultSet rsAlunos = stmtAlunos.executeQuery();

            jTextArea4.setText("");
            while (rsAlunos.next()) {
                int idAluno = rsAlunos.getInt("id_aluno");
                String nomeAluno = rsAlunos.getString("nome");

                jTextArea4.append("== " + nomeAluno + " ==\n");

                String sqlNotas = "SELECT nota FROM nota WHERE id_aluno=?";
                PreparedStatement stmtNotas = conn.prepareStatement(sqlNotas);
                stmtNotas.setInt(1, idAluno);
                ResultSet rsNotas = stmtNotas.executeQuery();

                while (rsNotas.next()) {
                    jTextArea4.append("Nota: " + rsNotas.getDouble("nota") + "\n");
                }
                stmtNotas.close();
            }
            stmtAlunos.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Connection conn = conexao.Conexao.conectar();

            String sqlAlunos = "SELECT id_aluno, nome, id_turma FROM aluno ORDER BY nome";
            PreparedStatement stmtAlunos = conn.prepareStatement(sqlAlunos);
            ResultSet rsAlunos = stmtAlunos.executeQuery();

            jTextArea5.setText("");
            while (rsAlunos.next()) {
                int idAluno = rsAlunos.getInt("id_aluno");
                String nomeAluno = rsAlunos.getString("nome");
                int idTurma = rsAlunos.getInt("id_turma");

                
                String sqlTurma = "SELECT nome FROM turma WHERE id_turma=?";
                PreparedStatement stmtTurma = conn.prepareStatement(sqlTurma);
                stmtTurma.setInt(1, idTurma);
                ResultSet rsTurma = stmtTurma.executeQuery();
                String nomeTurma = "";
                if (rsTurma.next()) {
                    nomeTurma = rsTurma.getString("nome");
                }
                stmtTurma.close();

                
                String sqlNotas = "SELECT nota FROM nota WHERE id_aluno=?";
                PreparedStatement stmtNotas = conn.prepareStatement(sqlNotas);
                stmtNotas.setInt(1, idAluno);
                ResultSet rsNotas = stmtNotas.executeQuery();

                double soma = 0;
                int quantidade = 0;
                while (rsNotas.next()) {
                    soma = soma + rsNotas.getDouble("nota");
                    quantidade = quantidade + 1;
                }
                stmtNotas.close();

                if (quantidade > 0) {
                    double media = soma / quantidade;
                    jTextArea5.append(nomeAluno + " (" + nomeTurma + "): " + media + "\n");
                } else {
                    jTextArea5.append(nomeAluno + " (" + nomeTurma + "): sem notas\n");
                }
            }
            stmtAlunos.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        MenuPrincipal tela = new MenuPrincipal();
        tela.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(RelatoriosConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatoriosConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatoriosConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatoriosConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatoriosConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
