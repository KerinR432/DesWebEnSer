import java.util.*;

public class Pokedex {
    String t;
    List<Pokemon> listaPokemon = new ArrayList<Pokemon>(); //lista
    Set<Pokemon> listapokemon2 = new TreeSet<Pokemon>();
    Set<Pokemon> listapokemon3 = new HashSet<Pokemon>();
    Map<Integer,Pokemon> mapsCodigo = new TreeMap<Integer,Pokemon>();
    Scanner in = new Scanner(System.in);

    public void RellenarLista(String n,String tipo, int cod){
//        System.out.println("Introduce Nombre, codigo, tipo");
//        n = in.nextLine();
//        cod = in.nextInt();
//        in.nextLine();
//        t = in.nextLine();


        // int pos = Math.abs(Collections.binarySearch(ListaPokemon,o))-2; //buscador binario
        listaPokemon.add(new Pokemon(n,cod,tipo));
        listapokemon2.add(new Pokemon(n,cod,tipo));
        listapokemon3.add(new Pokemon(n,cod,tipo));
        mapsCodigo.put(cod,new Pokemon(n,cod,tipo));
    }

    public Pokemon buscarPokemon (String n){
        System.out.println("Introduce el nombre que buscas");
        n = in.nextLine();
        for (Pokemon pok : listaPokemon) {

            if (pok.getNombre().equals(n)){
                return pok;
            }


        }
        return null;
    }
    public Pokemon buscarPokemonMapTree (int cod){
        return mapsCodigo.get(cod);
    }

    public boolean noEstaDuplicado(String n){
        System.out.println("Introduce un Nombre");
        n = in.nextLine();

        for (Pokemon pok : listaPokemon) {
            if (pok.getNombre().equals(n)){
                return true;
            }
        }
        return false;
    }
    public boolean eliminarPokemon(String n){
        System.out.println("Introduce nombre que eliminas");
        n = in.nextLine();
        return listaPokemon.remove(buscarPokemon(n));
    }

    public void ordenarAlphabletico(){
        listaPokemon.sort(null);
    }

    @Override
    public String toString() {
        String texto = "";
        for (Pokemon pok : listaPokemon){
            texto+= pok.toString()+"\n";
        }
        return texto;
    }


}
