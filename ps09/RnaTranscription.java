package ps09;

public class RnaTranscription {
    private String dna;

    public RnaTranscription() {
    }

    public String transcribe(String dna) {
        String rna = "";
        for (int i = 0; i < dna.length(); i++){
            if (dna.charAt(i) == 'G'){
                rna += 'C';
            } else if (dna.charAt(i) == 'C') {
                rna += 'G';
            } else if (dna.charAt(i) == 'T') {
                rna += 'A';
            } else if (dna.charAt(i) == 'A') {
                rna += 'U';
            } else
                rna += dna.charAt(i);
        }
        return rna;
    }
}
