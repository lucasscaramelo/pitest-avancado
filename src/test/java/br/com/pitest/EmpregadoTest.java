package br.com.pitest;

import org.junit.Assert;
import org.junit.Test;

public class EmpregadoTest {

    @Test
    public void comNome() {
        Empregado empregado = new Empregado("Lucas", "Programador", (float) 10000);
        String expected = "Olá! Meu nome é Lucas e meu cargo é Programador.";
        String result = empregado.introducao();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void semNome() {
        Empregado empregado = new Empregado("", "Programador", (float) 10000);
        String expected = "Empregado sem nome";
        String result = empregado.introducao();
        Assert.assertEquals(expected, result);
    }
}
