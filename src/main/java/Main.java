import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        /*List<Person> people = new ArrayList<>();
        Person lena = mapper.readValue(Paths.get("src/main/resources/lena.json").toFile(), Person.class);
        people.add(lena);
        System.out.println(Person.NUMBER_OF_PEOPLE);
        Person jyri = mapper.readValue(Paths.get("src/main/resources/jyri.json").toFile(), Person.class);
        people.add(jyri);
        System.out.println(Person.NUMBER_OF_PEOPLE);*/

        /*for(Person person : people) {
            System.out.println(person.getName());
        }*/

        List<Person> people = new ArrayList<>();
        Person ella = new Person("Ella", 16);
        Person alva = new Person("Alva", 14);

        List<Person> tempFromJson = (List.of(mapper.readValue(Paths.get("src/main/resources/people.json").toFile(), Person[].class)));
        people.addAll(tempFromJson);
        people.add(alva);

        mapper.writeValue(Paths.get("src/main/resources/people.json").toFile(), people);
        //mapper.writeValue(Paths.get("src/main/resources/lena.json").toFile(), lena);
        //mapper.writeValue(Paths.get("src/main/resources/jyri.json").toFile(), jyri);

    }
}
