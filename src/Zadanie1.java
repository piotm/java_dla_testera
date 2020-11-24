public class Zadanie1 {

        public static void main(String[] args) {

            int a = 10;
            int b = 3;
            int c = 5;
            int d = 9;
            boolean sum1 = (a + b) % 2 == 0;
            boolean sum2 = (c + d) % 2 == 0;

            if(sum1) {
                System.out.println("Suma dwóch pierwszych intów jest parzysta");
            }
            else {
                System.out.println("Suma dwóch pierwszych intów jest nieparzysta");
            }

            if(sum2) {
                System.out.println("Suma trzeciego i czwartego inta jest parzysta");
            }
            else {
                System.out.println("Suma trzeciego i czwartego inta jest nieparzysta");
            }

            if(sum1 && sum2) {
                System.out.println("Dwie pierwsze sumu są parzyste");
            }
            else {
                System.out.println("Dwie pierwsze sumy są nieparzyste");
            }
        }
    }


