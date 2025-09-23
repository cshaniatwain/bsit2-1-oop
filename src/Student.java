class Student implements LibraryUser {
    private String name;
    private String studentId;
    private int borrowedItems = 0;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getUserType() {
        return "Student";
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
        return 3;
    }
}
