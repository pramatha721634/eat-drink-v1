package com.eat.drink.rest

interface EatDrinkService {
    fun getRestaurantsAndPubsDetails(city : String): String?
}