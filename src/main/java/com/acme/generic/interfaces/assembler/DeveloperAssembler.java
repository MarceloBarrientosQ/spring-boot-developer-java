package com.acme.generic.interfaces.assembler;

import com.acme.generic.interfaces.resources.GreetDeveloperRequest;
import com.acme.generic.domain.model.entity.Developer;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * Assembler class to conver a {@link GreetDeveloperRequest} to a {@link Developer entity}.
 * Currently, this class does not contain any methods or properties.
 * It serves as a placeholder for future development.
 */
public class DeveloperAssembler {
    public static Developer toEntityFromRequest(GreetDeveloperRequest request) {
        if(Objects.isNull(request) ||
                StringUtils.isAnyBlank(request.firstName(),
                        request.lastName()))
        {
            return null;
        }

        return Developer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .build();
    }
}
