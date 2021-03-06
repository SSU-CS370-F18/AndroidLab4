package ssu.tholland.androidlab4.model;


import com.google.gson.annotations.SerializeName;



import java.util.List;

public class RecipeResponse {

    @SerializedName("matches")
    private List<RecipeModel> recipes;


    public List<RecipeModel> getRecipes() {
        return recipes;
    }
}


// ******** SAMPLE RESPONSE FROM YUMMLY API ***********
// http://api.yummly.com/v1/api/recipes?_app_key=ec3e34e0bb6801670dbd3dbd02ce7608&_app_id=4911b643&q=eggs
/*
{
  "criteria": {
    "q": "lemon",
    "allowedIngredient": null,
    "excludedIngredient": null
  },
  "matches": [
    { ... },  // these objects are RecipeModels
    { ... },
    { ... },
    { ... },
    { ... }
  ],
  "facetCounts": { ... },
  "totalMatchCount": 247614,
  "attribution": { ... }
}

*/