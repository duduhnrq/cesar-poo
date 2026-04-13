package ex014;

public class Candidato {
    private int numeroCandidato;
    private String nomeCandidato;
    private int votos;

    public Candidato(int numeroCandidato, String nomeCandidato, int votos) {
        this.numeroCandidato = numeroCandidato;
        this.nomeCandidato = nomeCandidato;
        this.votos = 0;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementarVotos() {
        this.votos++;
    }
}
