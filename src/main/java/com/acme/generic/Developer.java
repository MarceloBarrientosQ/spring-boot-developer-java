package com.acme.generic;

import lombok.Builder;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * Represents a developer with a unique ID, first name, and last name.
 * @author: Open Source Application Developer Team
 */

@Builder
@Getter
public class Developer {
    private final UUID id = UUID.randomUUID();
    private final String firstName;
    private final String lastName;

    public Developer(String firstName, String lastName) {
            this.firstName = StringUtils.trimToEmpty(firstName);
        this.lastName = StringUtils.trimToEmpty(lastName);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isAnyNameBlank() {
        return StringUtils.isAnyBlank(firstName, lastName);
    }

    public boolean isAnyNameEmpty() {
        return StringUtils.isAnyEmpty(firstName, lastName);
    }
}
