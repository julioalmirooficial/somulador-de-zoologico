package animales;
/*especie, edad y nivel de hambre*/
public class Animal {
    private  String especie;
    private int edad;
    private  int nivelDeHambre;

    public Animal(){}

    public  String getEspecie(){
        return this.especie;
    }
    public  void setEspecie(String especie){
        this.especie = especie;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getNivelDeHambre(){
        return this.nivelDeHambre;
    }
    public void setNivelDeHambre(int nivelDeHambre) {
        this.nivelDeHambre = nivelDeHambre;
    }

}
