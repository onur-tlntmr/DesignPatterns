/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Test {
    public static void main(String[] args) {
        Builder b = new ConcreteBuilder();
        Director.Construct(b);
        Product p1 = b.getProduct();
        System.out.println(p1);
        
        
        b = new ConcreteBuilder2();
        Director.Construct(b);
        p1 = b.getProduct();
        System.out.println(p1);
        
        
    }
}
