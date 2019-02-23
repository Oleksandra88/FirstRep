public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Person p = new Person("Ola");
        System.out.println("witaj" + p.givenName());


        try {
            showMeError();
            System.out.println("Acces element in array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exeption thrown :" + e);
        }
    }

        private static void showMeError() {
        int num[]={1, 2, 3, 4, 5};
        System.out.println( num [128]);
    }


}