public class Main {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Ana",123,20,30,0,"ADS",3);
        System.out.println(aluno1.avaliarAluno());
        System.out.println(aluno1.avaliarRecuperacao());
        aluno1.alteraNotaAE(70);
        System.out.println("Alterar nota da Prova Especial");
        System.out.println(aluno1.avaliarRecuperacao());


    }

}
