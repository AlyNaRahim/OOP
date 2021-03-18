package ps09;

public class Hamming {
    private String s1;
    private String s2;

    public Hamming(String s1, String s2) {
        if (s1.length() == s2.length()){
            this.s1 = s1;
            this.s2 = s2;
        } else {
            throw new IllegalArgumentException ("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                count += 1;
            }
        }
        return count;
    }
}
