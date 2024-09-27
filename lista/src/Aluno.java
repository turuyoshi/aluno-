public class Aluno { 
    private String nome; //encapsulado

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
@Override
public String toString() {
    return this.nome;
}
@Override
public boolean equals(Object obj) {
    Aluno oAluno = (Aluno) obj;
    return this.nome.equals(oAluno.nome);
    
}
}
