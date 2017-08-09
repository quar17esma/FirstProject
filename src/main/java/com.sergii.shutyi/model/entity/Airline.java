package com.sergii.shutyi.model.entity;

import java.util.HashSet;

/**
 * Class represents airline entity.
 */
public class Airline {

    /**
     * Planes of the company.
     */
    HashSet<Plane> planes;

    /**
     * Common people capacity of the airline.
     */
    Integer commonPeopleCapacity;

    /**
     * Common carrying capacity of the airline.
     */
    Integer commonCarryingCapacity;

    /**
     * Sorts planes by flightRange.
     */
    void sortByFlightRange(){}

    /**
     * Finds planes with fuel consumption in range.
     * @param fuelConsumptionMin minimum fuel consumption
     * @param fuelConsumptionMax maximum fuel consumption
     * @return {@code HashSet<Plane>} set of planes with suitable fuel consumption
     */
    HashSet<Plane> findPlanesByFuelConsumption(Integer fuelConsumptionMin, Integer fuelConsumptionMax){
        return null;
    }
}
