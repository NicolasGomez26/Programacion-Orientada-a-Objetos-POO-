package SistemasDeArmas;

public abstract class SistemaArmas {
    private Integer energia;

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }
    public  void atacar(){
        System.out.println("Ataco");
    }
    public  void  defenderse(){
        System.out.println("Me defiendo");
    }

}
