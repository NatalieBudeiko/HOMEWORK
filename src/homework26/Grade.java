package homework26;

public enum Grade {
    A, B, C, D, F;

    public boolean isPoor() {
        return this == D || this == F;
    }

    public static Grade getRandomGrade() {
      return Grade.values()[(int) (Math.random() * 100)%5];
    }
}

