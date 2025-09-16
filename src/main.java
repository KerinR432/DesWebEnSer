public class main {
    public static void main(String[] args) {
        Pokedex pok = new Pokedex();
        String n = "",t = "";
        int cod = 0;
        pok.RellenarLista(n,t,cod);
        pok.RellenarLista(n,t,cod);
        pok.RellenarLista(n,t,cod);
//        System.out.println(pok.buscarPokemon(n));
//        System.out.println(pok.noEstaDuplicado(n));
//        System.out.println(pok.eliminarPokemon(n));
//        System.out.println(pok.buscarPokemon(n));
        pok.ordenar();
        System.out.println(pok);
    }
}
