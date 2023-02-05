package com.shopme.admin.brand;

import com.opencsv.bean.CsvBindByName;

public class BrandWithCategory {
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String logo;
    @CsvBindByName
    private String categoryName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
