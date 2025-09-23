class Teacher implements LibraryUser {
    private String name;
    private String employeeId;
    private int borrowedItems = 0;

    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Teacher";
    }

    @Override
    public void borrowMedia(Media media) {
        if (borrowedItems < getMaxBorrowLimit()) {
            if (media.isAvailable()) {
                media.borrowItem();
                borrowedItems++;
            } else {
                System.out.println("Sorry, " + media.getTitle() + " is not available.");
            }
        } else {
            System.out.println(name + " cannot borrow more than " + getMaxBorrowLimit() + " items.");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
        borrowedItems--;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }
}
