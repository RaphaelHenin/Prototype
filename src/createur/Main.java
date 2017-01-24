/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createur;


/**
 *
 * @author Raphaël
 */
public class Main {
    public static void main(String[] args) {
        PrototypeFactory prototypeFactory = new PrototypeFactory();
        Prototype proto = prototypeFactory.getPrototype(PrototypeFactory.TypeObjet.TypeObjet1);
        if(proto instanceof Prototype1){
            System.out.println("Objet du type : Prototype 1");
        }
        Prototype proto1 = prototypeFactory.getPrototype(PrototypeFactory.TypeObjet.TypeObjet2);
        if(proto instanceof Prototype1){
            System.out.println("Objet du type : Prototype 2");
        }
    }
}
