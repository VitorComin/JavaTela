import javax.swing.*;


public class Tela extends JFrame {

    private JTextArea TextArea;
    private JComboBox<String> Options;
    private String[] opcoes = {"Low","Medium","High"};

    public Tela(){

        setTitle("Tasks");
        setSize(800,500);
        configurarJanela();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void configurarJanela() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Task");
        label.setBounds(50,10,100,30);
        label.setOpaque(true);

        TextArea = new JTextArea(100,100);
        TextArea.setBounds(60,50,690,80);
        TextArea.setBorder(BorderFactory.createLineBorder(getForeground()));

        Options = new JComboBox<>(opcoes);
        Options.setBounds(50,260,700,30);

        JLabel label2 = new JLabel("Priority");
        label2.setBounds(50,200,100,60);
        label2.setOpaque(true);

        JButton save = new JButton("save");
        save.setBounds(650, 380, 100, 25);

        JButton cancelarBotao = new JButton("Cancell");
        cancelarBotao.setBounds(530, 380, 100, 25);

        panel.add(label);

        panel.add(label2);

        panel.add(save);

        panel.add(cancelarBotao);

        panel.add(Options);

        panel.add(TextArea);
        
        add(panel);
    }

}
