import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Comparable<T> {
    int compareTo(T other);
    int compareTo(LocalDate other);
}