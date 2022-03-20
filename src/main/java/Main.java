import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable(null);
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        String orElse = hello.orElse("World");
        System.out.println(orElse);

        orElse = hello
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    //Extra computation
                    return "World";
                });

        System.out.println(orElse);

        //ifpresent
        hello.ifPresent(word -> System.out.println(word.toUpperCase()));

        //ifPresentOrElse
        hello.ifPresentOrElse(System.out::println, () -> System.out.println("World"));

    }
}
