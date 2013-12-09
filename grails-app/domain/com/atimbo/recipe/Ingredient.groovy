package com.atimbo.recipe

class Ingredient {
    String description
    Integer stepOrder = 1
    Double amount = 1.0

    /**
     * unique id for usda food_description
     * this id and the sequence id provide a key to access usda food_weight data
     */
    Integer foodId

    /**
     * sequence id for usda food_weight data
     * this id and the food_id provide a key to access usda food_weight data
     */
    Integer sequenceId

    static constraints = {
        foodId nullable: true
        sequenceId nullable: true
    }

    static mapping = {
        sort 'stepOrder'
    }
}
