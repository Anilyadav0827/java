public class CustomerDetails {
    private String applicantName;
    private String accountNo;

    private String ifscCode;
    private String address;

    public CustomerDetails(String applicantName, String accountNo, String ifscCode, String address) {
        this.applicantName = applicantName;
        this.accountNo = accountNo;
        this.ifscCode = ifscCode;
        this.address = address;
    }


    @Override
    public String toString() {
        return "CustomerDetails{" +
                "applicantName='" + applicantName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
