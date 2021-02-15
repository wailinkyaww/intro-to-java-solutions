package chapter1;

public class Exercise11_PopulationProjection {
    public static void main(String[] args) {
        /**
         * total seconds in a year = 3600 * 24 * 365 = 31,536,000
         * number of years = 5
         * primary population = 312,032,486
         */
        System.out.print("After 1 year: ");
        System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45))));

        System.out.print("After 2 years: ");
        System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 2));

        System.out.print("After 3 years: ");
        System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 3));

        System.out.print("After 4 years: ");
        System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 4));

        System.out.print("After 5 years: ");
        System.out.println(312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * 5));

    }
}
