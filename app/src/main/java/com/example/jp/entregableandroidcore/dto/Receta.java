package com.example.jp.entregableandroidcore.dto;

public class Receta {

    private String title;

    private Integer foto;

    private String ingredients;

    private String preparation;

    public Receta(String title, Integer foto, String ingredients, String preparation) {
        this.title = title;
        this.foto = foto;
        this.ingredients = ingredients;
        this.preparation = preparation;
    }

    public String getTitle() {
        return title;
    }

    public Integer getFoto() {
        return foto;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getPreparation() {
        return preparation;
    }
}
