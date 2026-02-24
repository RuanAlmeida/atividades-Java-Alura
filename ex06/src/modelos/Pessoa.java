package modelos;

import com.google.gson.annotations.SerializedName;

public record Pessoa(
        @SerializedName("nome") String nome,
        @SerializedName("idade") String idade,
        @SerializedName("cidade") String cidade
) {
}
