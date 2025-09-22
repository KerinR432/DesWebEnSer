import java.util.Objects;

public class Pokemon implements Comparable<Pokemon>{
    private String nombre;
    private int codigo;
    private String tipo;

    public Pokemon (){
        this.nombre = "";
        this.codigo = 0;
        this.tipo = "";
    }

    public Pokemon(String nombre,int codigo,String tipo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;

    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String toString(){
        return codigo+","+nombre+","+tipo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return codigo == pokemon.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre,codigo);
    }

    @Override
    public int compareTo(Pokemon o) {
        return this.getCodigo()-(o.getCodigo());
    }
}
