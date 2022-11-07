import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int math, physics,turkish,science,music,lessons = 0;
	        double average,sum = 0;

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Matematik notu:");
	        math = sc.nextInt();
	        if (0<=math && math<=100){
	            lessons +=1;
	            sum += math;
	        }
	        System.out.println("Fizik notu:");
	        physics = sc.nextInt();
	        if (0<=physics && physics<=100){
	            lessons +=1;
	            sum += physics;
	        }

	        System.out.println("Türkçe notu:");
	        turkish = sc.nextInt();
	        if (0<=turkish && turkish<=100){
	            lessons +=1;
	            sum += turkish;
	        }

	        System.out.println("Kimya notu:");
	        science = sc.nextInt();
	        if (0<=science && science<=100){
	            lessons +=1;
	            sum += science;
	        }

	        System.out.println("Müzik notu:");
	        music = sc.nextInt();
	        if (0<=music && music<=100){
	            lessons +=1;
	            sum += music;
	        }


	        average = sum / lessons;

	        if (average <= 55) {
	            System.out.println("Sinifta kaldiniz.");
	            System.out.println("Ortalamanız :" + average);
	        }else {
	            System.out.println("Tebrikler , geçtiniz !");
	            System.out.println("Ortalamanız :" + average);
	        }
	        System.out.println("Ortalamanız :" + average);
	    }
	}


