import java.util.*;

public class Pokedex {
    //En pokedex creamos una lista para guardar pokemons
    String t;
    List<Pokemon> listaPokemon = new ArrayList<Pokemon>(); //lista
    Set<Pokemon> listapokemon2 = new TreeSet<Pokemon>(); // esto es un set concretamente de Arbol
    Set<Pokemon> listapokemon3 = new HashSet<Pokemon>(); // esto es un set estilo hash
    Map<Integer,Pokemon> mapsCodigo = new TreeMap<Integer,Pokemon>();  // esto es un map de estilo tree

    // el tree es para ordenar según le pidamos, sea por codigo o nombre
    // el set es más eficiente para buscar pero no ordena nada
    Scanner in = new Scanner(System.in);


    //rellnamos la listas de pokemons
    public void RellenarLista(String n,String tipo, int cod){
//        System.out.println("Introduce Nombre, codigo, tipo");
//        n = in.nextLine();
//        cod = in.nextInt();
//        in.nextLine();
//        t = in.nextLine();


        // int pos = Math.abs(Collections.binarySearch(ListaPokemon,o))-2; //buscador binario
        listaPokemon.add(new Pokemon(n,cod,tipo)); //rellenamos una lista
        listapokemon2.add(new Pokemon(n,cod,tipo)); //rellenamos un tree
        listapokemon3.add(new Pokemon(n,cod,tipo)); //rellenamos un hash
        mapsCodigo.put(cod,new Pokemon(n,cod,tipo)); // rellenando un maps, utilizando el .put
    }

    //buscar pokemons, con el hash y el maps seria de manera mas sencilla
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
    // aqui ejemplo de la busqueda con un maps
    public Pokemon buscarPokemonMapTree (int cod){
        return mapsCodigo.get(cod); // --> aqui devolvemos el lo que hay en codigo siendo el codigo especial por el que buscamos
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
