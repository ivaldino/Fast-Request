package br.com.fastrequest.view;


import Excecoes.PrecoNaoRecebeString;
import br.com.fastrequest.controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Thiagoo
 * 
 * 
 */
public class TelaProdutos extends javax.swing.JFrame {
   
	/**
	 * Creates new form ExemploFRM
	 */

    private JButton btnCancelar1;
    
    
	public TelaProdutos() {
		initComponents();
                
	}

	public JButton getBtnAlterarProduto() {
		return btnAlterarProduto;
	}

	public void setBtnAlterarProduto(JButton btnAlterarProduto) {
		this.btnAlterarProduto = btnAlterarProduto;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JButton getBtnCancelar1() {
		return btnCancelar1;
	}

	public void setBtnCancelar1(JButton btnCancelar1) {
		this.btnCancelar1 = btnCancelar1;
	}

	public JButton getBtnDeletarProduto() {
		return btnDeletarProduto;
	}

	public void setBtnDeletarProduto(JButton btnDeletarProduto) {
		this.btnDeletarProduto = btnDeletarProduto;
	}

	public JButton getBtnIncluirProduto() {
		return btnIncluirProduto;
	}

	public void setBtnIncluirProduto(JButton btnIncluirProduto) {
		this.btnIncluirProduto = btnIncluirProduto;
	}

	public JLabel getIdCadastrar() {
		return idCadastrar;
	}

	public void setIdCadastrar(JLabel idCadastrar) {
		this.idCadastrar = idCadastrar;
	}

	public JLabel getIdPesquisar() {
		return idPesquisar;
	}

	public void setIdPesquisar(JLabel idPesquisar) {
		this.idPesquisar = idPesquisar;
	}

	public JTable getTabelaProdutos() {
		return tabelaProdutos;
	}

	public void setTabelaProdutos(JTable tabelaProdutos) {
		this.tabelaProdutos = tabelaProdutos;
	}

	public JTextField getTxtDescicao() {
		return txtDescicao;
	}

    public JTextField getTxtDescicao1() {
        return txtDescicao1;
    }

    public void setTxtDescicao1(JTextField txtDescicao1) {
        this.txtDescicao1 = txtDescicao1;
    }

    public JTextField getTxtNome1() {
        return txtNome1;
    }

    public void setTxtNome1(JTextField txtNome1) {
        this.txtNome1 = txtNome1;
    }

    public JTextField getTxtPreco1() {
        return txtPreco1;
    }

    public void setTxtPreco1(JTextField txtPreco1) {
        this.txtPreco1 = txtPreco1;
    }

	public void setTxtDescicao(JTextField txtDescicao) {
		this.txtDescicao = txtDescicao;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtPreco() {
		return txtPreco;
	}

	public void setTxtPreco(JTextField txtPreco) {
		this.txtPreco = txtPreco;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescicao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnAlterarProduto = new javax.swing.JButton();
        btnDeletarProduto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        idPesquisar = new javax.swing.JLabel();
        btnCancelar2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCasdastrar = new javax.swing.JList();
        btnIncluirProduto = new javax.swing.JButton();
        idCadastrar = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        txtDescicao1 = new javax.swing.JTextField();
        txtPreco1 = new javax.swing.JTextField();
        btnCancelar3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        imagemLogo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Descricao");

        jLabel4.setText("Preco");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaProdutos);

        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        btnDeletarProduto.setText("Deletar");
        btnDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProdutoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCancelar2.setText("Pesquisar");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescicao, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar2)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAlterarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)))))
                .addContainerGap(482, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idPesquisar)
                .addGap(64, 64, 64))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar2)
                .addGap(8, 8, 8)
                .addComponent(idPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarProduto)
                    .addComponent(btnDeletarProduto)
                    .addComponent(btnCancelar))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pesquisar", jPanel5);

        jLabel5.setText("Descricao");

        jLabel6.setText("Preco");

        jLabel7.setText("Nome");

        jListCasdastrar.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListCasdastrar);

        btnIncluirProduto.setText("Cadastrar");
        btnIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirProdutoActionPerformed(evt);
            }
        });

        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });

        txtPreco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreco1ActionPerformed(evt);
            }
        });

        btnCancelar3.setText("Cancelar");
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(273, 273, 273)
                                    .addComponent(idCadastrar)
                                    .addGap(117, 117, 117))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnIncluirProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addComponent(btnCancelar3))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                        .addComponent(txtDescicao1)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(435, 435, 435)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDescicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(idCadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIncluirProduto)
                            .addComponent(btnCancelar3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Satus dos Pedidos", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        imagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/logo 1.jpg")));
        imagemLogo.setPreferredSize(new java.awt.Dimension(1024, 150));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagemLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(imagemLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPreco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreco1ActionPerformed

    private void btnIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProdutoActionPerformed
        // TODO add your handling code here:
        
        
        btnIncluirProduto.addActionListener(new ActionListener() {

              @Override
              public void actionPerformed(ActionEvent ae) {
              
                  

    try{
    Controller control = new Controller();
    
    control.inserirNoBD(txtNome1.getText(), txtDescicao1.getText(), 
            Double.parseDouble(txtPreco1.getText()));
    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
    }catch(PrecoNaoRecebeString e1){
         JOptionPane.showMessageDialog(null, "Favor nao inserir letras no campo Preco");
    }



                   
              }
          });
        
      DefaultListModel model = new DefaultListModel();
      
      jListCasdastrar.setModel(new DefaultListModel());
      
      model.clear();
      
      model.addElement(txtNome1.getText());
      model.addElement(txtDescicao1.getText());
    
    }//GEN-LAST:event_btnIncluirProdutoActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar3ActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

	private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnCancelarActionPerformed

	private void btnDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeletarProdutoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnDeletarProdutoActionPerformed

	private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNomeActionPerformed

	private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelar1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnCancelar1ActionPerformed

	private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNome1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNome1ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaProdutos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaProdutos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaProdutos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaProdutos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaProdutos().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnDeletarProduto;
    private javax.swing.JButton btnIncluirProduto;
    private javax.swing.JLabel idCadastrar;
    private javax.swing.JLabel idPesquisar;
    private javax.swing.JLabel imagemLogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jListCasdastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtDescicao;
    private javax.swing.JTextField txtDescicao1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtPreco1;
    // End of variables declaration//GEN-END:variables

}
