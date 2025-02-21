import aula01.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno(); // nova instancia; novo objeto da classe
aluno1.nome = "Jansen";
aluno1.altura = 1.65;
System.out.println("Nome do aluno " + aluno1.nome);
System.out.println("Altura do aluno " + aluno1.altura);

aluno1.nome = "Ayla";
System.out.println("Nome do aluno " + aluno1.nome);

aluno1.estudar();
    }
}
