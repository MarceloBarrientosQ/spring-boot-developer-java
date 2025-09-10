package com.acme.generic.interfaces.assembler;

import com.acme.generic.domain.model.entity.Developer;
import com.acme.generic.interfaces.resources.GreetDeveloperResponse;

/**
 * Assembler class to convert a {@link Developer entity} to a {@link GreetDeveloperResponse resource}.
 * This class provides a method to transform the domain model into a format suitable for REST responses.
 * It handles cases where the developer information may be incomplete or missing.
 * @version 1.0.0
 * @since 1.0.0
 * @author Open Source Application Developer Team
 */
public class GreetDeveloperAssembler {

    /**
     * Converts a {@link Developer} entity to a {@link GreetDeveloperResponse} resource.
     * If the developer is null or has empty/blank names, it returns a default greeting message.
     * @param developer The developer entity to be converted.
     * @return A GreetDeveloperResponse resource with the developer's information or a default message.
     */
    public static GreetDeveloperResponse toResourceEntity(Developer developer) {
        if(isDeveloperNullOrEmptyNamed(developer)){
            return new GreetDeveloperResponse("Welcome Anonymous Spring Boot Developer!");
        }
        return new GreetDeveloperResponse(developer.getId(), developer.getFullName(),
                "Congrats" + developer.getFullName() + "! You are a Spring Boot Developer!");
    }

    /** Helper method to check if the developer is null or has empty/blank names.
     * @param developer The developer entity to be checked.
     * @return true if the developer is null or has any empty/blank names, false otherwise.
     */
    private static boolean isDeveloperNullOrEmptyNamed(Developer developer) {
        return developer == null
                || developer.isAnyNameEmpty()
                || developer.isAnyNameBlank();
    }
}
