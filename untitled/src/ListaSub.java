import java.util.LinkedList;
import java.util.List;


public class ListaSub {
    private List<subtitulo> guardarSub;

    public  ListaSub(){
        guardarSub = new LinkedList<>();

    }

    public void insertarSub(String texto, Double tiempo) {
        subtitulo nuevoSub=new subtitulo(texto,tiempo);


    for(int i=0; i<guardarSub.size(); i++){
        subtitulo subActual=guardarSub.get(i);

        if (nuevoSub.tiempo<subActual.tiempo){
            guardarSub.add(i,nuevoSub);
            System.out.println("Insertando subtitulo" + i);
            return;
        }
    }
    guardarSub.add(nuevoSub);
    System.out.println("Insertando en el final");


}
}






