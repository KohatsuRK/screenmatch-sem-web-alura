package br.com.alura.screenmatch.model;

public enum Categoria {

    ACAO("Action"),

    ROMANCE("Romance"),

    COMEDIA("Comedy"),

    DRAMA("Drama"),

    CRIME("Crime"),

    ANIMATION ("Animation");

    private String categoriaOmdb;

    Categoria(String cateforiaOmdb){
        this.categoriaOmdb = cateforiaOmdb;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }


}
