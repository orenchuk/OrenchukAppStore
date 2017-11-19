package main.java;

public enum Category {
    BUSINESS, EDUCATION, GAMES, UTILITIES, OTHER;

    public String toString() {
        switch (this) {
            case BUSINESS: return "Business";
            case EDUCATION: return "Education";
            case GAMES: return "Games";
            case UTILITIES: return "Utilities";
            case OTHER: return "Other";
            default: return null;
        }
    }
}
