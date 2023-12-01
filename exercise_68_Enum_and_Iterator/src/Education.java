public enum Education {
    FT("doctor"),
    FM("master of science"),
    LuK("bachelor's degree"),
    FilYO("baccalaureate");

    private String title;

    private Education() {
    }

    /**
     * this is just example how to use enum parameter
     * @param title person education title
     */
    private Education(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    /**
     * this is just example how to get enum number
     * @return title
     */
    public int getEnumNumber () {
        return this.ordinal();
    }
}
