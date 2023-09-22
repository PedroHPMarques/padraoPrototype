public class Habilidade implements Cloneable {

    private String habilidadeEspecial;
    private String habilidadeBasica;


    public Habilidade(String habilidadeEspecial, String habilidadeBasica){
        super();
        this.habilidadeEspecial = habilidadeEspecial;
        this.habilidadeBasica = habilidadeBasica;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getHabilidadeBasica() {
        return habilidadeBasica;
    }

    public void setHabilidadeBasica(String habilidadeBasica) {
        this.habilidadeBasica = habilidadeBasica;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Habilidade{" +
                "habilidade Especial='" + habilidadeEspecial + '\'' +
                ", habilidade Basica='" + habilidadeBasica +
                '}';
    }


}
