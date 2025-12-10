/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package views;

import dao.TarefaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import bean.Tarefas;
import bean.Categorias;
import dao.UsuarioDAO;
import dao.TarefaDAO;
import dao.CategoriaDAO;

/**
 *
 * @author gregory
 */
public class TelaCategoria extends javax.swing.JInternalFrame {
    // Criar um atributo para o tipo de produto (bean)
    Categorias minhaCategoria = null;

    /** Creates new form TelaTipoProduto */
    public TelaCategoria() {
        initComponents();
        
        preencherTabela();
    }
    
    // Método para limpar os campos
    public void limpar() {
        txtNome.setText("");
    }
    
    // Método para preencher a tabela
    public void preencherTabela() {
        DefaultTableModel dtm = (DefaultTableModel) tblCadastradosss.getModel();
        dtm.setRowCount(0);
        CategoriaDAO dao = new CategoriaDAO();
        
        for(Categorias t : dao.read()) {
            dtm.addRow(new Object[] {
                t.getId_categoria(),
                t.getNome(),
                t.getDescricao()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblCadastrados1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCadastrados2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCadastrados3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCadastradosss = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadastrados = new javax.swing.JTable();

        tblCadastrados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-mail", "Senha"
            }
        ));
        jScrollPane2.setViewportView(tblCadastrados1);

        tblCadastrados2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-mail", "Senha"
            }
        ));
        tblCadastrados2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastrados2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCadastrados2);

        tblCadastrados3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-mail", "Senha"
            }
        ));
        tblCadastrados3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastrados3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCadastrados3);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gerenciar Tipo de Produto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Tipo de Produto"));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Descricao");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        tblCadastradosss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ));
        tblCadastradosss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastradosssMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblCadastradosss);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(txtNome))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricao)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição"
            }
        ));
        tblCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCadastrados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // Construir um objeto do TipoProdmeuTipoProdutoo
        minhaCategoria = new Categorias();
        minhaCategoria.setDescricao(txtNome.getText());
        minhaCategoria.setNome(txtNome.getText());
        
        // Invocar o método create da classe DAO
        CategoriaDAO dao = new CategoriaDAO();
        dao.create(minhaCategoria);
        
        // Limpar os campos e preencher novamente a tabela
        limpar();
        preencherTabela();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tblCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastradosMouseClicked
        // TODO add your handling code here:
        int linha = tblCadastrados.getSelectedRow();
        String id = tblCadastrados.getValueAt(linha, 0).toString();
        
        if(linha != -1) {
            CategoriaDAO dao = new CategoriaDAO();
            minhaCategoria = dao.read(Integer.parseInt(id));
            
            // PreenchmeuTipoProduto os campos do formulário
            txtNome.setText(minhaCategoria.getDescricao());
        }
    }//GEN-LAST:event_tblCadastradosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        minhaCategoria.setDescricao(txtNome.getText());
        
        CategoriaDAO dao = new CategoriaDAO();
        dao.update(minhaCategoria);
        
        limpar();
        preencherTabela();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Confirmar se realmente deseja excluir
        if (minhaCategoria != null) {
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este tipo de produto?") == JOptionPane.YES_OPTION) {
                CategoriaDAO dao = new CategoriaDAO();
                dao.destroy(minhaCategoria);
                
                limpar();
                preencherTabela();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void tblCadastrados2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastrados2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblCadastrados2MouseClicked

    private void tblCadastrados3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastrados3MouseClicked
    
    }//GEN-LAST:event_tblCadastrados3MouseClicked

    private void tblCadastradosssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastradosssMouseClicked
        // TODO add your handling code here:
         int linha = tblCadastrados.getSelectedRow();
        String id = tblCadastrados.getValueAt(linha, 0).toString();

        if(linha != -1) {
            CategoriaDAO dao = new CategoriaDAO();
            minhaCategoria = dao.read(Integer.parseInt(id));

            // PreenchmeuTipoProduto os campos do formulário
            txtNome.setText(minhaCategoria.getNome());
            txtDescricao.setText(minhaCategoria.getDescricao());
           
        }
    }//GEN-LAST:event_tblCadastradosssMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblCadastrados;
    private javax.swing.JTable tblCadastrados1;
    private javax.swing.JTable tblCadastrados2;
    private javax.swing.JTable tblCadastrados3;
    private javax.swing.JTable tblCadastradosss;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
