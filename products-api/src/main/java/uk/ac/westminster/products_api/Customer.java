package uk.ac.westminster.products_api;

public class Customer {

    public static class customer {
        private Long id;
        private String name;
        private String email;
        private String address;
        public customer() {}
        public customer(Long id, String name, String email,String address) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.address = address;
        }
        public Long getId() { return id; }
        public String getName() { return name; }
        public String getEmail() { return email; }
        public String getAddress() { return address; }
    }
}
