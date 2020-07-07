package com.eat.drink.rest

import com.charging.stations.response.ChargingStationsResponse

interface EatDrinkService {
    fun getRestaurantsAndPubsDetails(city : String): ChargingStationsResponse?
}