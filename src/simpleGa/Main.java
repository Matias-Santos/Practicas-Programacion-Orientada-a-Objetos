package simpleGa;

public class Main {

    public static void main(String[] args) {

        // Seteamos una solucion objetivo
    	/*
    	 * 0
    	 * Asume la responsabilidad cuando comete un error
    	 * Intenta solucionar problemas ajenos a su puesto de trabajo
    	 * Respeta los horarios de trabajo
    	 * 0
    	 * Se preocupa cuando algún compañero tiene problemas fuera del trabajo
    	 * 0
    	 * 0
    	 * Acepta las ideas del resto aunque vayan en contra de la suya
    	 * 0
    	 */
        FitnessCalc.setSolution("0111010010");

        // Creamos una poblacion de 5 personas
        Population myPop = new Population(5, true);
        
        // Evolucionamos nuestra poblacion hasta que llegamos a una solucion optima
        int generationCount = 0;
        while (generationCount <10) {
            generationCount++;
            System.out.println("Generacion: " + generationCount + " Mas apto: " + myPop.getFittest().getFitness());
            myPop = Algorithm.evolvePopulation(myPop);
        }
       
        System.out.println("Solucion encontrada:");
        System.out.println("Generacion: " + generationCount);
        System.out.println("Genes:");
        System.out.println(myPop.getFittest());
    }
}
