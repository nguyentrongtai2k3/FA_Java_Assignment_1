package hello_check;

import java.util.Scanner;

public class CircleExercise {
	public static void main(String[] args) {
		double a;
		System.out.print("Enter Radius value : ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		final double pi = 3.141592653589793;
		System.out.println("Perimeter is:"+(2*a*pi));
		System.out.println("Area is:"+(a*a*pi));
	}
}
