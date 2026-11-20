
package com.dufuna.berlin.ajayiadebola.service;

import com.dufuna.berlin.ajayiadebola.model.LekkiProperty;

public interface LekkiPropertyService {

    void saveProperty(LekkiProperty property);

    LekkiProperty getProperty(String propertyId);

}
