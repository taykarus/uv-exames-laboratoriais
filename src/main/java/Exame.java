import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Exame {

    private static final int TRIGLICERIDES_DESEJAVEL = 150;
    private static final int TRIGLICERIDES_LIMITROFE = 200;
    private static final int TRIGLICERIDES_ALTO = 500;

    private static final int COLESTEROL_TOTAL_DESEJAVEL = 200;
    private static final int COLESTEROL_TOTAL_LIMITROFE = 240;

    private static final int COLESTEROL_HDL_BAIXO = 40;
    private static final int COLESTEROL_HDL_NORMAL = 60;

    private static final int COLESTEROL_LDL_OTIMO = 100;
    private static final int COLESTEROL_LDL_DESEJAVEL = 130;
    private static final int COLESTEROL_LDL_LIMITROFE = 160;
    private static final int COLESTEROL_LDL_ALTO = 190;

    private static final int COLESTEROL_VLDL_DESEJAVEL = 30;
    private static final int COLESTEROL_VLDL_LIMITROFE = 40;

    private int triglicerides;
    private int colesterolTotal;
    private int colesterolHDL;
    private int colesterolLDL;
    private int colesterolVLDL;

    public String obterNivelTriglicerides() {
        if (this.triglicerides <= 0) {
            throw new IllegalArgumentException("Triglicerides deve ser maior do que 0");
        }
        if (this.triglicerides < TRIGLICERIDES_DESEJAVEL) {
            return "Nivel desejável";
        } else if (this.triglicerides < TRIGLICERIDES_LIMITROFE) {
            return "Nível limitrofe";
        } else if (this.triglicerides < TRIGLICERIDES_ALTO) {
            return "Nível alto";
        } else {
            return "Nível muito alto";
        }
    }

    public String obterNivelColesterolTotal() {
        if (this.colesterolTotal <= 0) {
            throw new IllegalArgumentException("Colesterol total deve ser maior do que 0");
        }
        if (this.colesterolTotal < COLESTEROL_TOTAL_DESEJAVEL) {
            return "Desejável";
        } else if (this.colesterolTotal < COLESTEROL_TOTAL_LIMITROFE) {
            return "Limítrofe";
        } else {
            return "Elevado";
        }
    }

    public String obterNivelColesterolHDL() {
        if (this.colesterolHDL <= 0) {
            throw new IllegalArgumentException("Colesterol HDL deve ser maior do que 0");
        }
        if (this.colesterolHDL < COLESTEROL_HDL_BAIXO) {
            return "Baixo";
        } else if (this.colesterolHDL <= COLESTEROL_HDL_NORMAL) {
            return "Normal";
        } else {
            return "Desejável";
        }
    }

    public String obterNivelColesterolLDL() {
        if (this.colesterolLDL <= 0) {
            throw new IllegalArgumentException("Colesterol LDL deve ser maior do que 0");
        }
        if (this.colesterolLDL < COLESTEROL_LDL_OTIMO) {
            return "Ótimo";
        } else if (this.colesterolLDL < COLESTEROL_LDL_DESEJAVEL) {
            return "Desejável";
        } else if (this.colesterolLDL < COLESTEROL_LDL_LIMITROFE) {
            return "Limítrofe";
        } else if (this.colesterolLDL < COLESTEROL_LDL_ALTO) {
            return "Alto";
        } else {
            return "Muito alto";
        }
    }

    public String obterNivelColesterolVLDL() {
        if (this.colesterolVLDL <= 0) {
            throw new IllegalArgumentException("Colesterol VLDL deve ser maior do que 0");
        }
        if (this.colesterolVLDL < COLESTEROL_VLDL_DESEJAVEL) {
            return "Nivel desejável";
        } else if (this.colesterolVLDL <= COLESTEROL_VLDL_LIMITROFE) {
            return "Nivel limítrofe";
        } else {
            return "Nível elevado";
        }
    }
}
