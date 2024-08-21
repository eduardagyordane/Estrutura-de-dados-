public class Principal{
    public static void main(String[] args){

        //Imprimir dados dos objetos
        No<String> obj1 = new No<String>("Duda");
        System.out.println(obj1.imprimeDado());

        No<String> obj2 = new No<String>("Pedro");
        System.out.println(obj2.imprimeDado());

        No<String> obj3 = new No<String>("Bia");
        System.out.println(obj3.imprimeDado());

        //Imprimir dados das listas dos objetos
        obj1.setAux(obj2);
        obj2.setAux(obj3);

        System.out.println(obj1.imprimeDado());
        System.out.println(obj1.getAux().imprimeDado());
        System.out.println(obj1.getAux().getAux().imprimeDado());
    
        NO<String> aux = obj1;

        while(aux!=null){
            System.out.println(aux.imprimeDado());
            aux = aux.getAux();
            
        }
        //No<Integer> obj2 = new No<Integer>(19);
        //System.out.println(obj2.imprimeDado());
    }

}