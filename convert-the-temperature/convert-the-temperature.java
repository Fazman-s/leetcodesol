class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahreheit = celsius*1.80 + 32;
        double arr[] = {kelvin,fahreheit};
        return arr;
    }
}