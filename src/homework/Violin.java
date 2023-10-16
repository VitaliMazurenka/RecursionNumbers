package homework;

import java.time.LocalDate;


public class Violin {
    private String masterName;
    private LocalDate dateOfManufacture;

    public String getMasterName() {
        return masterName;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public Violin(String masterName, String date) { // изменили
        // "2022-10-16"
        this.masterName = masterName;
        this.dateOfManufacture = LocalDate.parse(date); // изменили
    }
}
