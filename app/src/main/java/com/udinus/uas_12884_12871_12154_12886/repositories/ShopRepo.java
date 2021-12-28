package com.udinus.uas_12884_12871_12154_12886.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.udinus.uas_12884_12871_12154_12886.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {
    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "I Want to Eat Your Pancreas", 120000, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b" ));
        productList.add(new Product(UUID.randomUUID().toString(), "iPad Air", 130000, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPad Pro", 999, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11", 699, false, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11 Pro", 999, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone 11 Pro Max", 1099, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        productList.add(new Product(UUID.randomUUID().toString(), "iPhone SE", 399, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Air", 999, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro 13", 1299, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        productList.add(new Product(UUID.randomUUID().toString(), "MacBook Pro 16", 2399, true, "https://firebasestorage.googleapis.com/v0/b/bookstore-b36ef.appspot.com/o/book1.jpg?alt=media&token=d5f93095-6cfe-46b4-8bd2-8aaf81496c9b"));
        mutableProductList.setValue(productList);
    }
}
