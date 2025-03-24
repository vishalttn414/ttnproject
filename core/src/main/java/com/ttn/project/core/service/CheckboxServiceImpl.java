package com.ttn.project.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import org.osgi.service.metatype.annotations.Designate;
@Component(service="CheckboxService.class",immediate=true)
@Designate(ocd="CheckboxConfig.class")
public class CheckboxServiceImpl implements CheckboxService{
    int checked;
    @Activate
    @Modified
    public void activate(CheckboxConfig config){
        int checked=config.isCheckboxTicked();
    }
    @Override
    public bool isChecked(){
        if(checked==1) return true;
        return false;
    }

}
