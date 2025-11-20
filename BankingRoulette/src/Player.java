public class Player {
    private String name; // (4 bytes ABC\n)
    private int level; // (stages 1-4)
    private double wealth; // (up to 10000)
    private int day;
    // getters setters constructors

    void setName(String name){
        this.name = name;
    }

    void setLevel(int level){
        this.level = level;
    }

    void setWealth(double weatlh){
        this.wealth = wealth;
    }

    void setDay(int day){
        this.day = day;
    }
}
