public class MainApp {

    public static void main(String[] args) {

        // typ nazwa = nowy okiet

        Bug pawel = new Bug("hello hello hello", "piotrek@testqa.pl",4);
        Bug mat = new Bug("lore ipsum", "mat@testqa.pl",3, true);
        System.out.println(pawel);
        System.out.println(mat);


        User piotrek = new User("Piotrek", "Testowy","piotre1@test.pl" , 17);
        piotrek.getAllInfo();
        // wywołanie konstruktora
        User tomek = new User("Tomek", "Brown","tomek@brown.pl" , 20);   // wywołanie konstruktora
        tomek.getAllInfo();
 /*
        User piotrek1 = new User("Piotrek1", "Testowy1","piotrek1@test.pl" , 25);
        System.out.println("Piotrek i firstname: " + piotrek1.firstName);


        piotrek.firstName = "Piotrek";
        piotrek.lastName = "Testowy";
        piotrek.email = "piotrek@test.pl";
        piotrek.age = 20;
        piotrek.isAdult = false;
        piotrek.getFullName();
        piotrek.getAllInfo();
        System.out.println(piotrek.getUserAge());
        int userAge = piotrek.getUserAge();
        System.out.println(userAge);

        boolean userAdult = piotrek.isUserAdult();
        System.out.println("czy piotrek jest dorosły " + userAdult);

        piotrek.grettings("Marcin");
        // System.out.println(piotrek.firstName + " " + piotrek.lastName);
      //  piotrek.howOldAreYou("Piotrek", 17);
      //  int piotrekAgePlus10 = piotrek.yourAgePlus10(17);
      //   System.out.println(piotrekAgePlus10);
      //  piotrek.grettings("Piotrek", "Testowy");

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Testowy2";
        tomek.email = "tomekk@test.pl";
        tomek.age = 29;
        tomek.isAdult = false;
       // System.out.println(tomek.firstName + " " + tomek.lastName);
        tomek.getFullName();
        tomek.getAllInfo();
/*
        int number = 10;
        System.out.println(number);

        double Doublenumber = 10.5;
        System.out.println(Doublenumber);

        String someText = "TextJava";
        System.out.println(someText);

        char someChar = 's';
        System.out.println('s');

        boolean TrueValue = true;
        System.out.println(TrueValue);

        boolean FalseValue = false;
        System.out.println(FalseValue);


int numOne = 10;
int numTwo = 2;

        if (numOne < numTwo){
            System.out.println("numb one is less then numer 2");
        } else {
            System.out.println("numb one is grather then numer 2");
        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "asd";

        switch (page){
            case "Home":
                System.out.println("Przełączam sie do strony Home");
                 break;
            case "Login":
                System.out.println("Przełączam sie do strony Login");
                 break;
            case "Contact":
                System.out.println("Przełączam sie do strony Contac");
                 break;
            default:
                System.out.println("Nie ma takiej strony");
        }

*/

    }

}
