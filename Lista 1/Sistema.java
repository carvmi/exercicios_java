import javax.swing.JOptionPane;
//desenvolva um programa em Java que declara variáveis inteiras, reais e String,
//recebe dois números inteiros usando interface com usuário,
//calcula o quociente da divisão dos dois números, 
//a potência do primeiro número pelo segundo número 
//e mostra essas informações usando interface com usuário.
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

