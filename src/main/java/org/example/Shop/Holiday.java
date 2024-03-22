package org.example.Shop;

import java.time.LocalDate;

public enum Holiday {
    MARCH_8("0803"),
    FEBRUARY_23("2302"),
    NEW_YEAR("0101");


    private String code;
    Holiday( String code) {
        this.code= code;
    }

    public String getCode() {
        return code;
    }
}
