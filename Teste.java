// Criado por IGOR MICHETTI e IEDA MARILIA DOS ANJOS AZEVEDO
public class Teste {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        // Aqui deve mostrar "true" se a lista estiver vazia
        System.out.print("\n Aqui deve mostrar 'true' se a lista estiver vazia: ");
        System.out.print(lista.vazia() + "\n");

        // Inserindo 3 valores
        lista.inserePrimeiro(1);
        lista.insereUltimo(6);
        lista.insereUltimo(12);
        // Aqui deve mostrar 1 6 12
        System.out.print("\n Aqui deve mostrar '1 6 12': ");
        lista.mostrar();
        
        lista.insereDepois(1,3) ;
        lista.insereDepois(2, 93);
        lista.insereDepois(3, 100);
        System.out.print("\n Aqui deve mostrar '1 6 3 93 100 12': ");
        // Aqui deve mostrar 1 6 3 93 100 12
        lista.mostrar();

        // Aqui deve mostrar "false" se a lista estiver vazia
        System.out.print("\n Aqui deve mostrar 'false' se a lista estiver vazia: ");
        System.out.print(lista.vazia());

        lista.removeUltimo();
        // Aqui deve mostrar "1 6 3 93 100" pois removemos o ultimo
        System.out.print("\n \n Aqui deve mostrar '1 6 3 93 100' pois removemos o ultimo: ");
        lista.mostrar();

        lista.removePrimeiro();
        // Aqui deve mostrar "6 3 93 100" pois removemos o primeiro no
        System.out.print("\n Aqui deve mostrar '6 3 93 100' pois removemos o primeiro: ");
        lista.mostrar();

        // Removendo um no especifico
        No<Integer> noRemover = lista.getPrimeiro().getProximo(); // Vamos usar o segundo no
        lista.remove(noRemover);
        // Aqui deve mostrar "6 93 100" pois removemos o segundo no
        System.out.print(" \n Aqui deve mostrar '6 93 100' pois removemos o segundo: ");
        lista.mostrar();

        System.out.print(" \n Acabamos por aqui! \n");


}}