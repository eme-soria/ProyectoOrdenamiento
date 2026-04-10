public class Main {

	public static void main(String[] args) {
		int numOrdenar[] = { 250, 100, 23, 145, 122, 432, 107, 109, 265, 194, 1 };
		int tamNumOrder = numOrdenar.length;
		System.out.println("array antes de ordenar....\n");
		for (int i = 0; i < tamNumOrder; i++) {
			System.out.print(numOrdenar[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < tamNumOrder - 1; i++) {
			for (int j = 0; j < tamNumOrder - 1; j++) {
				if (numOrdenar[j] > numOrdenar[j + 1]) {
					int temp = numOrdenar[j];
					numOrdenar[j] = numOrdenar[j + 1];
					numOrdenar[j + 1] = temp;
				}
			}

		}

		System.out.println("array despues de ordenar....\n");
		for (int i = 0; i < tamNumOrder; i++) {
			System.out.print(numOrdenar[i] + " ");
		}

		System.out.println("programa finalizado...........");
		System.out.println("linea de cambio");
	}
}
