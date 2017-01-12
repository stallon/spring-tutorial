package hello;

import org.springframework.batch.item.ItemProcessor;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Created by stallon on 2017. 1. 9..
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private final static Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {

        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }
}
