package com.eat.drink.controller

import com.eat.drink.rest.EatDrinkService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EatDrinkController {

    @Autowired
    lateinit var eatDrinkService: EatDrinkService

    @GetMapping("/eat_drink/{city}")
    fun getRestaurantsAndPubsDetails(@PathVariable city: String): String? {
        return eatDrinkService.getRestaurantsAndPubsDetails(city)
    }
}