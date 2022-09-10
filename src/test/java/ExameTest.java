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
        } catch (IllegalArgumentException e) {
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
        } catch (IllegalArgumentException e) {
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
        } catch (IllegalArgumentException e) {
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
        } catch (IllegalArgumentException e) {
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

    @Test
    public void deveTestarColesterolHDLNegativo() {
        try {
            Exame exame = new Exame();
            exame.setColesterolHDL(-1);
            exame.obterNivelColesterolHDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Colesterol HDL deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarColesterolHDLZerado() {
        try {
            Exame exame = new Exame();
            exame.setColesterolHDL(0);
            exame.obterNivelColesterolHDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Colesterol HDL deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarColesterolHDLBaixo() {
        Exame exame = new Exame();
        exame.setColesterolHDL(39);
        assertEquals("Baixo", exame.obterNivelColesterolHDL());
    }

    @Test
    public void deveTestarColesterolHDLNormal() {
        Exame exame = new Exame();
        exame.setColesterolHDL(60);
        assertEquals("Normal", exame.obterNivelColesterolHDL());
    }

    @Test
    public void deveTestarColesterolHDLDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolHDL(61);
        assertEquals("Desejável", exame.obterNivelColesterolHDL());
    }

    @Test
    public void deveTestarColesterolLDLNegativo() {
        try {
            Exame exame = new Exame();
            exame.setColesterolLDL(-1);
            exame.obterNivelColesterolLDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Colesterol LDL deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarColesterolLDLZerado() {
        try {
            Exame exame = new Exame();
            exame.setColesterolLDL(0);
            exame.obterNivelColesterolLDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Colesterol LDL deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarColesterolLDLOtimo() {
        Exame exame = new Exame();
        exame.setColesterolLDL(99);
        assertEquals("Ótimo", exame.obterNivelColesterolLDL());
    }

    @Test
    public void deveTestarColesterolLDLDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolLDL(129);
        assertEquals("Desejável", exame.obterNivelColesterolLDL());
    }

    @Test
    public void deveTestarColesterolLDLLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolLDL(159);
        assertEquals("Limítrofe", exame.obterNivelColesterolLDL());
    }

    @Test
    public void deveTestarColesterolLDLAlto() {
        Exame exame = new Exame();
        exame.setColesterolLDL(189);
        assertEquals("Alto", exame.obterNivelColesterolLDL());
    }

    @Test
    public void deveTestarColesterolLDLMuitoAlto() {
        Exame exame = new Exame();
        exame.setColesterolLDL(190);
        assertEquals("Muito alto", exame.obterNivelColesterolLDL());
    }

    @Test
    public void deveTestarColesterolVLDLNegativo() {
        try {
            Exame exame = new Exame();
            exame.setColesterolVLDL(-1);
            exame.obterNivelColesterolVLDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Colesterol VLDL deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarColesterolVLDLZerado() {
        try {
            Exame exame = new Exame();
            exame.setColesterolVLDL(0);
            exame.obterNivelColesterolVLDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Colesterol VLDL deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarColesterolVLDLDesejavel() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(29);
        assertEquals("Nivel desejável", exame.obterNivelColesterolVLDL());
    }

    @Test
    public void deveTestarColesterolVLDLLimitrofe() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(40);
        assertEquals("Nivel limítrofe", exame.obterNivelColesterolVLDL());
    }

    @Test
    public void deveTestarColesterolVLDLElevado() {
        Exame exame = new Exame();
        exame.setColesterolVLDL(41);
        assertEquals("Nível elevado", exame.obterNivelColesterolVLDL());
    }

    // glicose
    @Test
    public void deveTestarGlicoseNegativa() {
        try {
            Exame exame = new Exame();
            exame.setGlicose(-1);
            exame.obterNivelGlicose();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Glicose deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarGlicoseZerada() {
        try {
            Exame exame = new Exame();
            exame.setGlicose(0);
            exame.obterNivelGlicose();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Glicose deve ser maior do que 0", e.getMessage());
        }
    }

    @Test
    public void deveTestarGlicoseHipoglicemia() {
        Exame exame = new Exame();
        exame.setGlicose(59);
        assertEquals("Hipoglicemia", exame.obterNivelGlicose());
    }

    @Test
    public void deveTestarGlicoseDesejavel() {
        Exame exame = new Exame();
        exame.setGlicose(99);
        assertEquals("Desejável", exame.obterNivelGlicose());
    }

    @Test
    public void deveTestarGlicoseGlicemiaJejumInapropriada() {
        Exame exame = new Exame();
        exame.setGlicose(125);
        assertEquals("Glicemia de jejum inapropriada", exame.obterNivelGlicose());
    }

    @Test
    public void deveTestarGlicoseDiabetes() {
        Exame exame = new Exame();
        exame.setGlicose(126);
        assertEquals("Diabetes", exame.obterNivelGlicose());
    }
}