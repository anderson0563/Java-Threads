public class CorridaDeSapos {

    public static void main(String[] args) {
        final int NUM_SAPOS = 5;	// QTE. de sapos na corrida
        final int DISTANCIA = 500; // Distância da corrida em cm
        for (int i = 1; i <= NUM_SAPOS; i++) {
            new SapoCorrendoThread("SAPO_" + i, DISTANCIA).start();
        }
    }
}
