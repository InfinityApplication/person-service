package org.openapitools.api;

import org.openapitools.model.Person;
import org.openapitools.model.Person.GenderEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-17T22:03:11.989+01:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.personService.base-path:}")
public class PersonsApiController implements PersonsApi {

    private final NativeWebRequest request;

    @Autowired
    public PersonsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<Person>> personsGet() {
        Person item1 = new Person();
        item1.setUsername("dFenster");
        item1.setFirstName("David");
        item1.setLastName("Fenstermacher");
        item1.setGender(GenderEnum.MALE);
        item1.setHeight(183);
        return ResponseEntity.ok(Arrays.asList(item1));
    }
}