package asc.demo.domain;

import io.reactivex.Single;

import java.util.List;

public interface Products {
    Single<Product> save(Product product);

    Single<List<Product>> findAll();
}