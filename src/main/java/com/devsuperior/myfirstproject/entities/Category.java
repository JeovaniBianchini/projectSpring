package com.devsuperior.myfirstproject.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {
    private static final long serialversionUID = 1L;

    private Long id;
    private String name;

    public Category(){
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Category other = (Category) obj;
        if(id == null) {
            if (other.id != null)
                return false;
        } else if( !id.equals(other.id))
            return false;
        return true;



    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
