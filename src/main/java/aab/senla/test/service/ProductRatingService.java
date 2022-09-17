package aab.senla.test.service;

import aab.senla.test.entity.ProductRating;

import java.util.List;

public interface ProductRatingService {
    List<ProductRating> getAllSortedByOrdersCountDescending();
}
