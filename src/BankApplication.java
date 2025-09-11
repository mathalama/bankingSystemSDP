public class BankApplication {
    public static void main(String[] args) {
        User aikyn = User.builder()
                .setFullName("Aikyn")
                .setEmail("aikyn@mathalama.dev")
                .setIIN("112233888999")
                .setPhoneNumber("87771238888")
                .setPassword("math123lama")
                .build();
        System.out.println(aikyn);
    }
}