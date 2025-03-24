package com.ttn.project.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="Checkbox Configuartion")
public @interface CheckboxConfig {
    @AttributeDefinition(name="Please enter either 0 for true or 1 for false")
    public int isCheckboxTicked() default 1;
}
