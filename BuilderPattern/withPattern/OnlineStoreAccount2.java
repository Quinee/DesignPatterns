public class OnlineStoreAccount2 {

    private Long id;
    private String name;
    private String address;
    private Long budget;
    private Long discountRate;
    

    public static class Builder {
        private Long id;
        private String name;
        private String address;
        private Long budget;
        private Long discountRate;

        public Builder(Long id) {
            this.id = id;
        }

        public Builder withName(String name) {
            this.name = name;

            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;

            return this;
        }

        public Builder withBudget(Long budget) {
            this.budget = budget;

            return this;
        }

        public Builder withDiscount(Long discountRate) {
            this.discountRate = discountRate;

            return this;
        }

        public OnlineStoreAccount2 build() {
            OnlineStoreAccount2 onlineStoreAccount2 = new OnlineStoreAccount2();
            onlineStoreAccount2.id = this.id;
            onlineStoreAccount2.name = this.name;
            onlineStoreAccount2.address = this.address;
            onlineStoreAccount2.budget = this.budget;
            onlineStoreAccount2.discountRate = this.discountRate;

            return onlineStoreAccount2;
        }
    }

    private OnlineStoreAccount2() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public Long getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Long discountRate) {
        this.discountRate = discountRate;
    }

    // public Object Builder(long l) {
    //     return null;
    // }
}
