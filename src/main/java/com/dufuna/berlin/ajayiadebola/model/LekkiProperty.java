
package com.dufuna.berlin.ajayiadebola.model;

import java.time.LocalDate;
import java.util.Objects;

public class LekkiProperty {

    // Property information
    private String propertyId;
    private String address;
    private String type;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String owner;
    private String description;

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    private LocalDate validFrom;
    private LocalDate validTo;

    @Override
    public String toString() {
        return "LekkiProperty{" +
                "propertyId='" + propertyId + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfSittingRooms=" + numberOfSittingRooms +
                ", numberOfKitchens=" + numberOfKitchens +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfToilets=" + numberOfToilets +
                ", owner='" + owner + '\'' +
                ", description='" + description + '\'' +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LekkiProperty that = (LekkiProperty) o;
        return numberOfBedrooms == that.numberOfBedrooms && numberOfSittingRooms == that.numberOfSittingRooms && numberOfKitchens == that.numberOfKitchens && numberOfBathrooms == that.numberOfBathrooms && numberOfToilets == that.numberOfToilets && Objects.equals(propertyId, that.propertyId) && Objects.equals(address, that.address) && Objects.equals(type, that.type) && Objects.equals(owner, that.owner) && Objects.equals(description, that.description) && Objects.equals(validFrom, that.validFrom) && Objects.equals(validTo, that.validTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyId, address, type, numberOfBedrooms, numberOfSittingRooms, numberOfKitchens, numberOfBathrooms, numberOfToilets, owner, description, validFrom, validTo);
    }

    // No-arguments constructor
    public LekkiProperty() {
    }

}
