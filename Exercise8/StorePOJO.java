package com.company;

public class StorePOJO {

    public int Id;
    public String Name;
    public int Floor;
    public int IsRestaurant;
    public int IsOpenLate;
    public int IsLarge;

    public StorePOJO() {

    }

    public StorePOJO(int id, String name, int floor, int isRestaurant, int isOpenLate, int isLarge) {
        Id = id;
        Name = name;
        Floor = floor;
        IsRestaurant = isRestaurant;
        IsOpenLate = isOpenLate;
        IsLarge = isLarge;
    }

    @Override
    public String toString() {
        return "StorePOJO{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Floor=" + Floor +
                ", IsRestaurant=" + IsRestaurant +
                ", IsOpenLate=" + IsOpenLate +
                ", IsLarge=" + IsLarge +
                '}';
    }


}
