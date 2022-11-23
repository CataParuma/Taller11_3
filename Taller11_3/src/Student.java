import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

	private int iD, añoGraduacion;
	private float gPA;
	private String carrera, titulo;
	Scanner sc = new Scanner(System.in);
	
	
	public Student(String firstName, String middleName, String lastName, Date dateOfBirth, int iD, int añoGraduacion,
			float gPA, String carrera, String titulo) {
		
		super(firstName, middleName, lastName, dateOfBirth);
		this.iD = iD;
		this.añoGraduacion = añoGraduacion;
		this.gPA = 0;
		this.carrera = carrera;
		this.titulo = titulo;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public int getAñoGraduacion() {
		return añoGraduacion;
	}

	public void setAñoGraduacion(int añoGraduacion) {
		this.añoGraduacion = añoGraduacion;
	}

	public float getgPA() {
		return gPA;
	}

	public void setgPA(float gPA) {
		this.gPA = gPA;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// Metodos

	public void cambiarCarrera() {

		System.out.println("Digite nueva carrera:");
		this.carrera = sc.next();
	}

	public void CalcularGPA(String[] calificaciones) {
		float acumulado = 0;

		for (int i = 0; i < calificaciones.length; i++) {

			switch (calificaciones[i]) {
			case "A": {

				acumulado += 4;
				break;
			}
			case "A-": {

				acumulado += 3.67;
				break;
			}
			case "B+": {

				acumulado += 3.33;
				break;
			}
			case "B": {

				acumulado += 3;
				break;
			}
			case "B-": {

				acumulado += 2.67;
				break;
			}
			case "C+": {

				acumulado += 2.33;
				break;
			}
			case "C": {

				acumulado += 2;
				break;
			}
			case "D": {

				acumulado += 1;
				break;
			}
			case "F": {

				acumulado += 0;
				break;
			}
			}
		}
		gPA = (float) acumulado / calificaciones.length;
	}
}
