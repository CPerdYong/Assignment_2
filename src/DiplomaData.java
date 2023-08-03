public class DiplomaData {
    public String bil;
    public String category;
    public String name;
    public int total;
    public int max;
    public int min;
    public String year2014, year2015, year2016, year2017, year2018, year2019;

    // Constructor to initialize the DiplomaData object with data from CSV
    public DiplomaData(String bil, String category, String name, String year2014, String year2015, String year2016,
                       String year2017, String year2018, String year2019) {

        this.bil = bil;
        this.category = category;
        this.name = name;
        this.year2014 = year2014;
        this.year2015 = year2015;
        this.year2016 = year2016;
        this.year2017 = year2017;
        this.year2018 = year2018;
        this.year2019 = year2019;

        // Task 4: Calculate the total, max, and min values during object creation
        this.total = calculateTotal();
        this.max = calculateMax();
        this.min = calculateMin();
    }

    // Method to calculate the total sum of all the years
    private int calculateTotal() {
        return Integer.parseInt(year2014) + Integer.parseInt(year2015) + Integer.parseInt(year2016) +
                Integer.parseInt(year2017) + Integer.parseInt(year2018) + Integer.parseInt(year2019);
    }

    // Method to calculate the maximum value among all the years
    private int calculateMax() {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Integer.parseInt(year2014), Integer.parseInt(year2015)),
                Integer.parseInt(year2016)), Integer.parseInt(year2017)), Integer.parseInt(year2018)), Integer.parseInt(year2019));
    }

    // Method to calculate the minimum value among all the years
    private int calculateMin() {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Integer.parseInt(year2014), Integer.parseInt(year2015)),
                Integer.parseInt(year2016)), Integer.parseInt(year2017)), Integer.parseInt(year2018)), Integer.parseInt(year2019));
    }

    // Method to get the total sum of all the years
    public int getTotal() {
        return total;
    }

    // Method to get the maximum value among all the years
    public int getMax() {
        return max;
    }

    // Method to get the minimum value among all the years
    public int getMin() {
        return min;
    }

    // Method to create a string representation of the DiplomaData object
    @Override
    public String toString() {
        return bil + ". " + " Category = " + category + ", Name = " + name + ", Min = " + min + ", Max = " + max +
                ", Total = " + total;
    }
}
