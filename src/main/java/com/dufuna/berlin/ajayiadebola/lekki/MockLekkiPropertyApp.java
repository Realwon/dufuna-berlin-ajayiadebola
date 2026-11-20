
package com.dufuna.berlin.ajayiadebola.lekki;

import com.dufuna.berlin.ajayiadebola.model.LekkiProperty;
import com.dufuna.berlin.ajayiadebola.service.MockLekkiPropertyService;
import com.dufuna.berlin.ajayiadebola.service.LekkiPropertyService;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        // Create a property object
        LekkiProperty property = new LekkiProperty();

        // Create the property service
        LekkiPropertyService propertyService =
                new MockLekkiPropertyService();

        // Save the property
        propertyService.saveProperty(property);

        // Retrieve the property
        propertyService.getProperty(property.getPropertyId());
    }
}
