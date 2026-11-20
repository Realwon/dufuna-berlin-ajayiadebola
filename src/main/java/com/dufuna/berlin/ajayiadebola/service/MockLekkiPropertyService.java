package com.dufuna.berlin.ajayiadebola.service;

import com.dufuna.berlin.ajayiadebola.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {

    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty(String propertyId) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}
