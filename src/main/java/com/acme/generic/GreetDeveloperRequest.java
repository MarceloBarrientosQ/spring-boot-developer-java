package com.acme.generic;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * REST resource representing a request to greet a developer in a generic bounded context.
 * @param firstName The first name of the developer.
 * @param lastName The last name of the developer.
 */
public record GreetDeveloperRequest(String firstName, String lastName) {

    /**
     * Constructs a new GreetDeveloperRequest with the specified first and last names.
     * @param firstName The first name of the developer.
     * @param lastName The last name of the developer.
     */
    @JsonCreator
    public GreetDeveloperRequest(@JsonProperty("firstName") String firstName,
                                 @JsonProperty("lastName")  String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
