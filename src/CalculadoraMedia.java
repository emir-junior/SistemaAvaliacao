import javax.swing.JOptionPane;

public class CalculadoraMedia {
    public static void main(String[] args) {
        // primeira prova
            String notaProva1Str = JOptionPane.showInputDialog("Digite nota da Primeira Prova:(Entre 0 e 10)");
            double notaProva1 = Double.parseDouble(notaProva1Str);

        // segunda prova
        String notaProva2Str = JOptionPane.showInputDialog("Digite nota da Segunda Prova:(Entre 0 e 10)");
        double notaProva2 = Double.parseDouble(notaProva2Str);

        // trabalho
        String notaTrabalhoStr = JOptionPane.showInputDialog("Digite nota do Trabalho:(Entre 0 e 10)");
        double notaTrabalho = Double.parseDouble(notaTrabalhoStr);

        // média das notas
        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

        // se o aluno está aprovado ou reprovado
        String status = (media >= 6) ? "Aprovado" : "Reprovado";

        // Situação do aluno
        JOptionPane.showMessageDialog(null, "Média: " + media + "\nSituação: " + status);
    }
}
