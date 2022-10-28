import javax.swing.*;
import javafx.scene.paint.Color;

public class Tela extends JFrame {

    private JTextArea txtArea;
    private String[] opcoes = {"High","Medium","Low"};
    private JComboBox<String> Options;

    public Tela(){
    
        setTitle("Tarefas");
        setSize(1280,720);
        setVisible(true);
        frameConfig();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void frameConfig(){
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Tarefa");
        label.setBounds(50,10,100,30);
        label.setOpaque(true);

        campoTextArea = new JTextArea(50,100);
        campoTextArea.setBounds(40,50,690,80);
        campoTextArea.setBorder(BorderFactory.createLineBorder(getForeground()));

        JLabel label2 = new JLabel("Priority");
        label2.setBounds(40,190,90,50);
        label2.setOpaque(true);

        Options = new JComboBox<>(opcoes);
        Options.setBounds(50,260,700,30);

        JButton Botao = new JButton("Save");
        Botao.setBounds(650, 380, 100, 25);

        JButton Cancell = new JButton("Cancell");
        Cancell.setBounds(530, 380, 100, 25);

        panel.add(label);

        panel.add(label2);

        panel.add(Options);

        panel.add(txtArea);

        panel.add(Botao);

        panel.add(Cancell);
        
        add(panel);
    }

}
