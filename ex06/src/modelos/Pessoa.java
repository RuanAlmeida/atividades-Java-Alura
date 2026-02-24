package modelos;

import com.google.gson.annotations.SerializedName;

public record Pessoa(String nome, int idade, String cidade) {
}
