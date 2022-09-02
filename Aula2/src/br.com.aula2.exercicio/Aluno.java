public class Aluno {
    private String nome;
    private int matricula;
    private float notaAV1, notaAV2, notaAE;
    private String curso;
    private int periodo;

    public Aluno(String nome, int matricula, float notaAV1, float notaAV2, float notaAE, String curso, int periodo){
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
        this.curso = curso;
        this.periodo = periodo;

    }
}
