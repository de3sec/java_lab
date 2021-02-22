package lab;

public class AirImpurity {
    String areaName;
    double co2Conc;
    double h2sConc;
    double miscImpurity;

    AirImpurity(String area, double co2, double h2s, double misc){
        areaName=area;
        co2Conc=co2;
        h2sConc=h2s;
        miscImpurity=misc;
    }

}
