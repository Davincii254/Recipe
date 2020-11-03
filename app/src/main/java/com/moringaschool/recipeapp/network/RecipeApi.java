package com.moringaschool.recipeapp.network;

import com.moringaschool.recipeapp.models.RecipeSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {
    @GET("recipes/")
    Call<RecipeSearchResponse> getRecipe(
            @Query("type") String type,
            @Query("api_key") String apiKey
    );
}
