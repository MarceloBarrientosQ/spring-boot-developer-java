package com.acme.generic.interfaces.resources;

import java.util.UUID;

/**
 * REST resource representing a response to greet a developer in a generic bounded context.
 * @param id The unique identifier of the developer.
 * @param fullname The full name of the developer.
 * @param message The greeting message for the developer.
 * @author Open Source Application Developer Team
 * @version 1.0.0
 */
public record GreetDeveloperResponse(UUID id, String fullname, String message) {

    /**
     * Constructs a new GreetDeveloperResponse with the specified id, fullname, and message.
     * @param message The greeting message, which must not be null or empty.
     */
    public GreetDeveloperResponse(String message) {
        this(null,null, message);
    }
}
