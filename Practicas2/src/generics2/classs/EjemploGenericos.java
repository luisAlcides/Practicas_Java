package generics2.classs;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion){

        for (T a : camion) {
            if(a instanceof  Animal){
                System.out.println(((Animal)a).getNombre() + " " + ((Animal)a).getTipo());
            }else if(a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }else if(a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }
        }
    }
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(3);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("Margarita","Caballo"));
        transporteCaballos.add(new Animal("Blancqui","Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mazda"));
        transAuto.add(new Automovil("Mercedes"));

        imprimirCamion(transAuto);
    }
}
