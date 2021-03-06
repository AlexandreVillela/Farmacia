package view;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        Pedido = new javax.swing.JMenuBar();
        MenuCliente = new javax.swing.JMenu();
        itenCadastroCliente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuFuncionario = new javax.swing.JMenu();
        itenCadastroFuncionario = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        MenuItens = new javax.swing.JMenu();
        itenCadastroItens = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        MenuPedido = new javax.swing.JMenu();
        itenCadastroNovoPedido = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuCliente.setText("Cliente");

        itenCadastroCliente.setText("Adicionar");
        itenCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itenCadastroClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(itenCadastroCliente);

        jMenuItem2.setText("Remover");
        MenuCliente.add(jMenuItem2);

        jMenuItem3.setText("Atualizar");
        MenuCliente.add(jMenuItem3);

        jMenuItem8.setText("Historico de pedidos");
        MenuCliente.add(jMenuItem8);

        jMenuItem1.setText("Vizualizar Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuCliente.add(jMenuItem1);

        Pedido.add(MenuCliente);

        MenuFuncionario.setText("Funcionario");

        itenCadastroFuncionario.setText("Adicionar");
        itenCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itenCadastroFuncionarioActionPerformed(evt);
            }
        });
        MenuFuncionario.add(itenCadastroFuncionario);

        jMenuItem5.setText("Remover");
        MenuFuncionario.add(jMenuItem5);

        jMenuItem6.setText("Atualizar");
        MenuFuncionario.add(jMenuItem6);

        jMenuItem7.setText("Calcular Salario");
        MenuFuncionario.add(jMenuItem7);

        Pedido.add(MenuFuncionario);

        MenuItens.setText("Itens");

        itenCadastroItens.setText("Adicionar");
        itenCadastroItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itenCadastroItensActionPerformed(evt);
            }
        });
        MenuItens.add(itenCadastroItens);

        jMenuItem10.setText("Remover");
        MenuItens.add(jMenuItem10);

        jMenuItem11.setText("Atualizar");
        MenuItens.add(jMenuItem11);

        Pedido.add(MenuItens);

        MenuPedido.setText("Pedido");

        itenCadastroNovoPedido.setText("Novo Pedido");
        itenCadastroNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itenCadastroNovoPedidoActionPerformed(evt);
            }
        });
        MenuPedido.add(itenCadastroNovoPedido);

        Pedido.add(MenuPedido);

        setJMenuBar(Pedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //itensMenuCadastro
    private void itenCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itenCadastroClienteActionPerformed
        FrmCadastroCliente frmCadUse = new FrmCadastroCliente();
        frmCadUse.setVisible(true);
    }//GEN-LAST:event_itenCadastroClienteActionPerformed

    private void itenCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itenCadastroFuncionarioActionPerformed
        FrmCadastrarFuncionario frmCadUse = new FrmCadastrarFuncionario();
        frmCadUse.setVisible(true);
    }//GEN-LAST:event_itenCadastroFuncionarioActionPerformed

    private void itenCadastroItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itenCadastroItensActionPerformed
        FrmCadastrarItens frmCadUse =  new FrmCadastrarItens();
        frmCadUse.setVisible(true);
    }//GEN-LAST:event_itenCadastroItensActionPerformed

    private void itenCadastroNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itenCadastroNovoPedidoActionPerformed
        FrmCadastrarPedido frmCadUse = new FrmCadastrarPedido();
        frmCadUse.setVisible(true);
    }//GEN-LAST:event_itenCadastroNovoPedidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmVizualizarClientes frmCadUse = new FrmVizualizarClientes();
        frmCadUse.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuFuncionario;
    private javax.swing.JMenu MenuItens;
    private javax.swing.JMenu MenuPedido;
    private javax.swing.JMenuBar Pedido;
    private javax.swing.JMenuItem itenCadastroCliente;
    private javax.swing.JMenuItem itenCadastroFuncionario;
    private javax.swing.JMenuItem itenCadastroItens;
    private javax.swing.JMenuItem itenCadastroNovoPedido;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}
