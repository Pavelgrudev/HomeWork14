package Package;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person[] people = {
                new Person("Sarah", 30, 112),
                new Person("Джон", 13, 113),
                new Person("Иван", 45, 222),
                new Person("Tom", 23, 114),
                new Person("Джо",15,122)};
        Customer[] customers = {
                new Customer("Sarah", 30, 112, 444444),
                new Customer("Джон", 13, 113, 333333),
                new Customer("Иван", 45, 222, 222222),
                new Customer("Tom", 23, 114, 11111111)};

    Gamer [] gamers= {
            new Gamer("Джо", 15, 122, "PS"),
            new Gamer("Джон", 13, 113, "PC")};
        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);
    }



    }



