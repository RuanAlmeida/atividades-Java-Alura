package modelos;

public class Animal {

    private String raca;
    private int idade;

    public Animal(String raca, int idade) {
        this.raca = raca;
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "raca='" + raca + '\'' +
                ", idade=" + idade +
                '}';
    }


}
