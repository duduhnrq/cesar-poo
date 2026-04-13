package ex007;

public class CandidatoTeste {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato(43111, "Reginaldo Silva", 2358);

        System.out.println("Nome do candidato: " + candidato1.getNomeCandidato());
        System.out.println("Número do candidato: " + candidato1.getNumeroCandidato());
        System.out.println("Número de votos do candidato: " + candidato1.getNumeroVotos());
    }
}
