public class User {

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    /*
        User(String firstNameParam, String lastNameParam, String emailParam, int ageParam, boolean isAdultParam) {
            System.out.println(firstNameParam + " " + lastNameParam + " " + emailParam + " " + ageParam + " " + isAdultParam);

            firstName = firstNameParam;
            lastName = lastNameParam;
            email = emailParam;
            age = ageParam;
            isAdult = isAdultParam;
        }
    */
    User(String firstName, String lastName, String email, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();

    }

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }
    void grettings (String name) {
        System.out.println("Hi " + name +  ". Nice to see you");
    }

    void grettings (String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you");
    }

    //  void grettingsFullName (String firstName, String lastName) {
    //    System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you");
    // }
    void howOldAreYou(String name, int userAge){
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }
    int yourAgePlus10(int userAge){
        return userAge + 10;
    }
}


