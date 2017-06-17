package pair;

/** Ett par av heltal. */
public class Pair {
    private int a; // 0 <= a <4 - kortets färg
    private int b; // 0 <= b < 13 - kortets valör
    
    /** Skapar ett nytt par av heltal. */
    public Pair(int a, int b) {
            this.a = a;
            this.b = b;
    }

    /** Hämtar parets första tal. */
    public int first() {
            return a;
    }

    /** Hämtar parets andra tal. */
    public int second() {
            return b;
    }
    
    /** Hämtar en sträng som beskriver paret, exempelvis "(5,3)". */
    public String toString() {
            return "(" + a + "," + b + ")";
    }
}
