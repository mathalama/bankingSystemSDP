public class User {
    private final String fullName;
    private final String phoneNumber;
    private final String email;
    private final String IIN;
    private final String password;

    public User(Builder builder) {
        this.fullName = builder.fullName;
        this.password = builder.password;
        this.email = builder.email;
        this.IIN = builder.IIN;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder {
        private String fullName;
        private String phoneNumber;
        private String email;
        private String IIN;
        private String password;

        public Builder setFullName(String fullName) {
            if (fullName == null || fullName.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            this.fullName = fullName;
            return this;
        }
        public Builder setEmail(String email) {
            if (email == null || !email.contains("@")) {
                throw new IllegalArgumentException("Invalid email");
            }
            this.email = email;
            return this;
        }
        public Builder setPassword(String password) {
            if (password == null || password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be empty");
            }
            this.password = password;
            return this;
        }
        public Builder setIIN(String IIN) {
            if (IIN == null || !IIN.matches("\\d{12}")) {
                throw new IllegalArgumentException("Invalid IIN: must be exactly 12 digits");
            }
            this.IIN = IIN;
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber) {
            if (phoneNumber == null || !phoneNumber.matches("(\\+7|8)\\d{10}")) {
                throw new IllegalArgumentException("Invalid phone number");
            }
            this.phoneNumber = phoneNumber;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
    public static Builder builder() {
        return new Builder();
    }
    @Override
    public String toString() {
        return "Full Name = " + fullName + "\n" +
                "IIN: " + IIN + "\n" +
                "Number: " + phoneNumber + "\n" +
                "Email = " + email + "\n" +
                "Password = i can't display the password";
    }
}
