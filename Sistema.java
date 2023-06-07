import javax.swing.JOptionPane;

public class Sistema {
    public static void main(String[] entrada) {
        //var:
        int n1, n2;
        double quo, pot;
        //entradas:
        n1 = Integer.parseInt (JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        //processamento:
        quo = n1/n2;
        pot = (double) Math.pow(n1,n2);
        //saídas:
        JOptionPane.showMessageDialog(null, "Potencia: " + pot);
        JOptionPane.showMessageDialog(null, "Quociente: " + quo);
    }
}

