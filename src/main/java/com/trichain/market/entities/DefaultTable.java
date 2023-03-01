package com.trichain.market.entities;

//import com.trichain.market.entities.Auditable;
import jakarta.persistence.Entity;

@Entity
public class DefaultTable extends Auditable {

    private String column1;

    private String column2;


    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }
}
