package com.ttn.project.core.models;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

@Model(adaptables = Resource.class,
)
public class CheckedImpl implements Checked{
    @OSGiService
    private CheckboxService checkboxService;

    bool Checked(){
        return checkboxService.isChecked();
    }
}
