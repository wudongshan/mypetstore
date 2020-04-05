package org.csu.mypetstore.persistence;

import org.csu.mypetstore.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    //    得到产品列表
    List<Product> getProductListByCategory(String categoryId);
    //    得到一个产品
    Product getProduct(String ProductId);

    List<Product> searchProductList(String keywords);
}
