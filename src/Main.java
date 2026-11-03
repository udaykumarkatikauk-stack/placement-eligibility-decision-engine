public class Main {
    public static void main(String[] args) {

        String candidateName = "Rahul";
        double candidatePercentage = 78.0;
        int candidateBacklogs = 0;
        int candidateGraduationYear = 2026;

        String company = "Infosys";
        String role = "JavaDeveloper";
        double minPercentage = 65.0;
        int maxBacklogs = 0;
        int requiredGraduationYear = 2026;

        boolean isPercentagePass = candidatePercentage >= minPercentage;
        boolean isBacklogsPass = candidateBacklogs <= maxBacklogs;
        boolean isGraduationYearPass = candidateGraduationYear == requiredGraduationYear;

        boolean isEligible = isPercentagePass && isBacklogsPass && isGraduationYearPass;

        System.out.println("==================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("==================================");
        System.out.println("Candidate : " + candidateName);
        System.out.println("Company   : " + company);
        System.out.println("Role      : " + role);
        System.out.println();
        System.out.println("Percentage      : " + (isPercentagePass ? "PASS" : "FAIL"));
        System.out.println("Backlogs        : " + (isBacklogsPass ? "PASS" : "FAIL"));
        System.out.println("Graduation Year : " + (isGraduationYearPass ? "PASS" : "FAIL"));
        System.out.println();
        System.out.println("Final Result : " + (isEligible ? "ELIGIBLE" : "NOT ELIGIBLE"));
        System.out.println("==================================");
    }
}