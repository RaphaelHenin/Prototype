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
public class PrototypeFactory {
    enum TypeObjet{
        TypeObjet1, TypeObjet2 
   }
    /**
     * Noter le type de retour : une classe mère
     * @param typeobjet le type d'objet à retourner
     * @return soit un objet de Prototype1 ou Prototype2
     */
    public Prototype getPrototype(TypeObjet typeobjet){
        if(typeobjet == TypeObjet.TypeObjet1){
            return new Prototype1();
        }
        else{
            return new Prototype2();
        }        
    }
    
}
