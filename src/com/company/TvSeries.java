package com.company;

public class TvSeries extends NetflixStreaming {
    private int noOfSeasons;
    public TvSeries(String productName,String description,String dateOfRelease,int noOfSeasons){
        super(productName,description,dateOfRelease);
        this.noOfSeasons = noOfSeasons;
        incrementProducts();
    }

    public int getNoOfSeasons() {
        return noOfSeasons;
    }

    public void setNoOfSeasons(int noOfSeasons) {
        this.noOfSeasons = noOfSeasons;
    }
    public void showDetails(){
        System.out.println(super.printDetails() + '\n' + "no of seasons :- " + noOfSeasons + '\n');
    }
    public void rating(int rate){
        setRating(rate);
    }
    public void viewTvSeries(){
        setNoOfViewsPerMonth(getNoOfViewsPerMonth()+1);
    }
}
