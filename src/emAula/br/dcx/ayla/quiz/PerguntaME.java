package emAula.br.dcx.ayla.quiz;

import java.util.Arrays;
import java.util.Objects;

public class PerguntaME {
    private String enunciado;
    private String[] alternativas;
    private String respostaCorreta;

    public PerguntaME(String enunciado,String[] alternativas, String respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }
    public PerguntaME() {
        this("", new String[]{}, "");
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String[] alternativas) {
        this.alternativas = alternativas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public String toString() {
        String tmp = enunciado + "\n";
        for (String s: this.alternativas) {
            tmp+= s + "\n";
        }
        return tmp;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PerguntaME that = (PerguntaME) o;
        return Objects.equals(enunciado, that.enunciado) && Arrays.equals(alternativas, that.alternativas) && Objects.equals(respostaCorreta, that.respostaCorreta);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(enunciado, respostaCorreta);
        result = 31 * result + Arrays.hashCode(alternativas);
        return result;
    }
    public boolean estahCorretaResposta() {
        return this.respostaCorreta.equals(respostaCorreta);
    }
}
