import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tarefas extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel label;
    private JButton botaoAdicionar;
    private JButton botaoExcluir;
    private JButton botaoReagendar;
    private JCalendar calendario;

    public Tarefas() {
        super("Gerenciador de Tarefas");
        setLayout(new FlowLayout());
        label = new JLabel("Gerenciador de Tarefas");
        add(label);
        calendario = new JCalendar();
        add(calendario);
        botaoAdicionar = new JButton("Adicionar");
        add(botaoAdicionar);
        botaoExcluir = new JButton("Excluir");
        add(botaoExcluir);
        botaoReagendar = new JButton("Reagendar");
        add(botaoReagendar);
    }

    public static void main(String[] args) {
        Tarefas tarefas = new Tarefas();
        tarefas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tarefas.setSize(400, 300);
        tarefas.setVisible(true);
    }
}