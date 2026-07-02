public class FinancialForecast {

    static double predictValue(
            double currentValue,
            double growthRate,
            int years) {

        if(years == 0)
            return currentValue;

        return predictValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;

        double growthRate = 0.10;

        int years = 5;

        double futureValue =
                predictValue(
                        presentValue,
                        growthRate,
                        years);

        System.out.println(
                "Future Value = " + futureValue);
    }
}