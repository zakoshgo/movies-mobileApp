package com.company;

public class Main {

    public static void main(String[] args) {
    Movie m1 =new Movie("the social dilemma","The Social Dilemma is a 2020" +
        " American docudrama film directed by Jeff Orlowski and written by Orlowski, Davis Coombe, and Vickie Curtis. ... " +
        "The film also examines the issue of social media's effect on mental health (including the mental health of adolescents " +
        "and rising teen suicide rates).","January 26, 2020",94);
    m1.viewMovie();
    m1.rating(5);
    m1.showDetails();

        TvSeries t1 = new TvSeries("la casa de papel", "A criminal mastermind who goes " +
                "by \"The Professor\" has a plan to pull off the biggest heist in recorded history --" +
                " to print billions of euros in the Royal Mint of Spain. To help him carry out the ambitious plan, " +
                "he recruits eight people with certain abilities and who have nothing to lose. The group of thieves take hostages to aid in their" +
                " negotiations with the authorities, who strategize to come up with a way to capture " +
                "The Professor. As more time elapses, the robbers prepare for a showdown with the police","May 2, 2017",5);
        t1.viewTvSeries();
        t1.rating(1000000000);
        t1.showDetails();
    }
}
