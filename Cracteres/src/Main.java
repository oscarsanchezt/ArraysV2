import java.util.*;

public class Main {
	public static void main(String[] args) {
//		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		
			//Para la clase java.util.Arrays
		boolean isSortX = false;
		isSortX = Arrays.equals(listado1, listado2);	
		
		
		//Para la clase java.util.List
		boolean isSort = false;
		


		for (int i : listado1) {
			list1.add(i);
		}
		for (int j : listado2) {
			list2.add(j);
		}
		// Implementa una forma de saber si el array está ordenado o no
		isSort = list1.equals(list2);
		// Almacena el resultado en la variable isSort
		System.out.println("java.util.List");
		if (isSort)
			System.out.println("El vector está ordenado \n");
		else
			System.out.println("El vector NO está ordenado \n");

		System.out.println("java.util.Arrays");
		if (isSortX)
			System.out.println("El vector está ordenado");
		else
			System.out.println("El vector NO está ordenado");
	}
}
