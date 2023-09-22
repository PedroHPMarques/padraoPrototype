import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Personagem personagem = new Personagem("Pedro", 8, 80.0f, 1.7f, new Habilidade("Fogo", "Velocidade"));

        Personagem personagemClone = personagem.clone();
        personagemClone.setNivel(11);
        personagemClone.setNome("Pedro Clonado");
        personagemClone.getHabilidade().setHabilidadeEspecial("Gelo");

        assertEquals("Personagem{nome=Pedro, nivel=8, altura=1.7, peso=80.0, habilidade=Habilidade{habilidade Especial='Fogo', habilidade Basica='Velocidade}'}", personagem.toString());
        assertEquals("Personagem{nome=Pedro Clonado, nivel=11, altura=1.7, peso=80.0, habilidade=Habilidade{habilidade Especial='Gelo', habilidade Basica='Velocidade}'}", personagemClone.toString());
    }

}