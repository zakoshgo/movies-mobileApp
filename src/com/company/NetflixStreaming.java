package com.company;

public abstract class NetflixStreaming {
private String productName;
private  String description;
private static int noOfProducts=0;
private String dateOfRelease;
private int noOfViewsPerMonth=0;
private int rating;

    public NetflixStreaming(String productName,String description,String dateOfRelease) {
        this.productName = productName;
        this.description = description;
        this.dateOfRelease = dateOfRelease;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(String dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public int getNoOfViewsPerMonth() {
        return noOfViewsPerMonth;
    }

    public void setNoOfViewsPerMonth(int noOfViewsPerMonth) {
        this.noOfViewsPerMonth= noOfViewsPerMonth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static void incrementProducts(){
        noOfProducts++;
    }

    public String printDetails(){
        return("product name is " + productName + '\n' + "Description " + description + '\n'
        + "date of released is " + dateOfRelease + '\n' + "no of views is " + noOfViewsPerMonth + '\n'
        + "rating " +rating );
    }

}
