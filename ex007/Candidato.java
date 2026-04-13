package ex007;

public class Candidato {
    private int numeroCandidato;
    private String nomeCandidato;
    private int numeroVotos;

    public Candidato(int numeroCandidato, String nomeCandidato, int numeroVotos) {
        this.numeroCandidato = numeroCandidato;
        this.nomeCandidato = nomeCandidato;
        this.numeroVotos = numeroVotos;
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

    public int getNumeroVotos() {
        return numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }
}
