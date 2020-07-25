/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class ConcreteBuilder  extends Builder{
    private final Product m_Product = new Product();
    @Override
    public void BuildPart() {
        m_Product.Add("Parça1");
        m_Product.Add("Parça2");
        m_Product.Add("Parça3");
        
    }

    /**
     *
     * @return
     */
    @Override
    public Product getProduct() {
        return m_Product;
    }
    
}
