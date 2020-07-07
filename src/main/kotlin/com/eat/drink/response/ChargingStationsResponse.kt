package com.charging.stations.response

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
class ChargingStationsResponse {

    lateinit var eatDrinkList  : Set<ItemDetails>
    lateinit var address          : Address

    constructor()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ChargingStationsResponse

        if (eatDrinkList != other.eatDrinkList) return false
        if (address != other.address) return false

        return true
    }

    override fun hashCode(): Int {
        var result = eatDrinkList.hashCode()
        result = 31 * result + address.hashCode()
        return result
    }
}