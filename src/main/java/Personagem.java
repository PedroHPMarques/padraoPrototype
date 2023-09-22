public class Personagem implements Cloneable {
    private String nome;
    private int nivel;
    private float peso;
    private float altura;
    private Habilidade habilidade;

    public Personagem(String nome,int nivel,float peso,float altura,Habilidade habilidade) {
        this.nome = nome;
        this.nivel = nivel;
        this.peso = peso;
        this.altura = altura;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem personagemClone = (Personagem) super.clone();
        personagemClone.habilidade = (Habilidade) personagemClone.habilidade.clone();
        return personagemClone;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome=" + nome +
                ", nivel=" + nivel +
                ", altura=" + altura +
                ", peso=" + peso +
                ", habilidade=" + habilidade + '\'' +
                '}';
    }
}
