package com.mycompany.recipeapp

data class MealDBData (
    val meals: List<Meals>,
    val categories: List<Categories>
)

data class Meals (
    val idMeal: Int,
    val strMeal: String,
    val strCategory: String,
    val strArea: String,
    val strMealThumb: String,
    val strInstructions: String,
    val strIngredient1: String,
    val strIngredient2: String,
    val strIngredient3: String,
    val strIngredient4: String,
    val strIngredient5: String,
    val strIngredient6: String,
    val strIngredient7: String,
    val strIngredient8: String,
    val strIngredient9: String,
    val strIngredient10: String,
    val strIngredient11: String,
    val strIngredient12: String,
    val strIngredient13: String,
    val strIngredient14: String,
    val strIngredient15: String,
    val strIngredient16: String,
    val strIngredient17: String,
    val strIngredient18: String,
    val strIngredient19: String,
    val strIngredient20: String,
    val strMeasure1: String,
    val strMeasure2: String,
    val strMeasure3: String,
    val strMeasure4: String,
    val strMeasure5: String,
    val strMeasure6: String,
    val strMeasure7: String,
    val strMeasure8: String,
    val strMeasure9: String,
    val strMeasure10: String,
    val strMeasure11: String,
    val strMeasure12: String,
    val strMeasure13: String,
    val strMeasure14: String,
    val strMeasure15: String,
    val strMeasure16: String,
    val strMeasure17: String,
    val strMeasure18: String,
    val strMeasure19: String,
    val strMeasure20: String
)

data class Categories (
    val idCategory: Int,
    val strCategory: String,
    val strCategoryThumb: String
)

/* {"meals":
        [{"idMeal":"52771",
        "strMeal":"Spicy Arrabiata Penne",
        "strDrinkAlternate":null,
        "strCategory":"Vegetarian",
        "strArea":"Italian",
        "strInstructions":"Bring a large pot of water to a boil.",
        "strMealThumb":"https:\/\/www.themealdb.com\/images\/media\/meals\/ustsqw1468250014.jpg",
        "strTags":"Pasta,Curry",
        "strYoutube":"https:\/\/www.youtube.com\/watch?v=1IszT_guI08",
        "strIngredient1":"penne rigate",
        "strIngredient2":"olive oil",
        "strIngredient3":"garlic",
        "strIngredient4":"chopped tomatoes",
        "strIngredient5":"red chile flakes",
        "strIngredient6":"italian seasoning",
        "strIngredient7":"basil",
        "strIngredient8":"Parmigiano-Reggiano",
        "strIngredient9":"",
        "strIngredient10":"",
        "strIngredient11":"",
        "strIngredient12":"",
        "strIngredient13":"",
        "strIngredient14":"",
        "strIngredient15":"",
        "strIngredient16":null,
        "strIngredient17":null,
        "strIngredient18":null,
        "strIngredient19":null,
        "strIngredient20":null,
        "strMeasure1":"1 pound",
        "strMeasure2":"1\/4 cup",
        "strMeasure3":"3 cloves",
        "strMeasure4":"1 tin ",
        "strMeasure5":"1\/2 teaspoon",
        "strMeasure6":"1\/2 teaspoon",
        "strMeasure7":"6 leaves",
        "strMeasure8":"spinkling",
        "strMeasure9":"",
        "strMeasure10":"",
        "strMeasure11":"",
        "strMeasure12":"",
        "strMeasure13":"",
        "strMeasure14":"",
        "strMeasure15":"",
        "strMeasure16":null,
        "strMeasure17":null,
        "strMeasure18":null,
        "strMeasure19":null,
        "strMeasure20":null,
        "strSource":null,
        "dateModified":null}]}
 */