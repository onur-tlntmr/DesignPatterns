/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class ConcreteBuilder2 extends Builder {

    private Product m_Product = new Product();
    @Override
    public void BuildPart() {
        m_Product.Add("Parça1: x");
        m_Product.Add("Parça1: y");
        m_Product.Add("Parça1: z");

    }

    @Override
    public Product getProduct() {
        return m_Product;
       }
    
}
