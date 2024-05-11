package contador;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);


        int repetition = 0;
        while (repetition<=0){
                try {

                        System.out.println("digite um número:");
                        int firstNumber = scan.nextInt();

                        System.out.println("\ndigite mais um número(este deve ser maior que o anterior): ");
                        int secondNUmber = scan.nextInt();

                        repetition = counter(firstNumber,secondNUmber);
                } catch (ParametrosInvalidosException e) {
                        // TODO: handle exception
                        System.out.println("você digitou uma combinação inválida.");
                }
                 
        }
        scan.close();




		}
		public static int counter(int first, int second) throws ParametrosInvalidosException {
		        int iterations = second - first;
		        boolean iterationIsNegative = iterations < 0;
		        if(iterationIsNegative) {
		                throw new ParametrosInvalidosException();
		                //return iterations;
		        }
		        else {
		                int amountOfRepetition =0;
		                for(int i =0;i<iterations;i++) {
		                        System.out.println("iteração: "+(i+1));
		                        amountOfRepetition ++;
		                }
		                return amountOfRepetition;
		        }
		}

	}


