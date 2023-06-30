/*
 2) Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. 
 */
package Entidades;

/**
 *
 * @author MiriamNahuel
 */
public class Perro extends Animal {
    @Override
    public void hacerRuido(){
        System.out.println("Guau guau");
    }
}
