package com.adflix.domain.category;

import com.adflix.domain.Entity;
import com.adflix.domain.Identifier;

public class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    public AggregateRoot(ID id) {
        super(id);
    }
}
