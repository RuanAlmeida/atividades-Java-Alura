public class Titulo {
    private String name;
    private String diretor;
    private double tempoDeTitulo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getTempoDeTitulo() {
        return tempoDeTitulo;
    }

    public void setTempoDeTitulo(double tempoDeTitulo) {
        this.tempoDeTitulo = tempoDeTitulo;
    }

    @Override
    public String toString() {
        return "Titulo: " +
                "name='" + name +
                ", diretor='" + diretor +
                ", tempoDeTitulo=" + tempoDeTitulo;
    }
}
