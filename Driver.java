package basics;

public class Driver implements DriverRules {

    String Age;
    String licenseType;
    String IDNumber;
    String insuranceProvider;
    String fullName;


    public String getIDNumber() {
        return IDNumber;

    }

    @Override
    public boolean checkIfAgeAbove18() {
        return false;
    }


    @Override
    public Double safeDistance(

    ) { double distance=4;
        String meassage= (distance > 5)? "tooclose":"safedistance";
        return distance;
    }

    @Override
    public boolean checkSeatbelt() {
        return false;
    }

    @Override
    public Integer speedLimit() {
        return 0;
    }
}

