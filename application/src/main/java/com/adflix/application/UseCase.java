package com.adflix.application;


import com.adflix.domain.Identifier;
import com.adflix.domain.category.Category;
import com.adflix.domain.category.CategoryID;

import java.time.Instant;

public class UseCase {

    public Category execute() {
        return Category.newCategory("It: A Coisa", "Filme de Terror", true);
    };
}