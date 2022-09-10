import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameTest {

    @Test
    public void deveTestarTrigliceridesNegativo() {
        try {
            Exame exame = new Exame();
            exame.setTriglicerides(-1);
            exame.obterNivelTriglicerides();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Triglicerides deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarTriglicerideZerado() {
        try {
            Exame exame = new Exame();
            exame.setTriglicerides(0);
            exame.obterNivelTriglicerides();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Triglicerides deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarTrigliceridesDesejavel() {
        Exame exame = new Exame();
        exame.setTriglicerides(149);
        assertEquals("Nivel desejável", exame.obterNivelTriglicerides());
    }

    @Test
    public void deveTestarTrigliceridesLimitrofe() {
        Exame exame = new Exame();
        exame.setTriglicerides(199);
        assertEquals("Nível limitrofe", exame.obterNivelTriglicerides());
    }

    @Test
    public void deveTestarTrigliceridesAlto() {
        Exame exame = new Exame();
        exame.setTriglicerides(499);
        assertEquals("Nível alto", exame.obterNivelTriglicerides());
    }

    @Test
    public void deveTestarTrigliceridesMuitoAlto() {
        Exame exame = new Exame();
        exame.setTriglicerides(500);
        assertEquals("Nível muito alto", exame.obterNivelTriglicerides());
    }

    @Test
    public void deveTestarColesterolTotalNegativo() {
        try {
            Exame exame = new Exame();
            exame.setColesterolTotal(-1);
            exame.obterNivelColesterolTotal();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Colesterol total deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarColesterolTotalZerado() {
        try {
            Exame exame = new Exame();
            exame.setColesterolTotal(0);
            exame.obterNivelColesterolTotal();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Colesterol total deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarColesterolTotalDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolTotal(199);
        assertEquals("Desejável", exame.obterNivelColesterolTotal());
    }

    @Test
    public void deveTestarColesterolTotalLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolTotal(239);
        assertEquals("Limítrofe", exame.obterNivelColesterolTotal());
    }

    @Test
    public void deveTestarColesterolTotalElevado() {
        Exame exame = new Exame();
        exame.setColesterolTotal(240);
        assertEquals("Elevado", exame.obterNivelColesterolTotal());
    }
}