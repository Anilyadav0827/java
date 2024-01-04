public class ATM {
    private String cardNo;
    private String applicantName;
    private String validDate;
    private int cvv;

    public ATM(String cardNo, String applicantName, String validDate, int cvv) {
        this.cardNo = cardNo;
        this.applicantName = applicantName;
        this.validDate = validDate;
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "cardNo='" + cardNo + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", validDate='" + validDate + '\'' +
                ", cvv=" + cvv +
                '}';
    }
}
