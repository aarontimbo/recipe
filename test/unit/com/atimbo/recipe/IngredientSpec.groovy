package com.atimbo.recipe

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

@TestFor(Ingredient)
class IngredientSpec extends Specification {

    @Unroll
    void 'validate an ingredient'() {
        setup:
        Ingredient ingredient = new Ingredient(
                amount: amount,
                description: description
        )

        expect:
        ingredient.validate() == isValid

        where:
        description | amount || isValid
        'meat'      | 1.5    || true
        null        | 1.0    || false

    }

}
