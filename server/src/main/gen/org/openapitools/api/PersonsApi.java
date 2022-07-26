/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Person;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-29T22:41:20.472+01:00[Europe/Berlin]")
@Validated
@Tag(name = "persons", description = "the persons API")
public interface PersonsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /persons
     * Get a list of all Persons
     *
     * @return Success! (status code 200)
     */
    @Operation(
        operationId = "personsGet",
        tags = { "persons" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success!", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Person.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/persons",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Person>> personsGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /persons/{id}
     * Deleta a Person by id
     *
     * @param id  (required)
     * @return Successfully deleted a Person (status code 200)
     */
    @Operation(
        operationId = "personsIdDelete",
        tags = { "persons" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully deleted a Person")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/persons/{id}"
    )
    default ResponseEntity<Void> personsIdDelete(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /persons/{id}
     * Get a Person by PEID
     *
     * @param id  (required)
     * @return Success Response with Path Parameter (status code 200)
     */
    @Operation(
        operationId = "personsIdGet",
        tags = { "persons" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success Response with Path Parameter", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Person.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/persons/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Person>> personsIdGet(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /persons/{id}
     * Update a Person by PEID
     *
     * @param id  (required)
     * @return Data for Person with {PEID} changed! (status code 200)
     */
    @Operation(
        operationId = "personsIdPatch",
        tags = { "persons" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Data for Person with {PEID} changed!", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Person.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/persons/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Person> personsIdPatch(
        @Parameter(name = "id", description = "", required = true) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /persons
     * Add a new Person
     *
     * @param person  (optional)
     * @return Successfully added (status code 201)
     */
    @Operation(
        operationId = "personsPost",
        tags = { "persons" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successfully added")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/persons",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> personsPost(
        @Parameter(name = "Person", description = "") @Valid @RequestBody(required = false) Person person
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
