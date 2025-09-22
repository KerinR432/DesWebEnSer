import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Pokedex pok = new Pokedex();
        String n = "",t = "";
        int cod = 0;
        pok.RellenarLista("Charmander","fuego",001);
        pok.RellenarLista("Squire","agua",003);
        pok.RellenarLista("Bulbasur","planta",002);
        pok.RellenarLista("Zados","electrico",001);
//        System.out.println(pok.buscarPokemon(n));
//        System.out.println(pok.noEstaDuplicado(n));
//        System.out.println(pok.eliminarPokemon(n));
//        System.out.println(pok.buscarPokemon(n));
//        pok.ordenarAlphabletico();

        // aqui estamos mostrando las disntitas listas, set y map
        System.out.println("-!-!-!-LIST-!-!-!-");
        System.out.println(pok.listaPokemon);
        System.out.println("--------------------------------------------");
        System.out.println("-!-!-!-TREESET-!-!-!-");
        System.out.println(pok.listapokemon2);
        System.out.println("--------------------------------------------");
        System.out.println("-!-!-!-HASHSET-!-!-!-");
        System.out.println(pok.listapokemon3);

        System.out.println("--------------------------------------------");
        System.out.println("-!-!-!-MAPTREE-!-!-!-");
        System.out.println(pok.listapokemon3);
        System.out.println("--------------------------------------------");
        System.out.println("-!-!-!-MOSTRAR-!-!-!-");
        System.out.println(pok.buscarPokemonMapTree(002));

        try (FileWriter fW = new FileWriter("pokemon.csv")) {
            fW.append("Codigo,Nombre,Tipo\n");
            fW.append(pok.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileReader fR = new FileReader("pokemon.csv");) {
            int i;
            while ((i = fR.read())!=-1){
                System.out.print((char)i);
            }
            fR.read();
            fR.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

