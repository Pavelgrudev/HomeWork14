package Package;

public class PrintService {
    public void print(Person[] people) {
        System.out.println("Размер списка = " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println(" Имя " + person.getName() + " Возраст " + person.getAge() + " Телефон " + person.getPhoneNumber());
        }
    }

    public void print(Customer[] customers) {
        System.out.println("==============================================================================");
        System.out.println("Размер списка = " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println(" Имя " + customer.getName() + " Возраст " + customer.getAge() +
                    " Телефон " + customer.getPhoneNumber() + " Номер карты " + customer.getCardNumber());
        }
        System.out.println("==============================================================================");
    }

    public void print(Gamer[]gamers) {
        System.out.println("==============================================================================");
        System.out.println("Размер списка = " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamer gamer = gamers[i];
            System.out.println(" Имя " + gamer.getName() + " Возраст " + gamer.getAge() +
                    " Телефон " + gamer.getPhoneNumber() + " Номер карты " + gamer.getPlatform());
        }
    }


}