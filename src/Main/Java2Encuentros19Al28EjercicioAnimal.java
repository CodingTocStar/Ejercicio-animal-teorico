/*
1) Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”.

2) Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. 

3) Luego, en el main vamos a crear un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();

4) Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.

 */
package Main;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros19Al28EjercicioAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*3) Luego, en el main vamos a crear un ArrayList de animales y los siguientes animales
                Animal a = new Animal();
                Animal b = new Perro();
                Animal c = new Gato();*/
        
        ArrayList<Animal> animales = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        /*
        4) Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
        método hacerRuido() de cada ítem.
        */
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for(Animal animal : animales){
            animal.hacerRuido();
        }
        
    }
    
}
