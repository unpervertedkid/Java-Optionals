import java.util.List;
import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("James", "JAMES@GMAIL.COM"),
            new Person("Aisha", null)
        );

        for(Person person : people) {
            System.out.print(person.getName() + " : ");

            if(person.getEmail().isPresent()){
                System.out.print(person.getEmail().get());
            }else{
                System.out.print("Email not provided");
            }
            System.out.println();
        }
    }
}

    class Person {
        private final String name;
        private final String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
