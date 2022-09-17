package aab.senla.test.service;

import aab.senla.test.entity.Product;

import java.util.Collection;

public interface ProductService {
    Product create(Product origin);
    boolean allPresent(Collection<Integer> ids);
    void update(Product product);
    void deleteById(int id);
}
