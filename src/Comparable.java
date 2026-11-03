import java.time.LocalDate;

public interface Comparable<T> {
    int compareTo(T other);
    int compareTo(LocalDate other);
}