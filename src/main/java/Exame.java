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

    private int triglicerides;
    private int colesterolTotal;

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
}
