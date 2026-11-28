
public class Cuidado {

    private int id;
    private int idAnimal;
    private String tipo;
    private String descricao;
    private String data;

    public Cuidado(int id, int idAnimal, String tipo, String descricao, String data) {
        this.id = id;
        this.idAnimal = idAnimal;
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nID do Animal: " + idAnimal +
                "\nTipo: " + tipo +
                "\nDescrição: " + descricao +
                "\nData: " + data;
    }
}
