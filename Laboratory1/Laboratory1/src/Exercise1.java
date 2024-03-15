import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Complex Number Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.print("Choose an option (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Insert the real part of the first complex number");
                double realPart = scanner.nextDouble();
                System.out.println("Insert the imaginary part of the first complex number");
                double imaginaryPart = scanner.nextDouble();
                ComplexNumber c1 = new ComplexNumber(realPart, imaginaryPart);

                System.out.println("Insert the real part of the second complex number");
                double realPart2 = scanner.nextDouble();
                System.out.println("Insert the imaginary part of the second complex number");
                double imaginaryPart2 = scanner.nextDouble();
                ComplexNumber c2 = new ComplexNumber(realPart2, imaginaryPart2);

                makeAddition(c1, c2);
                break;
            }
            case 2: {
                System.out.println("Insert the real part of the first complex number");
                double realPart = scanner.nextDouble();
                System.out.println("Insert the imaginary part of the first complex number");
                double imaginaryPart = scanner.nextDouble();
                ComplexNumber c1 = new ComplexNumber(realPart, imaginaryPart);

                System.out.println("Insert the real part of the second complex number");
                double realPart2 = scanner.nextDouble();
                System.out.println("Insert the imaginary part of the second complex number");
                double imaginaryPart2 = scanner.nextDouble();
                ComplexNumber c2 = new ComplexNumber(realPart2, imaginaryPart2);

                makeSubtraction(c1, c2);
                break;
            }
            case 3: {
                System.out.println("Insert the real part of the first complex number");
                double realPart = scanner.nextDouble();
                System.out.println("Insert the imaginary part of the first complex number");
                double imaginaryPart = scanner.nextDouble();
                ComplexNumber c1 = new ComplexNumber(realPart, imaginaryPart);

                System.out.println("Insert the real part of the second complex number");
                double realPart2 = scanner.nextDouble();
                System.out.println("Insert the imaginary part of the second complex number");
                double imaginaryPart2 = scanner.nextDouble();
                ComplexNumber c2 = new ComplexNumber(realPart2, imaginaryPart2);

                makeMultiplication(c1, c2);
                break;
            }
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 3.");
        }
    }

    public static void makeAddition(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber result = new ComplexNumber(c1.real + c2.real, c1.imaginary + c2.imaginary);
        System.out.println("Result of addition: " + result);
    }

    // Method to perform subtraction of two complex numbers
    public static void makeSubtraction(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber result = new ComplexNumber(c1.real - c2.real, c1.imaginary - c2.imaginary);
        System.out.println("Result of subtraction: " + result);
    }

    // Method to perform multiplication of two complex numbers
    public static void makeMultiplication(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber result = new ComplexNumber(c1.real * c2.real, c1.imaginary * c2.imaginary);
        System.out.println("Result of multiplication: " + result);
    }

    static class ComplexNumber {
        private double real;
        private double imaginary;
        public ComplexNumber(){
        }

        public ComplexNumber(double real, double imaginary){
            this.real = real;
            this.imaginary = imaginary;

        }

        @Override
        public String toString() {
            return real + " + " + imaginary + "i";
        }
    }
}