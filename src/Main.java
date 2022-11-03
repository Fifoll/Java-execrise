public class Main {

    public static void main(String[] args) {

        writeName("Filip");
        writeAge(22);
        calc(2,4);
        checkIfEven(20);
        checkIfDividedBy3or5(30);
        powerBy3(9);
        rootOfTwo(16);
        checkTriangle(2, 4, 5);


    }


    // 1
    private static void writeName(String name) {
        System.out.println("Moje imię to " + name);
    }
    // 2
    private static void writeAge(int age) {
        System.out.println("Mój wiek to " + age + " lata");
    }
    //3
    private static void calc(int x, int y){
        System.out.println("suma liczb to " + (x+y));
        System.out.println("różnica liczb to " + (x-y));
        System.out.println("iloczyn liczb to " + (x*y));
    }
    // 4
    private static void checkIfEven(int x){
        if(x % 2 == 0){
            System.out.println("Liczba " + x + " jest parzysta");
        }
        else {
            System.out.println("Liczba " + x + " jest nieparzysta");
        }
    }

    // 5
    private static void checkIfDividedBy3or5(int x) {
        if(x%3 == 0 && x%5 == 0) {
            System.out.println("Liczba " + x + " jest podzielna przez 3 i 5");
        } else {
            System.out.println("Liczba " + x + " nie jest podzielna ani przez 3 ani przez 5");
        }
    }

    // 6
    private static void powerBy3(double x) {
        System.out.println("Liczba " + x + " podniesiona do 3 potęgi wynosi " + Math.pow(x, 3));
    }

    // 7
    private static void rootOfTwo(double x) {
        System.out.println("Pierwiastek kwadratowy z liczby " + x + " wynosi " + Math.sqrt(x));
    }

    // 8
    private static void checkTriangle(double a, double b, double c) {
        double povA = Math.pow(a, 2);
        double povB = Math.pow(b, 2);
        double povC = Math.pow(c, 2);

        if((povA + povB == povC) || (povA + povC == povB) || (povB + povC == povA)) {
            System.out.println("Z boków: " + a + " " + b + " " + c + " można zrobić trójkąt prostokątny");
        }
        else {
            System.out.println("Z boków: " + a + " " + b + " " + c + " nie można zrobić trójkąta prostokątnego");
        }
    }



}