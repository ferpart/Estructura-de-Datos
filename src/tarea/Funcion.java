package tarea;

public class Funcion {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int reps = 10000000;
		operation(reps);
		total_time(startTime);
	}
	
	public static void operation (int reps){
		for (int i=0 ; i<reps ; i++){
			int result=((i*(i+1))/2);
			System.out.println(result);
		}	
	}

	public static void total_time(long startTime){
		long endTime = System.nanoTime();
		long time=(endTime - startTime);
		double seconds = (double)time / 1000000000.0;
		System.out.println("Took "+(seconds) + " s"); 		
	}
}