class No<T>{

    private T dado;
    private No<T> aux; 

    public No(T dado){
        //setDado(dado);
        this.dado = dado;
        this.aux = aux;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setAux(No<T> aux){
        this.aux = aux;
    }

    public NO<T> getAux(){
        return this.aux;
    }

    public String imprimeDado(){
        return "{Dado: "+ getDado() +"}";
    }

}