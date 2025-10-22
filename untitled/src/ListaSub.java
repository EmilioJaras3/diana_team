public class ListaSub {
    private subtitulo inicio;

public ListaSub() {
    this.inicio=null;

}
public void listaSub(String texto, double tiempo){
    subtitulo nuevoSub = new subtitulo(texto,tiempo);


    if(inicio==null || tiempo < inicio.tiempo){
            nuevoSub.siguiente = inicio;
            inicio=nuevoSub;
            return;
    }
}


}
