package aab.senla.test.service.impl;

import aab.senla.test.dao.ProductDao;
import aab.senla.test.entity.Product;
import aab.senla.test.service.ProductService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.util.Collection;
import java.util.Random;

public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product create(Product origin) {
        origin.setStatus(getRandomStatus());
        return productDao.save(origin);
    }

    @Override
    public boolean allPresent(Collection<Integer> ids) {
        return false;
    }

    private static Product.Status getRandomStatus() {
        return Product.Status.values()[new Random().nextInt(Product.Status.values().length)];
    }


    @Override
    public void update(Product product) {
        productDao.save(product);
    }

    @Override
    public void deleteById(int id) {
        Product product = new Product();
        product.setStatus(Product.Status.OUT_OF_STOCK);
        ExampleMatcher matcher = ExampleMatcher.matchingAny()
                        .withMatcher("status", ExampleMatcher.GenericPropertyMatchers.exact());
        Example<Product> example = Example.of(product, matcher);
        if (!productDao.exists(example)) {
            throw new ServiceException("No product to delete");
        }
        productDao.deleteById(id);
    }
}
