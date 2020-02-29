package factory.builder;

public class Hall {
    private int size;
    private String universityName;

    public Hall() {}

//    public Hall(int size, String universityName) {
//        this.size = size;
//        this.universityName = universityName;
//    }

    public static class Builder {
        private Hall hall;

        public Builder() {
            this.hall = new Hall();
        }

        public Builder setStudentsCount(int count){
            hall.size = count;
            return this;
        }

        public Builder setUniversityName(String name) {
            hall.universityName = name;
            return this;
        }

        public Hall build() {
            return hall;
        }
    }
}
