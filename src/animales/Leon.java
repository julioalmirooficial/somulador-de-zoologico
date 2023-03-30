package animales;

public class Leon extends Animal{
    private int nivelDeFuerza;
    private boolean elLeonCome;

    private  String nombre;

    public Leon(){}

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelDeFuerza(){
        return  this.nivelDeFuerza;
    }
    public void setNivelDeFuerza(int nivelDeFuerza){
        this.nivelDeFuerza = nivelDeFuerza;
    }

    public boolean getElLeonCome() {
        return this.elLeonCome;
    }

    public  void setElLeonCome(boolean elLeonCome) {
        this.elLeonCome = elLeonCome;
    }

    // faltan las funciones que puede realizar el leon
}
