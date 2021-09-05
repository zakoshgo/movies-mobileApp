package com.company;

public class Movie extends NetflixStreaming {
    private int duration;
    public Movie(String productName,String description,String dateOfRelease,int duration){
        super(productName,description,dateOfRelease);
        this.duration = duration;
        incrementProducts();
    }
    public void showDetails(){
        System.out.println(super.printDetails() + '\n' + "Duration " + duration+ '\n');
    }
    public void rating(int rate){
        setRating(rate);
    }
    public void viewMovie(){
        setNoOfViewsPerMonth(getNoOfViewsPerMonth()+1);
    }
}
