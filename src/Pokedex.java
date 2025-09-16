import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pokedex {
    String t;
    List<Pokemon> ListaPokemon = new ArrayList<Pokemon>();
    Scanner in = new Scanner(System.in);

    public void RellenarLista(String n,String tipo, int cod){
        System.out.println("Introduce Nombre, codigo, tipo");
        n = in.nextLine();
        cod = in.nextInt();
        in.nextLine();
        t = in.nextLine();
        ListaPokemon.add(new Pokemon(n,cod,t));
    }

    public Pokemon buscarPokemon (String n){
        System.out.println("Introduce el nombre que buscas");
        n = in.nextLine();
        for (Pokemon pok : ListaPokemon) {

            if (pok.getNombre().equals(n)){
                return pok;
            }


        }
        return null;
    }

    public boolean noEstaDuplicado(String n){
        System.out.println("Introduce un Nombre");
        n = in.nextLine();

        for (Pokemon pok : ListaPokemon) {
            if (pok.getNombre().equals(n)){
                return true;
            }
        }
        return false;
    }
//    public void ordenar(){
//        ListaPokemon.sort(null);
//    }

    public boolean eliminarPokemon(String n){
        System.out.println("Introduce nombre que eliminas");
        n = in.nextLine();
        return ListaPokemon.remove(buscarPokemon(n));
    }

    public void ordenar(){
        ListaPokemon.sort(null);
    }

    @Override
    public String toString() {
        String texto = "";
        for (Pokemon pok : ListaPokemon){
            texto+= pok.toString()+"\n";
        }
        return texto;
    }
}
