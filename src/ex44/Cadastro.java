package ex44;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {

    static JTextField txtcodigo, txtnome, txtestado, txtcidade, txtbairro, txtcomplemento;

    public Cadastro() {
        this.criarTela();
        this.campos();
    }

    public void criarTela() {
        this.setTitle("Cadastro");
        this.setSize(500, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void campos() {
        setLayout(new BorderLayout());

        JPanel painelCampos = new JPanel(new GridLayout(10, 5, 2, 4));
        painelCampos.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel lblcodigo = new JLabel("Codigo");
        txtcodigo = new JTextField(15);

        JLabel lblnome = new JLabel("Nome");
        txtnome = new JTextField(15);

        JLabel lblestado = new JLabel("Estado");
        txtestado = new JTextField(15);

        JLabel lblcidade = new JLabel("Cidade");
        txtcidade = new JTextField(15);

        JLabel lblbairro = new JLabel("Bairro");
        txtbairro = new JTextField(15);

        JLabel lblcomplemento = new JLabel("Complemento");
        txtcomplemento = new JTextField(15);

        painelCampos.add(lblcodigo);
        painelCampos.add(txtcodigo);

        painelCampos.add(lblnome);
        painelCampos.add(txtnome);

        painelCampos.add(lblestado);
        painelCampos.add(txtestado);

        painelCampos.add(lblcidade);
        painelCampos.add(txtcidade);

        painelCampos.add(lblbairro);
        painelCampos.add(txtbairro);

        painelCampos.add(lblcomplemento);
        painelCampos.add(txtcomplemento);

        add(painelCampos, BorderLayout.NORTH);

        JPanel painelbotao = new JPanel(new GridLayout(1, 5, 2, 4));
        painelbotao.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        NovoAction novoAction = new NovoAction();
        JButton btnnovo = new JButton("Novo");
        btnnovo.addActionListener(novoAction);

        SalvarAction salvarAction = new SalvarAction();
        JButton btnsalvar = new JButton("Salvar");
        btnsalvar.addActionListener(salvarAction);

        ApagarAction apagarAction = new ApagarAction();
        JButton btnapagar = new JButton("Apagar");
        btnapagar.addActionListener(apagarAction);

        painelbotao.add(btnnovo);
        painelbotao.add(btnsalvar);
        painelbotao.add(btnapagar);

        add(painelbotao, BorderLayout.SOUTH);

        JPanel painelbotaocima = new JPanel();
        ConsultarAction consultarAction = new ConsultarAction();
        JButton btnocima = new JButton("Consultar");
        btnocima.addActionListener(consultarAction);

        painelbotaocima.add(btnocima);
        add(painelbotaocima, BorderLayout.CENTER);

        this.pack();
    }

    private static class SalvarAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            JOptionPane.showMessageDialog(null, " Codigo: " + txtcodigo.getText());
            JOptionPane.showMessageDialog(null, " Nome: " + txtnome.getText());

            
        }
    }

    private static class ApagarAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtcodigo.setText("");
            txtnome.setText("");
            txtestado.setText("");
            txtcidade.setText("");
            txtbairro.setText("");
            txtcomplemento.setText("");
        }
    }

    private static class ConsultarAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Consulta realizada!");
            
            
        }
    }

    class NovoAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtcodigo.setText("");
            txtnome.setText("");
            txtestado.setText("");
            txtcidade.setText("");
            txtbairro.setText("");
            txtcomplemento.setText("");
            JOptionPane.showMessageDialog(null, "Novo registro iniciado!");
        }
    }
}