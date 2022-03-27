package ru.itmo.lessons.lesson6.Alpinist;

public class Mountain {
    public String mountainName; // 4
    public String country; // 4
    public int height; // 100

    public void setMountainName(String mountainName) {
        if (mountainName == null || mountainName.length() < 4) {
            throw new IllegalArgumentException("В названии горы должно быть не менее 4 символов");
        }
        this.mountainName = mountainName;
    }

    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("В названии страны должно быть не менее 4 символов");
        }
        this.country = country;
    }

    public void setHeight(int height) {
        if (height < 0 || height < 100) {
            throw new IllegalArgumentException("В высоте горы должно быть не менее 100 метров");
        }
        this.height = height;
    }

    public String getMountainName() {
        return mountainName;
    }

    public String getCountry() {
        return country;
    }

    public int getHeight() {
        return height;
    }

}
